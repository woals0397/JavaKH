package java1016_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Java187_Sort {
	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,3,5,2,4};
		ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(arr));
		
		// 오름차순
		aList.sort(new Ascending());
		System.out.println(aList);
		
		// 내림차순
		aList.sort(new Descending());
		System.out.println(aList);
		
		System.out.println("// 앞 -> 뒤 //////////////////");
		
		ListIterator<Integer> ite = aList.listIterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		
		System.out.println("// 뒤 -> 앞 //////////////////");
		
		// 앞에 코드를 주석처리 후에 실행시키면 아무것도 찍히지 않는다.
		// ListIterator가 가르키는 인덱스가 처음에는 0번째 칸을 가르키기때문에 그전에 커서를 이동시킨후에 사용할 수 있다.
		while(ite.hasPrevious())
			System.out.println(ite.previous());
	}
}
