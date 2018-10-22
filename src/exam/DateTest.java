package exam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		Calendar me = new GregorianCalendar();
		
		int nYear = cal.get(Calendar.YEAR);
		int nMonth = cal.get(Calendar.MONTH)+1;
		int nDay = cal.get(Calendar.DAY_OF_MONTH);
		me.set(1987, 4, 27);
		
		SimpleDateFormat date = new SimpleDateFormat("생일:yyyy년 MM월 dd일 E요일");
		System.out.println(date.format(me.getTime()));
		
		date = new SimpleDateFormat("현재:yyyy년 MM월 dd일");
		System.out.println(date.format(cal.getTime()));
		
		System.out.println("나이:" + (nYear-me.get(Calendar.YEAR)));
	}
}
