package java0919_class;

/*
 * 오버로딩(Overloading)
 * 1 하나의 클래스에 같은 이름의 메서드를 여러개 정의 하는 것을 오버로딩이라한다.
 * 2 오버로딩의 조건
 * 	1) 메서드의 이름이 같아야 한다.
 * 	2) 매개변수의 갯수 또는 데이터 타입이 달라야 한다.
 * 	3) 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.
 * 	   (즉 리턴 타입은 오버로딩을 구현하는데 아무런 영향을 주지 않는다.)
 */

class Calculator{
	// 매개변수의 갯수가 다르거나 매개변수의 데이터타입이 다르면 오버로딩(Overloading)가능
	// 단, 리턴타입은 오버로딩구분에 사용되지 않는다. 
	void addValue(int x, int y) {
		System.out.println(x+y);
	}
	
	void addValue(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void addValue(double x, double y) {
		System.out.println(x+y);
	}
}

public class Java079_overloading {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addValue(4, 8);
		cal.addValue(2, 7, 5);
		cal.addValue(1.0, 2.0);
	}
}
