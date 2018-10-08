package java0921_inheritance;

/*
 * 오버라이딩(overriding)
 * 1 조상클래스의 메소드를 자식클래스에서 재정의(메소드 구현부)하는 기능이다.
 * 2 메소드의 선언부는 그대로 사용한다. (리턴데이터타입, 메소드명, 매개변수)
 *   단, 접근제어자는 같거나 크면된다.
 *   private < default < protected < public
 * 3 오버라이딩은 상속을 받은 후 할 수 있다.
 * 
 * super
 * 1. 자식클래스에서 부모클래스를 호출할때 사용한다.
 * 2. super.멤버변수
 *    super.메소드()
 *    super() => 생성자
 *    
 * 단일클래스            VS 상속클래스
 * overloading VS overriding
 * this        VS super
 * 
 */

class First{
	int a = 10;
	
	void prn() {
		System.out.println("a=" + a);
	}
}

class Second extends First{
	int b = 20;
	int a = 30;
	
	// Override를 할 경우 부모클래스의 접근제어자보다 크거가 같아야 한다.
	@Override
	public void prn() {
		System.out.printf("a=%d b=%d\n", super.a, b);
	}
	
	public void display() {
		System.out.println("display");
	}
	
	// static이 선언된 메소드에서는 super, this키워드를 사용할 수 없다.(메모리가 선언되는 시점이 다르기 때문에)
	public void superThisMethod() {
		super.prn();
		this.prn();
	}
}

public class Java096_inheritance {
	public static void main(String[] args) {
		Second sd = new Second();
		sd.prn();
		sd.display();
		sd.superThisMethod();
	}
}
