package frame_Menu;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Q&A 추가하기
public class Notice extends WindowAdapter implements ActionListener {
	private Frame f6;
	private Label lnt, lq;

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Frame getF6() {
		return f6;
	}

	public Notice() {
//		Frame setting
		f6 = new Frame("Notice");
		f6.setLayout(new FlowLayout());
		f6.setSize(400, 400);
		f6.setLocation(300, 300);
		f6.addWindowListener(this);

//		Label setting
		lnt = new Label("NOTICE");
		lq = new Label("Q&A");

	}

	public void startFrame() {
		f6.add(lnt);
		f6.add(lq);
//		f5.add(bm2);
//		f5.add(bm3);
//		f5.add(ls);
//		f5.add(tfs);
//		f5.add(bs);
//		f5.add(lmp);
//		f5.add(bmp);
		f6.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		Notice nt = new Notice();
		nt.startFrame();
	}

}
