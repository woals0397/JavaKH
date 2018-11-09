package project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class SelectTest extends JFrame implements ActionListener {
	JLabel drL, dateL, timeL, symptomL;
	JComboBox<String> dr, time;
	JTextField info, symptom;
	String[] selectDr = new String[] { "의사선택", "이혜린", "홍선아", "최진혁", "문성일", "김재민" };
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	String[] selectTime = new String[] {"09:00~09:30","09:30~10:00","10:00~10:30","10:30~11:30",
            "11:00~11:30","11:30~12:00","13:00~13:30","13:30~14:00","14:00~14:30","14:30~15:00",
            "15:00~15:30","15:30~16:00","16:00~16:30","16:30~17:30","17:00~17:30","17:30~18:00"};
	String[] impossibleTime = new String[] {"09:00~09:30","09:30~10:00","10:00~10:30","10:30~11:30","16:00~16:30","16:30~17:30","17:00~17:30","17:30~18:00"};
	String[] possibleTime;
	///////////////////////////////////////////////////////////////////////////////////////////////
	JButton reserveB;

	public SelectTest() {
		
		Font font_re = new Font("맑은 고딕", 1, 15);
		Font font = new Font("맑은 고딕", 0, 12);
		
		// 타이틀
		JPanel p1 = new JPanel(new GridLayout(2, 1));

		JLabel reseI = new JLabel(new ImageIcon("./src/reserve_gui/images/reserve.png"));
		JLabel reseL = new JLabel("                                           예약하기");
		reseL.setFont(font_re);

		p1.add(reseI);
		p1.add(reseL);
		p1.setBackground(Color.white);

		// 과에 대한 정보//////////////////////////////////////
		info = new JTextField(10);
		info.setBorder(new TitledBorder("피부과"));
		////////////////////////////////////////////////////

		// 의사선택
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		drL = new JLabel("의사");
		drL.setFont(font);
		dr = new JComboBox<String>(selectDr);
		dr.setFont(font);
		dr.setBackground(Color.WHITE);
		dr.addActionListener(this);

		p2.add(drL);
		p2.add(dr);
		p2.setBackground(Color.white);

		// 증상입력

		symptom = new JTextField(40);
		symptomL = new JLabel("증상");
		symptomL.setFont(font);

		JPanel p_symptom = new JPanel(new FlowLayout(FlowLayout.LEFT));
		p_symptom.add(symptomL);
		p_symptom.add(symptom);
		p_symptom.setBackground(Color.white);

		JPanel top2 = new JPanel(new GridLayout(3, 1));

		top2.add(info);
		top2.add(p2);
		top2.add(p_symptom);

		// 시간선택
		JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));

		timeL = new JLabel("시간");
		timeL.setFont(font);
		dateL = new JLabel("날짜");
		dateL.setFont(font);
		
		////////////////////////////////////////////////
		time = new JComboBox<>();
		time.addItem("날짜를 선택하세요.");
		
		DatePicker datepicker = new DatePicker();
		
		p3.add(dateL);
		datepicker.setBackground(Color.WHITE);
		p3.add(datepicker);	
		p3.add(timeL);
		
		p3.add(time);
		//////////////////////////////////////////
		
		p3.setBackground(Color.white);
		
		// 예약버튼
		JPanel p4 = new JPanel(new FlowLayout(0, 400, 50)); 
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

		JPanel XXXX = new JPanel();
		JPanel bot = new JPanel(new GridLayout(2, 1));
		bot.add(p3);
		bot.add(p4);

		// 전체 패널

		setLayout(new GridLayout(2, 1));
		this.add(top);
		this.add(bot);

		// (a,b,c,d) a = 행 번호, b = 열 번호, c = 수평 간격, d = 수직 간격.

		// 창설정
		setSize(500, 700);
		setVisible(true);
		setLocation(100, 50);
		setBackground(Color.white);
		
		
		//종료버튼 눌렀을 때
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 알림창 호출
				exit();
			}
		});
		
	}

	protected void exit() {
		int chk=JOptionPane.showConfirmDialog(this, "정말로 종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
		if(chk==JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		}


	}
@Override
	public void actionPerformed(ActionEvent arg0) {
		///////////////////////////////////
		Object obj = arg0.getSource();
		if(obj == reserveB) {
			int chk=JOptionPane.showConfirmDialog(this, "예약하시겠습니까?", "예약", JOptionPane.YES_NO_OPTION);
			if(chk==JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(this, "예약 완료되었습니다.","예약",JOptionPane.PLAIN_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(this, " 취소되었습니다.","예약",JOptionPane.PLAIN_MESSAGE);

			}
		}else if(obj == dr) {
			String drName = dr.getSelectedItem().toString();
			System.out.println(drName);
			
			String[] tempArray = new String[selectTime.length];
			System.arraycopy(selectTime, 0, tempArray, 0, selectTime.length);
			List<String> tempList = new ArrayList<>(Arrays.asList(tempArray));
			
			Arrays.sort(selectDr);
			if(Arrays.binarySearch(selectDr, drName)%2==0) {
				time.setModel(new DefaultComboBoxModel<String>(impossibleTime));
				System.out.println(Arrays.binarySearch(selectDr, drName));
			}else {
				System.out.println(Arrays.binarySearch(selectDr, drName));
				for(int i = 0; i < impossibleTime.length; i++) {
					if(tempList.contains(impossibleTime[i])) {
						tempList.remove(impossibleTime[i]);
					}
				}
				time.setModel(new DefaultComboBoxModel<String>(tempList.toArray(new String[tempList.size()])));
			}
		}
		
		/////////////////////////////////////////////////
	}


	public static void main(String[] args) {
		new SelectTest();
	}


}