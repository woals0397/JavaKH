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
import project.Dto.ReserveComplete_DTO;
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

		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}// end exit() ///////////////////////

	public void insertMethod(Reservation_DTO dto) {

		try {

			conn = init();
			String sql = "INSERT INTO reservation " + "VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getReserv_id());
			pstmt.setInt(2, dto.getReserv_num());
			pstmt.setString(3, dto.getHos_name());
			pstmt.setString(4, dto.getReserv_deptname());
			pstmt.setString(5, dto.getDocname());
			pstmt.setString(6, dto.getCurrent_symptom());
			pstmt.setString(7, dto.getReserv_date());
			pstmt.setString(8, dto.getReserv_time());

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

	public List<String> getReserveTime(String hosName, String docName, String reserveDate) {
		List<String> impossibleTime = new ArrayList<>();

		try {
			conn = init();
			String sql = "SELECT reserv_time " + "FROM reservation "
					+ "WHERE hos_name = ? AND docName = ? AND reserv_date = ?";
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

	public List<RequestData> getRequestData(String requestData) {
		List<RequestData> rd = new ArrayList<>();
		RequestData rqd;

		try {
			conn = init();
			String sql = "SELECT DISTINCT p.dept_name, p.dept_info, h.hos_name, d.doc_name "
					+ "FROM department p, hospital h, doctor d " + "WHERE p.dept_name = d.doc_dept "
					+ "AND d.doc_hos = h.hos_name " + "AND dept_name = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, requestData);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				rqd = new RequestData(rs.getString("dept_name"), rs.getString("dept_info"), rs.getString("hos_name"),
						rs.getString("doc_name"));
				rd.add(rqd);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return rd;
	}

	public List<Reservation_DTO> searchAll(String id) {
		List<Reservation_DTO> list = new ArrayList<>();
		Reservation_DTO dto;
		try {

			conn = init();
			String sql = "select * from RESERVATION WHERE reserv_id=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (!rs.isBeforeFirst()) {
				System.out.println("No data");
			}

			while (rs.next()) {
				dto = new Reservation_DTO();
				dto.setReserv_id(rs.getString(1));
				dto.setReserv_num(rs.getInt(2));
				dto.setHos_name(rs.getString(3));
				dto.setReserv_deptname(rs.getString(4));
				dto.setDocname(rs.getString(5));
				dto.setCurrent_symptom(rs.getString(6));
				dto.setReserv_date(rs.getString(7));
				dto.setReserv_time(rs.getString(8));
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

	// 해당진료번호 삭제.
	public void deleteReserve(String reserv_num, int chk) {

		try {
			conn = init();
			System.out.println("진료완료일경우");
			if (chk == 100) { // 100이면(진료완료일경우) 테이블에서 삭제전 ReserveComplete(진료완료테이블)에 넘겨야한다.
				String sql = "SELECT * FROM RESERVATION WHERE reserv_num=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, reserv_num);
				rs = pstmt.executeQuery();

				while (rs.next()) {
					ReserveComplete_DTO rcDTO = new ReserveComplete_DTO();
					rcDTO.setComp_id(rs.getString(1));
					rcDTO.setComp_num(rs.getInt(2));
					rcDTO.setComp_hosname(rs.getString(3));
					rcDTO.setComp_deptname(rs.getString(4));
					rcDTO.setComp_docname(rs.getString(5));
					rcDTO.setComp_date(rs.getString(7));
					rcDTO.setComp_symptom(rs.getString(6));
					ReserveComplete_DAO.getInstance().insertMethod(rcDTO);
					System.out.println("진료완료로 옮기기완료");

				} // while
				exit();
			} // if
				// 아래는 정상삭제.
			conn = init();
			String sql = "delete from RESERVATION WHERE reserv_num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reserv_num);
			rs = pstmt.executeQuery();

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

	}// deleteReserve

}
