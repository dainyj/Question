package proMiddle;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Dimension;
import java.awt.Font;
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

import db.Execute;
import db.MuseVo;
import db.Query;
import proFront.Menu;

public class Search extends WindowAdapter implements ActionListener, MouseListener {
	private JFrame fsc, fex;
	private JPanel p, p2, pex;
	private JButton bsc, bdown, bsave;
	private JTextField tfs;
	private JTable tb, tb2;
	private JScrollPane sp, sp2, spex;
	private Choice group;
	private DefaultTableModel model, model2;
	private String ID;
	private JLabel lex1, lex2, lex3;
	private JTextArea taex;

	private String explain1 = "", explain2 = "", explain3 = "";

	Execute ec = new Execute();
	Query qu = new Query();
	Menu mn = new Menu();

	public Search() {
//		Frame setting
		fsc = new JFrame("SEARCH");
		fsc.setLayout(null);
		fsc.setSize(300, 550);
		fsc.setLocation(300, 300);
//		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setResizable(false);
		fsc.addMouseListener(this);

		fex = new JFrame();
		fex.setLayout(null);
		fex.setSize(190, 175);

		fex.addMouseListener(this);

//		JTextArea setting
		taex = new JTextArea();
		taex.setSize(100, 100);
		taex.setLocation(20, 20);
		spex = new JScrollPane(taex);

		taex.append(explain1); // 어떤 Label인지에 따라서 들어가는 String도 다름, 한 Frame에 실행 시 다르게 넣을 예정

//		JPanel setting
		p = new JPanel();
		p.setSize(250, 150);
		p.setLocation(20, 70);
		p.setLayout(new BorderLayout());
		p.addMouseListener(this);

		pex = new JPanel();
		pex.setSize(135, 100);
		pex.setLocation(20, 20);
		pex.setLayout(new BorderLayout());
		pex.add(spex);

//		JTable setting
		String header[] = { "종류", "기관명", "도시명" };
		String contents[][] = null;
		model = new DefaultTableModel(contents, header); // 모델 생성

		tb = new JTable(model); // 모델을 사용한 테이블 생성
//		tb = new JTable(contents,header);
//		tb.setSize(230, 160);
//		tb.setLocation(30, 70);
//		tb.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tb.setPreferredSize(new Dimension(230, 160));

		sp = new JScrollPane(); // 테이블을 스크롤패널에 추가
		sp.setViewportView(tb);
		sp.addMouseListener(this);
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
//		tb.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
		p.add(sp);

		p2 = new JPanel();
		p2.setSize(250, 150);
		p2.setLocation(20, 280);
		p2.setLayout(new BorderLayout());
		p2.addMouseListener(this);

		String contents2[][] = null;
		model2 = new DefaultTableModel(contents2, header);

		tb2 = new JTable(model2);
//		tb2.setSize(230, 160);
//		tb2.setLocation(30, 280);
		tb2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tb2.setPreferredSize(new Dimension(230, 160));
		tb2.addMouseListener(this);

		sp2 = new JScrollPane(tb2);
		sp2.addMouseListener(this);
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

		bdown = new JButton("아래로");
		bdown.setSize(100, 30);
		bdown.setLocation(93, 230);
		bdown.addActionListener(this);
		bdown.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bsave = new JButton("저장");
		bsave.setSize(100, 30);
		bsave.setLocation(93, 445);
		bsave.addActionListener(this);
		bsave.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		back = new JButton("뒤로");
//		back.setSize(60, 18);
//		back.setLocation(210, 485);
//		back.addActionListener(this);
//		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		초이스? 콤보박스? setting
		group = new Choice();
		group.add("기관명");
		group.add("종류");
		group.add("도시");
		group.add("주소");
		group.setSize(60, 20);
		group.setLocation(20, 18);

//		JLabel setting
		lex1 = new JLabel("?"); // 검색버튼 옆
		lex1.setSize(30, 30);
		lex1.setLocation(255, 15);
		lex1.setHorizontalAlignment(JLabel.CENTER);
		lex1.addMouseListener(this);

		lex2 = new JLabel("?"); // 아래로버튼 옆
		lex2.setSize(30, 30);
		lex2.setLocation(200, 230);
		lex2.setHorizontalAlignment(JLabel.CENTER);
		lex2.addMouseListener(this);

		lex3 = new JLabel("?"); // 저장버튼 옆
		lex3.setSize(30, 30);
		lex3.setLocation(200, 445);
		lex3.setHorizontalAlignment(JLabel.CENTER);
		lex3.addMouseListener(this);

		explain1 = "설명1";
		explain2 = "설명2";
		explain3 = "설명3";

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
		fsc.add(bsave);
//		fsc.add(back);
		fsc.setVisible(true);

//		설명부분
		fsc.add(lex1);
		fsc.add(lex2);
		fsc.add(lex3);
		fex.add(pex);

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

		if (e.getActionCommand().equals("아래로")) {
			String[] inputStr2 = new String[3];
			int row = tb.getSelectedRow();
			inputStr2[0] = (String) tb.getValueAt(row, 0);
			inputStr2[1] = (String) tb.getValueAt(row, 1);
			inputStr2[2] = (String) tb.getValueAt(row, 2);
			model2.addRow(inputStr2);
		}

		if (e.getActionCommand().equals("저장")) { // 중복체크 넣어야함. 이건 화요일 오후에 시도할 예정.
//		1 버튼클릭 > 2 data get  > 3 insert DB
//					row 카운트  
//					검색어만 저장 후 불러올때 검색어를 이용한 DB 호출?
//					검색어는 기관명 시군명 이 두가지로

			int count = tb2.getRowCount(); // 저장해야할 행 수
			for (int i = 0; i < count; i++) {
//				int num = cnt + i + 1;
//				System.out.println("cntnum = " + num);
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

	@Override
	public void mouseClicked(MouseEvent e) {
//		삭제 : tb2에서 선택하여 더블클릭하면 삭제됨.
		if (e.getClickCount() == 2 && e.getSource().equals(tb2)) {
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
		if (e.getSource().equals(lex1)) {
			fex.setLocation(600, 300);
			System.out.println("?1");
			taex.setText(null);// 초기화 안해주면 내용이 중복되어 쌓임.
			taex.append(explain1);
			fex.setVisible(true);

		}
		if (e.getSource().equals(lex2)) {

			fex.setLocation(600, 400);

			System.out.println("?2");
			taex.setText(null);// 초기화 안해주면 내용이 중복되어 쌓임.
			taex.append(explain2);
			fex.setVisible(true);

		}
		if (e.getSource().equals(lex3)) {
			fex.setLocation(600, 600);
			System.out.println("?3");
			taex.setText(null);// 초기화 안해주면 내용이 중복되어 쌓임.
			taex.append(explain3);
			fex.setVisible(true);

		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource().equals(fsc)) {
			fex.setVisible(false);
		}
	}

}
