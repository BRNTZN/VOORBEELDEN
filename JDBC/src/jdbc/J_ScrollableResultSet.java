package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J_ScrollableResultSet {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {

				Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet rs = s.executeQuery("select * from tabel");
				rs.next();
				System.out.println("Eerste record: " + rs.getString(1) + rs.getString(3));
				rs.afterLast();
				rs.previous();
				System.out.println("Laatste record: " + rs.getString(1) + rs.getString(3));
				rs.first();
				System.out.println("Eerste record (opnieuw): " + rs.getString(1) + rs.getString(3));
				rs.absolute(3);
				System.out.println("Derde rij: " + rs.getString(1) + rs.getString(3));
				rs.absolute(-1);
				System.out.println("Laatste record (opnieuw): " + rs.getString(1) + rs.getString(3));
				rs.relative(-1);
				System.out.println("Voorlaatste record: " + rs.getString(1) + rs.getString(3));
				System.out.println("Rijnummer: " + rs.getRow());
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		/**
		 * Dit was read-only, kan ook updatable:
		 */
		updatable();
	}

	private static void updatable() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = s.executeQuery("select * from tabel");
				rs.absolute(4);
				rs.updateString(2, "NieuweAchternaam");
				rs.updateRow();
				
				rs.moveToInsertRow();
				rs.updateString(2, "Achternaam");
				rs.updateString(3, "Voornaam");
				rs.insertRow();
			} finally {
				conn.close();
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}
