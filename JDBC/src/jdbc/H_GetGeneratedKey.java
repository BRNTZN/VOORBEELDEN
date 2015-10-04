package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class H_GetGeneratedKey {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			try {
				PreparedStatement ps = conn.prepareStatement("insert into tabel (naam, voornaam) values (?,?)",
						PreparedStatement.RETURN_GENERATED_KEYS);
				ps.setString(1, "Courtois");
				ps.setString(2, "Brent");
				ps.executeUpdate();
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					int nieuweId = rs.getInt(1);
					System.out.println(nieuweId);
				}
				conn.close();
			} finally {
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
