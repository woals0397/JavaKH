package project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;

import javax.swing.JPanel;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

public class BirthPicker extends JPanel implements ActionListener {
	JDatePickerImpl birthPicker;
	String birth;

	public BirthPicker() {
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		birthPicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

		datePanel.setBackground(Color.WHITE);

		this.add(birthPicker);

		birthPicker.addActionListener(this);
		
		setSize(200, 65);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Date selectDay = (Date) birthPicker.getModel().getValue();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.KOREA);
		
		this.birth = dateFormat.format(selectDay);
	}
	
	public String getBirth() {
		return birth;
	}
}