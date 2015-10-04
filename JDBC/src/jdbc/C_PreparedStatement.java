package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C_PreparedStatement {
	/**
	 * 
	 * Prepared statement = way to go
	 * 
	 */

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				PreparedStatement ps = conn.prepareStatement("select * from tabel where naam = ?");
				ps.setString(1, "Courtois");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1));
					System.out.println(rs.getString(3));
				}
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
