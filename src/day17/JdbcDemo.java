package day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import day17.util.JdbcUtil;

public class JdbcDemo {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		try {
			//1. 连接驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接对象
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "123");
			//3.创建Statement
			statement = connection.createStatement();
			//4.准备Sql
			String sql = "CREATE TABLE teacher(id INT PRIMARY KEY AUTO_INCREMENT,NAME VARCHAR(20));";
			//5.执行Sql语句
			int result = statement.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement);
		}
	}
	
	@Test
	public void insert() {

		Connection connection = null;
		Statement statement = null;
		try {
			//1. 连接驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接对象
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "123");
			//3.创建Statement
			statement = connection.createStatement();
			//4.准备Sql
			String sql = "INSERT INTO teacher(NAME) VALUES('lisi');";
			//5.执行Sql语句
			int result = statement.executeUpdate(sql);
			System.out.println(result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement);
		}
	
	}
	
	@Test
	public void select() {
		Connection connection = null;
		Statement statement = null;
		try {
			//1. 连接驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.获取连接对象
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "123");
			//3.创建Statement
			statement = connection.createStatement();
			//4.准备Sql
			String teacherName = "lisi";
			String sql = "SELECT * FROM teacher where name='" + teacherName + "';";
			//5.执行sql语句
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				//String name = resultSet.getString(2);
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.print("id:" + id + "\t");
				System.out.print("name:" + name);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement);
		}
	
	}
	
	@Test
	public void select2() {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			connection = JdbcUtil.getConnection();
			//3.创建Statement
			statement = connection.createStatement();
			//4.准备Sql
			String teacherName = "lisi";
			String sql = "SELECT * FROM teacher where name='" + teacherName + "';";
			//5.执行sql语句
			resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				//String name = resultSet.getString(2);
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				System.out.print("id:" + id + "\t");
				System.out.print("name:" + name);
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, statement, resultSet);
		}
	}
}
