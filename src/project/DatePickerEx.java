package project;

import javax.swing.JFrame;

public class DatePickerEx extends JFrame{
	public DatePickerEx() {
		this.add(new DatePicker());
		
		setSize(500, 300);
		setLocation(600, 300);
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new DatePickerEx();
	}
}
