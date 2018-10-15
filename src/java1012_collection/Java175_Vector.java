package java1012_collection;

import java.util.Vector;

public class Java175_Vector {

	public static void main(String[] args) {
		Vector v=new Vector(3);
		//Integer -> Object : up-casting
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		v.add(new Integer(40));
		//2index의 요소를 제거
		v.remove(2);
		System.out.println(v.capacity());//메모리 크기
		System.out.println(v.size());//요소 크기
		for(int i=0;i<v.size();i++) {
			Integer it=(Integer)v.get(i);
			System.out.println(it);
		}
		
	}

}
