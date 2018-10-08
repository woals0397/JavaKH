package java0917_method;

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */

public class Java053_method {
	
	public static void test(int point) {
		System.out.println(point + "포인트가 적립되었습니다.");
	}
	
	public static void process(String name, boolean chk) {
		if(chk) {
			System.out.println(name + "님은 회원입니다.");
		}else {
			System.out.println(name + "님은 비회원입니다.");
		}
	}
	
	public static void main(String[] args) {
		// 매개변수가 선언된 메소드를 호출할 때 매개변수에 정의된 데이터 타입과 일치하는 값을 넘겨준다.
		process("홍길동", true);
		test(3000);
	}
	
	

}
