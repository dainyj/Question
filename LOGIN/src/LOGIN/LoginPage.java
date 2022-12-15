package LOGIN;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LoginPage extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button logb;
	private TextField tfid, tfpwd, tfmsg;
	private Panel p;
	private LoginDAO dao; // 78라인 오류 안나게 여기에

	public LoginPage() {
		dao = new LoginDAO(); // 78번 라인 오류 안나게 
		
		f = new Frame("Login Form");
		f.setSize(400, 200);
		f.setLayout(null);
		f.addWindowListener(this);
//		p = new Panel();
//		p.setBackground(Color.GREEN);
//		f.add(p, BorderLayout.CENTER);

//		ID,Password 부분
		Label lid = new Label("ID", Label.RIGHT);
		lid.setBounds(50, 50, 30, 10); // 50, 50위치에 30, 10의 크기로
		Label lpwd = new Label("Password", Label.RIGHT);
		lpwd.setBounds(5, 80, 100, 10); // 50, 80위치에 30, 10의 크기로
		tfid = new TextField(20);
		tfid.setBounds(125, 50, 150, 20);
		tfpwd = new TextField(20);
		tfpwd.setBounds(125, 80, 150, 20);
//		비번 *로 표시하는거 뭐더라????
		tfpwd.setEchoChar('*');
//		로그인 버튼
		logb = new Button("Login");
		logb.setBounds(300, 55, 70, 40);
		logb.addActionListener(this); // 버튼 클릭을 확인해주는 리스너
//		msg박스
		tfmsg = new TextField(200);
		tfmsg.setBounds(50, 125, 300, 20);
//		화면 구현? 출력?
		f.add(lid);
		f.add(tfid);
		f.add(lpwd);
		f.add(tfpwd);
		f.add(logb);
		f.add(tfmsg);

		f.setLocation(500, 100);
		f.setVisible(true);

	}

	public void windowClosing(WindowEvent e) { // 화면 종료 메서드
		System.exit(0);
	}

//	public String getInfo() {
//		String[] info = { inpid, inppwd };
//		return info[0];
//	}

	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Login")) {
			System.out.println("Button  Click!");
			ArrayList<LoginVo> list = dao.list(tfid.getText()); // 오류 안나게

			String id = ""; // tf가 String이 아니여서 String으로 변환해줘야함.
			String pwd = "";

			for (int i = 0; i < list.size(); i++) {
				LoginVo data = (LoginVo) list.get(i);
				id = data.getId();
				pwd = data.getPwd();
				System.out.println(id+ " "+ pwd+" ");
				
			}

			if (tfid.getText().equals(id) && tfpwd.getText().equals(pwd)) {
				System.out.println("로그인되었습니다.");
				tfmsg.setText("로그인되었습니다.");
			} else {
				System.out.println("다시 입력해주세요.");
				tfmsg.setText("다시 입력해주세요.");
			}

//			logb버튼을 눌렀을때 아이디 비번 일치 확인 후 msg 1.로그인되었습니다. 2. 다시 입력해주세요.
//			id tf와 c##green 일치여부/ pwd tf와 green1234 일치여부
//			inpid = id.getText();
//			inppwd = pwd.getText();
//			if(inpid.equals() && inppwd.equals()) {
////				msg tf에 출력????? 어떻게 하더라 생각이 안나네
//				msg.setText("로그인되었습니다.");
//			}else {
//				msg.setText("다시 입력해주세요.");
//			}

//			try {
//				for (int i = 0; i < list.size(); i++) {
//					String str = String.valueOf(list.get(i));
//					System.out.println(str);

//					if (getInfo().equals(str)) {
//						msg.setText("로그인되었습니다.");
//						System.out.println("로그인되었습니다.");
//					} else {
//						msg.setText("다시 시도해주세요.");
//						System.out.println("다시 시도해주세요.");
//					}

		}

//			} catch (Exception e1) {
//				e1.printStackTrace();
//			}
//
//		}
	}

	public static void main(String[] args) {
		new LoginPage();
//		new LoginDAO();// 연동확인

	}

}

//	로그인 연동 다시 확인 필요.
