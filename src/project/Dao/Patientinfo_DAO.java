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

import project.Dto.FirstAid_DTO;
import project.Dto.Patientinfo_DTO;





public class Patientinfo_DAO {

	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static Patientinfo_DAO dao = new Patientinfo_DAO();
	 
	 public Patientinfo_DAO() {
		// TODO Auto-generated constructor stub
	 }
	 public static Patientinfo_DAO getInstance() {
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
		
		//회원가입시 데이터넣는메소드
		public void insertMethod(Patientinfo_DTO dto) {
		
		 try {
			
				
			conn = init();
			String sql = "INSERT INTO PATIENTINFO(id,password,name,birth,address,phone,gender,question,answer) "
					      + "VALUES(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1 , dto.getId());
			pstmt.setString(2 , dto.getPassword());
			pstmt.setString(3 , dto.getName());
			pstmt.setString(4,  dto.getBirth());
			pstmt.setString(5 , dto.getAddress());
			pstmt.setString(6 , dto.getPhone());
			pstmt.setString(7 , dto.getGender());
			pstmt.setString(8, dto.getQuestion());
			pstmt.setString(9, dto.getAnswer());
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
		
		//로그인시 해당 아이디 dto값 메소드.
		public Patientinfo_DTO checkId(String idvalue){
			 
			 Patientinfo_DTO dto  = new Patientinfo_DTO();
			 try {
				
				conn = init();
			   
				String sql = "select * from patientinfo WHERE id=?";
			   
				pstmt = conn.prepareStatement(sql);
			   
				pstmt.setString(1, idvalue);
		    
				rs = pstmt.executeQuery();
                if(!rs.isBeforeFirst()) {
                	System.out.println("No data");
                }
			   
				while(rs.next()) {
				
					dto.setId(rs.getString(1));
					
					dto.setPassword(rs.getString(2));
					
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
			return dto;
		}//searchID
		
		//아이디 찾기 메소드
		public Patientinfo_DTO searchId(String name){
			 
			 Patientinfo_DTO dto  = new Patientinfo_DTO();
			 try {
				
				conn = init();
			   
				String sql = "select * from patientinfo WHERE name=?";
			   
				pstmt = conn.prepareStatement(sql);
			   
				pstmt.setString(1, name);
		    
				rs = pstmt.executeQuery();
               if(!rs.isBeforeFirst()) {
               	System.out.println("No data");
               }
			   
				while(rs.next()) {
				
					dto.setId(rs.getString(1));  
					dto.setPhone(rs.getString(6));  
				
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
			return dto;
		}//searchID
		
		
}//DAO
