package java1005_api.prob;

import java.util.Calendar;

/*
 * [출력결과]
 * <4시부터 12시 미만일때>
 * 지금은 5시 35분입니다.
 * Good Morning
 * 
 * <12시부터 18시 미만일때>
 * 지금은 16시 49분입니다.
 * Good Afternoon
 * 
 * <18시부터 22시 미만일때>
 * 지금은 20시 30분입니다.
 * Good Evening
 * 
 *  <그외 일때>
 *  Good Night
 */

public class Prob001_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		
		if(hour >= 4 && hour < 12)
			System.out.println("지금은 " + hour + "시 " + minute + "분입니다.\nGood Morning");
		else if(hour >= 12 && hour < 18)
			System.out.println("지금은 " + hour + "시 " + minute + "분입니다.\nGood Afternoon");
		else if(hour >= 18 && hour < 22)
			System.out.println("지금은 " + hour + "시 " + minute + "분입니다.\nGood Evening");
		else
			System.out.println("Good Night");
	}//end main()
}//end class
