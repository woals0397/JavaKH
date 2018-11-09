package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java1102_jdbc.EmpDTO;

public class getEmptyTime {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private Connection init() throws ClassNotFoundException, SQLException {
		// 1. 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");

		// 2. 서버연결
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
	}// end init()

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();

		if (stmt != null)
			stmt.close();

		if (pstmt != null)
			pstmt.close();

		if (conn != null)
			conn.close();

	}// end exit()
	
	public String[] getEmptyTime(String hosName, String docName) {
		String[] impossibleTime;
		String returnData = "";
		int rowCount;
		
		try {
			conn = init();
			String sql = "SELECT reserv_date, reserv_time " + 
					"FROM reservation " + 
					"WHERE hos_name = ? AND docName = ?;";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hosName);
			pstmt.setString(2, docName);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ReservationDTO dto = new ReservationDTO();
				
				dto.setHos_name(rs.getString("hos_name"));
				dto.setDocName(rs.getString("docName"));
				if(rs.isLast()) {
					rowCount = rs.getRow();
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
}
