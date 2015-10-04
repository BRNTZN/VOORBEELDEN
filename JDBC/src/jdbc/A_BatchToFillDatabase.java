package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A_BatchToFillDatabase {

	/**
	 * 
	 * SQL script: create database databank;
	 * 
	 * use databank;
	 * 
	 * create table tabel (id int NOT NULL, naam varchar(25), voornaam
	 * varchar(25), primary key (id));
	 * 
	 */

	public static void main(String[] args) {
		String[] namen = { "Courtois", "Turneer", "Courtois", "Courtois", "Courtois" };
		String[] voornamen = { "Leon", "Marie-Frances", "Gregory", "Gwen", "Brent" };

		/**
		 * Batch met prepared statement
		 */
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				PreparedStatement ps = conn.prepareStatement("insert into tabel (naam, voornaam) values (?, ?)");
				for (int i = 0; i < 5; i++) {
					ps.setString(1, namen[i]);
					ps.setString(2, voornamen[i]);
					ps.addBatch();
				}
				ps.executeBatch();
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
