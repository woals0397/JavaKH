package java1101_jdbc;

import java.util.List;
import java.util.Scanner;

public class Java234_jdbc {
	public static void main(String[] args) {
		DepartmentDAO dao = DepartmentDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 부서명 입력:");
		String data = sc.nextLine();
		List<DepartmentDTO> aList = dao.searchMethod(data);
		for(int i = 0; i < aList.size(); i++) {
			DepartmentDTO dto = aList.get(i);
			System.out.printf("%d %s %d %d\n", dto.getDepartment_id(), dto.getDepartment_name(), dto.getManager_id(), dto.getLocation_id());
		}
	}
}
