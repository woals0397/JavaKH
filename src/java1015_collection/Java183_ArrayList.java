package java1015_collection;

import java.util.ArrayList;

public class Java183_ArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);
	}
	
	public static void prnDisplay(ArrayList<String> aList) {
		// aList매개변수의 요소에서 'j'가 포함되어 있는 요소만 출력하는 프로그램을 구현하세요.
		for(String sn : aList) {
			if(sn.contains("j"))
				System.out.println(sn.toString());
		}
	}
}
