package java0918_class.prob;

/*피자의 반지름을 10, 도넛의 반지름은 2로 한다.
 * 
 * [실행결과]
 * 자바피자의 면적은 314.0
 * 자바도넛의 면적은 12.56
 */

class Circle {
	int radius; // 원의 반지름을 저장하는 멤버 변수
	String name; // 원의 이름을 저장하는 멤버 변수

	public double getArea() { // 멤버 메소드
		return 3.14 * radius * radius;
	}
}// end class////////////////////////

public class Prob01_class {

	public static void main(String[] args) {
		//여기를 구현하세요.////////////////////	
		Circle c1 = new Circle();
		c1.radius = 10;
		c1.name = "자바피자";
		System.out.printf("%s의 면적은 %.1f\n", c1.name, c1.getArea());
		
		Circle c2 = new Circle();
		c2.radius = 2;
		c2.name = "자바도넛";
		System.out.printf("%s의 면적은 %.2f\n", c2.name, c2.getArea());	
	}//end main()

}//end class
