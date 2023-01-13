package proFront;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import db.Execute;
import db.Query;
import menu.City;
import menu.Tab;
import menu.Theme;
import proMiddle.Mypage;
import proMiddle.Search;

public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4, f4_1;
	private JButton bm1, bm2, bm3, bs, bmp, back;
	private JLabel lm, line;
	private JTextArea ta;
	private JPanel p;
	private JScrollPane sp;
	private String ID;
	String str;

	String A = "";


	public Menu() {
//		Frame setting
		f4 = new JFrame("MENU");
		f4.setLayout(null);
		f4.setSize(300, 550);
		f4.setLocation(900, 300);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.setResizable(false);

//		=======DB출력 화면=========================================================================
		f4_1 = new JFrame("VIEW"); // 박물관 정보 출력프레임 // 탭으로 화면 구현, DB 불러오는 방식 공부
		f4_1.setLayout(null);
		f4_1.setSize(300, 550);
		f4_1.setLocation(300, 300);
		f4_1.setResizable(false);

		p = new JPanel();
		p.setSize(250, 400);
		p.setLocation(20, 30);
		p.setLayout(new BorderLayout());

		ta = new JTextArea();
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // 수정 X
		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기

		sp = new JScrollPane();
		sp.setViewportView(ta); // 스크롤에 ta를 추가
		p.add(sp); // 패널에 스크롤을 추가, 패널에 ta를 직접 추가하지 않는다.

		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
		// textArea 의 테두리 선의 색과 두께 설정 가능.
		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//		=============================================================================================	

//		Button setting
		bm1 = new JButton("ALL");
		bm1.setSize(100, 30);
		bm1.setLocation(95, 100);
		bm1.addActionListener(this);
		bm1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm2 = new JButton("List");
		bm2.setSize(100, 30);
		bm2.setLocation(95, 160);
		bm2.addActionListener(this);
		bm2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm3 = new JButton("주제별");
		bm3.setSize(100, 30);
		bm3.setLocation(95, 220);
		bm3.addActionListener(this);
		bm3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bs = new JButton("검색");
		bs.setSize(100, 30);
		bs.setLocation(95, 320);
		bs.addActionListener(this);
		bs.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bmp = new JButton("마이페이지");
		bmp.setSize(100, 30);
		bmp.setLocation(95, 380);
		bmp.addActionListener(this);
		bmp.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		back = new JButton("뒤로");
		back.setSize(70, 20);
		back.setLocation(200, 480);
		back.addActionListener(this);
		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		Label setting
		lm = new JLabel("MENU");
		lm.setSize(120, 30);
		lm.setLocation(50, 40);
		lm.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 40));

		line = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		line.setSize(200, 10);
		line.setLocation(50, 280);

	}

	public void startFrame() {
		f4_1.add(p);
		f4.add(lm);
		f4.add(line);
		f4.add(bm1);
		f4.add(bm2);
		f4.add(bm3);
		f4.add(bs);
		f4.add(bmp);
		f4.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Mypage mp = new Mypage();
		Query qu = new Query();
		Execute ec = new Execute();
		ec.connDB();
		if (e.getActionCommand().equals("ALL")) {
			f4_1.setVisible(true);
			String[] list = ec.printResult(qu.allQuery());
			for (int i = 0; i < list.length; i++) {
				ta.append(list[i]);
			}
		}

		if (e.getActionCommand().equals("List")) {
			Tab.main(null);
		}

		if (e.getActionCommand().equals("주제별")) {
			Theme.main(null);
		}

		if (e.getActionCommand().equals("검색")) {
			Search s = new Search();
			s.setID(ID);
			s.startFrame();
		}

		if (e.getActionCommand().equals("마이페이지")) {
			mp.setID(ID);
			mp.startFrame();			
		}

		if (e.getActionCommand().equals("뒤로")) {
			Menu mn = new Menu();
			f4_1.setVisible(false);
			mn.startFrame();
		}
	}
	
	public void setID(String ID) {
		this.ID = ID;
	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.startFrame();

	}

}