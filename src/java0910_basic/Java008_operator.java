package java0910_basic;

public class Java008_operator {

	public static void main(String[] args) {
		int x = 3;
		// 증가연산자 : 변수의 값을 1 증가한다.
		++x; // x = x+1;
		System.out.println("x = " +x);
		
		int y = 5;
		// 감소연산자 : 변수의 값을 1 감소한다.
		--y; // y = y-1;
		System.out.println("y = " +y);
		
		// 리터널, 상수는 증가, 감소연산자를 사용할 수 없다.
		//System.out.println(++10); error
		final int z = 8;
		//++z; error
		System.out.println("z = " +z);
	}

}
