package project.my_gui;

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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class myTest extends JFrame implements ActionListener{
	//멤버변수
	JLabel people; //성별에 따른 사람이미지
	JButton modiBtn; // 회원정보 수정하기 버튼
	JTable reserveTable, recodeTable; //예약 테이블, 진료기록 테이블
	DefaultTableModel reserveModel, recodeModel; //테이블 데이터 관리 객체
	
	//폰트설정
	Font font = new Font("맑은 고딕", 1, 15);
	
	//생성자
	public myTest() {
		setTitle("마이페이지");
		//생성
		//회원 이미지 (성별값을 받아서 남, 여 이미지를 따로 출력)
		people = new JLabel(new ImageIcon("./src/my_gui/images/patient.png")); //임시
		
		//간략한 회원정보
		JLabel name = new JLabel("이름 : ");
		JLabel loginName = new JLabel("이혜린"); //로그인한 정보에서 이름값 받아오기
		
		JLabel gen = new JLabel("성별 : ");
		JLabel loginGen = new JLabel("여자"); //로그인한 정보에서 성별값 받아오기
		
		JLabel email = new JLabel("이메일 : ");
		JLabel loginEmail = new JLabel("jlg2124@naver.com"); //로그인한 정보에서 이메일값 받아오기
		
		//회원정보 수정버튼
		modiBtn = new JButton("회원정보 수정");
		modiBtn.setFont(font);
		modiBtn.setPreferredSize(new Dimension(150, 50));
		modiBtn.setBackground(Color.PINK);
		modiBtn.setBorderPainted(false);
		
		
		//판넬
		JPanel name_sum = new JPanel();
		name_sum.add(name);
		name_sum.add(loginName);
		name_sum.setBackground(Color.WHITE);
		
		JPanel gen_sum = new JPanel();
		gen_sum.add(gen);
		gen_sum.add(loginGen);
		gen_sum.setBackground(Color.WHITE);
		
		JPanel email_sum = new JPanel();
		email_sum.add(email);
		email_sum.add(loginEmail);
		email_sum.setBackground(Color.WHITE);
		
		JPanel modi_sum = new JPanel(new FlowLayout());
		modi_sum.add(modiBtn);
		modi_sum.setBackground(Color.WHITE);
		
		JPanel loginInfo = new JPanel(new GridLayout(3, 1));
		loginInfo.add(name_sum);
		loginInfo.add(gen_sum);
		loginInfo.add(email_sum);
		loginInfo.setBackground(Color.WHITE);
		
		JPanel loginInfo_sum = new JPanel(new GridLayout(2, 1));
		loginInfo_sum.add(loginInfo);
		loginInfo_sum.add(modi_sum);
		loginInfo_sum.setBackground(Color.WHITE);
		
		JPanel top = new JPanel(new GridLayout(1, 2));
		top.add(people);
		top.add(loginInfo_sum);
		top.setBackground(Color.WHITE);
		
		
		//예약현황 테이블
		String[] reserveMenu = new String[] {"전공", "담당의사", "시간", "본인증상"};
		reserveModel = new DefaultTableModel(reserveMenu, 0); //0 값 대신 다른 값을 넣어주면 데이터 값을 넣어줄때 위치값을 찾아서 넣어주어야 함
		reserveTable = new JTable(reserveModel);
		
		reserveTable.setAutoResizeMode(0); // 테이블의 사이즈를 고정시킨다.
		reserveTable.setBackground(Color.PINK);
		
		JTableHeader reserveheader = reserveTable.getTableHeader();
		reserveheader.setReorderingAllowed(false); //테이블의 컬럼명을 고정시킨다, 기본은 true이기 때문에 왔다갔다 변경이 가능하다.

		TableColumnModel reservecolumnModel = reserveheader.getColumnModel(); // 각각의 컬럼을 접근하기 위해서
		// 컬럼별로 크기를 설정한다.
		reservecolumnModel.getColumn(0).setPreferredWidth(100);
		reservecolumnModel.getColumn(1).setPreferredWidth(100);
		reservecolumnModel.getColumn(2).setPreferredWidth(100);
		reservecolumnModel.getColumn(3).setPreferredWidth(200);

		reserveTable.setRowHeight(25); // 테이블 행의 높이를 설정한다.
		reserveTable.setEnabled(false); // 테이블 편집 불가
		
		
		//진료기록 테이블
		String[] recodeMenu = new String[] {"전공", "담당의사", "시간", "본인증상", "치료완료"};
		recodeModel = new DefaultTableModel(recodeMenu, 0);
		recodeTable = new JTable(recodeModel);
		
		recodeTable.setAutoResizeMode(0); // 테이블의 사이즈를 고정시킨다.
		recodeTable.setBackground(Color.PINK);
		
		JTableHeader recodeheader = recodeTable.getTableHeader();
		recodeheader.setReorderingAllowed(false); //테이블의 컬럼명을 고정시킨다, 기본은 true이기 때문에 왔다갔다 변경이 가능하다.

		TableColumnModel recodecolumnModel = recodeheader.getColumnModel(); // 각각의 컬럼을 접근하기 위해서
		// 컬럼별로 크기를 설정한다.
		recodecolumnModel.getColumn(0).setPreferredWidth(100);
		recodecolumnModel.getColumn(1).setPreferredWidth(100);
		recodecolumnModel.getColumn(2).setPreferredWidth(100);
		recodecolumnModel.getColumn(3).setPreferredWidth(100);
		recodecolumnModel.getColumn(4).setPreferredWidth(100);

		recodeTable.setRowHeight(25); // 테이블 행의 높이를 설정한다.
		recodeTable.setEnabled(false); // 테이블 편집 불가
		
		
		//테이블라벨
		JLabel reserveLable = new JLabel(new ImageIcon("./src/my_gui/images/folder.png"));
		reserveLable.setText("예약현황");
		reserveLable.setFont(font);
		JLabel recodeLable = new JLabel(new ImageIcon("./src/my_gui/images/recode.png"));
		recodeLable.setText("진료기록");
		recodeLable.setFont(font);
		
		//판넬
		JPanel reservePanel = new JPanel(new GridLayout(2,1));
		reservePanel.add(reserveLable);
		reservePanel.add(new JScrollPane(reserveTable));
		reservePanel.setBackground(Color.WHITE);
		
		JPanel recodePanel = new JPanel(new GridLayout(2, 1));
		recodePanel.add(recodeLable);
		recodePanel.add(new JScrollPane(recodeTable));
		recodePanel.setBackground(Color.WHITE);
		
		JPanel low = new JPanel(new GridLayout(2, 1));
		low.add(reservePanel);
		low.add(recodePanel);
		low.setBackground(Color.WHITE);
		
		
		//전체레이아웃
		setLayout(new GridLayout(2, 1));
		add(top);
		add(low);	
		
		
		//리스너 연결
		modiBtn.addActionListener(this);
		
		
		//기본입력
		setSize(500, 700);
		setLocation(1100, 250);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}//end myTest()

	
	//ActionListener 메소드
	@Override
	public void actionPerformed(ActionEvent e) {
		new ModifyTest();
		
	}
	
}//end class
