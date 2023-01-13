package DB_Query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InDe { // 현재 사용X PMemberDAO로 옮겨둠.

	public void insert(String ID, String PASSWORD, String PHNUM, String EMAIL) {
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

//			삽입
			System.out.println(ID + " " + PASSWORD + " " + PHNUM + " " + EMAIL);

			String sql = "INSERT INTO PMEMBER VALUES ('" + ID + "','" + PASSWORD + "','" + PHNUM + "','" + EMAIL + "')";
//			System.out.println(sql);
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}

//			String sql2 = "SELECT * FROM PMEMBER";
//			ResultSet rs = stmt.executeQuery(sql2);
//			while (rs.next()) {
//				System.out.print(rs.getString("ID") + "\t");
//				System.out.print(rs.getString("PASSWORD") + "\t");
//				System.out.print(rs.getString("PHNUM") + "\t");
//				System.out.println(rs.getString("EMAIL") + " ");
//			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void delete(String ID) {
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

//			삭제
			String sql = "delete FROM PMEMBER Where ID = " + "'" + ID + "'"; // 아이디 적용시키기
//			System.out.println(sql);
			stmt.executeQuery(sql);

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}
}
