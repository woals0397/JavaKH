package java1012_collection;

import java.util.Vector;

public class Java180_Vector {

	public static void main(String[] args) {
		Vector<Integer> v= new Vector<Integer>();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		System.out.println(v.capacity());
		//요소가 저장되여 있지 않은 메모리 제거
		v.trimToSize();
		System.out.println(v.capacity());
			

	}

}
