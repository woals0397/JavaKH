package project.reserve_gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import project.Dao.Reservation_DAO;
import project.Model.Reservation_model;

public class SelectTest extends JFrame implements ActionListener {
	String selectDept;
	JLabel drL, dateL, timeL, hosL, symptomL;
	static JComboBox<String> dr, time, hos;
	JTextField info;
	JTextArea symptom;
	JButton reserveB;

	String[] selectTime = new String[] { "09:00~09:30", "09:30~10:00", "10:00~10:30", "10:30~11:30", "11:00~11:30",
			"11:30~12:00", "13:00~13:30", "13:30~14:00", "14:00~14:30", "14:30~15:00", "15:00~15:30", "15:30~16:00",
			"16:00~16:30", "16:30~17:30", "17:00~17:30", "17:30~18:00" };
	String[] possibleTime;
	
	List<RequestData> requestInfo;
	List<String> selectDr;
	
	static DatePicker datepicker;
	
	static String hosName = "";
	static String drName = "";
	static String selectDate = "";
	
	public SelectTest(String selectDept) {
		
		Font font_title = new Font("맑은 고딕", 1, 20);
		Font font = new Font("맑은 고딕", 0, 12);
		
		// 선택된 값 입력
		this.selectDept = selectDept;
		
		// 타이틀
		JPanel p1 = new JPanel(new GridLayout(2, 1));
		JLabel reseI = new JLabel(new ImageIcon("./src/reserve_gui/images/reserve.png"));
		reseI.setText(" 예약하기");
		reseI.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 50));
		reseI.setFont(font_title);
		
		// DB에 기본정보 요청
		requestInfo = Reservation_DAO.getInstance().getRequestData(selectDept);
		
		// 과에 대한 정보//////////////////////////////////////
		info = new JTextField(10);
		TitledBorder infoL = new TitledBorder(selectDept);
		infoL.setTitleFont(font);
		info.setBorder(infoL);
		info.setText(requestInfo.get(0).getDeptInfo());
		info.setBackground(Color.WHITE);
		info.setEditable(false);
		
		p1.add(reseI);
		p1.add(info);
		p1.setBackground(Color.white);
		
		// 병원선택
		JPanel phos = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		List<String> selecthos = Reservation_model.getInstance().getHos_name(requestInfo);
		
		hosL = new JLabel("병원");
		hosL.setFont(font);
		hos = new JComboBox<String>(selecthos.toArray(new String[selecthos.size()]));
		hos.setFont(font);
		hos.setBackground(Color.WHITE);
		hos.addActionListener(this);
		
		phos.add(hosL);
		phos.add(hos);
		phos.setBackground(Color.white);
		
		// 의사선택
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		drL = new JLabel("의사");
		drL.setFont(font);
		dr = new JComboBox<String>();
		dr.addItem("병원을 먼저 선택하세요.");
		dr.setFont(font);
		dr.setBackground(Color.WHITE);
		dr.addActionListener(this);
		
		p2.add(drL);
		p2.add(dr);
		p2.setBackground(Color.white);
		
		// 콤보박스패널
		JPanel combo = new JPanel(new GridLayout(2, 1));
		combo.add(phos);
		combo.add(p2);
		
		TitledBorder selectL = new TitledBorder("선택사항");
		selectL.setTitleFont(font);
		combo.setBorder(selectL);
		combo.setBackground(Color.WHITE);
		
		// 증상입력
		JPanel p_symptom = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		TitledBorder symptomL = new TitledBorder("증상입력");
		
		symptomL.setTitleFont(font);
		symptom = new JTextArea(8, 33);
		
		p_symptom.setBorder(symptomL);
		p_symptom.add(symptom);
		p_symptom.setBackground(Color.WHITE);
		
		JPanel top2 = new JPanel(new GridLayout(1, 2));
		
		top2.add(combo);
		top2.add(p_symptom);
		
		// 시간선택
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		timeL = new JLabel("시간");
		timeL.setFont(font);
		dateL = new JLabel("날짜");
		dateL.setFont(font);
		
		time = new JComboBox<>();
		time.addItem("시간을 선택하세요.");
		time.setFont(font);
		
		p3.add(dateL);
		datepicker = new DatePicker();
		datepicker.setBackground(Color.WHITE);
		p3.add(datepicker);
		p3.add(timeL);
		p3.add(time);
		p3.setBackground(Color.white);
		
		// 예약버튼
		JPanel p4 = new JPanel(new FlowLayout(0, 700, 70));
		reserveB = new JButton("예약");
		reserveB.setFont(font);
		reserveB.setBorder(new EmptyBorder(15, 20, 15, 20));
		reserveB.setBackground(Color.PINK);
		p4.add(reserveB);
		p4.setBackground(Color.white);
		reserveB.addActionListener(this);

		JPanel top = new JPanel(new GridLayout(2, 1));
		
		top.add(p1);
		top.add(top2);
		
		JPanel bot = new JPanel(new GridLayout(2, 1));
		bot.add(p3);
		bot.add(p4);
		
		// 전체 패널
		setLayout(new GridLayout(2, 1));
		this.add(top);
		this.add(bot);
		
		// (a,b,c,d) a = 행 번호, b = 열 번호, c = 수평 간격, d = 수직 간격.
		
		// 창설정
		setSize(800, 700);
		setVisible(true);
		setLocation(100, 50);
		setBackground(Color.white);
		
		// 종료버튼 눌렀을 때
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 알림창 호출
				exit();
			}
		});

	}
	
	protected void exit() {
		int chk = JOptionPane.showConfirmDialog(this, "정말로 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
		if (chk == JOptionPane.YES_OPTION) {
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		} else {
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();

		if (obj == reserveB) {
			int chk = JOptionPane.showConfirmDialog(this, "예약하시겠습니까?", "예약", JOptionPane.YES_NO_OPTION);
			if (chk == JOptionPane.YES_OPTION) {
				if(hosName.equals("") || drName.equals("") || datepicker.getDateCheck() == 0 || datepicker.getDateCheck() == 3) {
					if(datepicker.getDateCheck() == 0) {
						JOptionPane.showMessageDialog(this, "입력하지 않은 값이 존재합니다. 다시 확인해주세요.", "예약", JOptionPane.ERROR_MESSAGE);
					}else if(datepicker.getDateCheck() == 3) {
						JOptionPane.showMessageDialog(this, "이미 지난 날짜입니다. 날짜를 다시 선택해주세요.", "예약", JOptionPane.ERROR_MESSAGE);
					}
				}else {
					Reservation_DAO.getInstance().insertMethod(Reservation_model.getInstance().getReservation_DTO("a", hosName, selectDept, drName, symptom.getText(), selectDate, time.getSelectedItem().toString()));
					JOptionPane.showMessageDialog(this, "예약 완료되었습니다.", "예약", JOptionPane.PLAIN_MESSAGE);
					
					dispose();
				}
			} else {
				JOptionPane.showMessageDialog(this, " 취소되었습니다.", "예약", JOptionPane.PLAIN_MESSAGE);
			}
		} else if (obj == hos) {
			if(hos.getSelectedIndex() != 0) {
				selectDr = Reservation_model.getInstance().getDoc_name(requestInfo, hos.getSelectedItem().toString());
				dr.setModel(new DefaultComboBoxModel<String>(selectDr.toArray(new String[selectDr.size()])));
			}else {
				dr.setModel(new DefaultComboBoxModel<String>(new String[]{"의사를 선택하세요."}));
			}
		}
	}
	
	public static void makeTimeTable() {
		hosName = hos.getSelectedItem().toString();
		drName = dr.getSelectedItem().toString();
		selectDate = datepicker.getSelectDate();	
		
		time.setModel(new DefaultComboBoxModel<String>(Reservation_model.getInstance().getPossibleTime(hosName, drName, selectDate, datepicker.getDateCheck())));
	}

}