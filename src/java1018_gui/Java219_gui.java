package java1018_gui;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

class MultiData extends JFrame implements ItemListener{
	JRadioButton topBtn, midBtn, botBtn;
	JCheckBox javaChk, jspChk, springChk;
	JComboBox<String> locBox;
	JTextArea ta;
	
	public MultiData() {
		ta = new JTextArea(10, 10);
		
		topBtn = new JRadioButton("상", true);
		midBtn = new JRadioButton("중");
		botBtn = new JRadioButton("하");
		
		// 라디오버튼을 그룹으로 묶어준다.
		ButtonGroup bg = new ButtonGroup();
		bg.add(topBtn);
		bg.add(midBtn);
		bg.add(botBtn);
		
		JPanel p1 = new JPanel();
		p1.add(topBtn);
		p1.add(midBtn);
		p1.add(botBtn);
		
		javaChk = new JCheckBox("java");
		jspChk = new JCheckBox("jsp");
		springChk = new JCheckBox("spring");
		
		JPanel p2 = new JPanel();
		p2.add(javaChk);
		p2.add(jspChk);
		p2.add(springChk);
		
		/*
		locBox = new JComboBox<>();
		locBox.addItem("서울");
		locBox.addItem("제주");
		locBox.addItem("대전");
		*/
		
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
		model.addElement("서울");
		model.addElement("제주");
		model.addElement("대전");
		locBox = new JComboBox<>(model);
		
		JPanel p3 = new JPanel(new GridLayout(3, 1));
		p3.add(p1);
		p3.add(p2);
		p3.add(locBox);
		
		setLayout(new GridLayout(2, 1));
		this.add(p3);
		this.add(ta);
		
		// 이벤트 리스너 연결
		topBtn.addItemListener(this);
		midBtn.addItemListener(this);
		botBtn.addItemListener(this);
		javaChk.addItemListener(this);
		jspChk.addItemListener(this);
		springChk.addItemListener(this);
		locBox.addItemListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		ta.setText("");
		if(topBtn.isSelected()) {
			ta.append(topBtn.getText());
		}else if(midBtn.isSelected()) {
			ta.append(midBtn.getText());
		}else if(botBtn.isSelected()) {
			ta.append(botBtn.getText());
		}
		ta.append("\r\n");
		
		if(javaChk.isSelected()) {
			ta.append(javaChk.getText() + "\r\n");
		}
		
		if(jspChk.isSelected()) {
			ta.append(jspChk.getText() + "\r\n");
		}
		
		if(springChk.isSelected()) {
			ta.append(springChk.getText() + "\r\n");
		}
		
		// 선택된 항목의 인덱스를 리턴
		int index = locBox.getSelectedIndex();
		// 선택된 항목의 문자열 리턴(getSelectedItem메소드는 Object로 리턴하므로 형변환)
		String txt = (String) locBox.getSelectedItem();
		ta.append(index + ":" + txt);
	}
}

public class Java219_gui {
	public static void main(String[] args) {
		new MultiData();
	}
}
