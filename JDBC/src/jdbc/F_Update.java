package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class F_Update {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			PreparedStatement ps = conn.prepareStatement("insert into tabel (naam, voornaam) values (?,?)");
			ps.setString(1, "Courtois");
			ps.setString(2, "Lex");
			int rows = ps.executeUpdate();
			System.out.println("rows affected:" + rows);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
