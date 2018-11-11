package project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.Dto.Department_DTO;
import project.Dto.FirstAid_DTO;

public class FirstAid_DAO {

	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static FirstAid_DAO dao = new FirstAid_DAO();
	 
	
	 public static FirstAid_DAO getInstance() {
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
		
		public List<FirstAid_DTO> selectMethod() {
		 List<FirstAid_DTO>	flist = new ArrayList<FirstAid_DTO>();
		 try {
			 
			conn = init();
		
			stmt = conn.createStatement();
			
		    String sql = "SELECT * FROM FIRSTAID";
			rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				FirstAid_DTO dto = new FirstAid_DTO();
			
				dto.setAid_name(rs.getString(1));
                //System.out.println(rs.getString(1));
				dto.setAid_solution(rs.getString(2));
				
				flist.add(dto);
			       
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
		return flist;
		 
			
		}//insertMethod
	
	
}
