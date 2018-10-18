package java1018_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


// Frame -> click -> WindowEvent -> WindowListener -> addWindowListener()
// Button -> click -> ActionEvent -> ActionListener -> addActionListener()
// TextField -> enter -> ActionEvent -> ActionListener -> addActionListener()
class TextInput extends Frame implements ActionListener{
	TextField inputTxt;
	Button clickBtn;
	TextArea multiTra;
	Panel pn;
	
	public TextInput() {
		inputTxt = new TextField(20);
		clickBtn = new Button("input");
		pn = new Panel();
		pn.add(inputTxt);
		pn.add(clickBtn);
		multiTra = new TextArea(10,10);
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
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
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

public class Java217_gui {
	public static void main(String[] args) {
		new TextInput();
	}
}
