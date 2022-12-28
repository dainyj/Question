package proFront;

import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;

// 프레임 1, 메뉴- 버튼3/라벨1, 검색- 라벨/텍스트필드/버튼 1, 마이페이지- 라벨/버튼1, 공지사항 - 라벨/버튼1
public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4;
	private Button bm1, bm2, bm3, bs, bmp, bnt;
	private Label lm, ls, lmp, lnt;
	private TextField tfs;

	Mypage mp = new Mypage();
	Notice nt = new Notice();



	public JFrame getF4() {
		return f4;
	}

	public Menu() {
//		Frame setting
		f4 = new JFrame();
		f4.setLayout(null);
//		f4.setLayout(new FlowLayout());
		f4.setSize(400, 400);
		f4.setLocation(300, 300);
		f4.addWindowListener(this);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		Button setting
		bm1 = new Button("박물관 & 미술관");
		bm1.setSize(100, 30);
		bm1.setLocation(60, 130);
		bm1.addActionListener(this);

		bm2 = new Button("체험 학습관");
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

	public void actionPerformed(ActionEvent e) {
		// 다른 프레임으로 넘어가도록
		if (e.getActionCommand().equals("박물관 & 미술관")) {
			f4.setVisible(false);
//			su.startFrame();
//			su.getF2().setVisible(true);
		}
		if (e.getActionCommand().equals("체험 학습관")) {
			f4.setVisible(false);
		}
		if (e.getActionCommand().equals("유적지")) {
			f4.setVisible(false);
		}
		if (e.getActionCommand().equals("검색")) {
			f4.setVisible(false);
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