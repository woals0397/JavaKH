package java1102_jdbc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class DesignTest extends JFrame implements ActionListener{
	JTextField inputText;
	JPanel input;
	JButton button;
	DefaultTableModel tableModel;
	JTable table;
	JScrollPane scroll;
	
	String[] cols = { "사원번호", "사원명", "연봉", "입사일"};
	
	public DesignTest() {
		inputText = new JTextField(20);
		button = new JButton("검색");
		
		JPanel input = new JPanel(new FlowLayout(FlowLayout.CENTER));
		input.add(inputText);
		input.add(button);
		this.add(input);
		
		
		tableModel = new DefaultTableModel(cols, 0) {
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};
		table = new JTable(tableModel);
		scroll = new JScrollPane(table);
		table.setRowHeight(20); // 라인의 높이
		table.getColumnModel().getColumn(0).setPreferredWidth(100); // 라인의 너비(전체 250)
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(100);
		table.getColumnModel().getColumn(3).setPreferredWidth(150);
		table.getTableHeader().setReorderingAllowed(false); // 컬럼이동불가능.
		table.setRowSelectionAllowed(false); // 기본 true
		table.setColumnSelectionAllowed(false); // 기본 false
		table.setEnabled(false);
		this.add(new JScrollPane(table));
		
		button.addActionListener(this);
		
		setLayout(new FlowLayout());
		this.setSize(540, 540);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		List<EmpDTO> emp = EmpDAO.getInstance().searchMethod(inputText.getText());

		if(obj == button) {
			tableModel.setRowCount(0);
			for(int i = 0; i < emp.size(); i++) {
				String[] line = new String[4];
				line[0] = Integer.toString(emp.get(i).getEmployee_id());
				line[1] = emp.get(i).getFirst_name();
				line[2] = Integer.toString(emp.get(i).getSalary());
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				String strDate = dateFormat.format(emp.get(i).getHire_date());
				line[3] = strDate;
				tableModel.addRow(line);
			}
		}
	}
}
	

public class Java238_Jdbc {
	public static void main(String[] args) {
		new DesignTest();
	}
}
