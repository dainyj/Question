package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import proFront.Menu;

// 쿼리 실행 클래스
public class M_find {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	String B = null;
	Menu m = new Menu();

	public void query(String A) {
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
//				System.out.println(rs.getString("BIZPLC_NM")); // 이거 필드 이름을 어떻게 설정해야하지?
				B = rs.getString("BIZPLC_NM");
				
				m.startmf(B); // 여기서 호출해서 실행
				
				
			}

			
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
