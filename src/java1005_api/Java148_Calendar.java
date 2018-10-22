package java1005_api;

import java.util.Calendar;

public class Java148_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;	// 값을 가져올때 월은 +1해줘야한다.
		int date = cal.get(Calendar.DATE);
		
		
		int hour = cal.get(Calendar.HOUR);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
	
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second);
		
		// 이번달의 마지막일 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		// 오늘의 요일 리턴(일요일 -> 1)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());
		
		// 2017-3-1
		cal.set(2017, 2, 1); // 저장할때는 월에 -1을 한값을 입력해줘야한다.
		//cal.set(Calendar.YEAR, 2017);
		System.out.printf("%d-%d-%d\n", cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
	}
}
