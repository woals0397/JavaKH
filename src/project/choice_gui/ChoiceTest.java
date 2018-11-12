/*package project.choice_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import project.info_gui.InfoTest;
import project.login_gui.LoginTest;
import project.login_gui.TransformTest;
import project.my_gui.myTest;


//기능선택 GUI
public class ChoiceTest extends JFrame implements ActionListener{
	JButton reserveBtn, infoBtn, qaBtn, myBtn;	//reserveBtn = 예약버튼, infoBtn = 정보버튼, qaBtn = 후기버튼, myBtn = 마이페이지버튼
	
	//폰트설정
	Font font = new Font("맑은 고딕", 1, 20); // 글꼴, 스타일(0:보통, 1:굵기, 2:기울기, 3:굵고기울기), 크기
	
	//화면전환용 변수 생성
	//TransformTest frame;

	//생성자
	public ChoiceTest(TransformTest frame) {
		//this.frame = frame;
		//setLayout(null);
		
		setTitle("기능 선택하기");
		
		//생성
		//예약하기
		reserveBtn  = new JButton(new ImageIcon("./src/choice_gui/images/reserve.png"));
		//reserveBtn.setPreferredSize(new Dimension(150, 150));
		reserveBtn.setBackground(Color.WHITE);
		reserveBtn.setBorderPainted(false);
		reserveBtn.setToolTipText("전공, 전공의, 시간 선택하여 예약가능");
		reserveBtn.setFont(font);
		JLabel reserveLable = new JLabel("예약하기");
		reserveLable.setFont(font);
		
		//의학정보
		infoBtn = new JButton(new ImageIcon("./src/choice_gui/images/info.png"));
		//infoBtn.setPreferredSize(new Dimension(150, 150));
		infoBtn.setBackground(Color.WHITE);
		infoBtn.setBorderPainted(false);
		infoBtn.setToolTipText("증상에 따른 의약품, 응급처치 요령");
		infoBtn.setFont(font);
		JLabel infoLabel = new JLabel("의학정보");
		infoLabel.setFont(font);
		
		//후기
		qaBtn = new JButton(new ImageIcon("./src/choice_gui/images/qa.png"));
		//qaBtn.setPreferredSize(new Dimension(150, 150));
		qaBtn.setBackground(Color.WHITE);
		qaBtn.setBorderPainted(false);
		qaBtn.setToolTipText("실제 사용자들의 후기");
		qaBtn.setFont(font);
		JLabel qaLable = new JLabel("후기");
		qaLable.setFont(font);
		
		//마이페이지
		myBtn = new JButton(new ImageIcon("./src/choice_gui/images/my.png"));
		myBtn.setBackground(Color.WHITE);
		myBtn.setBorderPainted(false);
		myBtn.setToolTipText("회원정보수정,예약확인,진로기록조회");
		myBtn.setFont(font);
		JLabel myLabel = new JLabel("마이페이지");
		myLabel.setFont(font);
		
		
		//판넬(버튼+라벨(가운데위치))
		//예약하기
		JPanel reservePanel = new JPanel();
		reservePanel.add(BorderLayout.CENTER, reserveLable);
		reservePanel.setBackground(Color.WHITE);
		
		JPanel reservePanel_sum = new JPanel(new GridLayout(2, 1));
		reservePanel_sum.add(reserveBtn);
		reservePanel_sum.add(reservePanel);
		reservePanel_sum.setBackground(Color.WHITE);
		
		//의학정보
		JPanel infoPanel = new JPanel();
		infoPanel.add(BorderLayout.CENTER, infoLabel);
		infoPanel.setBackground(Color.WHITE);
		
		JPanel infoPanel_sum = new JPanel(new GridLayout(2, 1));
		infoPanel_sum.add(infoBtn);
		infoPanel_sum.add(infoPanel);
		infoPanel_sum.setBackground(Color.WHITE);
		
		//후기
		JPanel qaPanel = new JPanel();
		qaPanel.add(BorderLayout.CENTER, qaLable);
		qaPanel.setBackground(Color.WHITE);
		
		JPanel qaPanel_sum = new JPanel(new GridLayout(2, 1));
		qaPanel_sum.add(qaBtn);
		qaPanel_sum.add(qaPanel);
		qaPanel_sum.setBackground(Color.WHITE);
		
		//마이페이지
		JPanel myPanel = new JPanel();
		myPanel.add(BorderLayout.CENTER, myLabel);
		myPanel.setBackground(Color.WHITE);
		
		JPanel myPanel_sum = new JPanel(new GridLayout(2, 1));
		myPanel_sum.add(myBtn);
		myPanel_sum.add(myPanel);
		myPanel_sum.setBackground(Color.WHITE);
		
		
		//전체 레이아웃
		setLayout(new GridLayout(4, 1));
		add(reservePanel_sum);
		add(infoPanel_sum);
		add(qaPanel_sum);
		add(myPanel_sum);
		
		
		//리스너 연결
		reserveBtn.addActionListener(this);
		infoBtn.addActionListener(this);
		qaBtn.addActionListener(this);
		myBtn.addActionListener(this);
		
		//기본입력
		setSize(500, 700);
		setLocation(1100, 250);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//end ChoiceTest()
	
	//ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == reserveBtn) {
			//예약하기 화면 띄우기
			//new ReserveTest();
		}else if(obj == infoBtn) {
			//의학정보 화면 띄우기
			new InfoTest();
		}else if(obj == qaBtn) {
			//후기 화면 띄우기
			//new qaTest();
		}else if(obj == myBtn) {
			//마이페이지 화면 띄우기
			new myTest();
		}
		
	}//end actionPerformed()//////////////////////////////////////////////////////////////

	
	

	

}//end class
*/