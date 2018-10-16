package java1016_collection;

import java.util.LinkedList;

/*
 * stack(스택)
 * 1 LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 * 
 */

public class Java192_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<>();
		// 추가
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());
	}
}
