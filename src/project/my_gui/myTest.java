package project.my_gui;

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
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import project.Dto.Patientinfo_DTO;
import project.Dto.Reservation_DTO;
import project.Dto.ReserveComplete_DTO;
import project.Model.myTest_model;
import project.login_gui.LoginTest;

public class myTest extends JFrame implements ActionListener, MouseListener {
	// 멤버변수
	JLabel people; // 성별에 따른 사람이미지
	JButton modiBtn; // 회원정보 수정하기 버튼
	JTable reserveTable, recodeTable; // 예약 테이블, 진료기록 테이블
	DefaultTableModel reserveModel, recodeModel; // 테이블 데이터 관리 객체
	JButton finishBtn, revokeBtn; // 예약 테이블에서 예약한 사항 완료버튼과 취소하기 버튼

	Patientinfo_DTO pdto;
	List<Reservation_DTO> rlist; // 예약정보 리스트에 뿌려줄 데이터를가져온 리스트
	List<ReserveComplete_DTO> rclist; //진료기록 리스트에 뿌려줄 데이터를가져온 리스트
    
	// 폰트설정
	Font font = new Font("맑은 고딕", 1, 15);

	// 생성자
	public myTest() {
		setTitle("마이페이지");
		// 생성
		// 회원 이미지 (성별값을 받아서 남, 여 이미지를 따로 출력)
		pdto = myTest_model.getInstance().searchPDTO(LoginTest.id); // 마이페이지 상단에 뿌려줄 회원정보
		rlist = myTest_model.getInstance().searchRDTO(LoginTest.id); // 마이페이지 하단 예약현황테이블 정보
		rclist = myTest_model.getInstance().searchRCDTO(LoginTest.id); //마이페이지 하단 진료기록테이블 정보
        
		
		System.out.println(pdto.getGender());
		people = new JLabel(new ImageIcon("./src/my_gui/images/patient.png"));
		if(pdto.getGender().equals("남")) {
			people = new JLabel(new ImageIcon("./src/my_gui/images/mypageman.png"));
		}else if(pdto.getGender().equals("여")) {
			people = new JLabel(new ImageIcon("./src/my_gui/images/mypagewoman.png"));
		}

		// 간략한 회원정보
		JLabel name = new JLabel("이름 : ");
		JLabel loginName = new JLabel(pdto.getName()); // 로그인한 정보에서 이름값 받아오기

		JLabel gen = new JLabel("성별 : ");
		JLabel loginGen = new JLabel(pdto.getGender()); // 로그인한 정보에서 성별값 받아오기

		JLabel email = new JLabel("주소 : ");
		JLabel loginEmail = new JLabel(pdto.getAddress()); // 로그인한 정보에서 이메일값 받아오기

		// 회원정보 수정버튼
		modiBtn = new JButton("회원정보 수정");
		modiBtn.setFont(font);
		modiBtn.setPreferredSize(new Dimension(150, 50));
		modiBtn.setBackground(Color.PINK);
		modiBtn.setBorderPainted(false);

		// 판넬
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
		loginInfo_sum.setBorder(new TitledBorder("내정보"));

		JPanel top = new JPanel(new GridLayout(1, 2));
		top.add(people);
		top.add(loginInfo_sum);
		top.setBackground(Color.WHITE);

		// 예약현황 테이블
		String[] reserveMenu = new String[] { "진료번호","병원", "전공", "담당의사", "시간", "본인증상" };
		reserveModel = new DefaultTableModel(reserveMenu, 0) { // 0 값 대신 다른 값을 넣어주면 데이터 값을 넣어줄때 위치값을 찾아서 넣어주어야 함

			// 셀 편집 불가능
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		reserveTable = new JTable(reserveModel);

		reserveTable.setAutoResizeMode(0); // 테이블의 사이즈를 고정시킨다.
		reserveTable.setBackground(Color.PINK);

		JTableHeader reserveheader = reserveTable.getTableHeader();
		reserveheader.setReorderingAllowed(false); // 테이블의 컬럼명을 고정시킨다, 기본은 true이기 때문에 왔다갔다 변경이 가능하다.

		TableColumnModel reservecolumnModel = reserveheader.getColumnModel(); // 각각의 컬럼을 접근하기 위해서
		// 컬럼별로 크기를 설정한다.
		reservecolumnModel.getColumn(0).setPreferredWidth(100);
		reservecolumnModel.getColumn(1).setPreferredWidth(100);
		reservecolumnModel.getColumn(2).setPreferredWidth(100);
		reservecolumnModel.getColumn(3).setPreferredWidth(100);
		reservecolumnModel.getColumn(4).setPreferredWidth(100);
		reservecolumnModel.getColumn(5).setPreferredWidth(340);

		reserveTable.setPreferredScrollableViewportSize(new Dimension(840, 100)); // 테이블크기 설정
		reserveTable.setRowHeight(25); // 테이블 행의 높이를 설정한다.
		// reserveTable.setEnabled(false); // 테이블 편집 불가

		// 예약테이블 기능 구현 버튼
		// 완료버튼
		finishBtn = new JButton("진료완료");
		finishBtn.setFont(font);
		finishBtn.setPreferredSize(new Dimension(100, 25));
		finishBtn.setBackground(Color.PINK);
		// 취소버튼
		revokeBtn = new JButton("예약취소");
		revokeBtn.setFont(font);
		revokeBtn.setPreferredSize(new Dimension(100, 25));
		revokeBtn.setBackground(Color.PINK);
		// 버튼판넬
		JPanel finishPanel = new JPanel(new FlowLayout());
		finishPanel.add(finishBtn);
		finishPanel.setBackground(Color.WHITE);

		JPanel revokePanel = new JPanel(new FlowLayout());
		revokePanel.add(revokeBtn);
		revokePanel.setBackground(Color.WHITE);

		JPanel nullPanel = new JPanel(); // 사이 여백을 주기 위한 빈 판넬
		nullPanel.setBackground(Color.WHITE);

		JPanel btnPanel = new JPanel(new GridLayout(3, 1));
		btnPanel.add(finishPanel);
		btnPanel.add(nullPanel); // 여백용 판넬
		btnPanel.add(revokePanel);
		btnPanel.setBackground(Color.WHITE);

		// 진료기록 테이블
		String[] recodeMenu = new String[] { "진료번호","병원","전공","담당의사","진료날짜","증상" };
		recodeModel = new DefaultTableModel(recodeMenu, 0);
		recodeTable = new JTable(recodeModel);

		recodeTable.setAutoResizeMode(0); // 테이블의 사이즈를 고정시킨다.
		recodeTable.setBackground(Color.PINK);

		JTableHeader recodeheader = recodeTable.getTableHeader();
		recodeheader.setReorderingAllowed(false); // 테이블의 컬럼명을 고정시킨다, 기본은 true이기 때문에 왔다갔다 변경이 가능하다.

		TableColumnModel recodecolumnModel = recodeheader.getColumnModel(); // 각각의 컬럼을 접근하기 위해서
		// 컬럼별로 크기를 설정한다.
		recodecolumnModel.getColumn(0).setPreferredWidth(150);
		recodecolumnModel.getColumn(1).setPreferredWidth(150);
		recodecolumnModel.getColumn(2).setPreferredWidth(150);
		recodecolumnModel.getColumn(3).setPreferredWidth(150);
		recodecolumnModel.getColumn(4).setPreferredWidth(150);
		recodecolumnModel.getColumn(5).setPreferredWidth(230);

		recodeTable.setPreferredScrollableViewportSize(new Dimension(980, 100)); // 테이블크기 설정
		recodeTable.setRowHeight(25); // 테이블 행의 높이를 설정한다.
		recodeTable.setEnabled(false); // 테이블 편집 불가

		// 테이블라벨
		JLabel reserveLable = new JLabel(new ImageIcon("./src/my_gui/images/folder.png"));
		reserveLable.setText("예약현황");
		reserveLable.setFont(font);
		JLabel recodeLable = new JLabel(new ImageIcon("./src/my_gui/images/recode.png"));
		recodeLable.setText("진료기록");
		recodeLable.setFont(font);

		// 판넬
		JPanel reservePanel = new JPanel(new FlowLayout());
		reservePanel.add(new JScrollPane(reserveTable));
		reservePanel.add(btnPanel);
		reservePanel.setBackground(Color.WHITE);

		JPanel reservePanel_sum = new JPanel(new GridLayout(2, 1));
		reservePanel_sum.add(reserveLable);
		reservePanel_sum.add(reservePanel);
		reservePanel_sum.setBackground(Color.WHITE);

		JPanel recodePanel = new JPanel(new FlowLayout());
		recodePanel.add(new JScrollPane(recodeTable));
		recodePanel.setBackground(Color.WHITE);

		JPanel recodePanel_sum = new JPanel(new GridLayout(2, 1));
		recodePanel_sum.add(recodeLable);
		recodePanel_sum.add(recodePanel);
		recodePanel_sum.setBackground(Color.WHITE);

		// 전체레이아웃
		// JPanel sum = new JPanel(new GridLayout(3, 1));
		setLayout(new GridLayout(3, 1));
		add(top);
		add(reservePanel_sum);
		add(recodePanel_sum);

		// 전체적인 여백 주기
		/*
		 * setLayout(new BorderLayout()); add("Center", sum); add("East", new
		 * JLabel("  ")); add("West", new JLabel("  ")); add("South", new JLabel("  "));
		 * add("North", new JLabel("  "));
		 */

		// 리스너 연결
		modiBtn.addActionListener(this);
		finishBtn.addActionListener(this);
		revokeBtn.addActionListener(this);

		setReserTable(rlist); //예약정보테이블 호출.
        setRecorTable(rclist); //진료완료테이블 호출.
		// 기본입력
		setSize(1000, 800);
		setLocation(1100, 250);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}// end myTest()

	
	// ActionListener 메소드
	@Override
   public void actionPerformed(ActionEvent e) {
       Object obj = e.getSource();
       /*if(obj==modiBtn) { new ModifyTest(); }  //회원정보수정 버튼
       else if(obj==finishBtn) {      reservFinish();       } // 진료완료버튼
       else if(obj==revokeBtn) {      reservCancel();       } // 진료취소버튼
      */
   }
             
	public void reservFinish() {  //진료완료
		 int row =reserveTable.getSelectedRow(); // 행의 번호를 받아옴
		 myTest_model.getInstance().deleteRDTO(reserveTable.getValueAt(row, 0).toString() , 100);
		 reshow();
	}
	
	private void reservCancel() { //진료취소
		//삭제여부 확인
		int chk = JOptionPane.showConfirmDialog(this, "정말로 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
		//삭제할 경우 
		if(chk == JOptionPane.NO_OPTION) {
		return;
		}
		int row =reserveTable.getSelectedRow(); // 행의 번호를 받아옴
		if(reserveTable.getValueAt(row, 0) == null) { //입력되어있지 않은 행을 선택한 경우
			JOptionPane.showMessageDialog(this, "등록되지 않은 레코드 입니다."); 
			return;
		}
		
		myTest_model.getInstance().deleteRDTO(reserveTable.getValueAt(row, 0).toString() , 2);  //선택된행의 진료번호를 넘긴다.
		reshow();
	}
    private void reshow() {
    	reserveModel.setRowCount(0);
    	recodeModel.setRowCount(0);
		rlist = myTest_model.getInstance().searchRDTO(LoginTest.id); // 새로정보를얻어와서
		setReserTable(rlist);                                             // 다시뿌려주자
		rclist = myTest_model.getInstance().searchRCDTO(LoginTest.id); 
		setRecorTable(rclist);
    }
	public void setReserTable(List<Reservation_DTO> rlist) { //예약정보 테이블에 값넣기.

		for (Reservation_DTO dto : rlist) {
			Object[] line = new Object[6];
			// line[0] = dto.getReserv_num();
			line[0] = dto.getReserv_num();
			line[1] = dto.getHos_name();
			line[2] = dto.getReserv_deptname();
			line[3] = dto.getDocname();
			line[4] = dto.getReserv_date();
			line[5] = dto.getCurrent_symptom();
			reserveModel.addRow(line);
		}

	}// setTable
	public static void main(String[] args) {
		new myTest();
	}
	
	
	private void setRecorTable(List<ReserveComplete_DTO> rclist) { //진료기록 테이블에 값넣기.
		for (ReserveComplete_DTO dto : rclist) {
			Object[] line2 = new Object[6];
			// line[0] = dto.getReserv_num();
			line2[0] = dto.getComp_num();
			line2[1] = dto.getComp_hosname();
			line2[2] = dto.getComp_deptname();
			line2[3] = dto.getComp_docname();
			line2[4] = dto.getComp_date();
			line2[5] = dto.getComp_symptom();
			recodeModel.addRow(line2);
		}
		
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}// end class