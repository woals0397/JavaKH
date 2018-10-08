package java1005_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 */

public class Java149_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, 1);
		cal.set(Calendar.DATE, cal.getActualMaximum(Calendar.DATE));
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String y = "";
		
		switch (week) {
		case 1: y = "일요일"; break;
		case 2:	y = "월요일"; break;
		case 3:	y = "화요일"; break; 
		case 4:	y = "수요일"; break;
		case 5:	y = "목요일"; break;
		case 6:	y = "금요일"; break;
		case 7:	y = "토요일";
		}

		System.out.printf("%d-%d-%d %s\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH) + 1,
				cal.getActualMaximum(Calendar.DATE), y);

	}
}
