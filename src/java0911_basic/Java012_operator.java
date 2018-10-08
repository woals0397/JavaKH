package java0911_basic;

public class Java012_operator {

	public static void main(String[] args) {
		int a = 4;
		int b = 5;
		int c = 7;
		
		// 논리연산자가 사용되면 무조건 좌변먼저 처리된다
		// &&연산자일 경우, 좌변이 false가 나오면 우변이 뭐든지간에 false가 나오므로 우변은 수행되지 않는다.
		boolean res = (++a > b) && (++b < c);
		System.out.println("a = " + a); // a = 5
		System.out.println("b = " + b); // b = 5
		System.out.println("res = " + res); // res = false
		
		a = 4;
		b = 5;
		res = (++a == b) && (++b < c);
		System.out.println("a = " + a); // a = 5
		System.out.println("b = " + b); // b = 6
		System.out.println("res = " + res); // res = true

		
		int x = 4;
		int y = 8;
		int z = 10;
		
		// ||연산자일 경우, 좌변이 true가 나오면 우변이 뭐든지간에 true가 나오므로 우변은 수행되지 않는다.
		res = (z > ++y) || (++x > y);
		System.out.println("x = " + x); // x = 5
		System.out.println("y = " + y); // y = 9
		System.out.println("res = " + res); // res = T
	}

}
