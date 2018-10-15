package java1012_collection;

import java.util.Vector;
/*
 * 배열: length키워드
 * 문자열:length()메소드
 * 컬렉션:size()메소드
 * 
 * 컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다.
 * 제너릭(generic):컬렉션 클래스에 저장된 객체를 가져올때
 * 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.
 */
public class Java177_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));

		System.out.println("///////////일반 반복문//////////");
		for (int i = 0; i < v.size(); i++) {
			String data = v.get(i);
			System.out.println(data);
		}
		System.out.println("///////////개선된 루프//////////");
		// for(데이터타입 변수 : 배열 or 컬렉션)
		for (String st : v) {
			System.out.println(st);
		}

		Vector<Number> vt = new Vector<Number>();
		// Integer->Number->Object : up-casting
		vt.add(new Integer(10));
		// Float->Number->Object : up-casting
		vt.add(new Float(5.4f));
		// Double->Number->Object : up-casting
		vt.add(new Double(3.4));

		for (Number ne : vt) {
			if (ne instanceof Integer) {
				Integer it = (Integer) ne;
				System.out.println(it);
			} else if (ne instanceof Float) {
				Float ft = (Float) ne;
				System.out.println(ft);
			} else if (ne instanceof Double) {
				double de = (double) ne;
				System.out.println(de);
			}
		}

	}

}
