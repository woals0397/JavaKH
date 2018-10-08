package java0920_class;

public class Java085_static {
	public static void display() {
		System.out.println("display");
	}
	
	public void process() {
		System.out.println("process");
		display();
	}
	
	public static void main(String[] args) {
		display();
		/*
		 * static이 선언된 메소드에서는 비-static자원(멤버변수, 메소드)를 호출할 수 없다.
		 */
		//process();
		
		Java085_static js = new Java085_static();
		js.process();
	}
	
}
