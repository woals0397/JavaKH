package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class DatePicker extends JFrame implements ActionListener{
	JDatePickerImpl datePicker;
	String selectDate;
	
	public DatePicker() {
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		
		
		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

		this.add(datePicker);
		
		datePicker.addActionListener(this);
		
		setSize(200, 65);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Date selectDay = (Date) datePicker.getModel().getValue();
		Date currentDay = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		String currentDate = dateFormat.format(currentDay);
		this.selectDate = dateFormat.format(selectDay);
		
		System.out.println("current" + currentDate);
		System.out.println("select" + selectDate);
		if(currentDate.compareTo(selectDate) > 0) {
			System.out.println("씨발");
		}
		
		DateFormat da = new SimpleDateFormat("HH:mm:ss");
		String a = da.format(currentDay);	// "01:04"
		System.out.println(a);
		String b = "01:06:25";
		
		System.out.println(a.compareTo(b));
	}
	
	public String getDate() {
		return selectDate;
	}
	
	public static void main(String[] args) {
		new DatePicker();
	}
}
