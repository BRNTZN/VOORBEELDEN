package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D_CallableStatement {

	/**
	 * 
	 * Callable statements gebruik je vooral bij stored procedures met output
	 * parameters
	 * 
	 */

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				CallableStatement cs = conn.prepareCall("select * from tabel where naam = ?");
				cs.setString(1, "Courtois");
				ResultSet rs = cs.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1));
					System.out.println(rs.getString(3));
				}
				conn.close();
			} finally {

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
