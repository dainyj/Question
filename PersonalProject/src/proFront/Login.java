package proFront;

import java.awt.Dialog;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

// ID 라벨, 텍스트필드/ PWD 라벨, 텍스트필드/ 로그인 버튼

public class Login extends WindowAdapter implements ActionListener {
	private JFrame f3;
	private JButton blogin, ok, sign;
	private Label lid2, lpwd2, lf;
	private TextField tfid2, tfpwd2;
	private Dialog info;
	private PMemberDAO dao;

	public Login() { // setting

		dao = new PMemberDAO();

//		Frame setting
		f3 = new JFrame("로그인");
		f3.setLayout(null);
//		f3.setLayout(new FlowLayout());
		f3.setSize(300, 300);
		f3.setLocation(300, 300);
		f3.addWindowListener(this);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//		Button setting O
		blogin = new JButton("로그인");
		blogin.setSize(150, 30);
		blogin.setLocation(100, 150);
		blogin.addActionListener(this);
		blogin.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		sign = new JButton("회원가입");
		sign.setSize(90, 30);
		sign.setLocation(160, 200);
		sign.addActionListener(this);
		sign.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		ok = new JButton("확인");// Dialog 버튼
		ok.setSize(70, 30);
		ok.setLocation(40, 60);
		ok.addActionListener(this);
		ok.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

//		Label setting O
		lid2 = new Label("ID", Label.CENTER);
		lid2.setSize(80, 20);
		lid2.setLocation(30, 50);
		lid2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		lpwd2 = new Label("PASSWORD", Label.CENTER);
		lpwd2.setSize(80, 20);
		lpwd2.setLocation(30, 100);
		lpwd2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		lf = new Label("로그인 실패", Label.CENTER); // Dialog
		lf.setSize(60, 30);
		lf.setLocation(45, 35);

//		TextField setting O
		tfid2 = new TextField(10);
		tfid2.setSize(100, 20);
		tfid2.setLocation(150, 50);
		tfpwd2 = new TextField(10);
		tfpwd2.setSize(100, 20);
		tfpwd2.setLocation(150, 100);
		tfpwd2.setEchoChar('*');

//		Dialog setting
		info = new Dialog(f3, "Infomation", true); // modal 설정 true/false
		info.setSize(150, 100);
		info.setLocation(300, 300);
		info.setLayout(null);
//		info.setLayout(new FlowLayout());
		info.addWindowListener(this);
		

	}

	public void startFrame() {
		f3.add(lid2);
		f3.add(tfid2);
		f3.add(lpwd2);
		f3.add(tfpwd2);
		f3.add(blogin);
		f3.add(sign);

		info.add(ok);
		f3.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("확인")) {
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

//				Dialog 적용하기  // 대신 아래 글 나오게 설정바꿔보기시도
			if (tfid2.getText() == "" && tfpwd2.getText() == "") {// 로그인창 비었을때 왜 성공뜸?
				info.add(lf);
				info.setVisible(true);
			}

			if (tfid2.getText().equals(id) && tfpwd2.getText().equals(password)) {
				Menu.main(null);
			} else {
				info.add(lf);
				info.setVisible(true);
			}
		}
		if (e.getActionCommand().equals("회원가입")) {
			f3.setVisible(false);
			SignUp.main(null);
		}
	}

	public static void main(String[] args) {
		Login login = new Login();
		login.startFrame();
	}

}