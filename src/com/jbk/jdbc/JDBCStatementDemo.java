package com.jbk.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection connection = JDBCUtil.getMySqlConnection();
		Statement statement = connection.createStatement();
		
		//insert 
		
		String query1= "insert into user(id,userid,userpass) values(3,'Krishna','kk111')";
		
		int executeUpdate = statement.executeUpdate(query1);
		if(executeUpdate>0) {
			System.out.println("user created !");
		}
		
		//read 
		String query2 = "select * from user";
		ResultSet resultSet = statement.executeQuery(query2);
		
		System.out.println("Sr No " + "\tUsername "+ "\tPassword ");
		while (resultSet.next()) {
			System.out.println( resultSet.getInt(1) +"\t" + resultSet.getString(2) + "\t"
					+ resultSet.getString(3));
		}
		
		System.out.println("----------------");
		// update
		String query3 = "update user set userpass ='raj#137' where id =1 ";
		int executeUpdate2 = statement.executeUpdate(query3);
		if(executeUpdate2>0) {
			System.out.println("password updated successfully!");
		}else {
			System.out.println("Something went wrong! Cant Update");
		}
			
		//delete
		String query4 = "delete from user where id =3 ";
		int executeUpdate3 = statement.executeUpdate(query4);
		if(executeUpdate3>0) {
			System.out.println("record deleted succesfully!");	
		}else {
			System.out.println("Something went wrong! Cant Delete");
		}
		
		
		
		
		resultSet.close();
		statement.close();
		
		JDBCUtil.closeMySqlConnection(connection);

	}
}
