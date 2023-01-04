package proFront;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import db.Mfind;
import menu.City;
import menu.Theme;
import proMiddle.Mypage;
import proMiddle.Notice;
import proMiddle.Search;

// 프레임 1, 메뉴- 버튼3/라벨1, 검색- 라벨/텍스트필드/버튼 1, 마이페이지- 라벨/버튼1, 공지사항 - 라벨/버튼1
public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4, f4_1;
	private JButton bm1, bm2, bm3, bs, bmp, bnt, back;
	private JLabel lm, line;
	private TextField tfs;
	private JTextArea ta;
	private JPanel p;
	private JScrollPane sp;

	String str;

	Mypage mp = new Mypage();
	Notice nt = new Notice();

	String A = "";

	public Menu() {
//		Frame setting
		f4 = new JFrame("MENU");
		f4.setLayout(null);
//		f4.setLayout(new FlowLayout());
		f4.setSize(300, 550);
		f4.setLocation(300, 300);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.setResizable(false);

//		=======DB출력 화면=========================================================================
		f4_1 = new JFrame("VIEW"); // 박물관 정보 출력프레임 // 탭으로 화면 구현, DB 불러오는 방식 공부
		f4_1.setLayout(null);
		f4_1.setSize(300, 550);
		f4_1.setLocation(300, 300);
		f4_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4_1.setResizable(false);

		p = new JPanel(); 
		p.setSize(250, 400);
		p.setLocation(20, 30);
		p.setLayout(new BorderLayout());

		ta = new JTextArea();
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // 수정 X
		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기

		p.add(ta);
		sp = new JScrollPane(); // 스크롤 3. 스크롤에 TA를 추가한다.
		sp.setViewportView(ta);
		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);

		// textArea 의 테두리 선의 색과 두께 설정 가능.
		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
				ta.setBorder(BorderFactory.createCompoundBorder(lineBorder,emptyBorder));

//		=============================================================================================	

//		Button setting
		bm1 = new JButton("ALL");
		bm1.setSize(100, 30);
		bm1.setLocation(95, 100);
		bm1.addActionListener(this);
		bm1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm2 = new JButton("지역별");
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

//		line = new JLabel("============================");
//		line = new JLabel("--------------------------------------------------");
		line = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		line.setSize(200, 10);
		line.setLocation(50, 280);

	}

	public void startFrame() {
		f4.add(lm);
		f4.add(line);
		f4.add(bm1);
		f4.add(bm2);
		f4.add(bm3);
		f4.add(bs);
		f4.add(bmp);
		f4.setVisible(true);
	}

	public void startmf(String a) {
		ta.append(a);
		f4_1.add(p);
		f4_1.add(back);
		f4_1.setVisible(true);
	}

	public String getStr(String str) {
		this.str = str;
		return str;
	}

	public void actionPerformed(ActionEvent e) {
		Mfind mf = new Mfind();
//		Menu m = new Menu();
//		City c = new City();

		if (e.getActionCommand().equals("ALL")) { // Mfind에서 이름만 나오게 설정해둠. //O
			f4.setVisible(false);
			String all = "SELECT * FROM MUSEUM";
			mf.query(all); // Mfind.query메서드에 직접 넣어서 실행.
//			System.out.println(str);
//			m.startmf(str);// 아예 mfind에 넘겨줌.
		}
		if (e.getActionCommand().equals("지역별")) { // O
			f4.setVisible(false);
			City.main(null);
		}

		if (e.getActionCommand().equals("주제별")) {
			f4.setVisible(false);
			Theme.main(null);
		}
		if (e.getActionCommand().equals("검색")) {
			f4.setVisible(false);
			Search.main(null); 
		}
		
		if (e.getActionCommand().equals("마이페이지")) {
			f4.setVisible(false);
			mp.getF5().setVisible(true);
		}
		


		if (e.getActionCommand().equals("뒤로")) {
			f4_1.setVisible(false);
			Menu.main(null);
		}
	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.startFrame();
	}

}