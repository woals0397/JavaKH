package java1019_gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Research extends JFrame implements ActionListener{
	JTextField nameTxt;
	JRadioButton manRad, womanRad;
	JComboBox<String> locBox;
	JButton saveBtn, openBtn;
	JTextArea multiLine;

	public Research() {
		nameTxt = new JTextField(10);

		manRad = new JRadioButton("남", true);
		womanRad = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(manRad);
		bg.add(womanRad);

		String[] city = new String[] { "seoul", "jeju", "pusan", "daejon" };
		locBox = new JComboBox<String>(city);

		saveBtn = new JButton("파일저장");
		openBtn = new JButton("파일열기");

		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("이름"));
		jp1.add(nameTxt);

		JPanel jp2 = new JPanel();
		jp2.add(new JLabel("성별"));
		jp2.add(manRad);
		jp2.add(womanRad);

		JPanel jp3 = new JPanel();
		jp3.add(new JLabel("지역"));
		jp3.add(locBox);

		JPanel jp4 = new JPanel();
		jp4.add(saveBtn);
		jp4.add(openBtn);

		JPanel top = new JPanel(new GridLayout(4, 1));
		top.add(jp1);
		top.add(jp2);
		top.add(jp3);
		top.add(jp4);

		multiLine = new JTextArea(10, 20);

		// JFrame의 Layout을 GridLayout 2행 1열로 변경한다.
		setLayout(new GridLayout(2, 1));

		// JFrame에 컴포넌트를 연결한다.
		add(top);
		add(multiLine);
		
		saveBtn.addActionListener(this);
		openBtn.addActionListener(this);

		setSize(300, 300);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// end Research()

	@Override
	public void actionPerformed(ActionEvent e) {
		// 현재 이벤트가 발생된 컴포넌트 정보를 리턴한다.
		Object obj = e.getSource();
		if(obj == saveBtn) {
			saveMethod();
			initMethod();
		}else if(obj == openBtn) {
			openMethod();
		}
	}
	
	private void saveMethod() {
		String name = nameTxt.getText();
		String gen = manRad.isSelected() ? "남" : "여";
		String loc = (String) locBox.getSelectedItem();
		JFileChooser save = new JFileChooser();
		int chk = save.showSaveDialog(this);
		if(chk == JFileChooser.CANCEL_OPTION)
			return;
		
		File file = save.getSelectedFile();
		FileWriter fw = null;
		
		try {
			// false:업데이트, true:append, 기본은 false
			fw = new FileWriter(file,true);
			fw.write(name + "/" + gen + "/" + loc + "\r\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void initMethod() {
		nameTxt.setText("");
		manRad.setSelected(true);
		locBox.setSelectedIndex(0);
		nameTxt.requestFocus();
	}
	
	private void openMethod() {
		JFileChooser open = new JFileChooser();
		int chk = open.showOpenDialog(this);
		if(chk == JFileChooser.CANCEL_OPTION)
			return;
		
		File file = open.getSelectedFile();
		Scanner sc = null;
		multiLine.setText("");
		
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				multiLine.append(sc.nextLine()+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

}// end Research

public class Java222_gui {

	public static void main(String[] args) {
		new Research();
	}// end main()

}// end class
