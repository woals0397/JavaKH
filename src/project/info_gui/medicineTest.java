package project.info_gui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class medicineTest extends JFrame{
	//멤버변수
	//이미지(panel), 약이름, 증상, 가격, 복용법
	JLabel image; //해당하는 이미지 파일 받기
	JLabel nameLabel, symptomLabel, priceLabel, infoLabel; // 단순하게 라벨로 사용할 것
	JTextField mediName, mediSymp, mediPrice, mediInfo; //이름, 증상, 가격, 복용법 받을 부분
	
	//생성자
	public medicineTest(){
		setTitle("약 정보");
		//생성
		image = new JLabel(new ImageIcon("./src/info_gui/medicien_images/타이레놀.png")); // DB에 저장되어있는 해당 이미지가 있는 위치 넣어주기
		
		
	}//end medicineTest()
}//end class
