package java1004_api;

import java.util.Random;

public class Java137_Random {
	public static void main(String[] args) {
		Random ran = new Random();
		
		// 랜덤실수 발생
		double r1 = ran.nextDouble();
		System.out.println(r1);
		
		// 랜덤정수 음수값으로 발생
		int r2 = ran.nextInt();
		System.out.println(r2);
		
		// 0부터 ~ 10미만
		int r3 = ran.nextInt(10);
		System.out.println(r3);
	}
}
