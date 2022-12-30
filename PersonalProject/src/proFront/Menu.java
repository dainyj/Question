package proFront;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import db.Mfind;
import muse.City;

// 프레임 1, 메뉴- 버튼3/라벨1, 검색- 라벨/텍스트필드/버튼 1, 마이페이지- 라벨/버튼1, 공지사항 - 라벨/버튼1
public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4, f4_1;
	private JButton bm1, bm2, bm3, bs, bmp, bnt;
	private Label lm;
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
		f4.setSize(400, 400);
		f4.setLocation(300, 300);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f4_1 = new JFrame("VIEW"); // 박물관 정보 출력프레임 // 탭으로 화면 구현, DB 불러오는 방식 공부
		f4_1.setLayout(null);
		f4_1.setSize(400, 400);
		f4_1.setLocation(300, 300);
		f4_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p = new JPanel(); // 스크롤 대신 탭으로 바꾸기 시도 해보자
		p.setSize(300, 200);
		p.setLocation(43, 30);
		p.setLayout(new BorderLayout());
		
		ta = new JTextArea(); 
		ta.setSize(300, 300);
		ta.setLocation(40, 30);
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // ta 수정 X
		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
		p.add(ta);
		sp = new JScrollPane(ta); //스크롤 3. 스크롤에 TA를 추가한다.
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(sp);  //3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
		
		
		
		
//		Button setting
		bm1 = new JButton("ALL");
		bm1.setSize(100, 30);
		bm1.setLocation(60, 130);
		bm1.addActionListener(this);
		bm1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm2 = new JButton("지역별");
		bm2.setSize(100, 30);
		bm2.setLocation(60, 200);
		bm2.addActionListener(this);
		bm2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm3 = new JButton("주제별");
		bm3.setSize(100, 30);
		bm3.setLocation(60, 270);
		bm3.addActionListener(this);
		bm3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bs = new JButton("검색");
		bs.setSize(60, 20);
		bs.setLocation(300, 115);
		bs.addActionListener(this);
		bs.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bnt = new JButton("공지사항");
		bnt.setSize(100, 30);
		bnt.setLocation(230, 165);
		bnt.addActionListener(this);
		bnt.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bmp = new JButton("마이페이지");
		bmp.setSize(100, 30);
		bmp.setLocation(230, 235);
		bmp.addActionListener(this);
		bmp.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		Label setting
		lm = new Label("MENU");
		lm.setSize(120, 30);
		lm.setLocation(50, 40);
		lm.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 40));

//		TextField setting
		tfs = new TextField();
		tfs.setSize(120, 20);
		tfs.setLocation(230, 90);

	}

	public void startFrame() {
		f4.add(lm);
		f4.add(bm1);
		f4.add(bm2);
		f4.add(bm3);
		f4.add(tfs);
		f4.add(bs);
		f4.add(bmp);
		f4.add(bnt);
		f4.setVisible(true);
	}

	public void startmf(String a) {
		ta.append(a);
		f4_1.add(p);
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

		if (e.getActionCommand().equals("ALL")) { // Mfind에서 이름만 나오게 설정해둠.
			f4.setVisible(false);
			String all = "SELECT * FROM MUSEUM";
			mf.query(all); // Mfind.query메서드에 직접 넣어서 실행.

//			System.out.println(str);
//			m.startmf(str);// 아예 mfind에 넘겨줌.
		}
		if (e.getActionCommand().equals("지역별")) {
			f4.setVisible(false);
//			새로운 창에 지역별 버튼 만들기
//			c.getFc().setVisible(true);
			City.main(null);

//			String city = null;
//			String all = "SELECT BIZPLC_NM FROM MUSEUM WHERE SIGUN_NM = " + city;
//			mf.query(all);
		}

		if (e.getActionCommand().equals("주제별")) {
			f4.setVisible(false);
//			su.startFrame();
//			su.getF2().setVisible(true);
		}
		if (e.getActionCommand().equals("검색")) {
			String st = tfs.getText();// 이거 쿼리에 넣을거
			System.out.println(st);
			tfs.setText(null);// 검색버튼 누르면 tf 초기화
		}
		if (e.getActionCommand().equals("마이페이지")) {
			f4.setVisible(false);
			mp.getF5().setVisible(true);
		}
		if (e.getActionCommand().equals("공지사항")) {
			f4.setVisible(false);
			nt.getF6().setVisible(true);
		}

	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.startFrame();
	}

}