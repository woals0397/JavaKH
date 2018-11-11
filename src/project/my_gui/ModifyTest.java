package project.my_gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ModifyTest extends JFrame implements ActionListener {
	// 멤버변수
	JTextField newid, newpw, newname, newphone, newadr, newbirth; // 아이디, 비밀번호, 이름, 전화번호, 주소, 이메일
	JRadioButton man, fman; // 성별선택 : 남, 여
	JButton modifyBtn; // 회원가입 버튼

	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 15);

	// 생성자
	public ModifyTest() {
		setTitle("회원정보 수정");
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

		// 전화번호
		newphone = new JTextField(20);
		JLabel phoneLable = new JLabel("전화번호");
		phoneLable.setFont(font);
		JPanel phonePanel = new JPanel();
		phonePanel.add(phoneLable);
		phonePanel.add(newphone);
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

		// 회원가입버튼
		modifyBtn = new JButton("수정하기");
		modifyBtn.setPreferredSize(new Dimension(200, 50));
		modifyBtn.setFont(font);
		modifyBtn.setBackground(Color.PINK);
		modifyBtn.setBorderPainted(false);
		JPanel singupBtnPanel = new JPanel(new FlowLayout());
		singupBtnPanel.add(modifyBtn);
		singupBtnPanel.setBackground(Color.WHITE);

		// 전체레이아웃
		setLayout(new GridLayout(8, 1));
		add(idPanel);
		add(pwPanel);
		add(namePanel);
		add(birthPanel);
		add(phonePanel);
		add(adrPanel);
		add(genPanel);
		add(singupBtnPanel);

		// 기본입력////////////////////////////////////////////////////////////////////////
		setSize(400, 700);
		setLocation(1500, 350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// end ModifyTest()

	// ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {

	}

}// end class
