package java0912_statement;

public class Java026_switch {

	public static void main(String[] args) {
		int month = 6; // 월
		int lastDay = -1; // 마지막일
		
		if(month < 1 || month > 12) {
			System.out.println("month값이 잘못 입력되었습니다.");
			return;
		}
		
		/*if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
			lastDay = 31;
		}else if(month==4 ||month==6 ||month==9 ||month==11) {
			lastDay = 30;
		}else if(month==2){
			lastDay = 28;
		}*/
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: lastDay = 31; break;
		case 4:
		case 6:
		case 9:
		case 11: lastDay = 31; break;
		case 2: lastDay = 28;
		}
		
		System.out.printf("%d월의 마지막 일은 %d입니다.\n", month, lastDay);

	}

}
