/*package project.my_gui;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import project.Model.myTest_model;

public class ModifyTest extends JFrame implements ActionListener,ItemListener {
	// 멤버변수
	JTextField newid, newpw, newname, tel1F, tel2F , newadr, newbirth; // 아이디, 비밀번호, 이름, 전화번호, 주소, 이메일
	JRadioButton man, fman; // 성별선택 : 남, 여
	JButton modifyBtn; // 회원가입 버튼
	DefaultComboBoxModel<String> telMmodel;
	JComboBox<String> telCombo;
	String tel1 = null; // 전화번호 콤보박스

	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 15);
	String[] telStr = { "010", "011" , "016"};
	
	// 생성자
	public ModifyTest() {
		setTitle("회원정보 수정");
		// 생성
		
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

//		// 전화번호
		
		
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
		

		// 생년월일
		newbirth = new JTextField(20);
		JLabel birthLabel = new JLabel("생년월일");
		birthLabel.setFont(font);
		JPanel birthPanel = new JPanel();
		birthPanel.add(birthLabel);
		birthPanel.add(newbirth);
		birthPanel.setBackground(Color.WHITE);

		// 주소
		newadr = new JTextField(20);
		JLabel adrLabel = new JLabel("주소");
		adrLabel.setFont(font);
		JPanel adrPanel = new JPanel();
		adrPanel.add(adrLabel);
		adrPanel.add(newadr);
		adrPanel.setBackground(Color.WHITE);

		
		
		modifyBtn = new JButton("수정하기");
		modifyBtn.setPreferredSize(new Dimension(200, 50));
		modifyBtn.setFont(font);
		modifyBtn.setBackground(Color.PINK);
		modifyBtn.setBorderPainted(false);
		JPanel singupBtnPanel = new JPanel(new FlowLayout());
		singupBtnPanel.add(modifyBtn);
		singupBtnPanel.setBackground(Color.WHITE);

		// 전체레이아웃
		setLayout(new GridLayout(6, 1));
		
		add(pwPanel);
		add(namePanel);
		add(birthPanel);
		add(phonePanel);
		add(adrPanel);
		
		add(singupBtnPanel);
		
		modifyBtn.addActionListener(this);
		telCombo.addItemListener(this);

		// 기본입력////////////////////////////////////////////////////////////////////////
		setSize(400, 700);
		setLocation(1500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// end ModifyTest()

	// ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
             Object obj = e.getSource();
             if(obj==modifyBtn)  modify();
		                
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		     System.out.println("좀되라");
		     tel1 = (String) telCombo.getSelectedItem();
		     System.out.println(tel1);
		
	}
	public void modify() {
  
		 String phone = "010-"+tel1F.getText()+"-"+tel2F.getText();
	     myTest_model.getInstance().modifyDTO(newpw.getText(), newname.getText() , phone , newbirth.getText(), newadr.getText());
		 
         dispose();
	     new myTest();
   }

}// end class
*/