package frame_Intro_Log_Sign;

import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 로그인, 회원가입 프레임으로 넘어가는 버튼 필요
// 버튼 눌렀을때 다른 프레임이 뜨도록 하기
// 종료버튼 작동하게 하기
public class Introduction extends WindowAdapter implements ActionListener {
	private Frame f1;
	private Button blogf, bsignf;
	private Label li;

	SignUp su = new SignUp();
	Login lg = new Login();

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Introduction() { // setting
//		Frame setting
		f1 = new Frame("INTRODUCTION");
//		f1.setLayout(new FlowLayout());
		f1.setLayout(null);
		f1.setSize(400, 400);
		f1.setLocation(300, 300);
		f1.addWindowListener(this);

//		Button setting
		blogf = new Button("로그인");
		blogf.setSize(60, 30);
		blogf.setLocation(100, 300);
		blogf.addActionListener(this);

		bsignf = new Button("회원가입");
		bsignf.setSize(60, 30);
		bsignf.setLocation(250, 300);
		bsignf.addActionListener(this);

//		Label setting
		String memo = "소개 내용?";
		li = new Label(memo, Label.CENTER);
		li.setSize(100, 100);
		li.setLocation(30, 30);

	}

	public void startFrame() {
		f1.add(li);
		f1.add(blogf);
		f1.add(bsignf);
		f1.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("회원가입")) {
			f1.setVisible(false);
			su.startFrame();
			su.getF2().setVisible(true);
		}

		if (e.getActionCommand().equals("로그인")) {
			f1.setVisible(false);
			lg.startFrame();
			lg.getF3().setVisible(true);
		}
	}

	public static void main(String[] args) {
		Introduction intro = new Introduction();
		intro.startFrame();
	}

}
