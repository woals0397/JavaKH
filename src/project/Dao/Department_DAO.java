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

import javax.swing.plaf.synth.SynthSpinnerUI;

import project.Dto.Department_DTO;
import project.Dto.Reservation_DTO;


public class Department_DAO {

	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static Department_DAO dao = new Department_DAO();
	 
	 public Department_DAO() {
		// TODO Auto-generated constructor stub
	 }
	 public static Department_DAO getInstance() {
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
		
		public List<Department_DTO> selectMethod() {
		 List<Department_DTO>	list = new ArrayList<Department_DTO>();
		 try {
			 
			conn = init();
		
			stmt = conn.createStatement();
			
		    String sql = "SELECT * FROM DEPARTMENT";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Department_DTO dto = new Department_DTO();
			
				dto.setDept_name(rs.getString(1));
				dto.setDept_info(rs.getString(2));
				
				list.add(dto);
			       
			}
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
		return list;
		 
			
		}//insertMethod
	
	
}
