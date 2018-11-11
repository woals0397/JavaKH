package project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.Dto.FirstAid_DTO;
import project.Dto.Medicine_DTO;


public class Medicine_DAO {

	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static Medicine_DAO dao = new Medicine_DAO();
	 
	
	 public static Medicine_DAO getInstance() {
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
		
		public List<Medicine_DTO> selectMethod(String med) {
		 List<Medicine_DTO>	mlist = new ArrayList<Medicine_DTO>();
		 try {
			 
			conn = init();
		
			//stmt = conn.createStatement();
			
		    //String sql = "SELECT * FROM MEDICINE WHERE med_symptom LIKE '%두통%'";
			String sql = "SELECT * FROM MEDICINE WHERE med_symptom LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+med+"%");
			rs = pstmt.executeQuery();
			//rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				Medicine_DTO dto = new Medicine_DTO();
			
				dto.setMed_name(rs.getString(1));
                dto.setMed_price(rs.getInt(2));
                dto.setMed_info(rs.getString(3));
                dto.setMed_symptom(rs.getString(4));
                mlist.add(dto);
			       
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
		return mlist;
		 
			
		}//insertMethod
}
