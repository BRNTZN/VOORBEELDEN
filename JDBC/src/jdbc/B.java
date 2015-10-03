package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class B {
	/**
	 * 
	 * Statement suckt
	 * 
	 */

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from tabel");
			while (rs.next()) {
				System.out.print(rs.getInt(1));
				System.out.print(rs.getString(2));
				System.out.println(rs.getString(3));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
