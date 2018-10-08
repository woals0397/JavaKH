package java0927_abstract_interface;

/*
 * final
 * 1 변수 : 상수
 *   int num = 20;
 *   num = 30;
 *   
 *   final int DATA;      (X)  => 반드시 초기값을 할당해야 한다.
 *   final int DATA = 5;  (O)
 *   DATA = 15;           (X)  => 값을 변경할 수 없다.
 *   
 * 2 메소드 : 오버라이딩을 할 수 없다.
 *   final void prn(){}        => 메소드에 final이 붙으면 오버라이딩은 할 수 없다.
 *   
 * 3 클래스 : 상속을 할 수 없다.
 *   final class Test{}
 *   
 */

class FinalTest{
	final int CODE = 1;
	
	void display() {
		// 상수는 새로운 값을 할당 할 수 없다.
		//CODE = 5;
	}
	
	void call() {
		System.out.println("call");
	}
	
	final void process() {
		System.out.println("process");
	}	
}


class UserFinal extends FinalTest{
	public UserFinal() {
		
	}
	
	@Override
	void call() {
		System.out.println("override call");
	}
	
	// process()메소드는 final이 선언되어 있기 때문에 오버라이딩을 할 수 없다.
	//void process() {}
}

final class Base{}

// final이 선언된 Base은 상속을 할 수 없다.
//class Expand extends Base{}

public class Java108_final {
	public static void main(String[] args) {
		
	}
}
