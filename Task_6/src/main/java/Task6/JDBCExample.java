package Task6;

import java.sql.*;

public class JDBCExample {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = DBConnection.getConnection();

			String createTable = "CREATE TABLE IF NOT EXISTS users (" + "id INT AUTO_INCREMENT PRIMARY KEY, "
					+ "name VARCHAR(100), " + "email VARCHAR(100))";
			pstmt = conn.prepareStatement(createTable);
			pstmt.executeUpdate();

			String insertSQL = "INSERT INTO users (name, email) VALUES (?, ?)";
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, "Don");
			pstmt.setString(2, "don345@gmail.com");
			pstmt.executeUpdate();
			System.out.println("User inserted!");

			String selectSQL = "SELECT * FROM users";
			pstmt = conn.prepareStatement(selectSQL);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Email: "
						+ rs.getString("email"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignored) {
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception ignored) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception ignored) {
			}
		}
	}

}
