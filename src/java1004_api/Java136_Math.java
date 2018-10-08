package java1004_api;

/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 */

import static java.lang.Math.*;

public class Java136_Math {
	public static void main(String[] args) {
		double num = random();
		System.out.println(num);
		num *= 100;
		
		System.out.println(round(num)/10.0);
	}
}
