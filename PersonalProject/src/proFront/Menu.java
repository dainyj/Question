package proFront;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import db.M_find;

// 프레임 1, 메뉴- 버튼3/라벨1, 검색- 라벨/텍스트필드/버튼 1, 마이페이지- 라벨/버튼1, 공지사항 - 라벨/버튼1
public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4, f4_1;
	private Button bm1, bm2, bm3, bs, bmp, bnt;
	private Label lm, ls, lmp, lnt;
	private TextField tfs;
	private TextArea ta;

	String str;

	Mypage mp = new Mypage();
	Notice nt = new Notice();

	String A = "";

	public JFrame getF4() {
		return f4;
	}

	public Menu() {
//		Frame setting
		f4 = new JFrame("MENU");
		f4.setLayout(null);
//		f4.setLayout(new FlowLayout());
		f4.setSize(400, 400);
		f4.setLocation(300, 300);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f4_1 = new JFrame("view");
		f4_1.setLayout(null);
		f4_1.setSize(400, 400);
		f4_1.setLocation(300, 300);
		f4_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ta = new TextArea(A, 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY); // 스크롤 세로만 가능
		ta.setSize(300, 300);
		ta.setLocation(40, 30);
		ta.setEditable(false); // ta 수정 X

//		Button setting
		bm1 = new Button("박물관 & 미술관");
		bm1.setSize(100, 30);
		bm1.setLocation(60, 130);
		bm1.addActionListener(this);

		bm2 = new Button("ALL");
		bm2.setSize(100, 30);
		bm2.setLocation(60, 200);
		bm2.addActionListener(this);

		bm3 = new Button("유적지");
		bm3.setSize(100, 30);
		bm3.setLocation(60, 270);
		bm3.addActionListener(this);

		bs = new Button("검색");
		bs.setSize(50, 20);
		bs.setLocation(300, 110);
		bs.addActionListener(this);

		bnt = new Button("공지사항");
		bnt.setSize(100, 30);
		bnt.setLocation(230, 165);
		bnt.addActionListener(this);

		bmp = new Button("마이페이지");
		bmp.setSize(100, 30);
		bmp.setLocation(230, 235);
		bmp.addActionListener(this);

//		Label setting
		lm = new Label("MENU");
		lm.setSize(80, 30);
		lm.setLocation(50, 60);

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
		f4_1.add(ta);
		f4_1.setVisible(true);
	}

	public String getStr(String str) {
		this.str = str;
		return str;
	}

	public void actionPerformed(ActionEvent e) {
		M_find mf = new M_find();
		Menu m = new Menu();

		if (e.getActionCommand().equals("박물관 & 미술관")) {
			f4.setVisible(false);
//			su.startFrame();
//			su.getF2().setVisible(true);
		}
		if (e.getActionCommand().equals("ALL")) { // M_find에서 이름만 나오게 설정해둠.
			f4.setVisible(false);
			String all = "SELECT * FROM MUSEUM";
			mf.query(all); // M_find.query메서드에 직접 넣어서 실행.
//			
//			System.out.println(str);
//			m.startmf(str);// 아예 mfind에 넘겨줌.
		}
		if (e.getActionCommand().equals("지역별")) {
			f4.setVisible(false);
//			새로운 창에 지역별 버튼 만들기
			
			
//			String city = null;
//			String all = "SELECT BIZPLC_NM FROM MUSEUM WHERE SIGUN_NM = " + city;
//			mf.query(all);

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