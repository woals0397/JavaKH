package java1004_api;

/*
 * 단입력: 3
 * 3 X 1 =  3
 * 3 X 2 =  6
 * 3 X 3 =  9
 * 3 X 4 = 12
 * 3 X 5 = 15
 * 3 X 6 = 18
 * 3 X 7 = 21
 * 3 X 8 = 24
 * 3 X 9 = 27
 * 계속하시겠습니까?(종료:n, 계속:아무키) n
 * 프로그램 종료
 */

import java.util.Scanner;

public class Java141_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("단입력: ");
			int dan = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d X %d = %2d\n", dan, i, dan * i);
			}
			System.out.print("계속하시겠습니까?(종료:n, 계속:아무키) ");
			String chk = sc.next();
			if (chk.equals("n")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
