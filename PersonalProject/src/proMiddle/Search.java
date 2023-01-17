package proMiddle;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import db.Execute;
import db.MuseVo;
import db.Query;
import proFront.Menu;

public class Search extends WindowAdapter implements ActionListener{
	private JFrame fsc;
	private JPanel p, p2;
	private JButton bsc, bdown, bup, bsave;
	private JTextField tfs;
	private JTable tb, tb2;
	private JScrollPane sp, sp2;
	private Choice group;
	private DefaultTableModel model, model2;
	private String ID;


	Execute ec = new Execute();
	Query qu = new Query();
	Menu mn = new Menu();

	public Search() {
//		Frame setting
		fsc = new JFrame("SEARCH");
		fsc.setLayout(null);
		fsc.setSize(300, 550);
		fsc.setLocation(1200, 300);
//		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setResizable(false);

//		JPanel setting
		p = new JPanel();
		p.setSize(250, 150);
		p.setLocation(20, 70);
		p.setLayout(new BorderLayout());

//		JTable setting
		String header[] = { "종류", "기관명", "도시명" };
		String contents[][] = null;
		model = new DefaultTableModel(contents, header); // 모델 생성

		tb = new JTable(model); // 모델을 사용한 테이블 생성
		tb.setPreferredSize(new Dimension(230, 160));

//		테이블 가로 넓이 조절
		TableColumn col0 = tb.getColumnModel().getColumn(0);
		col0.setPreferredWidth(10);
		TableColumn col1 = tb.getColumnModel().getColumn(1);
		col1.setPreferredWidth(100);
		TableColumn col2 = tb.getColumnModel().getColumn(2);
		col2.setPreferredWidth(5);
		
		
		sp = new JScrollPane(); // 테이블을 스크롤패널에 추가
		sp.setViewportView(tb);
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
		p.add(sp);

		p2 = new JPanel();
		p2.setSize(250, 150);
		p2.setLocation(20, 280);
		p2.setLayout(new BorderLayout());

		String contents2[][] = null;
		model2 = new DefaultTableModel(contents2, header);

		tb2 = new JTable(model2);
		tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tb2.setPreferredSize(new Dimension(230, 160));

//		테이블 가로 넓이 조절
		TableColumn col3 = tb2.getColumnModel().getColumn(0);
		col3.setPreferredWidth(10);
		TableColumn col4 = tb2.getColumnModel().getColumn(1);
		col4.setPreferredWidth(100);
		TableColumn col5 = tb2.getColumnModel().getColumn(2);
		col5.setPreferredWidth(5);
		
		sp2 = new JScrollPane(tb2);
		tb2.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
//		tb2.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
		p2.add(sp2);

//		TextField setting
		tfs = new JTextField(20);
		tfs.setSize(100, 20);
		tfs.setLocation(90, 20);

//		Button setting
		bsc = new JButton("검색");
		bsc.setSize(60, 20);
		bsc.setLocation(200, 20);
		bsc.addActionListener(this);
		bsc.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bdown = new JButton("↓");
		bdown.setSize(45, 30);
		bdown.setLocation(90, 230);
		bdown.addActionListener(this);
		bdown.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bup = new JButton("↑");
		bup.setSize(45, 30);
		bup.setLocation(150, 230);
		bup.addActionListener(this);
		bup.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bsave = new JButton("저장");
		bsave.setSize(100, 30);
		bsave.setLocation(93, 445);
		bsave.addActionListener(this);
		bsave.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		초이스? 콤보박스? setting
		group = new Choice();
		group.add("기관명");
		group.add("종류");
		group.add("도시");
		group.add("주소");
		group.setSize(60, 20);
		group.setLocation(20, 18);

	}

//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}

	public void startFrame() {
		fsc.add(tfs);
		fsc.add(p);
		fsc.add(p2);
		fsc.add(bsc);
		fsc.add(group);
		fsc.add(bdown);
		fsc.add(bup);
		fsc.add(bsave);
		fsc.setVisible(true);
		ec.connDB();
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public void actionPerformed(ActionEvent e) {

		String[] inputStr = new String[3];
		if (e.getActionCommand().equals("검색")) {
			if (tfs.getText().equals(null)) {
				model.setNumRows(0);
				inputStr = null;
			} else {
				String st = tfs.getText();// 검색어 부분
				String c = group.getItem(group.getSelectedIndex()); // sc // 콤보박스 내용 -> 스위치케이스문으로 구분 -> 쿼리문 완성
				String ssl = qu.serchQuery(c, st); // SearchSqlList // sql 완성 메서드

				model.setNumRows(0);
				ArrayList<MuseVo> list = ec.list2(ssl);
				for (int i = 0; i < list.size(); i++) {
					MuseVo data = (MuseVo) list.get(i);
//					System.out.println(list.get(i));
//					System.out.println();
					inputStr[0] = data.getMUSEUM_ARTGLRY_TYPE_NM();
					inputStr[1] = data.getBIZPLC_NM();
					inputStr[2] = data.getSIGUN_NM();
					model.addRow(inputStr);
				}
			}
			tfs.setText(null);// 검색버튼 누르면 tf 초기화
		}

		if (e.getActionCommand().equals("↓")) {
			String[] inputStr2 = new String[3];
			int row = tb.getSelectedRow();
			inputStr2[0] = (String) tb.getValueAt(row, 0);
			inputStr2[1] = (String) tb.getValueAt(row, 1);
			inputStr2[2] = (String) tb.getValueAt(row, 2);
			model.removeRow(tb.getSelectedRow());
			model2.addRow(inputStr2);
		}
		
		if (e.getActionCommand().equals("↑")) {
			String[] inputStr3 = new String[3];
			int row = tb2.getSelectedRow();
			inputStr3[0] = (String) tb.getValueAt(row, 0);
			inputStr3[1] = (String) tb.getValueAt(row, 1);
			inputStr3[2] = (String) tb.getValueAt(row, 2);
			model2.removeRow(tb2.getSelectedRow());
			model.addRow(inputStr3);
		}
		
		if (e.getActionCommand().equals("저장")) { 
			int count = tb2.getRowCount(); // 저장해야할 행 수
			for (int i = 0; i < count; i++) {
				String A = (String) tb2.getValueAt(i, 1);// 기관명
				String B = (String) tb2.getValueAt(i, 2); // 도시명
				String sql = qu.insertQuery(A, B, ID);
//				System.out.println(A + " " + B + " " + ID + "\n");
//				System.out.println(sql + "\n\n");
				ec.insertMypage(sql);
				String dsSql = qu.deleteSame(ID);
				ec.runQuery(dsSql);
			}

		}

		if (e.getActionCommand().equals("뒤로")) {
			fsc.setVisible(false);
			mn.setID(ID);
//			System.out.println("검색>" + ID);
			mn.startFrame();
		}
	}

	public static void main(String[] args) {
		Search s = new Search();
		s.startFrame();
		Execute ec = new Execute();
		ec.connDB();
	}

}
