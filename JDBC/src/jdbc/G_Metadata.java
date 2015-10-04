package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class G_Metadata {

	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/databank", "root", "root");
			/**
			 * naam databank:
			 */
			System.out.println(conn.getCatalog());
			
			/**
			 * metadata databank:
			 */
			DatabaseMetaData metaD = conn.getMetaData();
			System.out.println("Server metadata:");
			System.out.println("Batch support: "+metaD.supportsBatchUpdates());
			System.out.println("StoredProcedure support: "+metaD.supportsStoredProcedures());
			System.out.println("Scrollable resultset support: "+metaD.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE));
			
			/**
			 * resultset:
			 */
			PreparedStatement ps = conn.prepareStatement("select * from tabel");
			ResultSet rs = ps.executeQuery();
			
			/**
			 * metadata resultset:
			 */
			ResultSetMetaData metaR = rs.getMetaData();
			System.out.println("Resultset metadata:");
			System.out.println(metaR.getColumnCount());
			System.out.println(metaR.getColumnName(2));
			
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
