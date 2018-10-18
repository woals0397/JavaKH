package java1018_gui;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 컴퓨터와 사용자 인터페이스
 * 1 CUI(Character User Interface) : 문자대화방식 - DOS, Linux
 * 2 GUI(Graphics User Interface) : 그림대화방식-WINDOW
 * 
 * 자바에서 GUI을 구현할 수 있도록 AWT, Swing을 제공한다.
 * 
 * Component(컴포넌트)
 * 1 비주얼 컴포넌트 : 자기 자신위에 다른 컴포넌트 연결할 수 없는 컴포넌트이다.
 * 2 컨테이너 :자기 자신위에 다른 컴포넌트 연결할 수 있는 컴포넌트이다.
 * 3 메뉴 컴포넌트 : 메뉴에 관련된 컴포넌트이다.
 * 
 * Event(이벤트) : 컴포넌트에서 키보드로 입력하고, 클릭하고 하는 행동을
 *      컴포넌트에 사건이 발생된 것인데 이를 이벤트라 한다.
 * 
 * eventListener(이벤트리스너) : 컴포넌트에서 이벤트가 발생되면 이를 
 *    해결해야 하는데 해결할 메소드를 정의해놓은 인터페이스다.
 * 
 * Frame     WindowEvent WindowListener  addWindowListener()
 * Button    ActionEvent ActionListener  addActionListener()
 * Checkbox  ItemEvent   ItemListener    addItemListener()
 * 
 */

class Win extends Frame{
	public Win() {
		// 윈도우창의 크기를 가로 300, 세로 400 픽셀단위
		setSize(300, 400);
		// 윈도우창을 화면에 보이기
		setVisible(true);
		
		Exit exit = new Exit();
		this.addWindowListener(exit);
	}
	
	class Exit implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// 시스템 종료
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

public class Java211_gui {
	public static void main(String[] args) {
		new Win();
	}
}
