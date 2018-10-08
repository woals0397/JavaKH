package java1004_api;

/*
 * 1 기본자료형을 클래스로 정의해 놓은 것을  Wrapper라 한다
 *   char	-> Character
 *   byte	-> Byte
 *   short	-> Short
 *   int	-> Integer
 *   long 	-> Long
 *   float 	-> Float
 *   double	-> Double
 *   boolean -> Boolean
 *
 * 2 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
 *   Wrapper클래스를 제공한다.
 * 
 * 3 auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 *   auto boxing => 스택 -> 힙영역에 복사
 *   auto unboxing => 힙 -> 스택영역에 복사    
 */

public class Java142_Wrapper {
	public static void main(String[] args) {
		String data = "1234";
		
		// String -> Integer
		Integer it = new Integer(data);
		
		// Integer -> int
		int num = it.intValue();
		
		// Integer -> double
		double pro = it.doubleValue();
		
		// Integer -> long
		long nn = it.longValue();
		
		// String -> Float
		Float ft = new Float(data);
		
		// Float -> int
		int num1 = ft.intValue();
		
		// Float -> double
		double da = ft.doubleValue();
		
		int x = 10;	// stack
		
		// Integer ig = new Integer(x);	// heap
		Integer ie = x;	// auto boxing (stack -> heap)
		
		// int y = ie.intValue();
		int y = ie;	// auto unboxing (heap -> stack)
		
		double z = ie;	// auto unboxing (heap -> stack)
	}
}
