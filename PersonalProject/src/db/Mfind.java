package db;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;

import muse.City;
import proFront.Menu;

// 쿼리 실행 클래스
public class Mfind {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private JFrame fci;
	private TextArea ta;
	
	String B = null;
	Menu m = new Menu();

	public void query(String A) { // 전체 박물관 이름 출력
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();

			String sql = A;

			stmt.executeQuery(sql);
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
//				System.out.println(rs.getString("BIZPLC_NM")); 
				B = rs.getString("BIZPLC_NM");

				m.startmf(B); // 여기서 호출해서 실행
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fcity(String C) { // 지역별 정보 출력
		fci = new JFrame("목록");
//		fci.setLayout(null);
		fci.setLayout(new FlowLayout());
		fci.setSize(400,400);
		fci.setLocation(300, 300);
		
		ta = new TextArea(B, 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY); // 스크롤 세로만 가능
		ta.setSize(300, 300);
		ta.setLocation(40, 30);
		ta.setEditable(false); // ta 수정 X

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();
			String sql = C;

			stmt.executeQuery(sql);
			System.out.println(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("BIZPLC_NM"));
				System.out.println(rs.getString("REFINE_ROADNM_ADDR"));// 이거 필드 이름을 어떻게 설정해야하지?
				String mn = rs.getString("BIZPLC_NM");
				String ma = rs.getString("REFINE_ROADNM_ADDR");
				ta.append(mn);
				ta.append(ma);
//				화면에 띄우는 것도 해야하는데 이것도 성공!!
//				레이아웃 남았네ㅠㅠㅠㅠㅠㅠㅠㅠㅠ
				fci.add(ta);
				fci.setVisible(true);
				

			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
