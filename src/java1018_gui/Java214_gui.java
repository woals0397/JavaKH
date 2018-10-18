package java1018_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FlowLayoutTest extends Frame{
	Button oneBtn, twoBtn, threeBtn;
	Panel pn;
	TextArea ta;
	
	public FlowLayoutTest() {
		oneBtn = new Button("one");
		twoBtn = new Button("two");
		threeBtn = new Button("three");
		
		// Panel의 기본 레이아웃은 FlowLayout이다.
		// FlowLayout에 컴포넌트를 연결할때는 add해준 순서대로 왼쪽에서 오른쪽으로 연결된다.
		// Panel은 컨테이너지만 단독으로 화면을 띄울 수 없으며 단지 컴포넌트들을 그룹화하는데 사용된다.
		pn = new Panel();
		pn.add(oneBtn);
		pn.add(twoBtn);
		pn.add(threeBtn);
		this.add(BorderLayout.NORTH, pn);
		
		ta = new TextArea(10, 20);
		this.add(BorderLayout.CENTER, ta);
		
		setSize(500, 400);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

public class Java214_gui {
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
}
