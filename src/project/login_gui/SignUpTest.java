/*package project.login_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import project.Dao.Patientinfo_DAO;
import project.Dto.Patientinfo_DTO;
import project.Model.Login_model;
import project.Model.myTest_model;

//회원가입 GUI
public class SignUpTest extends JFrame implements ActionListener , ItemListener {
	// 멤버변수
	JTextField newid, newpw, newname, tel1F, tel2F, newadr, newbirth; // 아이디, 비밀번호, 이름, 전화번호, 주소, 이메일
	JRadioButton man, fman; // 성별선택 : 남, 여
	JComboBox<String> questionBox; // 비밀번호 찾기 질문
	DefaultComboBoxModel<String> telMmodel;
	JComboBox<String> telCombo;
	JTextField answer; // 비밀번호 찾기 답변
	JButton singupBtn; // 회원가입 버튼

	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 15);

	String question = null; // 2차비번 질문
	
	// 생성자
	public SignUpTest() {
		setTitle("회원가입");
		// 생성
		// 아이디
		newid = new JTextField(20);
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(font);
		JPanel idPanel = new JPanel();
		idPanel.add(idLabel);
		idPanel.add(newid);
		idPanel.setBackground(Color.WHITE);

		// 비밀번호
		newpw = new JTextField(20);
		JLabel pwLabel = new JLabel("비밀번호");
		pwLabel.setFont(font);
		JPanel pwPanel = new JPanel();
		pwPanel.add(pwLabel);
		pwPanel.add(newpw);
		pwPanel.setBackground(Color.WHITE);

		// 이름
		newname = new JTextField(20);
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(font);
		JPanel namePanel = new JPanel();
		namePanel.add(nameLabel);
		namePanel.add(newname);
		namePanel.setBackground(Color.WHITE);

		// 생년월일
		newbirth = new JTextField(20);
		JLabel birthLabel = new JLabel("생년월일");
		birthLabel.setFont(font);
		JPanel birthPanel = new JPanel();
		birthPanel.add(birthLabel);
		birthPanel.add(newbirth);
		birthPanel.setBackground(Color.WHITE);

		// 전화번호
		JLabel phoneLable = new JLabel("전화번호");
		phoneLable.setFont(font);
		
		telMmodel = new DefaultComboBoxModel<String>();
		telMmodel.addElement("010");
		telMmodel.addElement("011");
		telMmodel.addElement("016");
		telCombo = new JComboBox<String>(telMmodel);
		telCombo.setPreferredSize(new Dimension(65, 21));
		telCombo.setBackground(Color.WHITE);
		
		JPanel tel1 = new JPanel(new FlowLayout());
		tel1.setBackground(Color.WHITE);
		tel1.add(telCombo); //콤보박스를 tel1 패널에
     	JPanel tel2 = new JPanel(new FlowLayout());
     	tel2.setBackground(Color.WHITE);
     	tel1F = new JTextField();
     	tel1F.setPreferredSize(new Dimension(65, 21));
		tel2.add(tel1F);  //tel2에 텍스트필드 1개
		

		JPanel tel3 = new JPanel(new FlowLayout());
		tel3.setBackground(Color.WHITE);
		tel2F = new JTextField();
		tel2F.setPreferredSize(new Dimension(65, 21));
		tel3.add(tel2F);  //tel3에 텍스트필드 두번쨰꺼
		
  
		JPanel phonePanel = new JPanel();
		phonePanel.add(phoneLable);
		phonePanel.add(tel1);
		phonePanel.add(new JLabel("-"));
		phonePanel.add(tel2);
		phonePanel.add(new JLabel("-"));
		phonePanel.add(tel3);
		phonePanel.setBackground(Color.WHITE);
		
		
		// 주소
		newadr = new JTextField(20);
		JLabel adrLabel = new JLabel("주소");
		adrLabel.setFont(font);
		JPanel adrPanel = new JPanel();
		adrPanel.add(adrLabel);
		adrPanel.add(newadr);
		adrPanel.setBackground(Color.WHITE);

		// 성별
		man = new JRadioButton("남", true);
		man.setBackground(Color.WHITE);
		fman = new JRadioButton("여");
		fman.setBackground(Color.WHITE);
		ButtonGroup bg = new ButtonGroup();
		bg.add(man);
		bg.add(fman);
		JLabel genLabel = new JLabel("성별");
		genLabel.setFont(font);
		JPanel genPanel = new JPanel();
		genPanel.add(genLabel);
		genPanel.add(man);
		genPanel.add(fman);
		genPanel.setBackground(Color.WHITE);

		// 비밀번호 찾기 질문
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

		// 회원가입버튼
		singupBtn = new JButton("회원가입");
		singupBtn.setPreferredSize(new Dimension(200, 50));
		singupBtn.setFont(font);
		singupBtn.setBackground(Color.PINK);
		singupBtn.setBorderPainted(false);
		JPanel singupBtnPanel = new JPanel(new FlowLayout());
		singupBtnPanel.add(singupBtn);
		singupBtnPanel.setBackground(Color.WHITE);

		// 전체레이아웃
		setLayout(new GridLayout(10, 1));
		add(idPanel);
		add(pwPanel);
		add(namePanel);
		add(birthPanel);
		add(phonePanel);
		add(adrPanel);
		add(genPanel);
		add(quesPanel);
		add(answPanel);
		add(singupBtnPanel);
		
		
		//리스너
		singupBtn.addActionListener(this);
        questionBox.addItemListener(this);
        
        
		// 기본입력////////////////////////////////////////////////////////////////////////
		setSize(400, 700);
		setLocation(1500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 회원가입 창만 나가도록

	}// end SignUpTest()

	// ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
         
		 Object obj =  e.getSource();
		 if(obj==singupBtn)
		 {
			 insert(); 
//			 newid.setText("");
//			 newpw.setText("");
//			 newname.setText("");
//			 newbirth.setText("");
//			 tel1F.setText("");
//			 tel2F.setText("");
//			 newadr.setText("");
//			 man.setSelected(true);
//			 questionBox.setSelectedIndex(0);
//			 answer.setText("");
			 
		 }
		 
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		  question = (String) questionBox.getSelectedItem();
	}// end actionPerformed()
	
    public void insert() {
    	 String id = newid.getText();
		 String pw = newpw.getText();
		 String name = newname.getText();
		 String birth = newbirth.getText();
		 String phone = "010-"+tel1F.getText()+"-"+tel2F.getText();
		 String adr = newadr.getText();
		 String gen=null;
		 if (man.isSelected()) {
			    gen = man.getText(); 
			} else if (fman.isSelected()) {
				gen = fman.getText();
			} 
		 String ans = answer.getText();
		 
		 
		 //회원정보등록
		 Patientinfo_DTO  pi = new Patientinfo_DTO();
		 pi.setId(id); pi.setPassword(pw); pi.setName(name); pi.setBirth(birth); pi.setAddress(adr);
		 pi.setPhone(phone);  pi.setGender(gen); pi.setQuestion(question); pi.setAnswer(ans);
		 
		 String result = Login_model.getInstance().validityCheck(pi); //회원가입 삽입전 유효성검사
		 
		 if(result==null) {
			 Patientinfo_DAO.getInstance().insertMethod(pi);
			 dispose();
		 }else {
			 System.out.println(result);
			 
		 }
		 
		 
		 
    }
    
}// end SignUpTest()
*/