package java0921_inheritance;

/*
 * 상속(inheritance)
 * 1 기본 클래스를 재사용하여 새로운 클래스를 정의하는 것이다.
 * 2 두 클래스를 조상과 자손 관계를 맺어준다(extends)
 * 3 상속을 해주는 클래스 : 수퍼클래스, 부모클래스, 기본클래스
 *   상속을 받는 클래스 : 서브클래스, 자식클래스, 유도클래스
 * 4 자식(손)클래스는 조상의 모든 자원을 상속받는다.
 *   (생성자, static{}은 제외)
 * 5 자식(손)의 자원은 부모보다 크거나 같아야 한다.(자식클래스 => 부모클래스)
 * 6 상속을 할때 사용되는 키워드 : extends(단일상속)
 * 
 * class A{}
 * class b extends A{}
 * =>자식 클래스 B extends 부모클래스 A
 * - A는 B에게 상속한다.
 * - B는 A이다.(상속관계의 클래스를 is a 관계라한다.)
 * 
 * class 도형{}
 * class 삼각형 extends 도형{}
 * 삼각형은 도형이다.
 * ========================
 * class Test{}
 * class Sample{
 * 	 public static void main(String[] args){
 * 		Test tt = new Test();
 *   }
 * }
 * 
 * Sample은 Test를 포함한다.(포함관계-has a)
 * 
 */

class Father{
	int a = 3;
	void prn() {
		System.out.println("a="+a);
	}
}

// Child는 Father을 상속받는다(Child는 Father이다)
class Child extends Father{
	int b = 5;
}

public class Java092_inheritance {
	public static void main(String[] args) {
		Child cd = new Child();
		System.out.println("cd.a=" + cd.a);
		cd.prn();
	}
}
