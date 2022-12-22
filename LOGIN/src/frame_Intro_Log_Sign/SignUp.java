package frame_Intro_Log_Sign;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 프레임 1개, 버튼1개, 라벨 5개, 텍스트필드 4개
public class SignUp extends WindowAdapter implements ActionListener {
	private Frame f2;
	private Button bsignUp;
	private Label lid, lpwd, lpn, lem, ltitle;
	private TextField tfid, tfpwd, tfpn, tfem;

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public SignUp() {
//		Frame setting 1개
		f2 = new Frame("회원가입");
		f2.setLayout(new FlowLayout());
		f2.setSize(400, 400);
		f2.setLocation(300, 300);
		f2.addWindowListener(this);

//		Button setting 1개
		bsignUp = new Button();
		bsignUp.addActionListener(this);

//		Label setting 5개 lid, lpwd, lpn, lem, ltitle
		lid = new Label("ID", Label.RIGHT);
		lpwd = new Label("PASSWORD", Label.RIGHT);
		lpn = new Label("Phone Number");
		lem = new Label("EMAil");
		ltitle = new Label("TiTle");

//		TextField 4개
		tfid = new TextField(10);
		tfpwd = new TextField(10);
		tfpn = new TextField(10);
		tfem = new TextField(10);

	}

	public void startFrame() {
		f2.add(lid);
		f2.add(bsignUp);
		f2.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		SignUp su = new SignUp();
		su.startFrame();
	}

}
