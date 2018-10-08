package java0910_basic;

public class Java007_operator {

	public static void main(String[] args) {
		int numa = 3;
		int numb = 4;
		System.out.println(numa + numb); // 산술연산자
		System.out.println(numa + "는(은) 삼입니다."); // 문자열연결
		System.out.println("numa = " + numa);
		
		// 결과 = 7
		System.out.println("결과 = " + (numa + numb)); // 결과 = 7
		System.out.println("결과 = " + numa + numb); // 결과 = 34
	}

}
