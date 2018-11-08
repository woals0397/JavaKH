package java1102_jdbc;

import java.util.HashMap;
import java.util.List;

public class Java235_Jdbc {
	public static void main(String[] args) {
		MemDAO dao = MemDAO.getInstance();
		
		/*
		MemDTO md = new MemDTO("앵두", 40, "북경");
		dao.insertMethod(md);
		*/
		
		/*
		HashMap<String,Object> map = new HashMap<>();
		map.put("name", new String("윤아"));
		map.put("num", new Integer(1));
		dao.updateMethod(map);
		*/
		
		dao.deleteMethod(3);
		
		List<MemDTO> aList = dao.listMethod();
		for(MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n", dto.getNum(), dto.getName(), dto.getAge(), dto.getLoc());
	}
}
