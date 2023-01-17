package db;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

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
	private ResultSet rs;

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

//	지역별 
//	public void fcity(String C) { // 지역별 정보 출력 
//		fci = new JFrame("목록");
//		fci.setLayout(null);
//		fci.setSize(300, 550);
//		fci.setLocation(300, 300);
//		fci.setResizable(false);
//
//		p = new JPanel();
//		p.setSize(250, 400);
//		p.setLocation(20, 30);
//		p.setLayout(new BorderLayout());
//
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // ta 수정 X
//		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
//
//		p.add(ta);
//		sp = new JScrollPane(ta); // 스크롤 3. 스크롤에 TA를 추가한다.
//		sp.setViewportView(ta);
//		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		p.add(sp); // 3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.
//		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
//		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);
//
//		// textArea 의 테두리 선의 색과 두께 설정 가능.
//		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
//		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
//		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder, emptyBorder));
//
//		connDB();
//
//		try {
//			String sql2 = C;
//
//			stmt.executeQuery(sql2);
//			System.out.println(sql2);
//			rs = stmt.executeQuery(sql2);
//			while (rs.next()) {
////				System.out.println(rs.getString("BIZPLC_NM"));
////				System.out.println(rs.getString("REFINE_ROADNM_ADDR"));
//				String mn = " - " + rs.getString("BIZPLC_NM") + "\n" + "      주소 : "
//						+ rs.getString("REFINE_ROADNM_ADDR") + "\n\n";
//				ta.append(mn);
//				fci.add(p);
//				fci.setVisible(true);
//
//			}
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//
//	}

//	public void printTheme(String add) { // 주제별 정보 출력  // 옮김!!
//		String base = "SELECT * FROM MUSEUM WHERE MUSEUM_ARTGLRY_TYPE_NM LIKE '%" + add + "%'";
//		connDB();
//		try {
//			System.out.println(base);
//			stmt.executeQuery(base);
//			ResultSet rs = stmt.executeQuery(base);
//			while (rs.next()) {
////				내용 채워야함. 이거 다음에 급한거 먼저 하자.
//			}
//		} catch (SQLException e) {
//			System.out.println(e);
//		}
//	}

//	museVo 사용해보기??
	public ArrayList<MuseVo> list(String sql) {
		ArrayList<MuseVo> list = new ArrayList<MuseVo>();
		connDB();

		try {
			System.out.println(sql);
			stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);

			while (rs.next()) { // 맞게 수정 해야함. 마지막만 출력하는걸 어떻게 바꿔야하나? => 배열로 해결
				String strbn = rs.getString("BIZPLC_NM");
				String stradd = rs.getString("REFINE_ROADNM_ADDR");
				MuseVo data = new MuseVo(strbn, stradd);
				list.add(data);
//					System.out.println(strbn + " " + stradd + "\n" + list.add(data)));
//					System.out.println();
			}
//			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);

		}

		return list;

	}

}
