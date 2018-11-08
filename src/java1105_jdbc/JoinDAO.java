package java1105_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JoinDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private static JoinDAO dao = new JoinDAO();

	private JoinDAO() {

	}

	public static JoinDAO getInstance() {
		return dao;
	}

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

	public List<EmpDTO> listMethod() {
		List<EmpDTO> aList = new ArrayList<>();

		try {
			conn = init();
			stmt = conn.createStatement();
			String sql = "SELECT e.employee_id, e.first_name, e.salary, d.department_id, d.department_name " + 
						"FROM employees e, departments d " + 
						"WHERE e.department_id = d.department_id " + 
						"ORDER BY e.employee_id";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				EmpDTO edto = new EmpDTO();
				edto.setEmployee_id(rs.getInt("employee_id"));
				edto.setFirst_name(rs.getString("first_name"));
				edto.setSalary(rs.getInt("salary"));
				
				DeptDTO dept = new DeptDTO();
				dept.setDepartment_id(rs.getInt("department_id"));
				dept.setDepartment_name(rs.getString("department_name"));
				
				edto.setDept(dept);	//DeptDTO객체를 EmpDTO객체안에 저장(=조인)
				
				aList.add(edto);
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

}
