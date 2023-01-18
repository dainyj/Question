//package menu;
//
//import java.awt.BorderLayout;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//
//import db.Execute;
//import db.Query;
//import proFront.Menu;
//
//public class Theme_0 extends WindowAdapter 
//implements ActionListener {
//	private JFrame ft;
//	private JButton bm, ba, bg, back;
//	private JPanel pm, pa, pg;
//	private JTextArea tam, taa, tag;
//	private JScrollPane sm, sa, sg;
//
//	Query qu = new Query();
//	Execute ec = new Execute();
//	Menu mn = new Menu();
//
//	public Theme_0() {
////		Frame setting
//		ft = new JFrame("주제별");
//		ft.setLayout(null);
//		ft.setSize(300, 550);
//		ft.setLocation(300, 300);
////		ft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ft.setResizable(false);
//
////		Button setting
//		bm = new JButton("박물관");
//		bm.setSize(73, 20);
//		bm.setLocation(30, 20);
//		bm.addActionListener(this);
//		bm.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		ba = new JButton("미술관");
//		ba.setSize(73, 20);
//		ba.setLocation(30, 180);
//		ba.addActionListener(this);
//		ba.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		bg = new JButton("전시관");
//		bg.setSize(73, 20);
//		bg.setLocation(30, 340);
//		bg.addActionListener(this);
//		bg.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		back = new JButton("뒤로");
//		back.setSize(60, 18);
//		back.setLocation(210, 10);
//		back.addActionListener(this);
//		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		Panel setting
//		pm = new JPanel();
//		pm.setSize(240, 125);
//		pm.setLocation(25, 50);
//		pm.setLayout(new BorderLayout());
//
//		pa = new JPanel();
//		pa.setSize(240, 125);
//		pa.setLocation(25, 210);
//		pa.setLayout(new BorderLayout());
//
//		pg = new JPanel();
//		pg.setSize(240, 125);
//		pg.setLocation(25, 370);
//		pg.setLayout(new BorderLayout());
//
////		TextArea setting
//		tam = new JTextArea();
//		tam.setLineWrap(true); // 자동 줄바꿈
//		tam.setEditable(false); // 수정 X
//		tam.setCaretPosition(tam.getDocument().getLength());
//		pm.add(tam);
//
//		taa = new JTextArea();
//		taa.setLineWrap(true); // 자동 줄바꿈
//		taa.setEditable(false); // 수정 X
//		taa.setCaretPosition(taa.getDocument().getLength());
//		pa.add(taa);
//
//		tag = new JTextArea();
//		tag.setLineWrap(true); // 자동 줄바꿈
//		tag.setEditable(false); // 수정 X
//		tag.setCaretPosition(tag.getDocument().getLength());
//		pg.add(tag);
//
////		ScrollPane setting
//		sm = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sm.setViewportView(tam);
//		pm.add(sm);
//
//		sa = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sa.setViewportView(taa);
//		pa.add(sa);
//
//		sg = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sg.setViewportView(tag);
//		pg.add(sg);
//	}
//
//	public void startFrame() {
//		ft.add(bm);
//		ft.add(pm);
//		ft.add(ba);
//		ft.add(pa);
//		ft.add(bg);
//		ft.add(pg);
////		ft.add(back);
//		ft.setVisible(true);
//	}
//	
////	public void windowClosing(WindowEvent e) {
////		System.exit(0);
////	}
//
//	public void actionPerformed(ActionEvent e) {
//		ec.connDB();
//		if (e.getActionCommand().equals("박물관")) {
//			String add = bm.getText();
//			String sql = qu.themeQuery(add);
//			System.out.println(add + " " + sql);
//			tam.setText(null);
//			String[] list = ec.printResult(sql);
//			for (int i = 0; i < list.length; i++) {
//				tam.append(list[i]);
//			}
//
//		}
//
//		if (e.getActionCommand().equals("미술관")) {
//			String add = ba.getText();
//			String sql = qu.themeQuery(add);
//			System.out.println(add + " " + sql);
//			taa.setText(null);
//			String[] list = ec.printResult(sql);
//			for (int i = 0; i < list.length; i++) {
//				taa.append(list[i]);
//			}
//
//		}
//
//		if (e.getActionCommand().equals("전시관")) {
//			String add = bg.getText();
//			String sql = qu.themeQuery(add);
//			System.out.println(add + " " + sql);
//			tag.setText(null);
//			String[] list = ec.printResult(sql);
//			for (int i = 0; i < list.length; i++) {
//				tag.append(list[i]);
//
//			}
//		}
//
//		if (e.getActionCommand().equals("뒤로")) {
//			ft.setVisible(false);
//			mn.startFrame();
//		}
//	}
//
//	public static void main(String[] args) {
//		Theme_0 tm = new Theme_0();
//		tm.startFrame();
//	}
//
//}
