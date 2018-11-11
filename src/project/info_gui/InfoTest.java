package project.info_gui;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class InfoTest extends JFrame{
	//멤버변수
	JRadioButton pillBtn, firstAidBtn; //약 체크박스, 응급처치 체크박스
	JComboBox<String> symptomBox; //증상 콤보박스
	JTable infoTable; //정보 리스트가 나올 테이블
	DefaultTableModel model; //테이블 데이터 관리 객체
	
	//폰트지정
	Font titleFont = new Font("맑은 고딕", 1, 20);
	Font font = new Font("맑은 고딕", 1, 15);
	//생성자
	public InfoTest() {
		setTitle("의학정보");
		//생성
		//상단라벨
		JLabel title = new JLabel(new ImageIcon("./src/info_gui/images/info.png"));
		title.setText("의학정보");
		title.setFont(titleFont);
		
		//약
		pillBtn = new JRadioButton("약", true);
		pillBtn.setFont(font);
		pillBtn.setBackground(Color.WHITE);
		JLabel pillLabel = new JLabel(new ImageIcon("./src/info_gui/images/pill.png"));
		JPanel pillPanel = new JPanel();
		pillPanel.add(pillBtn);
		pillPanel.add(pillLabel);
		pillPanel.setBackground(Color.WHITE);
		
		//응급처치
		firstAidBtn = new JRadioButton("응급처치");
		firstAidBtn.setFont(font);
		firstAidBtn.setBackground(Color.WHITE);
		JLabel firstAidLabel = new JLabel(new ImageIcon("./src/info_gui/images/first_aid.png"));
		JPanel firstAidPanel = new JPanel();
		firstAidPanel.add(firstAidBtn);
		firstAidPanel.add(firstAidLabel);
		firstAidPanel.setBackground(Color.WHITE);
		
		//라디오그룹
		ButtonGroup bg = new ButtonGroup();
		bg.add(pillBtn);
		bg.add(firstAidBtn);
		
		
		//증상 콤보박스
		String[] symptom = new String[10]; // 추후에 약과 응급처치 증상 부분에 해당하는 값들 입력
		symptomBox = new JComboBox<String>(symptom);
		symptomBox.setPreferredSize(new Dimension(400, 50));
		
		
		//판넬
		JPanel checkPanel = new JPanel(new GridLayout(1, 2));
		checkPanel.add(pillPanel);
		checkPanel.add(firstAidPanel);
		checkPanel.setBackground(Color.WHITE);
		
		JPanel symptomPanel = new JPanel(new FlowLayout());
		symptomPanel.add(symptomBox);
		symptomPanel.setBackground(Color.WHITE);
		
		JPanel checkPanel_sum = new JPanel(new GridLayout(3, 1));
		checkPanel_sum.add(title);
		checkPanel_sum.add(checkPanel);
		checkPanel_sum.add(symptomPanel);
		checkPanel_sum.setBackground(Color.WHITE);
		
		
		//테이블
		String[] medicine = new String[] {"종류", "정보"}; 
		model = new DefaultTableModel(medicine, 0); //0 값 대신 다른 값을 넣어주면 데이터 값을 넣어줄때 위치값을 찾아서 넣어주어야 함
		infoTable = new JTable(model);
		
		// 테이블의 사이즈를 고정시킨다.
		infoTable.setAutoResizeMode(0);

		JTableHeader header = infoTable.getTableHeader();
		
		// 테이블의 컬럼명을 고정시킨다.
		header.setReorderingAllowed(false); //기본은 true이기 때문에 왔다갔다 변경이 가능하다.

		// 컬럼모델을 리턴한다.
		TableColumnModel columnModel = header.getColumnModel(); // 각각의 컬럼을 접근하기 위해서

		// 컬럼별로 크기를 설정한다.
		columnModel.getColumn(0).setPreferredWidth(150);
		columnModel.getColumn(1).setPreferredWidth(350);

		// 테이블 행의 높이를 설정한다.
		infoTable.setRowHeight(25);

		// 테이블 편집 불가
		infoTable.setEnabled(false);

		
		//전체 레이아웃
		setLayout(new GridLayout(2, 1));
		add(checkPanel_sum);
		add(new JScrollPane(infoTable));
		
	
		//기본입력
		setSize(500, 700);
		setLocation(1100, 250);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}//end InfoTest()
	
}//end InfoTest
