package java1018_gui.prob;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MenuItem extends JFrame implements ActionListener{
	JComboBox<String> firstCom, secondCom;
	JTextArea ta;
	String[] foodMain = new String[] { "선택하세요", "한식", "중식", "일식" };
	String[][] foodSub = new String[][] { 
		{ "선택하세요", "불고기", "비빔밥", "삼계탕" }, 
		{ "선택하세요", "짬뽕", "짜장", "탕수육" },
		{ "선택하세요", "돈부리", "우동", "덮밥" } };

	
	public MenuItem() {
		firstCom = new JComboBox<String>(foodMain);
		secondCom = new JComboBox<String>();
		secondCom.addItem("선택하세요");
		
		JPanel jp = new JPanel();
		jp.add(new JLabel("MENU : "));
		jp.add(firstCom);
		jp.add(secondCom);

		ta = new JTextArea(10, 15);

		add(BorderLayout.NORTH, jp);
		add(BorderLayout.CENTER, ta);		
		
		firstCom.addActionListener(this);
		secondCom.addActionListener(this);
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// end MenuItem


	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");
		Object obj = e.getSource();
		int index = firstCom.getSelectedIndex();
		int index2 = secondCom.getSelectedIndex();
		String txt = (String) firstCom.getSelectedItem();
		String food = (String) secondCom.getSelectedItem();
		
		if(obj == firstCom) {
			if(index == 0) {
				JOptionPane.showMessageDialog(this, "한식,일식,중식 메뉴를 선택하세요.");
			}else if(index == 1) {
				secondCom.removeAllItems();
				for(int i = 0; i < foodSub[index-1].length; i++) {
					secondCom.addItem(foodSub[index-1][i]);
				}
			}else if(index == 2) {
				secondCom.removeAllItems();
				for(int i = 0; i < foodSub[index-1].length; i++) {
					System.out.println(i);
					secondCom.addItem(foodSub[index-1][i]);
					System.out.println(foodSub[index-1].length);
				}
			}else if(index == 3) {
				secondCom.removeAllItems();
				for(int i = 0; i < foodSub[index-1].length; i++) {
					secondCom.addItem(foodSub[index-1][i]);
				}
			}
		}
		
		if(obj == secondCom) {
			if(index2 == 0) {
				JOptionPane.showMessageDialog(this, "음식메뉴를 선택하세요.");
			}else if(index2 == 1) {
				food = (String) secondCom.getSelectedItem();
				ta.append(txt + ":" + food);
			}else if(index2 == 2) {
				food = (String) secondCom.getSelectedItem();
				ta.append(txt + ":" + food);
			}else if(index2 == 3) {
				food = (String) secondCom.getSelectedItem();
				ta.append(txt + ":" + food);
			}
		}
	}


}// end class

public class Prob01 {

	public static void main(String[] args) {
		MenuItem mt = new MenuItem();

	}// end main()

}// end class
