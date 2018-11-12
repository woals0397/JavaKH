package project.Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.Dto.Reservation_DTO;
import project.reserve_gui.RequestData;



public class Reservation_DAO {

	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static Reservation_DAO dao = new Reservation_DAO();
	 
	 public Reservation_DAO() {
		// TODO Auto-generated constructor stub
	 }
	 
	 public static Reservation_DAO getInstance() {
		 return dao;
	 }
	 
	 private Connection init() throws ClassNotFoundException, SQLException {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. 서버 연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";

			
			return DriverManager.getConnection(url, username, password); 

		}// end init() ////////////////////////
		private void exit() throws SQLException {
			
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		}// end exit() ///////////////////////
		
		public void insertMethod(Reservation_DTO dto) {
		 
		 try {
			 
			conn = init();
			String sql = "INSERT INTO reservation " + 
					"VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1 , dto.getReserv_id());
			pstmt.setInt(2 , dto.getReserv_num());
			pstmt.setString(3 , dto.getHos_name());
			pstmt.setString(4, dto.getReserv_deptname());
			pstmt.setString(5 , dto.getDocname());
			pstmt.setString(6, dto.getCurrent_symptom());
			pstmt.setString(7, dto.getReserv_date());
			pstmt.setString(8, dto.getReserv_time());
			
			pstmt.executeUpdate();         
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				exit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		 
			
		}//insertMethod
		
		public List<String> getReserveTime(String hosName, String docName, String reserveDate) {			
			List<String> impossibleTime = new ArrayList<>();

			try {
				conn = init();
				String sql = "SELECT reserv_time " + 
						"FROM reservation " + 
						"WHERE hos_name = ? AND docName = ? AND reserv_date = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, hosName);
				pstmt.setString(2, docName);
				pstmt.setString(3, reserveDate);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					impossibleTime.add(rs.getString("reserv_time"));
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

			return impossibleTime;
		}
		
		
		public List<RequestData> getRequestData(String requestData){
			List<RequestData> rd = new ArrayList<>();
			RequestData rqd;
			
			try {
				conn = init();
				String sql = "SELECT DISTINCT p.dept_name, p.dept_info, h.hos_name, d.doc_name " + 
						"FROM department p, hospital h, doctor d " + 
						"WHERE p.dept_name = d.doc_dept " + 
						"AND d.doc_hos = h.hos_name " + 
						"AND dept_name = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, requestData);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					rqd = new RequestData(rs.getString("dept_name"), rs.getString("dept_info"), rs.getString("hos_name"), rs.getString("doc_name"));
					rd.add(rqd);
				}
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
			
			return rd;
		}
		
		
		
}
