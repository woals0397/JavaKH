package java1015_collection;

import java.util.Arrays;
import java.util.List;

public class Java185_ArrayList {
	public static void main(String[] args) {
		String[] arr = {"oracel", "mysql", "mssql"};
		// 배열 -> 컬렉션(List)
		
		List<String> list = Arrays.asList(arr);
		for(String sn : list)
			System.out.println(sn);
		
		
	}
}
