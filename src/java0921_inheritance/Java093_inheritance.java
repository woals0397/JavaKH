package java0921_inheritance;

class MyGrand{
	public MyGrand() { // 7
		System.out.println("MyGrand"); // 8
	} // 9
}

// 자식클래스에 있는 생성자에서는 부모클래스의 생성자를 반드시 호출해야 한다.
class MyFather extends MyGrand{
	public MyFather() { // 5
		super(); // 6
		System.out.println("MyFather"); // 10
	} // 11
}

// 객체안에서 this는 자신을 의미, super는 부모객체를 의미한다.
class MyChild extends MyFather{
	public MyChild() { // 3
		// 자식생성자에서는 반드시 부모생성자를 호출해야 한다.
		// 부모생성자 호출이 생략되어 있으면 JVM에서 super()로 호출한다.
		super(); // 4
		System.out.println("MyChild"); // 12
	} // 13
}

public class Java093_inheritance {
	public static void main(String[] args) { // 1
		MyChild m = new MyChild(); // 2		
	} // 14
}
