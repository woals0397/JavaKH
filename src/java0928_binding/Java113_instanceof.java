package java0928_binding;

/*
 * instanceof : 객체를 비교하기 위한 비교연산자이다.
 * a instanceof A
 * : a객체가 A타입이면 true, 아니면 false 리턴한다.
 */

class ExamA{
	void prn() {
	}
}

class ExamB extends ExamA{
	void prn() {
	}
}

class ExamC extends ExamB{
	
}

public class Java113_instanceof {
	
	public static void main(String[] args) {
		// 객체 instanceof 비교 데이터타입과 같거나 조상 데이터타입
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA);
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB);
		
		ExamA ea = new ExamB();
		System.out.println(ea instanceof ExamA);
		System.out.println(ea instanceof ExamB);
		System.out.println(ea instanceof ExamC);
	}
}
