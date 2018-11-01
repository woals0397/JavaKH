package java1023_network;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimeTest extends JPanel implements Runnable {
	Thread clock;
	Font myFont;
	JLabel lbl;

	public TimeTest() {
		Thread th = new Thread(this);
		lbl = new JLabel();
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		add(lbl);
		th.start();
	}// end TimeTest()////////////////////////

	public void timer() {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int date = now.get(Calendar.DATE);
		int hour = now.get(Calendar.HOUR);
		int min = now.get(Calendar.MINUTE);
		int sec = now.get(Calendar.SECOND);

		lbl.setFont(myFont);
		lbl.setText(year + "-" + month + "-" + date + " " + hour + ":" + min + ":" + sec);
	}// end timer()////////////////////////

	public void run() {
		while (true) {
			timer();
			try {
				Thread.sleep(1000);// 1초마다 쓰레드 실행
			} catch (InterruptedException ie) {
				
			}
		}
	}// end run()/////////////////////////
}// end class
