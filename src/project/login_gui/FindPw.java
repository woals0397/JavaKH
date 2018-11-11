package project.login_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindPw extends JFrame implements ActionListener {
	// 멤버변수
	JComboBox<String> questionBox; // 비밀번호 찾기를 하기 위한 질문 콤보박스
	JTextField userId, answer; // 본인아이디, 회원가입시 했던 질문에 대한 답변을 쓸 textfield
	JButton findPwBtn; // 비밀번호 찾기 버튼

	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 20);

	// 생성자
	public FindPw() {
		setTitle("비밀번호 찾기");
		// 생성
		// 아이디 입력
		userId = new JTextField(20);
		JLabel idLabel = new JLabel("ID");
		idLabel.setFont(font);
		JPanel idPanel = new JPanel();
		idPanel.add(idLabel);
		idPanel.add(userId);
		idPanel.setBackground(Color.WHITE);
		
		
		// 질문박스
		// 질문
		String[] ques = new String[8];
		ques[0] = "본인의 보물 1호는?";
		ques[1] = "가장 좋아하는 색은?";
		ques[2] = "노래방 애창곡은?";
		ques[3] = "가장 생각나는 친구 이름은?";
		ques[4] = "가장 좋아하는 동물은?";
		ques[5] = "나의 출신 초등학교는?";
		ques[6] = "좋아하는 스포츠 팀은?";
		ques[7] = "나의 좌우명은?";
		// 콤보박스
		questionBox = new JComboBox<String>(ques);
		JLabel quesLabel = new JLabel("질문");
		quesLabel.setFont(font);
		JPanel quesPanel = new JPanel();
		quesPanel.add(quesLabel);
		quesPanel.add(questionBox);
		quesPanel.setBackground(Color.WHITE);

		// 비밀번호 찾기 답변
		answer = new JTextField(20);
		JLabel answLabel = new JLabel("답");
		answLabel.setFont(font);
		JPanel answPanel = new JPanel();
		answPanel.add(answLabel);
		answPanel.add(answer);
		answPanel.setBackground(Color.WHITE);
		
		//비밀번호 찾기 버튼
		findPwBtn = new JButton("비밀번호 찾기");
		findPwBtn.setFont(font);
		findPwBtn.setBorderPainted(false);
		findPwBtn.setBackground(Color.PINK);
		findPwBtn.setPreferredSize(new Dimension(200, 50));
		JPanel findBtnPanel = new JPanel(new FlowLayout());
		findBtnPanel.add(findPwBtn);
		findBtnPanel.setBackground(Color.WHITE);
		
		//판넬
		JPanel find = new JPanel();
		find.add(idPanel);
		find.add(quesPanel);
		find.add(answPanel);
		find.setBackground(Color.WHITE);
		
		
		//전체레이아웃
		setLayout(new GridLayout(2, 1));
		add(find);
		add(findBtnPanel);
		
		
		//리스너 연결
		findPwBtn.addActionListener(this);
		
		
		//기본입력
		setSize(400, 350);
		setLocation(1500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}// end FindPw()

	// end ActionListener()
	@Override
	public void actionPerformed(ActionEvent e) {
                  Object obj = e.getSource();
	}

}// end class
