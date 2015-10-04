package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _ConnectToDatabase {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				/**
				 * Do whatever you want here
				 */
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
