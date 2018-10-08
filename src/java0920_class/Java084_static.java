package java0920_class;

/*
 * class 클래스명{
 * 	  멤버변수;
 * 	 static {}
 * 	  생성자(){}
 * 	  메소드(){}
 * 	  내부클래스
 * }
 * 
 */

class OrderStatic{
	static {
		System.out.println("static");
	}
	
	public OrderStatic() {
		System.out.println("constructor");
	}
		
	public void prn() {
		System.out.println("method");
	}
}

public class Java084_static {
	
	public static void main(String[] args) {
		OrderStatic st = null;
		st = new OrderStatic();
		st.prn();
	}
}
