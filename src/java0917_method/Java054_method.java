package java0917_method;

public class Java054_method {
	public static void main(String[] args) {
		int year = 2012;
		
		if(isLeapYear(year)) {
			System.out.printf("%d년도는 윤년입니다.\n", year);
		}else {
			System.out.printf("%d년도는 평년입니다.\n", year);
		}
	}
	
	public static boolean isLeapYear(int year) {
		// 어떤 년도가 윤년이면 true, 평년이면 false을 리턴하는 프로그램 구현
		boolean chk;
		
		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			chk = true;
		}else {
			chk = false;
		}
		
		return chk;
	}
}
