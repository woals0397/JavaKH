package project.reserve_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ReserveTest extends JFrame implements ActionListener {
	JButton card, pul, gast, neph, endo, chest, ortho, plastic,
	neuro, pedi, obngy, neuroPsy, eye, skin, urol, denti,ent;

	public ReserveTest() {

		Font font = new Font("맑은 고딕", 1, 13);
		Font font_title = new Font("맑은 고딕", 1, 20);

		card = new JButton(new ImageIcon("./src/project/reserve_gui/images/heart.png"));
		card.setText("순환기내과");
		card.setFont(font);
		card.setPreferredSize(new Dimension(150, 20));
		card.setBackground(Color.WHITE);
		card.setBorderPainted(false);

		pul = new JButton(new ImageIcon("./src/project/reserve_gui/images/lungs.png"));
		pul.setText("호흡기내과");
		pul.setFont(font);
		pul.setPreferredSize(new Dimension(150, 20));
		pul.setBackground(Color.WHITE);
		pul.setBorderPainted(false);

		gast = new JButton(new ImageIcon("./src/project/reserve_gui/images/stomach.png"));
		gast.setText("소화기내과");
		gast.setFont(font);
		gast.setPreferredSize(new Dimension(150, 20));
		gast.setBackground(Color.WHITE);
		gast.setBorderPainted(false);

		neph = new JButton(new ImageIcon("./src/project/reserve_gui/images/kidney.png"));
		neph.setText("신장내과");
		neph.setFont(font);
		neph.setPreferredSize(new Dimension(150, 20));
		neph.setBackground(Color.WHITE);
		neph.setBorderPainted(false);

		endo = new JButton(new ImageIcon("./src/project/reserve_gui/images/thyroid.png"));
		endo.setText("내분비내과");
		endo.setFont(font);
		endo.setPreferredSize(new Dimension(150, 20));
		endo.setBackground(Color.WHITE);
		endo.setBorderPainted(false);

		chest = new JButton(new ImageIcon("./src/project/reserve_gui/images/chest_lungs.png"));
		chest.setText("흉부외과");
		chest.setFont(font);
		chest.setPreferredSize(new Dimension(150, 20));
		chest.setBackground(Color.WHITE);
		chest.setBorderPainted(false);

		ortho = new JButton(new ImageIcon("./src/project/reserve_gui/images/foot.png"));
		ortho.setText("정형외과");
		ortho.setFont(font);
		ortho.setPreferredSize(new Dimension(150, 20));
		ortho.setBackground(Color.WHITE);
		ortho.setBorderPainted(false);

		plastic = new JButton(new ImageIcon("./src/project/reserve_gui/images/plastic.png"));
		plastic.setText("성형외과");
		plastic.setFont(font);
		plastic.setPreferredSize(new Dimension(150, 20));
		plastic.setBackground(Color.WHITE);
		plastic.setBorderPainted(false);

		neuro = new JButton(new ImageIcon("./src/project/reserve_gui/images/brain.png"));
		neuro.setText("신경외과");
		neuro.setFont(font);
		neuro.setPreferredSize(new Dimension(150, 20));
		neuro.setBackground(Color.WHITE);
		neuro.setBorderPainted(false);

		pedi = new JButton(new ImageIcon("./src/project/reserve_gui/images/baby.png"));
		pedi.setText("소아청소년과");
		pedi.setFont(font);
		pedi.setPreferredSize(new Dimension(150, 20));
		pedi.setBackground(Color.WHITE);
		pedi.setBorderPainted(false);

		obngy = new JButton(new ImageIcon("./src/project/reserve_gui/images/mother.png"));
		obngy.setText("산부인과");
		obngy.setFont(font);
		obngy.setPreferredSize(new Dimension(150, 20));
		obngy.setBackground(Color.WHITE);
		obngy.setBorderPainted(false);

		neuroPsy = new JButton(new ImageIcon("./src/project/reserve_gui/images/thinking.png"));
		neuroPsy.setText("신경정신과");
		neuroPsy.setFont(font);
		neuroPsy.setPreferredSize(new Dimension(150, 20));
		neuroPsy.setBackground(Color.WHITE);
		neuroPsy.setBorderPainted(false);

		eye = new JButton(new ImageIcon("./src/project/reserve_gui/images/eye.png"));
		eye.setText("안과");
		eye.setFont(font);
		eye.setPreferredSize(new Dimension(150, 20));
		eye.setBackground(Color.WHITE);
		eye.setBorderPainted(false);

		skin = new JButton(new ImageIcon("./src/project/reserve_gui/images/finger.png"));
		skin.setText("피부과");
		skin.setFont(font);
		skin.setPreferredSize(new Dimension(150, 20));
		skin.setBackground(Color.WHITE);
		skin.setBorderPainted(false);

		urol = new JButton(new ImageIcon("./src/project/reserve_gui/images/kidneys.png"));
		urol.setText("비뇨기과");
		urol.setFont(font);
		urol.setPreferredSize(new Dimension(150, 20));
		urol.setBackground(Color.WHITE);
		urol.setBorderPainted(false);

		denti = new JButton(new ImageIcon("./src/project/reserve_gui/images/premolar.png"));
		denti.setText("치과");
		denti.setFont(font);
		denti.setPreferredSize(new Dimension(150, 20));
		denti.setBackground(Color.WHITE);
		denti.setBorderPainted(false);

		ent = new JButton(new ImageIcon("./src/project/reserve_gui/images/ear.png"));
		ent.setText("이비인후과");
		ent.setFont(font);
		ent.setPreferredSize(new Dimension(150, 30));
		ent.setBackground(Color.WHITE);
		ent.setBorderPainted(false);

		
		//맨위 예약하기 표시
		JPanel title =new JPanel();
		JLabel reseI = new JLabel(new ImageIcon("./src/project/reserve_gui/images/reserve.png"));
		reseI.setText(" 예약하기");
		reseI.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		reseI.setFont(font_title);
		title.add(reseI);
		title.setBackground(Color.WHITE);
		// 왼쪽 정렬로, 수평 간격을 300, 수직 간격을 10 픽셀로 배치하는
		// FlowLayout 생성
		//contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 300, 10));
		
		//병원 전공별 버튼
		// 		//chest, ortho, plastic, neuro, pedi,
		//obngy, neuroPsy, eye, skin,  urol,
		//denti, ent
		
		//첫번째줄 card, pul, gast, neph, endo,
		JPanel p1 =new JPanel(new GridLayout(1, 5));
		p1.add(card);
		p1.add(pul);
		p1.add(gast);
		p1.add(neph);
		p1.add(endo);
		p1.setBackground(Color.WHITE);
		
		//두번째줄 chest, ortho, plastic, neuro, pedi,
		JPanel p2 =new JPanel(new GridLayout(1, 5));
		p2.add(chest);
		p2.add(ortho);
		p2.add(plastic);
		p2.add(neuro);
		p2.add(pedi);
		p2.setBackground(Color.WHITE);
		
		//세번째줄 obngy, neuroPsy, eye, skin,  urol,
		JPanel p3 =new JPanel(new GridLayout(1, 5));
		p3.add(obngy);
		p3.add(neuroPsy);
		p3.add(eye);
		p3.add(skin);
		p3.add(urol);
		p3.setBackground(Color.WHITE);
		
		//4번째줄 denti, ent
		JPanel p4 =new JPanel(new GridLayout(1, 5));
		p4.add(denti);
		p4.add(ent);
		p4.setBackground(Color.WHITE);
		
		//빈패널 -> 흰색
		JPanel XXXX = new JPanel();
		XXXX.setBackground(Color.WHITE);
		//전체패널
		setLayout(new GridLayout(6,1));
		this.add(title);
		this.add(p1);
		this.add(p2);
		this.add(p3);
		this.add(p4);
		this.add(XXXX);

		 card.addActionListener(this);
		 pul.addActionListener(this);
		 gast.addActionListener(this);
		 neph.addActionListener(this);
		 endo.addActionListener(this);
		 chest.addActionListener(this); 
		 ortho.addActionListener(this);
		 plastic.addActionListener(this);
		 neuro.addActionListener(this);
		 pedi.addActionListener(this);
		 obngy.addActionListener(this);
		 neuroPsy.addActionListener(this); 
		 eye.addActionListener(this);
		 skin.addActionListener(this);
		 urol.addActionListener(this);
		 denti.addActionListener(this);
		 ent.addActionListener(this);

		

		setSize(800, 700);
		setVisible(true);
		setLocation(100, 50);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// 왼쪽 정렬로, 수평 간격을 30, 수직 간격을 40 픽셀로 배치하는
		// FlowLayout 생성
		/*
		 * contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 10));
		 * contentPane.add(new JLabel("예약하기")); contentPane.add(p1);
		 * contentPane.add(p2); contentPane.add(p3);
		 * contentPane.setBackground(Color.WHITE);
		 */
	}

	public static void main(String[] args) {

		new ReserveTest();

	}// end main

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == card || obj ==pul || obj ==gast || obj ==neph ||
				obj ==endo|| obj ==chest|| obj ==ortho|| obj ==plastic||
						obj ==neuro|| obj ==pedi|| obj ==obngy|| obj ==neuroPsy|| 
						obj ==eye||obj == skin||obj == urol||obj == denti||obj ==ent) {
			String selectDept = ((JButton)obj).getText();
			new SelectTest(selectDept);
		}
	}

}// end class
