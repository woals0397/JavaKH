package test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import test.BirthPicker;

public class test extends JFrame implements ActionListener{
	JPanel panelBirth;
	BirthPicker SelectBirth;
	JButton a;
	public test() {
		panelBirth = new JPanel(new FlowLayout(FlowLayout.LEFT));
		SelectBirth = new BirthPicker();
		panelBirth.add(SelectBirth);
		
		a = new JButton("AA");
		panelBirth.add(a);
		this.add(panelBirth);
		
		a.addActionListener(this);
		
		setSize(800, 700);
		setVisible(true);
		setLocation(100, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new test();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(SelectBirth.getBirth());
	}
}
