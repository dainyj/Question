package proMiddle;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.Execute;
import db.Query;

public class Mypage extends WindowAdapter implements ActionListener, MouseListener {
	private JFrame f5, fclick;
	private JPanel p;
	private JScrollPane sp;
	private JTable tb;
	private DefaultTableModel model;
	private JButton b;

	TextArea comments;

	Query qu = new Query();
	Execute ec = new Execute();

	public Mypage() {
//		Frame setting
		f5 = new JFrame("Mypage");
		f5.setLayout(null);
		f5.setSize(300, 550);
		f5.setLocation(300, 300);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f5.setResizable(false);

		fclick = new JFrame("자세히");
		fclick.setLayout(null);
		fclick.setSize(500, 200);

		comments = new TextArea();

		p = new JPanel();
		p.setSize(250, 450);
		p.setLocation(20, 30);
		p.setLayout(new BorderLayout());
		p.addMouseListener(this);

//		JTable setting
		String header[] = { "기관명", "도시명" };
		String contents[][] = null;
		model = new DefaultTableModel(contents, header); // 모델 생성

		tb = new JTable(model); // 모델을 사용한 테이블 생성
//		tb.setSize(230, 160);
//		tb.setLocation(30, 70);
		tb.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		tb.setPreferredSize(new Dimension(250, 450));

		sp = new JScrollPane(); // 테이블을 스크롤패널에 추가
		sp.setViewportView(tb);
		sp.addMouseListener(this);
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
//		tb.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
		tb.setEnabled(false); // 테이블 수정 금지// 적용하면 자료 이동이 안됨.
		p.add(sp);

		b = new JButton("확인");
		b.setSize(80, 25);
		b.setLocation(100, 480);
		b.addActionListener(this);
		b.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

	}

	public void list() {// 여기서 부터 다시 작성 시작
		String A = qu.main();
		String list[] = ec.printResult(A);
		for(int i=0;i<list.length;i++) {
		model.addRow(list);	
		
		}

	}

	public void startFrame() {
		f5.add(p);
		f5.add(b);
		f5.setVisible(true);
	}

	public void startClick() {
		fclick.add(comments);
		fclick.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("확인")) {
			Mypage mp = new Mypage();
			int row = tb.getSelectedRow();
			String get = (String) tb.getValueAt(row, 1);
//			쿼리 작성하고 실행시켜서 출력 하나만 출력하면 됨. 
			String sql = qu.detail(get);
			String result = ec.printRes(sql);
			comments.append(result);
			mp.startClick();
		}

	}

	public static void main(String[] args) {
		Mypage mp = new Mypage();
		mp.startFrame();
	}

	@Override
	public void mouseClicked(MouseEvent e) { // 이거 안씀 정리 해야함.
		String[] inputStr = new String[3];
//		tb에서 선택하여 프레임 더블클릭하면 tb2에 추가됨.
		if (e.getClickCount() == 2 && e.getSource().equals(sp)) {
//		if(e.getClickCount()==3) {
			int row = tb.getSelectedRow();
			inputStr[0] = (String) tb.getValueAt(row, 0);
			inputStr[1] = (String) tb.getValueAt(row, 1);
			inputStr[2] = (String) tb.getValueAt(row, 2);
//			model2.addRow(inputStr);
			fclick.setVisible(true);
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