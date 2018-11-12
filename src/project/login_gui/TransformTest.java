/*package project.login_gui;

import javax.swing.JFrame;

import project.choice_gui.ChoiceTest;

public class TransformTest extends JFrame{
	public LoginTest login_gui = null;
	public ChoiceTest choice_gui = null;
	
	public void transform(String change) {
		if(change.equals(login_gui)) {
			getContentPane().removeAll();
			getContentPane().add(login_gui);
			revalidate();
			repaint();
		}else if(change.equals(choice_gui)) {
			getContentPane().removeAll();
			getContentPane().add(choice_gui);
			revalidate();
			repaint();
		}
	}//end transform()
	
	public static void main(String[] args) {
		TransformTest frame = new TransformTest();

		frame.login_gui = new LoginTest(frame);
		frame.choice_gui = new ChoiceTest(frame);

		frame.add(frame.login_gui);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(500, 700);
		frame.setLocation(1100, 250);
		frame.setVisible(true);
	}
	
}//end class
*/