package exam;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ex3 {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		
		int year = 1987;
		int month = 5;
		int date = 27;
		
		int nYear = cal.get(Calendar.YEAR);
		int nMonth = cal.get(Calendar.MONTH) + 1;
		int nDate = cal.get(Calendar.DATE);
		
		
	}
}
