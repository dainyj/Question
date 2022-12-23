package project_1st;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Frame_1st extends WindowAdapter implements ActionListener {
//	 프레임/id, pwd Label, TextField / 로그인, 회원가입 버튼
	private Frame f1, f2;
	private Button blog, bsignUp;
	private TextField tfid, tfpwd;
	private Label lid, lpwd;

	public Frame_1st() {
		f1 = new Frame("1st Frame"); // loginFrame
		f1.setLayout(new FlowLayout());
		f1.setSize(400, 300);
		f1.setLocation(500, 100);
		f1.addWindowListener(this);

		f2 = new Frame("2nd Frame");
		f2.setLayout(null);
		f2.setSize(400, 300);
		f2.setLocation(300, 100);
		f2.addWindowListener(this);

		blog = new Button("로그인");
		blog.addActionListener(this);

		bsignUp = new Button("2nd Frame");
		bsignUp.addActionListener(this);

		lid = new Label("ID", Label.RIGHT);
		lpwd = new Label("PASSWORD", Label.RIGHT);

		tfid = new TextField(10);
		tfpwd = new TextField(10);
		tfpwd.setEchoChar('*');

	}

	public void startFrame() {
		f1.add(lid);
		f1.add(tfid);
		f1.add(lpwd);
		f1.add(tfpwd);
		f1.add(blog);
		f1.add(bsignUp);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		Frame_1st ff = new Frame_1st();
		ff.startFrame();
	}

	public void actionPerformed(ActionEvent e) {
//		if (blog.getLabel().equals("로그인")) {
//		} 
		if (e.getActionCommand().equals("2nd Frame")) {
			f1.setVisible(false);
			f2.setVisible(true);
		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}
