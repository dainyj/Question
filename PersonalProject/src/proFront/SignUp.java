package proFront;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// 프레임 1개, 버튼1개, 라벨 5개, 텍스트필드 4개
// 정보 입력하고 bsignUp 버튼 클릭 시 DB에 저장되도록 연동, DB에 MEMBER TABLE 필요

public class SignUp extends WindowAdapter implements ActionListener {
	private JFrame f2, fout;
	private JButton bsignUp, bout, bout2, bidcheck;
	private JLabel lid, lpwd, ltitle, lid2, lpwd2, lpwd3, label, lout;
	private TextField tfid, tfpwd, tfid2, tfpwd2, tfpwd3;

	PMemberDAO dao = new PMemberDAO();

	public SignUp() {

//		Frame setting 1개
		f2 = new JFrame("회원가입");
		f2.setLayout(null);
		f2.setSize(300, 550);
		f2.setLocation(300, 300);
		f2.addWindowListener(this);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setResizable(false);

		fout = new JFrame("탈퇴하기");
		fout.setLayout(null);
		fout.setSize(150, 150);
		fout.setLocation(300, 300);
		fout.addWindowListener(this);
		fout.setResizable(false);

//		Button setting 1개

		bidcheck = new JButton("ID 확인"); // O
		bidcheck.setSize(83, 20);
		bidcheck.setLocation(160, 125);
		bidcheck.addActionListener(this);
		bidcheck.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bsignUp = new JButton("가입하기"); // O
		bsignUp.setSize(100, 40);
		bsignUp.setLocation(90, 260);
		bsignUp.addActionListener(this);
		bsignUp.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bout = new JButton("탈퇴하기"); // O
		bout.setSize(83, 30);
		bout.setLocation(180, 450);
		bout.addActionListener(this);
		bout.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bout2 = new JButton("탈퇴");
		bout2.setSize(80, 17);
		bout2.setLocation(30, 85);
		bout2.addActionListener(this);
		bout2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

//		Label setting 5개
		ltitle = new JLabel("가입 정보 입력", JLabel.CENTER); // O
		ltitle.setSize(150, 30);
		ltitle.setLocation(70, 30);
		ltitle.setFont(new Font("kopubworld", Font.BOLD, 20)); // 폰트

		lid = new JLabel("ID", JLabel.CENTER);
		lid.setSize(100, 20);
		lid.setLocation(30, 100);
		lid.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lpwd = new JLabel("PASSWORD", JLabel.CENTER);
		lpwd.setSize(100, 20);
		lpwd.setLocation(30, 150);
		lpwd.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lpwd3 = new JLabel("PASSWORD확인", JLabel.CENTER);
		lpwd3.setSize(100, 20);
		lpwd3.setLocation(30, 200);
		lpwd3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		label = new JLabel("", JLabel.CENTER);
		label.setSize(200, 20);
		label.setLocation(50, 230);
		label.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lid2 = new JLabel("ID", JLabel.RIGHT); // 탈퇴프레임
		lid2.setSize(30, 20);
		lid2.setLocation(3, 15);
		lid2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lpwd2 = new JLabel("PWD", JLabel.RIGHT); // 탈퇴프레임
		lpwd2.setSize(40, 20);
		lpwd2.setLocation(3, 40);
		lpwd2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lout = new JLabel("", JLabel.RIGHT); // 탈퇴프레임
		lout.setSize(120, 20);
		lout.setLocation(10, 65);
		lout.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		TextField 4개
		tfid = new TextField();
		tfid.setSize(100, 20);
		tfid.setLocation(150, 100);

		tfpwd = new TextField();
		tfpwd.setSize(100, 20);
		tfpwd.setLocation(150, 150);

		tfpwd3 = new TextField();
		tfpwd3.setSize(100, 20);
		tfpwd3.setLocation(150, 200);

		tfid2 = new TextField(); // 탈퇴프레임
		tfid2.setSize(70, 20);
		tfid2.setLocation(55, 15);

		tfpwd2 = new TextField(); // 탈퇴프레임
		tfpwd2.setSize(70, 20);
		tfpwd2.setLocation(55, 40);

	}

	public void startFrame() {
		f2.add(ltitle);
		f2.add(lid);
		f2.add(tfid);
		f2.add(bidcheck);
		f2.add(lpwd);
		f2.add(tfpwd);
		f2.add(lpwd3);
		f2.add(tfpwd3);
		f2.add(label);
		f2.add(bsignUp);
		f2.add(bout);

		f2.setVisible(true);

	}

	public void outFrame() {
		fout.add(lid2);
		fout.add(tfid2);
		fout.add(lpwd2);
		fout.add(tfpwd2);
		fout.add(lout);
		fout.add(bout2);
		fout.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		SignUp su = new SignUp();
//		============================================= 다시 작성해야함.============
		if (e.getActionCommand().equals("ID 확인")) { // id 중복체크
			if (!(tfid.getText() == null)) {
				String answer = dao.idmatch(tfid.getText());
				label.setText(answer);
			}
		}
//		방법1
		if (e.getActionCommand().equals("가입하기")) {
			// ID확인 버튼을 클릭하는걸 전제조건으로 삼으려면 어떻게 해야하지? 이 방법은 버튼 누른 상태여야하나봄 다시 검색시작
			if (label.getText().equals("사용 가능한 ID입니다.")) {

				if (tfpwd.getText().equals(tfpwd3.getText())) {
					f2.setVisible(false);
					dao.insert(tfid.getText(), tfpwd.getText());
					Login.main(null);
				} else {
					label.setText("비밀번호가 일치하지 않습니다.");

				}
			} else {
				label.setText("중복 ID 확인을 해주세요.");
			}
		}
		
//		방법2
//		boolean b = false;
		

		if (e.getActionCommand().equals("탈퇴하기")) {
			f2.setVisible(false);
			su.outFrame();
		}

		if (e.getActionCommand().equals("탈퇴")) {
			String id = tfid2.getText();
			String pwd = tfpwd2.getText();
			lout.setText("탈퇴되었습니다.");
			dao.delete(id, pwd);
//			fout.setVisible(false);
		}
	}

	public static void main(String[] args) {
		SignUp su = new SignUp();
		su.startFrame();

	}
}
