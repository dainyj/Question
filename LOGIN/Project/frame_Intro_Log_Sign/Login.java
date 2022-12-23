package frame_Intro_Log_Sign;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import frame_Menu.Menu;

// ID 라벨, 텍스트필드/ PWD 라벨, 텍스트필드/ 로그인 버튼

public class Login extends WindowAdapter implements ActionListener {
	private Frame f3;
	private Button blogin, ok;
	private Label lid2, lpwd2, ls, lf;
	private TextField tfid2, tfpwd2;
	private Dialog info;
	private PMemberDAO dao;
	
	Menu mn = new Menu();

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Frame getF3() {
		return f3;
	}

	public Login() { // setting
		
		dao = new PMemberDAO();

//		Frame setting
		f3 = new Frame("로그인");
		f3.setLayout(new FlowLayout());
		f3.setSize(400, 400);
		f3.setLocation(300, 300);
		f3.addWindowListener(this);

//		Button setting
		blogin = new Button("로그인");
		blogin.addActionListener(this);
		ok = new Button("OK");// Dialog 버튼
		ok.addActionListener(this);

//		Label setting
		lid2 = new Label("ID", Label.RIGHT);
		lpwd2 = new Label("PASSWORD", Label.RIGHT);
//		ls = new Label("로그인 성공", Label.CENTER); // Dialog
		lf = new Label("로그인 실패", Label.CENTER); // Dialog

//		TextField setting
		tfid2 = new TextField(10);
		tfpwd2 = new TextField(10);

//		Dialog setting
		info = new Dialog(f3, "Infomation", true); // modal 설정 true/false
		info.setSize(140, 90);
		info.setLocation(300, 300);
		info.setLayout(new FlowLayout());
		info.addWindowListener(this);

	}

	public void startFrame() {
		f3.add(lid2);
		f3.add(tfid2);
		f3.add(lpwd2);
		f3.add(tfpwd2);
		f3.add(blogin);

		info.add(ok);
		f3.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("OK")) {
			info.dispose(); // info창만 종료
		}

		if (e.getActionCommand().equals("로그인")) {
			f3.setVisible(false);
			ArrayList<PMemberVo> list = dao.list(tfid2.getText());

			String id = "     ", password = "     "; // 다이얼로그 오류 원인 - 기본값이 ""니 당연히 성공이지
			for (int i = 0; i < list.size(); i++) {
				PMemberVo data = (PMemberVo) list.get(i);
				id = data.getId();
				password = data.getPwd();

				System.out.println(id + " : " + password);
			}

//				Dialog 적용하기 
			if (tfid2.getText() == "" && tfpwd2.getText() == ""){// 로그인창 비었을때 왜 성공뜸?
				info.add(lf);
				info.setVisible(true);
			}

			if (tfid2.getText().equals(id) && tfpwd2.getText().equals(password)) {
				mn.startFrame();
				mn.getF4().setVisible(true);
			} else {
				info.add(lf);
				info.setVisible(true);
			}
		}

	}

	public static void main(String[] args) {
		Login login = new Login();
		login.startFrame();
	}

}
