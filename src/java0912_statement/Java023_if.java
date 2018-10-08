package java0912_statement;

/*
 * 각 월의 마지막일
 * 1 3 5 7 8 10 12 => 31
 * 4 6 9 11 => 30
 * 2 => 28
 */

public class Java023_if {

	public static void main(String[] args) {
		int month = 15; // 월
		int lastDay = -1; // 마지막일
		
		if(month <1 || month > 12) {
			System.out.println("month값이 잘못 입력되었습니다.");
			return;
		}
		
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			lastDay = 31;
		}else if(month==4 ||month==6 ||month==9 ||month==11) {
			lastDay = 30;
		}else if(month==2){
			lastDay = 28;
		}
		
		System.out.printf("%d월의 마지막 일은 %d입니다.\n", month, lastDay);

	}

}
