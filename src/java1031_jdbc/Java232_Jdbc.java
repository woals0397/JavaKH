package java1031_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class JdbcTest {
	Connection conn;
	Statement stmt;
	ResultSet rs;

	public JdbcTest() {

	}

	void process() {

		try {
			// 1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. 서버연결
			String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
			String username = "hr";
			String password = "a1234";
			conn = DriverManager.getConnection(url, username, password);

			// 3. 쿼리문을 실행하기 위한 Statement타입의 객체를 리턴
			stmt = conn.createStatement();

			// 4. 쿼리문을 실행한다.
			String sql = "SELECT * FROM departments ORDER BY department_id";
			rs = stmt.executeQuery(sql);
			
			// 5. 쿼리문 결과 출력
			while (rs.next()) {
				int departmentId = rs.getInt("department_id");
				String departName = rs.getString("department_name");
				int manId = rs.getInt("manager_id");
				int locId = rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, departName, manId, locId);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 6. 연결종료
			// 연결종료를 해주지 않으면 데이터베이스는 접근이 종료됐다고 인식하지 못한다.
			if(rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(stmt != null)
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if(conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}

public class Java232_Jdbc {
	public static void main(String[] args) {
		new JdbcTest().process();
	}
}
