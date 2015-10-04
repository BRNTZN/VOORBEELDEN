package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class K_Transaction {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				conn.setAutoCommit(false);
				PreparedStatement ps = conn.prepareStatement("insert into tabel (naam, voornaam) values (?, ?)");
				ps.setString(1, "Vermeulen");
				ps.setString(2, "Joske");
				ps.executeUpdate();
				
				ps = conn.prepareStatement("insert into tabel (id, naam, voornaam) values (?, ?, ?)");
				ps.setInt(1, 2);
				ps.setString(2, "Conflict yo");
				ps.setString(3, "ID mag niet twee keer voorkomen!");
				ps.executeUpdate();
				
				conn.commit();
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * Bij transacties wordt ofwel alles uitgevoerd ofwel niets
	 * 
	 * Joske Vermeulen geraakt niet in de databank
	 */
}
