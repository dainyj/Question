package Test;

// JTable 생성, row 추가 성공, 선택 후 같은 프레임에는 추가가 되는데 다른 프레임에는 안됨. 이거 해결해야함.
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.MuseVo;

public class JTableTest extends JFrame implements MouseListener {
	private JFrame f, fsave;
	private JButton b, back;
	private JScrollPane sp, sp2;
	private JTable tb, tb2;
	boolean t;

	DefaultTableModel model, model2;

//    public boolean isCellEditable(int rowIndex, int columnIndex)
//    : rowIndex,columnIndex 에 위치하는 셀이 편집 가능한지 아닌지를 리턴. 편집이 가능한 경우에 true, 안되면 false

	public JTableTest() {
//		Dimension dim = new Dimension(500, 300);
//		f.setPreferredSize(dim);
//		f.pack();

		f = new JFrame("TEST");

		f.setLocation(300, 300);
		f.setSize(400, 300);
//		f.addMouseListener(this); // 마우스리스너 동작 인식
		String header[] = { "종류", "기관명", "도시명" };
		String contents[][] = { { "박물관", "경기도박물관", "용인시" }, { "미술관", "선바위미술관", "과천시" }, { "전시관", "영집궁시박물관", "파주시" } };

//		모델을 사용하면 테이블 추가 ,삭제, 수정이 편리하다.
		model = new DefaultTableModel(contents, header); // 모델 생성

		tb = new JTable(model); // 모델을 사용한 테이블 생성
		sp = new JScrollPane(tb); // 테이블을 스크롤패널에 추가
		sp.addMouseListener(this);

		fsave = new JFrame("SAVE");
		fsave.setLocation(300, 700);
		fsave.setSize(400, 300);
		fsave.addMouseListener(this);

		String contents2[][] = null;

		model2 = new DefaultTableModel(contents2, header);

		tb2 = new JTable(model2);
		sp2 = new JScrollPane(tb2);
		sp2.addMouseListener(this);

//		tb.setEnabled(false); // 테이블 수정 금지// 적용하면 자료 이동이 안됨.
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
		tb.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
//		tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 테이블 하나만 선택가능

		tb2.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
		tb2.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정

	}

	public void startFrame() {
		f.add(sp);
		f.setVisible(true);
		fsave.add(sp2);
		fsave.setVisible(true);

	}

	public void mouseClicked(MouseEvent e) {
		String[] inputStr = new String[3];
//		tb에서 선택하여 프레임 더블클릭하면 tb2에 추가됨.
		if (e.getClickCount() == 2 && e.getSource().equals(sp)) {
			int row = tb.getSelectedRow();
			inputStr[0] = (String) tb.getValueAt(row, 0);
			inputStr[1] = (String) tb.getValueAt(row, 1);
			inputStr[2] = (String) tb.getValueAt(row, 2);
			model2.addRow(inputStr);
		}
//		삭제
//		tb2에서 선택하여 프레임 더블클릭하면 삭제됨.
		if (e.getClickCount() == 2 && e.getSource().equals(sp2)) {
			model2.removeRow(tb2.getSelectedRow());
		}

	}

	public static void main(String[] args) {
		JTableTest t = new JTableTest();
		t.startFrame();

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
