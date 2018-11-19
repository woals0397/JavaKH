package project.login_gui;

import java.awt.BorderLayout;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import project.Model.Login_model;
import project.choice_gui.ChoiceTest; //기능선택 gui 클래스 import

//로그인 GUI
public class LoginTest extends JFrame implements ActionListener {
	//멤버변수
	// 로그인 화면
	JTextField idtf, pwtf; // 아이디, 비번 입력
	JButton logBtn, addBtn, fidBtn, fpwBtn; // 로그인(log), 회원가입(add), 아이디 찾기(find id > fid), 비번 찾기(find pw > fpw)

	//폰트설정
	Font font = new Font("맑은 고딕", 1, 20);
	
	//화면전환용 변수 생성
	//TransformTest frame;
    
	public static String id=null;  //로그인성공시 해당아이디값을  뒤에서도 참조 변수.	
	
	//생성자
	public LoginTest(/*TransformTest frame*/) {
		//this.frame = frame;
		//setLayout(null);
		setTitle("병원 프로그램");
		// 아이디&비번입력_레이아웃//////////////////////////////////////////////////////////
		idtf = new JTextField(15);
		JLabel id = new JLabel("ID");
		id.setFont(font);

		pwtf = new JPasswordField(15);
		JLabel pw = new JLabel("PW");
		pw.setFont(font);

		JPanel pid = new JPanel();
		pid.add(id);
		pid.add(idtf);
		pid.setBackground(Color.WHITE);

		JPanel ppw = new JPanel();
		ppw.add(pw);
		ppw.add(pwtf);
		ppw.setBackground(Color.WHITE);

		JPanel input = new JPanel(new GridLayout(2, 1));
		input.add(BorderLayout.SOUTH, pid);
		input.add(BorderLayout.NORTH, ppw);
		input.setBackground(Color.WHITE);

		logBtn = new JButton(new ImageIcon("./src/login_gui/images/login.png"));
		logBtn.setPreferredSize(new Dimension(100, 100));
		logBtn.setBackground(Color.PINK);
		logBtn.setBorderPainted(false);
		
		JPanel logbtn_Panel = new JPanel(new FlowLayout());
		logbtn_Panel.add(logBtn);
		logbtn_Panel.setBackground(Color.WHITE);
		
		JPanel log = new JPanel();
		log.add(input);
		log.add(BorderLayout.WEST, logbtn_Panel);
		log.setBackground(Color.WHITE);

		// 선택버튼_레이아웃//////////////////////////////////////////////////////////
		Font font1 = new Font("맑은 고딕", 1, 15); //사용해야하는 글씨의 크기가 달라서 따로 지정해서 사용
		addBtn = new JButton("회원가입");
		addBtn.setFont(font1);
		addBtn.setPreferredSize(new Dimension(100, 50));
		addBtn.setBackground(Color.PINK);
		addBtn.setBorderPainted(false);
		
		fidBtn = new JButton("ID찾기");
		fidBtn.setFont(font1);
		fidBtn.setPreferredSize(new Dimension(100, 50));
		fidBtn.setBackground(Color.PINK);
		fidBtn.setBorderPainted(false);
		
		fpwBtn = new JButton("PW찾기");
		fpwBtn.setFont(font1);
		fpwBtn.setPreferredSize(new Dimension(100, 50));
		fpwBtn.setBackground(Color.PINK);
		fpwBtn.setBorderPainted(false);
		
		
		JPanel find = new JPanel();
		find.add(addBtn);
		find.add(fidBtn);
		find.add(fpwBtn);
		find.setBackground(Color.WHITE);

		JPanel low = new JPanel(new FlowLayout());
		low.add(find, BorderLayout.CENTER);
		low.setBackground(Color.WHITE);

		// 로고_레이아웃//////////////////////////////////////////////////////////
		JLabel title_logo = new JLabel(new ImageIcon("./src/login_gui/images/hospital.png"));
		JPanel title = new JPanel();
		title.add(BorderLayout.CENTER, title_logo);
		title.setBackground(Color.WHITE);
		
		// 전체레이아웃//////////////////////////////////////////////////////////////
		JPanel total_login = new JPanel(new GridLayout(3, 1));
		total_login.add(title);
		total_login.add(log);
		total_login.add(low);
		
		add(total_login);
		
		/*setLayout(new GridLayout(3, 1));
		add(title);
		add(log);
		add(low);*/

		// 리스너연결///////////////////////////////////////////////////////////////////
		logBtn.addActionListener(this);
		addBtn.addActionListener(this);
		fidBtn.addActionListener(this);
		fpwBtn.addActionListener(this);

		// 기본입력////////////////////////////////////////////////////////////////////
		setSize(500, 700);
		setLocation(1100, 250);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// end LoginTest()

	// ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if (obj == logBtn) {
			// 로그인 버튼
			// 로그인 확인 메소드
			// 성공시 화면전환 -> ChoiceTest
		
			int chk = Login_model.getInstance().loginCheck(idtf.getText(),pwtf.getText());
			id = idtf.getText();
			if(chk==1)
			{
				System.out.println("아이디비번 확인완료");
				new ChoiceTest();
			}else if(chk==2)
			{
				System.out.println("아이디가 없습니다");
			}else if(chk==3) {
				System.out.println("비밀번호가 틀립니다");
			}

			//frame.transform("choice_gui");
			// 실패시 초기화, 메세지 창 
			init();
		} else if (obj == addBtn) {
			// 회원가입 버튼
			new SignUpTest();
			
		} else if (obj == fidBtn) {
			// 아이디 찾기 버튼
			new FindID();
		} else if (obj == fpwBtn) {
			// 비밀번호 찾기 버튼
			new FindPw();

		} 

	}// end actionPerformed()

	private void init() {
		idtf.setText("");
		pwtf.setText("");
		idtf.requestFocus();
	}// end init()

	public static void main(String[] args) {
		new LoginTest();

	}// end main()

}// end LoginTest
