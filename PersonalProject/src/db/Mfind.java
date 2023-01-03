package db;

import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import proFront.Menu;

// 쿼리 실행 클래스
public class Mfind {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	String user = "c##green";
	String password = "green1234";

	private JFrame fci;
	private JTextArea ta;
	private JScrollPane sp;
	private JPanel p;

	String B = null;
	Menu m = new Menu();

	private Connection con;
	private Statement stmt;

	String sql = "";

	public void connDB() { // 드라이버 연결, 계정 연결
		try {
			Class.forName(driver); // 드라이버 연결(위에 문자열 선언해둠)
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password); // 계정 연결
			System.out.println("oracle connection success.");
//			stmt = con.createStatement();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void query(String A) { // 전체 박물관 이름 출력
		connDB();

		try {
			String sql1 = A;

			stmt.executeQuery(sql1);
			System.out.println(sql1);
			ResultSet rs = stmt.executeQuery(sql1);
			while (rs.next()) {
//				System.out.println(rs.getString("BIZPLC_NM")); 
				B = " - " + rs.getString("BIZPLC_NM") + "\n\t: " + rs.getString("SIGUN_NM") + "\n"; // 화면 출력 형식 결정
//				박물관명 + 시군명 
				m.startmf(B); // 여기서 호출해서 실행
			}

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fcity(String C) { // 지역별 정보 출력
		fci = new JFrame("목록");
		fci.setLayout(null);
		fci.setSize(300, 550);
		fci.setLocation(300, 300);
		fci.setResizable(false);

		p = new JPanel();
		p.setSize(250, 400);
		p.setLocation(20, 30);
		p.setLayout(new BorderLayout());

		ta = new JTextArea();
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // ta 수정 X
		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기

		p.add(ta);
		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
		sp.setViewportView(ta);
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.

		connDB();

		try {
			String sql2 = C;

			stmt.executeQuery(sql2);
			System.out.println(sql2);
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
//				System.out.println(rs.getString("BIZPLC_NM"));
//				System.out.println(rs.getString("REFINE_ROADNM_ADDR"));
				String mn = " - " + rs.getString("BIZPLC_NM") + "\n" + "      주소 : "
						+ rs.getString("REFINE_ROADNM_ADDR") + "\n\n";
				ta.append(mn);
				fci.add(p);
				fci.setVisible(true);

			}
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public String mq(String com, String sc) {
		switch (com) {
		case "기관명":
			com = "BIZPLC_NM";
		case "종류":
			com = "MUSEUM_ARTGLRY_TYPE_NM";
		case "도시":
			com = "SIGUN_NM";
		case "주소":
			com = "REFINE_ROADNM_ADDR";
		}
		sql = "SELECT * FROM MUSEUM WHERE " + com + " LIKE '%" + sc + "%'";

		return sql;
	}

//	museVo 사용해보기??
	public ArrayList<MuseVo> list() {
		connDB();

		try {
			System.out.println(sql);
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected...");
			} else {
				System.out.println(rs.getRow() + " rows selected...");
				rs.previous();

				while (rs.next()) { // 맞게 수정 해야함.
					String strbn = rs.getString("BIZPLC_NM");
					String stradd = rs.getString("REFINE_ROADNM_ADDR");
					MuseVo data = new MuseVo(strbn, stradd);
					list().add(data);
					System.out.println(strbn + " " + stradd + " " + data);
					System.out.println();
				}
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		return list();

	}

//	public String serch(String com, String sc) { // 검색어 입력
//		String mn = "";
//		connDB();
//		try {
//			switch (com) {
//			case "기관명":
//				com = "BIZPLC_NM";
//			case "종류":
//				com = "MUSEUM_ARTGLRY_TYPE_NM";
//			case "도시":
//				com = "SIGUN_NM";
//			case "주소":
//				com = "REFINE_ROADNM_ADDR";
//			}
//			String sql = "SELECT * FROM MUSEUM WHERE " + com + " LIKE '%" + sc + "%'";
//			stmt.executeQuery(sql);
////				System.out.println(sql);
//			ResultSet rs = stmt.executeQuery(sql);
//
//			while (rs.next()) { // 맞게 수정 해야함.
//				mn = " - " + rs.getString("BIZPLC_NM") + "\n" + "      주소 : " + rs.getString("REFINE_ROADNM_ADDR")
//						+ "\n\n";
//				System.out.println(mn);
//			}
//
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//		return mn;
//	}

}
