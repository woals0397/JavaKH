package java1105_jdbc;

import java.util.List;

public class Java239_Jdbc {
	public static void main(String[] args) {
		JoinDAO dao = JoinDAO.getInstance();
		List<EmpDTO> aList = dao.listMethod();
		
		for(EmpDTO dto : aList) {
			System.out.printf("%d %s %d %d %s\n", dto.getEmployee_id(), dto.getFirst_name(), dto.getSalary(), dto.getDept().getDepartment_id(), dto.getDept().getDepartment_name()); 
		}
	}
}
