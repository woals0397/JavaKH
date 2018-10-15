package java1012_collection;

import java.util.Vector;

public class Java179_Vector {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add(new String("java"));
		
		v=new Vector<String>(2);
		v.add(new String("seoul"));
		v.add(new String("busan"));
		v.add(new String("inchon"));
		
		System.out.println("용량:"+v.capacity());
		System.out.println("크기:"+v.size());
		
		v=new Vector<String>(2,1);
		v.add(new String("홍길동"));
		v.add(new String("영순이"));
		v.add(new String("갑돌이"));
		
		System.out.println("용량:"+v.capacity());
		System.out.println("크기:"+v.size());
		
	}

}
