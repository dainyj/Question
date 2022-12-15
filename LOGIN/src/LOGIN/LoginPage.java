package LOGIN;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class LoginPage extends WindowAdapter implements ActionListener {
	private Frame f;
	private Button logb;
	private TextField id, pwd, msg;
	private String inpid;
	private String inppwd;

	public LoginPage() {
		f = new Frame("Login Form");
		f.setSize(400, 200);
		f.setLayout(null);
		f.addWindowListener(this);

//		ID,Password 부분
		Label lid = new Label("ID", Label.RIGHT);
		lid.setBounds(50, 50, 30, 10); // 50, 50위치에 30, 10의 크기로
		Label lpwd = new Label("Password", Label.RIGHT);
		lpwd.setBounds(5, 80, 100, 10); // 50, 80위치에 30, 10의 크기로
		id = new TextField(20);
		id.setBounds(125, 50, 150, 20);
		pwd = new TextField(20);
		pwd.setBounds(125, 80, 150, 20);
//		비번 *로 표시하는거 뭐더라????
		pwd.setEchoChar('*');
//		로그인 버튼
		logb = new Button("Login");
		logb.setBounds(300, 55, 70, 40);
		logb.addActionListener(this); // 버튼 클릭을 확인해주는 리스너
//		msg박스
		msg = new TextField(200);
		msg.setBounds(50, 125, 300, 20);
//		화면 구현? 출력?
		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(logb);
		f.add(msg);

		f.setLocation(500, 100);
		f.setVisible(true);

	}

	public String getInfo() {
		String[] info = { inpid, inppwd };
		return info[0];
	}

	public void actionPerformed(ActionEvent e) {
		LoginDAO dao = new LoginDAO();
		ArrayList<LoginVo> list = dao.list("id");
		if (e.getActionCommand().equals("Login")) {
//			logb버튼을 눌렀을때 아이디 비번 일치 확인 후 msg 1.로그인되었습니다. 2. 다시 입력해주세요.
//			id tf와 c##green 일치여부/ pwd tf와 green1234 일치여부
			inpid = id.getText();
			inppwd = pwd.getText();
//			if(inpid.equals() && inppwd.equals()) {
////				msg tf에 출력????? 어떻게 하더라 생각이 안나네
//				msg.setText("로그인되었습니다.");
//			}else {
//				msg.setText("다시 입력해주세요.");
//			}

			System.out.println("Button  Click!");

			try {
				for (int i = 0; i < list.size(); i++) {
					String str = String.valueOf(list.get(i));
//				if(getInfo().equals(str)){
					if (getInfo().equals(str)) {
						msg.setText("로그인되었습니다.");
						System.out.println("로그인되었습니다.");
					} else {
						msg.setText("다시 시도해주세요.");
						System.out.println("다시 시도해주세요.");
					}

				}

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}

	public void windowClosing(WindowEvent e) { // 화면 종료 메서드
		System.exit(0);
	}

	public static void main(String[] args) {
		LoginPage l = new LoginPage();
		LoginDAO dao = new LoginDAO();

	}

}

//	로그인 연동 다시 확인 필요.
