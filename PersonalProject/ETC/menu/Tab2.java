//package menu;
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTabbedPane;
//import javax.swing.JTextArea;
//import javax.swing.border.Border;
//
//import db.Execute;
//import db.Query;
//
//public class Tab2 extends JFrame {
//// 외부객체 생성
//	Alltab allt = new Alltab();
//	Citytab cityt = new Citytab();
//	Themetab themet = new Themetab();
//
//	public Tab2() {
//		JTabbedPane jtp = new JTabbedPane();
//
//		jtp.add("ALL", allt);
//		jtp.add("CITY", cityt);
//		jtp.add("THEME", themet);
//
////		프레임에 jtp 붙이기
//		add(jtp);
//
//		setTitle("List");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(300, 550);
//		setLocation(900, 300);
//		setVisible(true);
//	}
//
//	public static void main(String[] args) {
//		new Tab2();
//	}
//}// Tab 클래스 end
//
//class Alltab extends JPanel {
//	private JTextArea ta;
//	private JScrollPane sp;
//
//	public Alltab() {
//		setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setSize(270, 400);
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // 수정 X
//
//		sp = new JScrollPane();
//		sp.setViewportView(ta); // 스크롤에 ta를 추가
//		sp.setSize(270, 400);
//		add(sp); // 패널에 스크롤을 추가, 패널에 ta를 직접 추가하지 않는다.
//
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		Query qu = new Query();
//		Execute ec = new Execute();
//		ec.connDB();
//		String[] list = ec.printResult(qu.allQuery());
//		for (int i = 0; i < list.length; i++) {
//			ta.append(list[i]);
//		}
//	}
//
//}// All 클래스 end
//
//class C1 extends JPanel implements ActionListener {
//	private JButton b1, b2, b3, b4, b5, b6, b7;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C1() {
////		setLayout(null);
////		도시 시작
//		b1 = new JButton("가평군");
//		b1.setSize(87, 30);
//		b1.setLocation(75, 10);
//		b1.addActionListener(this);
//		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b2 = new JButton("과천시");
//		b2.setSize(87, 30);
//		b2.setLocation(75, 80);
//		b2.addActionListener(this);
//		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b3 = new JButton("광명시");
//		b3.setSize(87, 30);
//		b3.setLocation(75, 150);
//		b3.addActionListener(this);
//		b3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b4 = new JButton("광주시");
//		b4.setSize(87, 30);
//		b4.setLocation(75, 220);
//		b4.addActionListener(this);
//		b4.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b5 = new JButton("고양시");
//		b5.setSize(87, 30);
//		b5.setLocation(75, 290);
//		b5.addActionListener(this);
//		b5.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b6 = new JButton("구리시");
//		b6.setSize(87, 30);
//		b6.setLocation(75, 360);
//		b6.addActionListener(this);
//		b6.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b7 = new JButton("김포시");
//		b7.setSize(87, 30);
//		b7.setLocation(75, 430);
//		b7.addActionListener(this);
//		b7.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b1);
//		add(b2);
//		add(b3);
//		add(b4);
//		add(b5);
//		add(b6);
//		add(b7);
//
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//		if (e.getActionCommand().equals("가평군")) {
//			f.setVisible(true);
//			ta.setText(null); // TextArea 초기화
//			A = qu.cityQuery(b1.getText()); // 쿼리 완성
////			MuseVo에 저장한 list 불러오기
//			String[] list = ec.printResult(A);//
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("과천시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b2.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("광명시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b3.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("광주시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b4.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("고양시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b5.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("구리시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b6.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("김포시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b7.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//	}
//} // C1 end
//
//class C2 extends JPanel implements ActionListener {
//	private JButton b8;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C2() {
////		setLayout(null);
//		
//		b8 = new JButton("남양주시");
//		b8.setSize(87, 30);
//		b8.setLocation(75, 10);
//		b8.addActionListener(this);
//		b8.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b8);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("남양주시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b8.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//
//		}
//
//	}
//} // C2 end
//
//class C3 extends JPanel implements ActionListener {
//	private JButton b9;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C3() {
//		b9 = new JButton("동두천시");
//		b9.setSize(87, 30);
//		b9.setLocation(190, 105);
//		b9.addActionListener(this);
//		b9.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////			sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b9);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("동두천시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b9.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//	}
//} // C3 end
//
//class C4 extends JPanel implements ActionListener {
//	private JButton b10;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C4() {
//		b10 = new JButton("부천시");
//		b10.setSize(87, 30);
//		b10.setLocation(10, 155);
//		b10.addActionListener(this);
//		b10.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////			sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b10);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("부천시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b10.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//	}
//
//} // C4 end
//
//class C5 extends JPanel implements ActionListener {
//	private JButton b11, b12, b13;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C5() {
//		b11 = new JButton("성남시");
//		b11.setSize(87, 30);
//		b11.setLocation(100, 155);
//		b11.addActionListener(this);
//		b11.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b12 = new JButton("수원시");
//		b12.setSize(87, 30);
//		b12.setLocation(190, 155);
//		b12.addActionListener(this);
//		b12.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b13 = new JButton("시흥시");
//		b13.setSize(87, 30);
//		b13.setLocation(10, 205);
//		b13.addActionListener(this);
//		b13.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b11);
//		add(b12);
//		add(b13);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("성남시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b11.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//		if (e.getActionCommand().equals("수원시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b12.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("시흥시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b13.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//	}
//
//}// C5 end
//
//class C6 extends JPanel implements ActionListener {
//	private JButton b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C6() {
//		b14 = new JButton("안산시");
//		b14.setSize(87, 30);
//		b14.setLocation(100, 205);
//		b14.addActionListener(this);
//		b14.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b15 = new JButton("안성시");
//		b15.setSize(87, 30);
//		b15.setLocation(190, 205);
//		b15.addActionListener(this);
//		b15.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b16 = new JButton("안양시");
//		b16.setSize(87, 30);
//		b16.setLocation(10, 255);
//		b16.addActionListener(this);
//		b16.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b17 = new JButton("양주시");
//		b17.setSize(87, 30);
//		b17.setLocation(100, 255);
//		b17.addActionListener(this);
//		b17.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b18 = new JButton("양평군");
//		b18.setSize(87, 30);
//		b18.setLocation(190, 255);
//		b18.addActionListener(this);
//		b18.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b19 = new JButton("여주시");
//		b19.setSize(87, 30);
//		b19.setLocation(10, 305);
//		b19.addActionListener(this);
//		b19.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b20 = new JButton("오산시");
//		b20.setSize(87, 30);
//		b20.setLocation(100, 305);
//		b20.addActionListener(this);
//		b20.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b21 = new JButton("용인시");
//		b21.setSize(87, 30);
//		b21.setLocation(190, 305);
//		b21.addActionListener(this);
//		b21.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b22 = new JButton("이천시");
//		b22.setSize(87, 30);
//		b22.setLocation(10, 355);
//		b22.addActionListener(this);
//		b22.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b23 = new JButton("의왕시");
//		b23.setSize(87, 30);
//		b23.setLocation(100, 355);
//		b23.addActionListener(this);
//		b23.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b24 = new JButton("의정부시");
//		b24.setSize(87, 30);
//		b24.setLocation(190, 355);
//		b24.addActionListener(this);
//		b24.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b14);
//		add(b15);
//		add(b16);
//		add(b17);
//		add(b18);
//		add(b19);
//		add(b20);
//		add(b21);
//		add(b22);
//		add(b23);
//		add(b24);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("안산시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b14.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("안성시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b15.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("안양시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b16.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("양주시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b17.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("양평군")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b18.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("여주시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b19.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("오산시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b20.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("용인시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b21.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("이천시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b22.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("의왕시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b23.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("의정부시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b24.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//	}
//} // C6 end
//
//class C7 extends JPanel implements ActionListener {
//	private JButton b25, b26;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C7() {
//		b25 = new JButton("파주시");
//		b25.setSize(87, 30);
//		b25.setLocation(10, 405);
//		b25.addActionListener(this);
//		b25.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b26 = new JButton("포천시");
//		b26.setSize(87, 30);
//		b26.setLocation(100, 405);
//		b26.addActionListener(this);
//		b26.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b25);
//		add(b26);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("파주시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b25.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("포천시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b26.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//	}
//} // C7 end
//
//class C8 extends JPanel implements ActionListener {
//	private JButton b27, b28;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//	private JFrame f;
//
//	public C8() {
//		b27 = new JButton("하남시");
//		b27.setSize(87, 30);
//		b27.setLocation(190, 405);
//		b27.addActionListener(this);
//		b27.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b28 = new JButton("화성시");
//		b28.setSize(87, 30);
//		b28.setLocation(10, 450);
//		b28.addActionListener(this);
//		b28.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		setLayout(null);
//
//		f = new JFrame("목록");
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setResizable(false);
//		p = new JPanel();
//		p.setSize(250, 380);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
////		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		f.add(p);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		add(b27);
//		add(b28);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String A = "";
//		ec.connDB();
//
//		if (e.getActionCommand().equals("하남시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b27.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("화성시")) {
//			f.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b28.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//	}
//} // C8 end
//
//class Citytab extends JPanel {
//	C1 c1 = new C1();
//	C2 c2 = new C2();
//	C3 c3 = new C3();
//	C4 c4 = new C4();
//	C5 c5 = new C5();
//	C6 c6 = new C6();
//	C7 c7 = new C7();
//	C8 c8 = new C8();
//
//	public Citytab() {
//		JTabbedPane tab = new JTabbedPane(JTabbedPane.LEFT);
//		setLayout(new BorderLayout()); // 탭 추가보다 위에 있어야 함.
//		setSize(300, 550);
//		setLocation(900, 300);
//		setVisible(true);
//
//		tab.add("ㄱ", c1);
//		tab.add("ㄴ", c2);
//		tab.add("ㄷ", c3);
//		tab.add("ㅂ", c4);
//		tab.add("ㅅ", c5);
//		tab.add("ㅇ", c6);
//		tab.add("ㅍ", c7);
//		tab.add("ㅎ", c8);
//
//		add(tab);
//	}
//
//}// Citytab 클래스 end
//
//class Themetab extends JPanel implements ActionListener {
//	private JButton bm, ba, bg;
//	private JTextArea tam, taa, tag;
//	private JScrollPane sm, sa, sg;
//
//	public Themetab() {
////		Button setting
//		bm = new JButton("박물관");
//		bm.setSize(73, 20);
//		bm.setLocation(25, 5);
//		bm.addActionListener(this);
//		bm.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		ba = new JButton("미술관");
//		ba.setSize(73, 20);
//		ba.setLocation(25, 165);
//		ba.addActionListener(this);
//		ba.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		bg = new JButton("전시관");
//		bg.setSize(73, 20);
//		bg.setLocation(25, 325);
//		bg.addActionListener(this);
//		bg.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////		Panel setting
//
////		TextArea setting
//		tam = new JTextArea();
//
//		tam.setLineWrap(true); // 자동 줄바꿈
//		tam.setEditable(false); // 수정 X
//		tam.setCaretPosition(tam.getDocument().getLength());
//
//		taa = new JTextArea();
//		taa.setLineWrap(true); // 자동 줄바꿈
//		taa.setEditable(false); // 수정 X
//		taa.setCaretPosition(taa.getDocument().getLength());
//		add(taa);
//
//		tag = new JTextArea();
//		tag.setLineWrap(true); // 자동 줄바꿈
//		tag.setEditable(false); // 수정 X
//		tag.setCaretPosition(tag.getDocument().getLength());
//		add(tag);
//
////		ScrollPane setting
//		sm = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sm.setViewportView(tam);
//		sm.setSize(240, 125);
//		sm.setLocation(20, 35);
//		add(sm);
//
//		sa = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sa.setViewportView(taa);
//		sa.setSize(240, 125);
//		sa.setLocation(20, 195);
//		add(sa);
//
//		sg = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sg.setViewportView(tag);
//		sg.setSize(240, 125);
//		sg.setLocation(20, 355);
//		add(sg);
//
//		setLayout(null);
//		add(bm);
//		add(ba);
//		add(bg);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		Query qu = new Query();
//		Execute ec = new Execute();
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
//	}
//
//}
//// Themetab 클래스 end
