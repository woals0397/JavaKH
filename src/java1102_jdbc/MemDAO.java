package java1102_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MemDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private MemDAO() {

	}

	private static MemDAO dao = new MemDAO();

	public static MemDAO getInstance() {
		return dao;
	}

	private Connection init() throws ClassNotFoundException, SQLException {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");

		// 서버연결
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);

	}

	private void exit() throws SQLException {
		if (rs != null)
			rs.close();
		if (stmt != null)
			stmt.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}

	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<>();
		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT * FROM mem ORDER BY num";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemDTO dto = new MemDTO(rs.getString("name"), rs.getInt("age"), rs.getString("loc"));
				dto.setNum(rs.getInt("num"));
				aList.add(dto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return aList;
	}

	public void insertMethod(MemDTO dto) {
		try {
			conn = init();
			// stmt = conn.createStatement();
			// String sql = "INSERT INTO mem(num,name,age,loc) VALUES(mem_num_seq.nextval,
			// '"+dto.getName()+"',"+dto.getAge()+",'"+dto.getLoc()+"')";
			// stmt.executeUpdate(sql);
			String sql = "INSERT INTO mem(num,name,age,loc) VALUES(mem_num_seq.nextval,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());

			// SELECT -> ResultSet executeQuery()
			// INSERT, UPDATE, DELETE -> int executeUpdate()
			pstmt.executeUpdate(); // Jdbc API에서는 쿼리문을 실행하면 자동적으로 commit이 된다.

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public void updateMethod(HashMap<String, Object> map) {
		try {
			conn = init();
			String sql = "UPDATE mem SET name=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, (String) map.get("name"));
			pstmt.setInt(2, (Integer) map.get("num"));
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteMethod(int num) {
		try {
			conn = init();
			String sql = "DELETE FROM mem WHERE num = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				exit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
