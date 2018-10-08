package java0921_inheritance;

/*
다음과 같은 결과가 나오도록 구현하시오.
(단, main()안의 내용수정과 새로운 Method추가하지마시오)

**** x,y,z에 값채우기*** 
10을 넘겨받은 생성자
10   20   을 넘겨받은 생성자
10   20   30  을 넘겨받은 생성자
10   20   30
합 : 60

*/

class SuperClass {
	int x, y, z;

	public SuperClass() { 
		System.out.println("**** x,y,z에 값채우기***");  
	} 

	public SuperClass(int k) { 
		this(); 
		this.x = k; 
		System.out.println(k + "을 넘겨받은 생성자"); 
	} 

	public SuperClass(int a, int b) { 
		this(a); 
		this.y = b; 
		System.out.println(a + "   " + b + "   을 넘겨받은 생성자");
	}

	public SuperClass(int a, int b, int c) { 
		this(a, b); 
		z = c; 
		System.out.println(a + "   " + b + "   " + c + "   을 넘겨받은 생성자");
	}

	public void display() { 
		System.out.printf("%d %d %d\n", x, y, z); 
	} 
}// end SuperClass

class SubClass extends SuperClass {

	public SubClass(int a, int b, int c) { 
		// 여기를 구현하세요.//////////////////////
		super(a, b, c);
		display();
		sumData();
		//////////////////////////////
	}

	public void sumData() {  
		System.out.println("합 : " + (x + y + z)); 
	}
}// end SubClass

public class Java098_inheritance {

	public static void main(String[] args) { 
		SubClass ss = new SubClass(10, 20, 30); 

	}// end main( )

}// end class
