package java0927_abstract_interface;

/*				class				interface
 * 멤버변수        		  o						상수
 * 메소드	                선언부+구현부			선언부(추상메소드)	 
 * 생성자 			  o						x
 * 초기화블록		  o						x
 * 내부클래스		  o						o
 * 
 * 
 * extends : 클래스에 클래스를 상속(단일상속), 인터페이스에 인터페이스 상속(다중상속)
 * implements : 클래스에 인터페이스 상속(다중상속)
 * 
 * 인터페이스(interface)
 * 1 추상메소드와 상수를 가지고 있는 형태이다.
 * 2 클래스 작성에 도움을 주기위한 목적으로 제공이 되는 표준명세서이다.
 * 3 implements : 클래스에 인터페이스를 상속할 때 사용되는 키워드이다.
 * 4 인터페이스는 접근제어자로 public만 제공한다.
 * 5 인터페이스는 추상메소드에 abstract키워드를 명시하지 않아도 된다.
 *   자바가상머신에서 자동처리하기 때문에...
 */


interface CarRun{
	int carCount=5;	// public static final 생략
	
	//public CarRun() {}	// 생성자 가질수 없음
	
	void prn();	// public abstract 생략
	
	//void display() {}   // 구현부없어야함
	
	class Sun{}	// 내부클래스 가능
}

class TruckRun implements CarRun{
	public TruckRun() {
		
	}
	
	@Override
	public void prn() {
		System.out.println("prn");
	}
}


public class Java105_interface {
	
	public static void main(String[] args) {
		System.out.println(CarRun.carCount);	// new키워드로 객체생성없이 바로 호출 가능
		
		TruckRun tr = new TruckRun();
		tr.prn();
	}
}
