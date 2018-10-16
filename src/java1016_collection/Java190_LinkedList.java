package java1016_collection;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 1 배열 구조로 데이터 관리 : Vector, ArrayList
 * 					  ArrayList-추가-(순차적으로 처리할때 사용)
 * 2 링크로 데이터 관리 : LinkedList
 *                 삽입, 삭제-(비순차적으로 처리할때 사용)
 * 3 List을 구현해놓은 컬렉션
 *   Vector, ArrayList, LinkedList은 add()해준 순서대로 데이터 관리를 해준다.
 */

public class Java190_LinkedList {
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		System.out.println(aList);
		
		System.out.println("///////////////////////////");
		// 추가
		LinkedList<String> aNode = new LinkedList<>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		System.out.println(aNode);
		
		// 삽입
		aNode.add(1, new String("ajax"));
		System.out.println("삽입\n" + aNode);
		
		// 삭제
		aNode.remove(2);
		System.out.println("삭제\n" + aNode);
	}
}
