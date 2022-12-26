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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import InsertDelete.InDe;

// 프레임 1개, 버튼1개, 라벨 5개, 텍스트필드 4개
// 정보 입력하고 bsignUp 버튼 클릭 시 DB에 저장되도록 연동, DB에 MEMBER TABLE 필요

public class SignUp extends WindowAdapter implements ActionListener {
	private Frame f2, fout;
	private Button bsignUp, bout, bout2;
	private Label lid, lpwd, lpn, lem, ltitle, lid2;
	private TextField tfid, tfpwd, tfpn, tfem, tfid2;

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

//	다른 클래스에서 프레임 불러오기에 사용하려고
	public Frame getF2() {
		return f2;
	}

	public SignUp() {

//		Frame setting 1개
		f2 = new Frame("회원가입");
		f2.setLayout(null);
//		f2.setLayout(new FlowLayout());
		f2.setSize(400, 400);
		f2.setLocation(300, 300);
		f2.addWindowListener(this);

		fout = new Frame("탈퇴하기");
		fout.setLayout(null);
//		fout.setLayout(new FlowLayout());
		fout.setSize(150, 150);
		fout.setLocation(300, 300);
		fout.addWindowListener(this);

//		Button setting 1개
		bsignUp = new Button("가입하기");  //O
		bsignUp.setSize(60, 30);
		bsignUp.setLocation(200, 300);
		bsignUp.addActionListener(this);

		bout = new Button("탈퇴하기");  //O
		bout.setSize(60, 30);
		bout.setLocation(280, 300);
		bout.addActionListener(this);

		bout2 = new Button("탈퇴");	
		bout2.setSize(100, 30);
		bout2.setLocation(30, 90);
		bout2.addActionListener(this);

//		Label setting 5개
		ltitle = new Label("가입 정보 입력", Label.CENTER);  //O
		ltitle.setSize(100, 30);
		ltitle.setLocation(80, 60);
		
		lid = new Label("ID", Label.CENTER);
		lid.setSize(100, 20);
		lid.setLocation(60, 100);
		
		lpwd = new Label("PASSWORD", Label.CENTER);
		lpwd.setSize(100, 20);
		lpwd.setLocation(60, 150);
		
		lpn = new Label("Phone Number", Label.CENTER);
		lpn.setSize(100, 20);
		lpn.setLocation(60, 200);
		
		lem = new Label("E-mail", Label.CENTER);
		lem.setSize(100, 20);
		lem.setLocation(60, 250);

		lid2 = new Label("ID", Label.RIGHT); // 탈퇴프레임
		lid2.setSize(30, 20);
		lid2.setLocation(10, 60);
		
//		TextField 4개
		tfid = new TextField();
		tfid.setSize(100, 20);
		tfid.setLocation(180, 100);
	
		tfpwd = new TextField();
		tfpwd.setSize(100, 20);
		tfpwd.setLocation(180, 150);
		
		tfpn = new TextField();
		tfpn.setSize(100, 20);
		tfpn.setLocation(180, 200);
		
		tfem = new TextField();
		tfem.setSize(100, 20);
		tfem.setLocation(180, 250);
		
		tfid2 = new TextField(); // 탈퇴프레임
		tfid2.setSize(80, 20);
		tfid2.setLocation(50, 60);
	}

	public void startFrame() {
		f2.add(ltitle);
		f2.add(lid);
		f2.add(tfid);
		f2.add(lpwd);
		f2.add(tfpwd);
		f2.add(lpn);
		f2.add(tfpn);
		f2.add(lem);
		f2.add(tfem);
		f2.add(bsignUp);
		f2.add(bout);

		f2.setVisible(true);

	}
	
	public void outFrame() {
		fout.add(lid2);
		fout.add(tfid2);
		fout.add(bout2);
		fout.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		SignUp su= new SignUp();
		InDe it = new InDe();
		Login log = new Login();

		if (e.getActionCommand().equals("가입하기")) { // 버튼 클릭시 회원정보 DB테이블에 저장
			f2.setVisible(false);
			it.insert(tfid.getText(), tfpwd.getText(), tfpn.getText(), tfem.getText());
			log.startFrame();
			log.getF3().setVisible(true);
		}
		if (e.getActionCommand().equals("탈퇴하기")) { // 우선 ID만 입력해서 탈퇴가능, 나중에 비밀번호도 같이 입력해서 하도록 바꾸기 
			f2.setVisible(false);
			su.outFrame();
		}

		if (e.getActionCommand().equals("탈퇴")) { 
			it.delete(tfid2.getText());
			log = new Login();
			log.startFrame();
			log.getF3().setVisible(true);
		}
	}

	public static void main(String[] args) {
		SignUp su = new SignUp();
		su.startFrame();

	}
}
