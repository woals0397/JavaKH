package java1018_gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserSize extends Frame{
	Button btn;
	
	public UserSize() {
		btn = new Button("button");
		
		// Frame컨테이너의 레이아웃설정을 안해주면 BorderLayout이 적용된다.
		// Frame컨테이너의 Layout을 null로 초기화한다.
		setLayout(null);
		btn.setLocation(50, 50);	// 가로, 세로위치
		btn.setSize(200, 150);		// 가로, 세로크기
		this.add(btn);
		//btn.setBounds(50, 50, 200, 150);	// 가로위치, 세로위치, 가로크기, 세로크기
		
		setSize(300, 300);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Java215_gui {
	public static void main(String[] args) {
		new UserSize();
	}
}
