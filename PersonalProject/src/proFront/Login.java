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

public class Login extends WindowAdapter implements ActionListener {
	private JFrame f3;
	private JButton blogin, ok, sign;
	private Label lid2, lpwd2, lf;
	private TextField tfid2, tfpwd2;
	private Dialog info;
	private PMemberDAO dao;

	public Login() {
		dao = new PMemberDAO();

//		Frame setting
		f3 = new JFrame("로그인");
		f3.setLayout(null);
		f3.setSize(300, 550);
		f3.setLocation(300, 300);
		f3.addWindowListener(this);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f3.setResizable(false);

//		Button setting O
		blogin = new JButton("로그인");
		blogin.setSize(130, 40);
		blogin.setLocation(85, 230);
		blogin.addActionListener(this);
		blogin.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		sign = new JButton("회원가입");
		sign.setSize(90, 30);
		sign.setLocation(160, 400);
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
		lid2.setLocation(30, 80);
		lid2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		lpwd2 = new Label("PASSWORD", Label.CENTER);
		lpwd2.setSize(80, 20);
		lpwd2.setLocation(30, 150);
		lpwd2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		lf = new Label("로그인 실패", Label.CENTER); // Dialog
		lf.setSize(60, 30);
		lf.setLocation(45, 35);

//		TextField setting O
		tfid2 = new TextField(10);
		tfid2.setSize(100, 20);
		tfid2.setLocation(150, 80);
		tfpwd2 = new TextField(10);
		tfpwd2.setSize(100, 20);
		tfpwd2.setLocation(150, 150);
		tfpwd2.setEchoChar('*');

//		Dialog setting
		info = new Dialog(f3, "Infomation", true); // modal 설정 true/false
		info.setSize(150, 100);
		info.setLocation(300, 300);
		info.setLayout(null);
		info.addWindowListener(this);
	}

	public void startFrame() {
		f3.add(lid2);
		f3.add(tfid2);
		f3.add(lpwd2);
		f3.add(tfpwd2);
		f3.add(blogin);
		f3.add(sign);
		f3.setVisible(true);

		info.add(ok);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("확인")) {
			info.dispose(); // info창만 종료
			tfid2.setText(null);
			tfpwd2.setText(null);
			f3.setVisible(true);
		}

		if (e.getActionCommand().equals("로그인")) {
//			Dialog 적용하기 
			if (tfid2.getText() == "" && tfpwd2.getText() == "") {
				info.add(lf);
				info.setVisible(true);
			}

			ArrayList<PMemberVo> list = dao.list(tfid2.getText()); // ID가 DB에 있는지 확인하는 메서드 호출

			String id = "     ", password = "     "; // 기본 "";로 하면 null을 하나의 값으로 인식해서 자동으로 로그인이 되어버림.
			for (int i = 0; i < list.size(); i++) {
				PMemberVo data = (PMemberVo) list.get(i);
				id = data.getId();
				password = data.getPwd();
			}
			f3.setVisible(false);

			if (tfid2.getText().equals(id) && tfpwd2.getText().equals(password)) { // 로그인 성공할 때
				Menu mn = new Menu(); // ID가 필요한 프레임에 넘겨주기 위해 객체 생성 
				mn.setID(tfid2.getText()); // ID 저장할 메서드 호출
				mn.startFrame(); // 로그인 성공 시 열리는 프레임

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