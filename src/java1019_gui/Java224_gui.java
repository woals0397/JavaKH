package java1019_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

class ButtonImg extends JFrame{
	JButton save, open;
	JTextField tf;
	
	public ButtonImg() {
		save = new JButton(new ImageIcon("src/java1019_gui/images/save.gif"));
		open = new JButton(new ImageIcon("src/java1019_gui/images/open.gif"));
		tf = new JTextField(10);
		
		// 말풍선
		save.setToolTipText("저장");
		open.setToolTipText("열기");
									// top, left, bottom, right
		save.setBorder(new EmptyBorder(0, 10, 0, 10));
		tf.setBorder(new TitledBorder("기타"));
		
		// Font(글꼴, 스타일(0보통, 1굵기, 2기울기, 3굵고 기울기), 크기)
		Font font = new Font("고딕체", 2, 20);
		tf.setFont(font);
		
		// RGB
		Color color = new Color(150, 255, 140);
		tf.setForeground(color);
		tf.setBackground(color.BLACK);
		
		JPanel p = new JPanel();
		p.add(save);
		p.add(open);
		
		setLayout(new GridLayout(2, 1));
		add(p);
		add(tf);
		
		setSize(300, 300);
		setLocation(400, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Java224_gui {
	public static void main(String[] args) {
		new ButtonImg();
	}
}
