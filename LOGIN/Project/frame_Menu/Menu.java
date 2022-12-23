package frame_Menu;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 프레임 1, 메뉴- 버튼3/라벨1, 검색- 라벨/텍스트필드/버튼 1, 마이페이지- 라벨/버튼1
public class Menu extends WindowAdapter implements ActionListener {
	private Frame f4;
	private Button bm1, bm2, bm3, bs, bmp;
	private Label lm, ls, lmp;
	private TextField tfs;

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Frame getF4() {
		return f4;
	}

	public Menu() {
//		Frame setting
		f4 = new Frame();
		f4.setLayout(new FlowLayout());
		f4.setSize(400, 400);
		f4.setLocation(300, 300);
		f4.addWindowListener(this);

//		Button setting
		bm1 = new Button("박물관 & 미술관");
		bm1.addActionListener(this);
		bm2 = new Button("체험 학습관");
		bm2.addActionListener(this);
		bm3 = new Button("유적지");
		bm3.addActionListener(this);
		bs = new Button("검색");
		bs.addActionListener(this);
		bmp = new Button("마이페이지");
		bmp.addActionListener(this);

//		Label setting
		lm = new Label("MENU");
		ls = new Label("SEARCH");
		lmp = new Label("MYPAGE");

//		TextField setting
		tfs = new TextField(10);

	}

	public void startFrame() {
		f4.add(lm);
		f4.add(bm1);
		f4.add(bm2);
		f4.add(bm3);
		f4.add(ls);
		f4.add(tfs);
		f4.add(bs);
		f4.add(lmp);
		f4.add(bmp);
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
		}

	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.startFrame();
	}

}
