package java0918_class;

/*
 * [사각형 도형]
 * 가로	세로	넓이를 구한다	둘레를 구한다
 * 5	3	  15	        16
 * 7	4	  28	        22
 * 
 * [객체모델링과정]
 * 객체의 특징 : 가로, 세로
 * 객체의 기능 : 넓이를 구한다. 둘레를 구한다.
 * 
 * [출력결과]
 * [가로5, 세로3의 사각형]
 * 넓이 : 15
 * 둘레 : 16
 * ====================
 * [가로7, 세로4의 사각형]
 * 넓이 : 28
 * 둘레 : 22
 */

class Rect{
	int width;	// 가로
	int height;	// 세로
	
	// 널비을 구하는 메소드 정의
	int area() {
		return width*height;
	}
	
	// 둘레를 구하는 메소드 정의
	int grith() {
		return (width+height)*2;
	}
	
	void prn() {
		System.out.printf("[가로%d, 세로%d의 사각형]\n", width, height);
		System.out.printf("넓이 : %d\n", area());
		System.out.printf("둘레 : %d\n", grith());
	}
}

public class Java067_class {
	public static void main(String[] args) {
		Rect t1 = new Rect();
		t1.width = 5;
		t1.height = 3;
		t1.prn();
		
		System.out.println("===================================");
		
		Rect t2 = new Rect();
		t2.width = 7;
		t2.height = 4;
		t2.prn();
	}
}
