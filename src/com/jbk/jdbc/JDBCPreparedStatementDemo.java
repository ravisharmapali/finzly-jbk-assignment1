package com.jbk.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCPreparedStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = JDBCUtil.getMySqlConnection();
		String query = "insert into user(id,userid,userpass) values(?,?,?)";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setInt(1, 11);
		prepareStatement.setString(2, "Abhyuday2");
		prepareStatement.setString(3, "abhy@1234");
		// insert
		int executeUpdate = prepareStatement.executeUpdate();
		if (executeUpdate > 0) {
			System.out.println("record inserted ");
		}

		System.out.println("----------------------------");

		// read
		String query2 = "select * from user";
		ResultSet resultSet = prepareStatement.executeQuery(query2);

		System.out.println("Sr No " + "\tUsername " + "\tPassword ");
		System.out.println("-------------------------------------");
		while (resultSet.next()) {
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
		}

		System.out.println("----------------------------");

		// update
		String query3 = "update user set userpass = 'haha@123' where id = 3 ";
		int executeUpdate2 = prepareStatement.executeUpdate(query3);
		if (executeUpdate2 > 0) {
			System.out.println("password updated Successfully!");
		} else {
			System.out.println("Something went wrong! Cant Update");
		}

		System.out.println("----------------------------");
		// delete
		String query4 = "delete from user where id= 11";
		int executeUpdate3 = prepareStatement.executeUpdate(query4);
		if (executeUpdate3 > 0) {
			System.out.println("user deleted Successfully!");
		} else {
			System.out.println("Something went wrong! Cant delete");
		}
		System.out.println("----------------------------");

		prepareStatement.close();
		JDBCUtil.closeMySqlConnection(connection);

	}
}