package project.login_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import project.Model.Login_model;

//아이디찾기 : 이름이랑 전화번호 입력하면(where), 해당하는 아이디값(select) 해주기 
public class FindID extends JFrame implements ActionListener{
	//멤버변수
	JTextField findName, findPhone; //아이디를 찾기 위한 이름과 전화번호 입력할 textfield
	JButton findIDBtn; //아이디 찾기 버튼
	
	//폰트설정
	Font font = new Font("맑은 고딕", 1, 20);
	
	//생성자
	public FindID() {
		setTitle("아이디 찾기");
		//생성
		//이름
		findName = new JTextField(20);
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(font);
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		namePanel.add(findName);
		namePanel.setBackground(Color.WHITE);
		
		//전화번호
		findPhone = new JTextField(20);
		JLabel phoneLabel = new JLabel("전화번호");
		phoneLabel.setFont(font);
		JPanel phonePanel = new JPanel();
		phonePanel.add(phoneLabel);
		phonePanel.add(findPhone);
		phonePanel.setBackground(Color.WHITE);
		
		//아이디 찾기 버튼
		findIDBtn = new JButton("아이디 찾기");
		findIDBtn.setFont(font);
		findIDBtn.setBorderPainted(false);
		findIDBtn.setBackground(Color.PINK);
		findIDBtn.setPreferredSize(new Dimension(200, 50));
		JPanel findBtnPanel = new JPanel(new FlowLayout());
		findBtnPanel.add(findIDBtn);
		findBtnPanel.setBackground(Color.WHITE);
		
		//판넬
		JPanel input = new JPanel();
		input.add(namePanel);
		input.add(phonePanel);
		input.setBackground(Color.WHITE);
		
		//전체레이아웃
		setLayout(new GridLayout(2, 1));
		add(input);
		add(findBtnPanel);
		
		//리스너 연결
		findIDBtn.addActionListener(this);
		
		
		//기본입력
		setSize(400, 350);
		setLocation(1500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}//end FindID()

	
	//ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		  Object obj = e.getSource();
		  
		  String id =  Login_model.getInstance().idCheck(findName.getText(), findPhone.getText());
		  
		  if(id==null) {
			  System.out.println("해당정보가없습니다");
		  }else{
			  System.out.println("아이디는 "+id+" 입니다");
		  }
		
	}

}//end class
