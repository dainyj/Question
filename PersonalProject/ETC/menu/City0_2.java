//package menu;
//
//
//import java.awt.BorderLayout;
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//
//import javax.swing.BorderFactory;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.ScrollPaneConstants;
//import javax.swing.border.Border;
//
//import db.Execute;
//import db.Query;
//import proFront.Menu;
//
///*//1가평군 //2과천시 //3광명시 //4광주시 //5고양시 //6구리시 //7김포시
////8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
////14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시
////20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
////25파주시 //26포천시 //27하남시 //28화성시
//*/public class City0_2 implements ActionListener { // 디스플레이만 설정 바꾸면 됨
//	private JFrame fc, fci;
//	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
//			b23, b24, b25, b26, b27, b28, back;
//	private JPanel p, ptab;
//	private JTextArea ta;
//	private JScrollPane sp;
//	
//	Menu mn = new Menu();
//	Query qu = new Query();
//	Execute ec = new Execute();
//	String A = "";
//
//	public City0_2() {
//		fc = new JFrame("CITY");
//		fc.setLayout(null);
//		fc.setSize(300, 550);
//		fc.setLocation(300, 300);
////		fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		fc.setResizable(false);
//
//		ptab = new JPanel();
//		ptab.setSize(300, 550);
//		ptab.setLocation(900, 300);
//		ptab.setLayout(new BorderLayout());
//		
//		
////		도시 시작
//		b1 = new JButton("가평군");
//		b1.setSize(87, 30);
//		b1.setLocation(10, 20);
//		b1.addActionListener(this);
//		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b2 = new JButton("과천시");
//		b2.setSize(87, 30);
//		b2.setLocation(100, 20);
//		b2.addActionListener(this);
//		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b3 = new JButton("광명시");
//		b3.setSize(87, 30);
//		b3.setLocation(190, 20);
//		b3.addActionListener(this);
//		b3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b4 = new JButton("광주시");
//		b4.setSize(87, 30);
//		b4.setLocation(10, 70);
//		b4.addActionListener(this);
//		b4.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b5 = new JButton("고양시");
//		b5.setSize(87, 30);
//		b5.setLocation(100, 70);
//		b5.addActionListener(this);
//		b5.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b6 = new JButton("구리시");
//		b6.setSize(87, 30);
//		b6.setLocation(190, 70);
//		b6.addActionListener(this);
//		b6.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b7 = new JButton("김포시");
//		b7.setSize(87, 30);
//		b7.setLocation(10, 120);
//		b7.addActionListener(this);
//		b7.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
////8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
//		b8 = new JButton("남양주시");
//		b8.setSize(87, 30);
//		b8.setLocation(100, 120);
//		b8.addActionListener(this);
//		b8.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b9 = new JButton("동두천시");
//		b9.setSize(87, 30);
//		b9.setLocation(190, 120);
//		b9.addActionListener(this);
//		b9.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b10 = new JButton("부천시");
//		b10.setSize(87, 30);
//		b10.setLocation(10, 170);
//		b10.addActionListener(this);
//		b10.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b11 = new JButton("성남시");
//		b11.setSize(87, 30);
//		b11.setLocation(100, 170);
//		b11.addActionListener(this);
//		b11.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b12 = new JButton("수원시");
//		b12.setSize(87, 30);
//		b12.setLocation(190, 170);
//		b12.addActionListener(this);
//		b12.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b13 = new JButton("시흥시");
//		b13.setSize(87, 30);
//		b13.setLocation(10, 220);
//		b13.addActionListener(this);
//		b13.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
////14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시		
//		b14 = new JButton("안산시");
//		b14.setSize(87, 30);
//		b14.setLocation(100, 220);
//		b14.addActionListener(this);
//		b14.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b15 = new JButton("안성시");
//		b15.setSize(87, 30);
//		b15.setLocation(190, 220);
//		b15.addActionListener(this);
//		b15.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b16 = new JButton("안양시");
//		b16.setSize(87, 30);
//		b16.setLocation(10, 270);
//		b16.addActionListener(this);
//		b16.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b17 = new JButton("양주시");
//		b17.setSize(87, 30);
//		b17.setLocation(100, 270);
//		b17.addActionListener(this);
//		b17.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b18 = new JButton("양평군");
//		b18.setSize(87, 30);
//		b18.setLocation(190, 270);
//		b18.addActionListener(this);
//		b18.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b19 = new JButton("여주시");
//		b19.setSize(87, 30);
//		b19.setLocation(10, 320);
//		b19.addActionListener(this);
//		b19.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
//		b20 = new JButton("오산시");
//		b20.setSize(87, 30);
//		b20.setLocation(100, 320);
//		b20.addActionListener(this);
//		b20.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b21 = new JButton("용인시");
//		b21.setSize(87, 30);
//		b21.setLocation(190, 320);
//		b21.addActionListener(this);
//		b21.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b22 = new JButton("이천시");
//		b22.setSize(87, 30);
//		b22.setLocation(10, 370);
//		b22.addActionListener(this);
//		b22.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b23 = new JButton("의왕시");
//		b23.setSize(87, 30);
//		b23.setLocation(100, 370);
//		b23.addActionListener(this);
//		b23.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b24 = new JButton("의정부시");
//		b24.setSize(87, 30);
//		b24.setLocation(190, 370);
//		b24.addActionListener(this);
//		b24.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
////25파주시 //26포천시 //27하남시 //28화성시
//		b25 = new JButton("파주시");
//		b25.setSize(87, 30);
//		b25.setLocation(10, 420);
//		b25.addActionListener(this);
//		b25.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b26 = new JButton("포천시");
//		b26.setSize(87, 30);
//		b26.setLocation(100, 420);
//		b26.addActionListener(this);
//		b26.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b27 = new JButton("하남시");
//		b27.setSize(87, 30);
//		b27.setLocation(190, 420);
//		b27.addActionListener(this);
//		b27.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		b28 = new JButton("화성시");
//		b28.setSize(87, 30);
//		b28.setLocation(10, 470);
//		b28.addActionListener(this);
//		b28.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		back = new JButton("뒤로");
//		back.setSize(70, 20);
//		back.setLocation(200, 480);
//		back.addActionListener(this);
//		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//
//		fci = new JFrame("목록");
//		fci.setLayout(null);
//		fci.setSize(300, 550);
//		fci.setLocation(300, 300);
//		fci.setResizable(false);
//
//		p = new JPanel();
//		p.setSize(250, 400);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		p.add(ta);
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
//		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//	}
//	
////	public void windowClosing(WindowEvent e) {
////		System.exit(0);
////	}
//
//	public void startFrame() {
//		ptab.add(b1);
//		ptab.add(b2);
//		ptab.add(b3);
//		ptab.add(b4);
//		ptab.add(b5);
//		ptab.add(b6);
//		ptab.add(b7);
//		ptab.add(b8);
//		ptab.add(b9);
//		ptab.add(b10);
//		ptab.add(b11);
//		ptab.add(b12);
//		ptab.add(b13);
//		ptab.add(b14);
//		ptab.add(b15);
//		ptab.add(b16);
//		ptab.add(b17);
//		ptab.add(b18);
//		ptab.add(b19);
//		ptab.add(b20);
//		ptab.add(b21);
//		ptab.add(b22);
//		ptab.add(b23);
//		ptab.add(b24);
//		ptab.add(b25);
//		ptab.add(b26);
//		ptab.add(b27);
//		ptab.add(b28);
////		ptab.add(back);
//		fc.add(ptab);
//		fc.setVisible(true);
//		
//		fci.add(p);
//	}
//
//	public void actionPerformed(ActionEvent e) { 
//		if (e.getActionCommand().equals("가평군")) {
//			fci.setVisible(true);
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
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b2.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("광명시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b3.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("광주시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b4.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("고양시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b5.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("구리시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b6.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("김포시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b7.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("남양주시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b8.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("동두천시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b9.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("부천시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b10.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("성남시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b11.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//		if (e.getActionCommand().equals("수원시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b12.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("시흥시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b13.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("안산시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b14.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("안성시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b15.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("안양시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b16.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("양주시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b17.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("양평군")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b18.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("여주시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b19.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("오산시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b20.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("용인시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b21.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("이천시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b22.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("의왕시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b23.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("의정부시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b24.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("파주시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b25.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("포천시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b26.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("하남시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b27.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("화성시")) {
//			fci.setVisible(true);
//			ta.setText(null);
//			A = qu.cityQuery(b28.getText());
//			String[] list = ec.printResult(A);
//			for (int i = 0; i < list.length; i++) {
//				ta.append(list[i]);
//			}
//		}
//
//		if (e.getActionCommand().equals("뒤로")) {
//			fc.setVisible(false);
//			mn.startFrame();
//		}
//
//	}
//
//	public static void main(String[] args) {
//		City0_2 c = new City0_2();
//		c.startFrame();
//	}
//
//}
