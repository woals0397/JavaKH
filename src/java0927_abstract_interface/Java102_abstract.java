package java0927_abstract_interface;

/*
 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
 * 메소드 정의 : 메소드 선언부 + 메소드 구현부
 * public void prn(){}
 * 
 * 추상메소드 : 메소드 선언부만 정의되여 있는 메소드이다.
 * abstract public void prn();
 * 
 * 
 * 추상클래스(abstract) : 추상메소드를 가지고 있는 클래스이다.
 * abstract public class Test{}
 * 
 * 추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고 객체생성을 할 수 없도록 하기 위해서이다.
 */

/*
 * Car : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. work()
 * Senda extends Car:
 * Truck extends Car:
 */

abstract class CarAbs{	// 추상클래스
	int speed;
	String color;
	
	abstract public void work();	// 추상메소드
	public void display() {
		System.out.printf("%d %s\n", speed, color);
	}
}

class TruckAbs extends CarAbs{
	
	@Override
	public void work() {
		System.out.println("트럭에 짐을 싣고 있다.");
	}
}


class SendaAbs extends CarAbs{
	
	@Override
	public void work() {
		System.out.println("승용차가 사람을 태우고 있습니다.");
	}
}

public class Java102_abstract {
	public static void main(String[] args) {
		// 추상클래스는 객체생성을 할 수 없다. ==> 불안정한 클래스이기 때문에
		//CarAbs ca = new CarAbs();
		
		TruckAbs truck = new TruckAbs();
		truck.work();
		
		SendaAbs senda = new SendaAbs();
		senda.work();
	}
}
