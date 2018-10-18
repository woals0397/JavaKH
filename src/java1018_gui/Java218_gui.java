package java1018_gui;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TextInput2 extends JFrame implements ActionListener{
	JTextField inputTxt;
	JButton clickBtn;
	JTextArea multiTra;
	JPanel pn;
	
	public TextInput2() {
		inputTxt = new JTextField(10);
		clickBtn = new JButton("input");
		pn = new JPanel();
		pn.add(inputTxt);
		pn.add(clickBtn);
		multiTra = new JTextArea(10,10);
		// TextArea에서 편집 불가능
		multiTra.setEditable(false);
		
		this.add(BorderLayout.NORTH, pn);
		this.add(BorderLayout.CENTER, multiTra);
		
		// 컴포넌트에 이벤트리스너 연결
		// 이벤트가 발생이 되면 ActionListener에 있는 actionPerformed메소드가 실행이된다.
		clickBtn.addActionListener(this);
		inputTxt.addActionListener(this);
		
		setSize(300, 200);
		setVisible(true);
		
		// 시스템종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 아무런 이벤트 발생이 안된다.
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// JFrame을 화면에서 숨긴다.
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		// JFrame자원을 메모리에서 파괴(제거)한다.
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String line = inputTxt.getText();
		// TextArea에 TextField에 입력된 문자열을 추가한다.
		multiTra.append(line+"\r\n");
		// TextField을 초기화한다.
		inputTxt.setText("");
		// TextField로 포커스를 이동한다.
		inputTxt.requestFocus();
	}
}

public class Java218_gui {
	public static void main(String[] args) {
		new TextInput2();
	}
}
