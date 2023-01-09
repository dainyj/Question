package Test;


	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;
	import java.awt.event.WindowAdapter;

	import javax.swing.JFrame;
	import javax.swing.JScrollPane;
	import javax.swing.JTable;
	import javax.swing.table.DefaultTableModel;


	public class TableScroll extends WindowAdapter implements ActionListener, MouseListener {
		private JFrame fsc;
		private JTable tb, tb2;
		private JScrollPane sp, sp2;
		private DefaultTableModel model, model2;


		public TableScroll() {
//			Frame setting
			fsc = new JFrame("SEARCH");
			fsc.setLayout(null);
			fsc.setSize(300, 550);
			fsc.setLocation(300, 300);
			fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fsc.setResizable(false);

			String colName[]= {"종류", "기관명", "도시명"};
			String data[][] = {{ "박물관", "경기도박물관", "용인시" }, { "미술관", "선바위미술관", "과천시" }, { "전시관", "영집궁시박물관", "파주시" } };
 
			tb = new JTable(data,colName);
			tb.setSize(230,160);
			tb.setLocation(30,70);
			sp = new JScrollPane();
			sp.setViewportView(tb);
			sp.addMouseListener(this);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		}

		public void startFrame() {
			fsc.add(tb);
			fsc.add(sp);
			fsc.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
			
		}
		

		public static void main(String[] args) {
			TableScroll ts = new TableScroll();
			ts.startFrame();
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			String[] inputStr = new String[3];
//			tb에서 선택하여 프레임 더블클릭하면 tb2에 추가됨.
			if (e.getClickCount() == 2 && e.getSource().equals(sp)) {
				int row = tb.getSelectedRow();
				inputStr[0] = (String) tb.getValueAt(row, 0);
				inputStr[1] = (String) tb.getValueAt(row, 1);
				inputStr[2] = (String) tb.getValueAt(row, 2);
				model2.addRow(inputStr);
			}
//			삭제
//			tb2에서 선택하여 프레임 더블클릭하면 삭제됨.
			if (e.getClickCount() == 2 && e.getSource().equals(sp2)) {
				model2.removeRow(tb2.getSelectedRow());
			}		
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	}
