package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class A {

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
		String[] namen = {"Courtois", "Turneer", "Courtois", "Courtois", "Courtois"};
		String[] voornamen = {"Leon", "Marie-Frances", "Gregory", "Gwen", "Brent"};
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			System.out.println(conn.getCatalog());
			PreparedStatement ps = conn.prepareStatement("insert into tabel (id, naam, voornaam) values (?, ?, ?)");
			for (int i = 0; i < 5; i++) {
				ps.setInt(1, i);
				ps.setString(2, namen[i]);
				ps.setString(3, voornamen[i]);
				ps.addBatch();
			}
			ps.executeBatch();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
