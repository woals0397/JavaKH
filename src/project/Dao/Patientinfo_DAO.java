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

		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}// end exit() ///////////////////////

	// 회원가입시 데이터넣는메소드
	public void insertMethod(Patientinfo_DTO dto) {

		try {

			conn = init();
			String sql = "INSERT INTO PATIENTINFO(id,password,name,birth,address,phone,gender,question,answer) "
					+ "VALUES(?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId().toLowerCase());
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getAddress());
			pstmt.setString(6, dto.getPhone());
			pstmt.setString(7, dto.getGender());
			pstmt.setString(8, dto.getQuestion());
			pstmt.setString(9, dto.getAnswer());
			pstmt.executeUpdate();

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

	}// insertMethod

	// 로그인시 해당 아이디 dto값 메소드.
	public Patientinfo_DTO checkId(String idvalue) {

		Patientinfo_DTO dto = new Patientinfo_DTO();
		try {

			conn = init();

			String sql = "select * from patientinfo WHERE id=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, idvalue);

			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No data");
			}

			while (rs.next()) {

				dto.setId(rs.getString(1));
                dto.setPassword(rs.getString(2));
				dto.setQuestion(rs.getString(8)); // 현재는 이정보를 담을 필요없지만 비밀번호찾기에서 필요(메소드공유)
				dto.setAnswer(rs.getString(9)); // 현재는 이정보를 담을 필요없지만 비밀번호찾기에서 필요(메소드공유)

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
		return dto;
	}// searchID

	// 아이디 찾기 메소드
	public Patientinfo_DTO searchId(String name) {

		Patientinfo_DTO dto = new Patientinfo_DTO();
		try {

			conn = init();

			String sql = "select * from patientinfo WHERE name=?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No data");
			}

			while (rs.next()) {

				dto.setId(rs.getString(1));
				dto.setPhone(rs.getString(6));

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
		return dto;
	}// searchID

	// 마이페이지에서 해당 id 의 모든정보 가져오기.
	public Patientinfo_DTO searchAll(String id) {
		Patientinfo_DTO dto = new Patientinfo_DTO();
		try {

			conn = init();
			String sql = "select * from patientinfo WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No data");
			}

			while (rs.next()) {

				dto.setId(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setBirth(rs.getString(4));
				dto.setAddress(rs.getString(5));
				dto.setPhone(rs.getString(6));
				dto.setGender(rs.getString(7));
				dto.setQuestion(rs.getString(8));
				dto.setAnswer(rs.getString(9));

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
		return dto;
	}
	
	//회원가입시 아이디중복체크 메소드
	public boolean validityId(String id) {
		boolean chk = false;
		try {

			conn = init();
			String sql = "select * from patientinfo WHERE id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				chk = true;
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
		return chk;
	}
	

	// 마이페이지 회원정보수정 메소드
	public void modifyMethod(Patientinfo_DTO dto) {

		try {

			conn = init();
			String sql = "UPDATE PATIENTINFO SET password=? , name=?, phone=?,birth=?,address=?  WHERE id = ?";
			pstmt = conn.prepareStatement(sql);
		
			pstmt.setString(1, dto.getPassword());
			pstmt.setString(2, dto.getName());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getBirth());
			pstmt.setString(5, dto.getAddress());
			pstmt.setString(6, dto.getId());
			pstmt.executeUpdate();

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

	}// ModifyMethod

}// DAO
