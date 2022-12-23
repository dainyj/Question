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

// 프레임 1개, 버튼1개, 라벨 5개, 텍스트필드 4개
// 정보 입력하고 bsignUp 버튼 클릭 시 DB에 저장되도록 연동, DB에 MEMBER TABLE 필요

public class SignUp extends WindowAdapter implements ActionListener {
	private Frame f2;
	private Button bsignUp;
	private Label lid, lpwd, lpn, lem, ltitle;
	private TextField tfid, tfpwd, tfpn, tfem;
	private String strid, strpwd, strpn, strem;

//	종료 메서드
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public Frame getF2() {
		return f2;
	}

	public SignUp() {

//		Frame setting 1개
		f2 = new Frame("회원가입");
		f2.setLayout(new FlowLayout());
		f2.setSize(400, 400);
		f2.setLocation(300, 300);
		f2.addWindowListener(this);

//		Button setting 1개
		bsignUp = new Button("가입하기");
		bsignUp.addActionListener(this);

//		Label setting 5개
		lid = new Label("ID", Label.RIGHT);
		lpwd = new Label("PASSWORD", Label.RIGHT);
		lpn = new Label("Phone Number", Label.RIGHT);
		lem = new Label("E-mail", Label.RIGHT);
		ltitle = new Label("가입 정보 입력", Label.CENTER);

//		TextField 4개
		tfid = new TextField(10);
		tfpwd = new TextField(10);
		tfpn = new TextField(10);
		tfem = new TextField(10);

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

		f2.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("가입하기")) { // 버튼 클릭시 회원정보 DB테이블에 저장
			f2.setVisible(false);
			strid = tfid.getText();
			strpwd = tfpwd.getText();
			strpn = tfpn.getText();
			strem = tfem.getText();
			SignUp su2 = new SignUp(strid, strpwd, strpn, strem);
			su2.insert();

		}
	}

	public static void main(String[] args) {
		SignUp su = new SignUp();
		su.startFrame();

	}

	public SignUp(String strid, String strpwd, String strpn, String strem) {
		this.strid = strid;
		this.strpwd = strpwd;
		this.strpn = strpn;
		this.strem = strem;
	}

	public void insert() { // 테이블에 회원가입정보 추가
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();

			String ID = strid, PASSWORD = strpwd, PHNUM = strpn, EMAIL = strem;
//			System.out.println(ID + " " + PASSWORD + " " + PHNUM + " " + EMAIL);
			String sql = "INSERT INTO PMEMBER VALUES ('" + ID + "','" + PASSWORD + "','" + PHNUM + "','" + EMAIL + "')";
//			System.out.println(sql);

			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}

			String sql1 = "SELECT * FROM PMEMBER";
			ResultSet rs = stmt.executeQuery(sql1);
			while (rs.next()) {
//				System.out.print(rs.getString("ID") + "\t");
//				System.out.print(rs.getString("PASSWORD") + "\t");
//				System.out.print(rs.getString("PHNUM") + "\t");
//				System.out.println(rs.getString("EMAIL") + " ");
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
