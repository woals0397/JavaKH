package project.reserve_gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import project.Model.Reservation_model;

public class DatePicker extends JPanel implements ActionListener {
	JDatePickerImpl datePicker;
	Date currentDay;
	String currentDate;
	String selectDate;
	int dateCheck = 0;

	public DatePicker() {
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

		datePanel.setBackground(Color.WHITE);

		this.add(datePicker);

		datePicker.addActionListener(this);

		setSize(200, 65);
		// setLocation(400, 200);
		setVisible(true);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		currentDay = new Date();
		Date selectDay = (Date) datePicker.getModel().getValue();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd",  Locale.KOREA);

		System.out.println(dateFormat.format(currentDay));
		this.currentDate = dateFormat.format(currentDay);
		System.out.println(dateFormat.format(selectDay));
		this.selectDate = dateFormat.format(selectDay);
		
		if (currentDay.compareTo(selectDay) < 0) {
			this.dateCheck = 1;
		} else if (dateFormat.format(currentDay).equals(dateFormat.format(selectDay))) {
			this.dateCheck = 2;
		} else {
			JOptionPane.showMessageDialog(this, "이미 지난 날짜를 선택하였습니다.", "예약", JOptionPane.WARNING_MESSAGE);
			this.dateCheck = 3;
		}

	}

	public String getSelectDate() {
		return selectDate;
	}

	public int getDateCheck() {
		return dateCheck;
	}
	
	public JDatePickerImpl getDatePikcer() {
		return datePicker;
	}
	
}