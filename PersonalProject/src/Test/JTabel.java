package Test;

// JTable 생성, row 추가 성공, 선택 후 같은 프레임에는 추가가 되는데 다른 프레임에는 안됨. 이거 해결해야함.
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.MuseVo;

public class JTabel extends JFrame implements MouseListener {
	private JFrame f, fsave;
	private JButton b, back;
	private JScrollPane sp, sp2;
	private JTable tb, tb2;

	DefaultTableModel model, model2;

	MuseVo newtb;

	String zero, one, two;

//    public boolean isCellEditable(int rowIndex, int columnIndex)
//    : rowIndex,columnIndex 에 위치하는 셀이 편집 가능한지 아닌지를 리턴. 편집이 가능한 경우에 true, 안되면 false

	public JTabel() {
//		Dimension dim = new Dimension(500, 300);
//		f.setPreferredSize(dim);
//		f.pack();

		f = new JFrame("TEST");

		f.setLocation(300, 300);
		f.setSize(400, 300);
		f.addMouseListener(this); // 마우스리스너 동작 인식
		String header[] = { "종류", "기관명", "도시명" };
		String contents[][] = { { "박물관", "경기도박물관", "용인시" }, { "미술관", "선바위미술관", "과천시" }, { "전시관", "영집궁시박물관", "파주시" } };

//		모델을 사용하면 테이블 추가 ,삭제, 수정이 편리하다.
		model = new DefaultTableModel(contents, header); // 모델 생성
		tb = new JTable(model); // 모델을 사용한 테이블 생성
		sp = new JScrollPane(tb); // 테이블을 스크롤패널에 추가
		tb.addMouseListener(this);
		sp.addMouseListener(this);

		fsave = new JFrame("SAVE");
		fsave.setLocation(300, 700);
		fsave.setSize(400, 300);
		fsave.addMouseListener(this);

		model2 = new DefaultTableModel(0, 3);
		tb2 = new JTable(model2);
//		tb2.addMouseListener(this);
		sp2 = new JScrollPane(tb2);
		sp2.addMouseListener(this);

//		newtb = new MuseVo(zero, one, two);

//		tb.setEnabled(false); // 테이블 수정 금지// 적용하면 자료 이동이 안됨.ㄴ
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
		tb.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
//		tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 테이블 하나만 선택가능

	}

	public void startFrame() {
		f.add(sp);
		f.setVisible(true);
		fsave.add(sp2);
		fsave.setVisible(true);

	}

	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2)  {
			System.out.println("check");
			int row = tb.getSelectedRow();
				
			String add[] = { (String) tb.getValueAt(row, 0), (String) tb.getValueAt(row, 1),
					(String) tb.getValueAt(row, 2) };
			model2.addRow(add);
			System.out.println(add);
		}
		if(e.getClickCount()==2&&tb2.getRowSelectionAllowed()) {
			int row2 = tb2.getSelectedRow();
			String add[] = { (String) tb.getValueAt(row2, 0), (String) tb.getValueAt(row2, 1),
					(String) tb.getValueAt(row2, 2) };
			model2.removeRow(row2);
		}
	
	
//	public void mouseClicked(MouseEvent e) {
//		if (e.getClickCount() == 1 && e.getSource().equals(tb)) {
//			System.out.println("check");
//			int row = tb.getSelectedRow();
//				
//			String add[] = { (String) tb.getValueAt(row, 0), (String) tb.getValueAt(row, 1),
//					(String) tb.getValueAt(row, 2) };
//			tb.remove(row);
//			model2.addRow(add);
//			System.out.println(add);
//		}
//		else {
//			System.out.println("check22");
//			int row1 = tb2.getSelectedRow();
//			String add1[] = { (String) tb2.getValueAt(row1, 0), (String) tb2.getValueAt(row1, 1),
//					(String) tb2.getValueAt(row1, 2) };
//			tb2.remove(row1);
//			model.addRow(add1);

//		}

	}

//			System.out.println(row + " " + col);
//			TableModel data = tb.getModel();

//			for (int i = 0; i < tb.getColumnCount(); i++) {
//				System.out.println(data + "\n");
//				System.out.println(zero + " " + one + " " + two);
//				System.out.println(tb.getModel().getValueAt(row, 1));
//			}
//			String header1[] = { "종류", "기관명", "도시명" };
//			tb2.addColumn(zero,one,two);

//				String contents[i] = { newtb.getMUSEUM_ARTGLRY_TYPE_NM(), newtb.getBIZPLC_NM(), newtb.getSIGUN_NM() };

//		}

	public static void main(String[] args) {
		JTabel t = new JTabel();
		t.startFrame();
//		String ad[]= {"A","B","C"};
//		t.model.addRow(ad);

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
