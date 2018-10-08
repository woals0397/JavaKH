package java0918_class;

/*
 * 생성자(constructor)
 * 1 멤버변수를 초기화하기 위한 목적으로 사용한다.(한번만 호출)
 * 2 클래스명과 같다.
 * 3 클래스는 한개 이상의 생성자는 갖는다.
 * 4 생성자는 리턴타입이 없다.
 * 5 클래스에 생성자가 정의되어 있지 않으면 JVM에서 기본생성자를 제공한다.
 * 6 기본생성자는 클래스의 접근제어자를 그대로 사용한다.
 */

class HandPhone{
	// 멤버변수
	String name;
	String number;
	
	// 생성자
	HandPhone(){}
	
	// class에 한개라도 생성자가 정의가 되어있다면 기본생성자를 제공하지 않는다.
	// 위에 기본생성자를 정의해주지 않으면 메인문에서 오류가 발생한다.
	HandPhone(String ne, String nb){
		name = ne;
		number = nb;
	}
	
	// 메소드
	void prn() {
		System.out.printf("%s %s\n", name, number);
	}
	
}

public class Java070_constructor {
	public static void main(String[] args) {
		/*
		 * 1. stack영역에 4바이트 생성
		 * 	  (객체변수 선언 : HandPhone ph)
		 * 2. heap영역에 HandPhone크기만큼 메모리 생성
		 * 	  (new)
		 * 3. 멤버변수에 초기값 할당
		 * 	  (생성자 호출 : HandPhone())
		 * 4. heap의 주소를 stack에 저장
		 * 	  (=)
		 */
		HandPhone ph = new HandPhone();
		ph.name = "홍길동";
		ph.number = "010-2563-9029";
		ph.prn();
		
		HandPhone ne = new HandPhone("이영희", "010-9725-8525");
		ne.prn();
	}
}
