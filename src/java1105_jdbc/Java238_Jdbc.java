package java1105_jdbc;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java1102_jdbc.EmpDAO;
import java1102_jdbc.EmpDTO;

class DesignTest extends JFrame implements ActionListener {
	JTextField inputTxt;
	JButton searchBtn;
	JTable table;
	DefaultTableModel model;

	public DesignTest() {
		inputTxt = new JTextField(20);
		searchBtn = new JButton("검색");

		JPanel jp = new JPanel();
		jp.add(inputTxt);
		jp.add(searchBtn);

		// 테이블 헤드
		Object[] obj = { "사원번호", "사원명", "연봉", "입사일" };
		model = new DefaultTableModel(obj, 0) {

			// 셀 편집 불가능
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		table = new JTable(model);

		// 컬럼이동 불가능
		table.getTableHeader().setReorderingAllowed(false);

		// 라인의 높이
		table.setRowHeight(20);

		add(BorderLayout.NORTH, jp);
		add(BorderLayout.CENTER, new JScrollPane(table));

		searchBtn.addActionListener(this);

		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// end DesignTest()

	@Override
	public void actionPerformed(ActionEvent e) {
		String data = inputTxt.getText();
		
		inputTxt.requestFocus();
		inputTxt.select(0, data.length());
		
		// 테이블 초기화
		model.setRowCount(0);
		
		EmpDAO dao = EmpDAO.getInstance();
		List<EmpDTO> aList = dao.searchMethod(data);
		if(aList.size()==0) {
			JOptionPane.showMessageDialog(this, "검색데이터가 없습니다.");
			return;
		}
		
		for (EmpDTO dto : aList) {
			Object[] line = new Object[4];
			line[0] = dto.getEmployee_id();
			line[1] = dto.getFirst_name();
			line[2] = dto.getSalary();
			line[3] = dto.getHire_date();
			model.addRow(line);
		}

	}// end actionPerformed()
}// end class

public class Java238_Jdbc {

	public static void main(String[] args) {
		new DesignTest();
	}// end main()

}// end class
