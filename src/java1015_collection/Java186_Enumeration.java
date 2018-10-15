package java1015_collection;

import java.util.Iterator;
import java.util.Vector;

// Enumeration은 Vector와 Hashtable에서만 제공이 되는 인터페이스이다.

public class Java186_Enumeration {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		/*
		for(int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		*/

		/*
		// 열거형
		Enumeration<Integer> enu = v.elements();
		while(enu.hasMoreElements())
			System.out.println(enu.nextElement());
		*/
		
		/*
		// 반복자
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());
		*/
		
		for(Integer ig : v)
			System.out.println(ig);
		
	}
}
