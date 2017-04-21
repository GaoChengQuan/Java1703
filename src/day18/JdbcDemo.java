package day18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo {
	public static void main(String[] args) {
		String name = "zhangsan";
		String password = "123";
		
	}
	
	@Test
	public void loginStatement() {
		String name = "zhang' OR 1=1 -- ";
		String password = "123";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			statement = connection.createStatement();
			String sql = "SELECT * FROM USER WHERE NAME='"+name+"' AND PASSWORD='"+password+"';";
			resultSet = statement.executeQuery(sql);
			if (resultSet.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement, resultSet);
		}
	}
	
	@Test
	public void loginPreparedStatement() {
	//		String name = "zhangsan0";
		String name = "zhang' OR 1=1 -- ";
		String password = "123";
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		connection = JdbcUtil.getConnection();
		//?表示一个参数的占位符
		String sql = "SELECT * FROM USER WHERE NAME=? AND PASSWORD=?;";
		try {
			preparedStatement = connection.prepareStatement(sql);
			//设置参数值:            参数位置,参数值
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, password);
			resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				System.out.println("登陆成功");
			} else {
				System.out.println("登陆失败");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement, resultSet);
		}
	}
	
	@Test
	public void insertStatement() {
		long start = System.currentTimeMillis();
		
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			statement = connection.createStatement();
			for (int i = 0; i < 1000; i++) {
				String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES('zhangsan" + i + "','123');";
				statement.executeUpdate(sql);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement, resultSet);
		}
		
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("使用时间： " + delta);
		//使用时间： 20126
	}
	
	@Test
	public void insertPreparedStatement() {
		long start = System.currentTimeMillis();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES(?,?);";
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < 1000; i++) {
				preparedStatement.setString(1, "zhangsan" + i);
				preparedStatement.setString(2, "123");
				preparedStatement.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement, resultSet);
		}
		
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("使用时间： " + delta);
		//使用时间： 22529
	}
	
	@Test
	public void insertPreparedStatementByBatch() {
		long start = System.currentTimeMillis();
		
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = JdbcUtil.getConnection();
			String sql = "INSERT INTO USER(NAME,PASSWORD) VALUES(?,?);";
			preparedStatement = connection.prepareStatement(sql);
			for (int i = 0; i < 1000; i++) {
				preparedStatement.setString(1, "zhangsan" + i);
				preparedStatement.setString(2, i + "");
				preparedStatement.addBatch();
			}
			preparedStatement.executeBatch();
			preparedStatement.clearBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement, resultSet);
		}
		
		long end = System.currentTimeMillis();
		long delta = end - start;
		System.out.println("使用时间： " + delta);
		//使用时间： 
	}
	
	@Test
	public void transaction1() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = JdbcUtil.getConnection();
		String sql1 = "UPDATE account SET money=money-1000 WHERE name='zhangsan';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='lisi'";
		try {
			connection.setAutoCommit(true);
			//1、第一次执行sql
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			
			//2、第一次执行sql
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, preparedStatement);
		}

	}
	
	@Test
	public void transaction2() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		connection = JdbcUtil.getConnection();
		String sql1 = "UPDATE account SET money=money-1000 WHERE name='zhangsan';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='lisi'";
		try {
			//开启手动提交
			connection.setAutoCommit(false);
			//1、第一次执行sql
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			
			//2、第一次执行sql
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			try {
				//出现异常回滚
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				//手动提交事物
				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtil.close(connection, preparedStatement);
		}
	}
	
	@Test
	public void transaction3() {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		Savepoint savepoint = null;
		
		String sql1 = "UPDATE account SET money=money-1000 WHERE name='zhangsan';";
		String sql2 = "UPDATE account SET money=money+1000 WHERE NAME='lisi'";
		
		String sql3 = "UPDATE account SET money=money+500 WHERE name='zhangsan';";
		String sql4 = "UPDATE account SET money=money-500 WHERE NAME='lisi'";
		try {
			connection = JdbcUtil.getConnection();
			//开启手动提交
			connection.setAutoCommit(false);
			
			//1、第一次转账
			preparedStatement = connection.prepareStatement(sql1);
			preparedStatement.executeUpdate();
			preparedStatement = connection.prepareStatement(sql2);
			preparedStatement.executeUpdate();
			
			//设置保存点,回滚到这个位置
			savepoint = connection.setSavepoint();
			
			//2、第二次转账
			preparedStatement = connection.prepareStatement(sql3);
			preparedStatement.executeUpdate();
			preparedStatement = connection.prepareStatement(sql4);
			preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			//出现异常回滚
			if (savepoint == null) {
				try {
					connection.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} else {
				try {
					connection.rollback(savepoint);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
		} finally {
			//手动提交事物
			try {
				connection.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			JdbcUtil.close(connection, preparedStatement);
		}
	}
	

}
