package project.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import project.Dto.Reservation_DTO;
import project.Dto.ReserveComplete_DTO;

public class ReserveComplete_DAO {
     
	 private Connection conn;
	 private Statement stmt;
	 private PreparedStatement pstmt;
	 private ResultSet rs;
	 
	 private static ReserveComplete_DAO dao = new ReserveComplete_DAO();
	 
	 public ReserveComplete_DAO() {
		// TODO Auto-generated constructor stub
	 }
	 public static ReserveComplete_DAO getInstance() {
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
		
		public void insertMethod(ReserveComplete_DTO dto) {
			 
			 try {
				 
				conn = init();
				String sql = "INSERT INTO reservecomplete(comp_id,comp_num,comp_hosname,comp_deptname,comp_docname,comp_date,comp_symptom) "
						      + "VALUES(?,?,?,?,?,?,? )";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1 , dto.getComp_id());
				pstmt.setInt(2 , dto.getComp_num());
				pstmt.setString(3 , dto.getComp_hosname());
				pstmt.setString(4, dto.getComp_deptname());
				pstmt.setString(5 , dto.getComp_docname());
				pstmt.setString(6, dto.getComp_date());
				pstmt.setString(7, dto.getComp_symptom());
				
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
		
		public List<ReserveComplete_DTO> searchAll(String id) {
			List<ReserveComplete_DTO> list = new ArrayList<>();
			ReserveComplete_DTO dto;
			try {

				conn = init();
				String sql = "select * from reservecomplete WHERE comp_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if (!rs.isBeforeFirst()) {
					System.out.println("No data");
				}

				while (rs.next()) {
                    dto = new ReserveComplete_DTO();
					dto.setComp_id(rs.getString(1));
					dto.setComp_num(rs.getInt(2));
					dto.setComp_hosname(rs.getString(3));
					dto.setComp_deptname(rs.getString(4));
					dto.setComp_docname(rs.getString(5));
					dto.setComp_date(rs.getString(6));
					dto.setComp_symptom(rs.getString(7));
					
					list.add(dto);

				}

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					exit();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return list;
		}
		
}
