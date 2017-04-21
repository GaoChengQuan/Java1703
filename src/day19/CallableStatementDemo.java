package day19;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementDemo {
	public static void main(String[] args) {
		Connection connection = null;
		CallableStatement callableStatement = null;
		ResultSet resultSet = null;
		connection = JdbcUtil.getConnection();
		try {
			callableStatement = connection.prepareCall("CALL show_student");
			resultSet = callableStatement.executeQuery();
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				int age = resultSet.getInt("age");
				String gender = resultSet.getString("gender");
				System.out.println("name:" + name + ", age: " + age + ", gender: " + gender);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(connection, callableStatement);
		}
	}
}
