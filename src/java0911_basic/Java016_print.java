package java0911_basic;

public class Java016_print {
	public static void main(String[] args) {
		System.out.println("java");
		System.out.println("jsp");
		System.out.print("spring\n");
		System.out.print("oracle\n");
		
		
		/*
		 * printf("출력형식", 값1, 값2...)
		 * 
		 * 출력기호
		 * %s : 문자열
		 * %d : 정수
		 * %f : 실수
		 * %c : 문자
		 * %b : 논리
		 * %% : %
		 * \ : 특수문자를 처리하는 기호
		 */
		
		System.out.printf("%s\n", "mybatis");
		System.out.printf("%d\n", 50L); // byte, short, int, long
		System.out.printf("%f\n", 4.5f); // float, double
		System.out.printf("%c %b %d\n", 'a', true, 10);
		
		// 소수점 첫번째까지 출력을 한다.(반올림)
		System.out.printf("%.1f\n", 4.56);
		System.out.printf("%.1f\n", 4.51);
		
		// 5는 총자릿수(소수점 포함)  .1은 소수점 자릿수
		System.out.printf("%5.1f\n", 4.56);
		System.out.printf("%5.1f\n", 34.56);
		System.out.printf("%5.1f\n", 124.56);
		System.out.printf("%5.1f\n", 5124.56); // 총자릿수를 넘으면 무시하고 그대로 출력된다. 5124.6출력
		
		System.out.printf("%5.2f\n", 4.56); //  4.56
		System.out.printf("%5.2f\n", 4.5); //  4.50
		System.out.printf("%5.2f\n", 24.567); // 24.57
		System.out.printf("%5.2f\n", 124.5); // 124.50  소숫점2자리를 먼저 채우고 총자릿수랑 상관없이 무시하고 출력된다.
		
		System.out.printf("%10s\n", "korea"); // 오른쪽정렬      korea
		System.out.printf("%-10s\n", "korea"); // 왼쪽정렬 korea     
		
		
		// 내 나이는 10살입니다.
		int age = 10;
		System.out.printf("내 나이는 %d살입니다.\n", age);
		
		// 홍길동님의 평균은 95.0이므로 A학점입니다.
		System.out.printf("%s님의 평균은 %.1f이므로 %c학점입니다.\n", "홍길동", 95.0, 'A');
		
		// 3 + 2 = 5
		int a = 3;
		int b = 2;
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		
		// 3 % 2 = 1
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		// 당신의 색깔은 "파랑"입니다.
		System.out.printf("당신의 색깔은 \"%s\"입니다.", "파랑");
	}
}
