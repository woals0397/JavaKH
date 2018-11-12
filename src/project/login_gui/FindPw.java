package project.login_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.Model.Login_model;

public class FindPw extends JFrame implements ActionListener , ItemListener{
	// 멤버변수
	JComboBox<String> questionBox; // 비밀번호 찾기를 하기 위한 질문 콤보박스
	JTextField userId, answer; // 본인아이디, 회원가입시 했던 질문에 대한 답변을 쓸 textfield
	JButton findPwBtn; // 비밀번호 찾기 버튼
	JLabel resPw; // 찾은 비밀번호 띄울 라벨
    
	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 20);
    String question=null;
	 
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
		DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
		model.addElement("본인의 보물 1호는?");
		model.addElement("가장 좋아하는 색은?");
		model.addElement("노래방 애창곡은?");
		model.addElement("가장 생각나는 친구 이름은?");
		model.addElement("가장 좋아하는 동물은?");
		model.addElement("나의 출신 초등학교는?");
		model.addElement("좋아하는 스포츠 팀은?");
		model.addElement("나의 좌우명은?");
		// 콤보박스
		questionBox = new JComboBox<String>(model);
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
		
		
		//찾은 비밀번호 띄울 라벨
		resPw = new JLabel();
		
		
		//판넬
		JPanel find = new JPanel();
		find.add(idPanel);
		find.add(quesPanel);
		find.setBackground(Color.WHITE);
		
		JPanel findBtnPanel = new JPanel(new FlowLayout());
		findBtnPanel.add(answPanel);
		findBtnPanel.add(findPwBtn);
		findBtnPanel.setBackground(Color.WHITE);
		
		JPanel resPanel = new JPanel();
		resPanel.add(resPw);
		resPanel.setBackground(Color.WHITE);
		
		
		//전체레이아웃
		setLayout(new GridLayout(3, 1));
		add(find);
		add(findBtnPanel);
		add(resPanel);
		
		
		//리스너 연결
		findPwBtn.addActionListener(this);
		questionBox.addItemListener(this);
		
		
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
                  String chk=null;
                  chk=Login_model.getInstance().passCheck(userId.getText(), question, answer.getText());
                  resPw.setText(chk);

                  if(chk.contains("호")) {
                	//MatrixTime(chk);
                  }
                  
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		question = (String) questionBox.getSelectedItem();
		
	}
	public void MatrixTime(String chk){
		    resPw.setText(chk);
            int delayTime=4000;
	        long saveTime = System.currentTimeMillis();
	        long currTime = 0;


	       while( currTime - saveTime < delayTime){
	            currTime = System.currentTimeMillis();
	       }
	       
	}


	

}// end class 