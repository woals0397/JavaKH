package java0917_method;

/*
 * 메소드(method) 정의
 * 1. 값을 계산하기 위해서 사용되는 기능이다.
 * 2. 객체의 동작을 처리하기 위한 기능이다.
 * 
 * method구조 : 메소드 선언부 + 메소드 구현부
 *   반환형 메소드명(데이터타입  매개변수)          => 메소드 선언부
 *   {   
 *         메소드가 처리해야 할 로직 구현;         => 메소드 구현부
 *         return 값;
 *   }
 *   
 * 1 리턴값이 없고 매개변수도 없다.
 *   void add(){
 *   	int x = 10;
 *   	int y = 20;
 *   	if(y > 30){
 *   		return;     => 반환타입이 없으므로 반환값은 없어야한다.
 *   	}
 *   	System.out.println(x+y);
 *   }
 *   
 *   add(); => 호출
 * 
 * 
 * 2 리턴값은 없지만 매개(parameter)변수는 있다.
 *   void plus(int x, int y){
 *   	System.out.println(x+y);
 *   }
 *   
 *   plus(10, 20); => 호출
 * 	
 *   System.out.println(plus(10, 20));   (x)
 *     
 *     
 * 3 리턴값은 있으나 매개변수가 없다.
 *   double avg(){
 *   	int total = 15;
 *   	return total/3.0;
 *   }
 *   
 *   double res = avg();       => 호출
 *   System.out.println(res);
 *   =====================================
 *   
 *   System.out.println(avg());   (O)
 *   
 *   
 * 4 리턴값 있고 매개변수도 있다.
 * 	 double avg(int x, int y){
 * 		retunr (x+y)/2.0;
 *   }
 *  
 *  double res = avg(10, 20);     => 호출
 *  System.out.println(res);
 *  
 *  
 *  ==> return타입이 반환형타입보다 작을 경우에도 형변환(casting)이 되어 return이 가능하다.
 */

public class Java052_method {
	// 프로그램을 실행하면 JVM(자바가상머신 - Java Virtual Machine)에서 main스레드에 의해서 main()메소드를 호출한다.
	public static void main(String[] args) { // 1
		 System.out.println("main start"); // 2
		 
		 // makeTest()메소드 호출(call) - 정의된 메소드를 호출해야만 실행한다.
		 makeTest(); // 3
		 
		 System.out.println("main end"); // 7
	} // 8
	
	// 메소드 정의
	public static void makeTest() { // 4
		System.out.println("makeTest"); // 5
	} // 6
}
