package java1004_api;

import static java.lang.Math.*;

public class Java135_Math {
	public static void main(String[] args) {
		double ran = random();	// 0.0이상 1.0미만 사이의 난수 발생
		System.out.println(ran);
		
		// 0.0 ~ 10.0미만 사이의 난수 발생
		ran = ran*10;
		System.out.println(ran);
		
		// 소수 이하는 버리고 0~10미만을 리턴
		int num = (int)(ran);
		System.out.println(num);
	}
}
