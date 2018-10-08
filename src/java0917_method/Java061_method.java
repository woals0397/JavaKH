package java0917_method;

/*
 * [출력결과]
 * 20는 양수입니다.
 * 0는 0입니다.
 * -20는 음수입니다.
 */

public class Java061_method {
	public static void main(String[] args) {
		process(20);
		process(0);
		process(-20);
	}
	
	public static void process(int num) {
		// num변수의 값이 0보다 크면 "양수", 0이면 "0", 0보다 작으면 "음수"로 출력하는 프로그램을 구현하세요.
		if(num > 0)
			System.out.printf("%d는 양수입니다.\n", num);
		else if(num < 0)
			System.out.printf("%d는 음수입니다.\n", num);
		else
			System.out.printf("%d는 0입니다.\n", num);
	}
}
