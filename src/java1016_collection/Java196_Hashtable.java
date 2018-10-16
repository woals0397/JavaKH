package java1016_collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

/*
 * Hashtable
 * 1 Map인터페이스 구현해놓은 클래스
 * 2 Map인터페이스를 구현해놓은 클래스들은 key, value쌍으로 저장한다.
 * 3 value을 구현해주는 것은 key이므로 key은 중복을 허용하지 않는다.
 */

public class Java196_Hashtable {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<>();
		
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		
		System.out.println(table.get(20));	// jsp
		
		System.out.println("//Enumeration///////////////");
		Enumeration<Integer> enu = table.keys();
		while(enu.hasMoreElements()) {
			Integer key = enu.nextElement();
			System.out.printf("%d : %s\n", key, table.get(key));
		}
		
		System.out.println("//Iterator//////////////////");
		Set<Integer> set = table.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d : %s\n", key, table.get(key));
		}
	}
}
