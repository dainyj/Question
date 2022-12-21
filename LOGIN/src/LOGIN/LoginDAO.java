package LOGIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class LoginDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";

	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

//===연동 확인=============================================================		
//	public LoginDAO() { // Logindata table 출력해봄.
//		try {
//		Class.forName(driver);
//		conn = DriverManager.getConnection(url, user, password);
//		stmt = conn.createStatement();
//		String sql2 = "SELECT id, pwd From logindata";
//		rs = stmt.executeQuery(sql2);
//		while (rs.next()) {
//			System.out.print(rs.getString("id") + "\t");
//			System.out.println(rs.getString("pwd") + "\t");
//	}
//
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//}
//========================================================================	

	public ArrayList<LoginVo> list(String id) {
		ArrayList<LoginVo> list = new ArrayList<LoginVo>();

		try {
			connDB();

			String query = "SELECT * FROM LOGINDATA";
			if (id != null) {
				query += " where id='" + id + "'";
			}
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query); // 쿼리 실행
			rs.last();// 마지막 레코드로 이동.
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected.");
			} else {
				System.out.println(rs.getRow() + " rows selected.");
				rs.previous(); // 이전으로 이동 아마 처음시작부분으로 이동하는듯 확인해보기

				while (rs.next()) {// 한칸씩 이동
					String did = rs.getString("id");
					String dpwd = rs.getString("pwd");
//				System.out.println(did + " " + dpwd + " ");

					LoginVo data = new LoginVo(did, dpwd);
					list.add(data);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void connDB() { // db 접속 역할
		try {
			Class.forName(driver);
//			System.out.println("jdbc driver loading success.");
			conn = DriverManager.getConnection(url, user, password);
//			System.out.println("oracle connection success.");
//			stmt = con.createStatement();
			stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			위의 33,40번 라인을 사용하기 위한 옵션 추가 
//			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

} // class end
