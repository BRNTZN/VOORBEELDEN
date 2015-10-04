package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class I_MultiQueries {

	public static void main(String[] args) {
		Connection conn;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank?allowMultiQueries=true", "root",
					"root");
			try {
				Statement s = conn.createStatement();
				boolean isResultSet = s.execute("select * from tabel;"
						+ "update tabel set voornaam = 'Lex' where voornaam = 'Vince';" + "select * from tabel;");
				int updateCount = s.getUpdateCount();
				while (isResultSet || updateCount != -1) {
					/**
					 * if query is select => isResultset 
					 * 
					 * if query is update => updatecount != -1
					 */
					if (isResultSet) {
						ResultSet rs = s.getResultSet();
						while (rs.next()) {
							System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
						}
					}
					isResultSet = s.getMoreResults();
					updateCount = s.getUpdateCount();
				}
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		/**
		 * Kan ook met prepared statements
		 */
		withPrepared();
	}

	private static void withPrepared() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank?allowMultiQueries=true",
					"root", "root");
			try {
				PreparedStatement ps = conn.prepareStatement("select * from tabel;"
						+ "update tabel set voornaam = 'Vince' where voornaam = 'Lex';" + "select * from tabel;");
				boolean isResultSet = ps.execute();
				int updateCount = ps.getUpdateCount();
				while (isResultSet || updateCount != -1) {
					/**
					 * if query is select => isResultset 
					 * 
					 * if query is update => updatecount != -1
					 */
					if (isResultSet) {
						ResultSet rs = ps.getResultSet();
						while (rs.next()) {
							System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
						}
					}
					isResultSet = ps.getMoreResults();
					updateCount = ps.getUpdateCount();
				}
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

}
