package jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class E_StoredProcedures {

	public static void main(String[] args) {
		statement();
		preparedStatement();
		callableStatement();
		callableStatementInAndOut();
	}

	/**
	 * Stored procedure:
	 * 
	 * use databank;
	 * 
	 * delimiter //
	 * 
	 * create procedure procedure_all()
	 * 
	 * begin
	 * 
	 * select * from tabel;
	 * 
	 * end //
	 * 
	 * delimiter ;
	 */
	private static void statement() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				Statement s = conn.createStatement();
				ResultSet rs = s.executeQuery("call procedure_all");
				while (rs.next()) {
					System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
				}
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Stored procedure:
	 * 
	 * use databank;
	 * 
	 * delimiter //
	 * 
	 * create procedure procedure_in( in inputnaam varchar(50))
	 * 
	 * begin
	 * 
	 * select * from tabel where naam = inputnaam;
	 * 
	 * end //
	 * 
	 * delimiter ;
	 */
	private static void preparedStatement() {
		/**
		 * Met prepared statements kan je dus handig gebruik maken van
		 * inputparameters
		 */
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				PreparedStatement ps = conn.prepareStatement("call procedure_in(?)");
				ps.setString(1, "Courtois");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(1) + rs.getString(2) + rs.getString(3));
				}
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Stored procedure:
	 * 
	 * use databank;
	 * 
	 * delimiter //
	 * 
	 * create procedure procedure_out( out totaal int)
	 * 
	 * begin
	 * 
	 * select count(*) into totaal from tabel;
	 * 
	 * end //
	 * 
	 * delimiter ;
	 */
	private static void callableStatement() {
		/**
		 * Met callable statements kan je ook gebruik maken van outputparameters
		 */
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				CallableStatement cs = conn.prepareCall("call procedure_out(?)");
				cs.registerOutParameter(1, java.sql.Types.INTEGER);
				cs.executeUpdate();
				System.out.println(cs.getString(1));
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Stored procedure:
	 * 
	 * use databank;
	 * 
	 * delimiter //
	 * 
	 * create procedure procedure_inout( in inputnaam varchar(50), out totaal
	 * int)
	 * 
	 * begin
	 * 
	 * select count(*) into totaal from tabel where naam = inputnaam;
	 * 
	 * end //
	 * 
	 * delimiter ;
	 */
	private static void callableStatementInAndOut() {
		/**
		 * Voorbeeld met In én Outputparameters
		 */
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				CallableStatement cs = conn.prepareCall("call procedure_inout(?, ?)");
				cs.setString(1, "Turneer");
				cs.registerOutParameter(2, java.sql.Types.INTEGER);
				cs.executeUpdate();
				System.out.println(cs.getString(2));
			} finally {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
