package java1018_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Win2 extends Frame {
	public Win2() {
		// 윈도우창의 크기를 가로 300, 세로 400 픽셀단위
		setSize(300, 400);
		// 윈도우창을 화면에 보이기
		setVisible(true);
		
		//Exit exit = new Exit();
		//this.addWindowListener(exit);
		
		// 익명클래스 이용  -> 한번사용하기 위해 클래스정의와 객체생성을 하는 번거로움을 줄이기 위해 사용
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	/*
	class Exit extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	*/
}

public class Java212_gui {
	public static void main(String[] args) {
		new Win2();
	}
}
