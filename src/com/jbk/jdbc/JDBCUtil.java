package com.jbk.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	Connection connection = null;

	public static Connection getMySqlConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly1", "root", "password");

		return connection;
	}

	public static void closeMySqlConnection(Connection connection) throws SQLException {
		connection.close();
	}
}

//System.out.println("----- Welcome ------");
//
//while (true) {
//	System.out.println("1 : Add Teacher ");
//	System.out.println("2 : Add Student ");
//	System.out.println("3 : Display Teachers Details ");
//	System.out.println("4 : Display Students Details");
//	System.out.println("5 : Exit ");
//	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Enter your option ");
//	String opt = scanner.nextLine();
////	switch() {
////	
////	}
////	
//}
