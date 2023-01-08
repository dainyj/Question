package proFront;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import LOGIN_T.MemberVo;

public class PMemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

//	public PMemberDAO() {
//		try {
//			Class.forName(driver);
//			System.out.println("jdbc driver loading success.");
//			con = DriverManager.getConnection(url, user, password);
//			System.out.println("oracle connection success.");
////			stmt = con.createStatement();
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			System.out.println("statement create success.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	public void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<PMemberVo> list(String id) { // 로그인 시 id 매치
		connDB();
		ArrayList<PMemberVo> list = new ArrayList<PMemberVo>();
		try {
			String query = "SELECT * FROM PMEMBER";
			if (id != null) {
				query += " where id='" + id + "'";
			}
			System.out.println("SQL : " + query);
			rs = stmt.executeQuery(query);
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected...");
			} else {
				System.out.println(rs.getRow() + " rows selected...");
				rs.previous();

				while (rs.next()) {
					String strId = rs.getString("id");
					String strPwd = rs.getString("password");

					PMemberVo data = new PMemberVo(strId, strPwd);
					list.add(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public String idmatch(String id) { // ID 중복 확인
		connDB();
		String answer = "";
		try {
			String query = "SELECT * FROM PMEMBER";
			if (id != null) {
				query += " where id='" + id + "'";

				System.out.println("SQL : " + query);
				rs = stmt.executeQuery(query);
				rs.last();
				int count = rs.getRow();
				System.out.println(count);
				rs.previous();

				if (count != 0) {
					answer = "이미 존재하는 ID입니다.";
				} else {
					answer = "사용 가능한 ID입니다.";
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return answer;
	}

	public void insert(String ID, String PASSWORD) { // 회원가입 추가
		try {
			connDB();
			System.out.println(ID + " " + PASSWORD);

			String sql = "INSERT INTO PMEMBER VALUES ('" + ID + "','" + PASSWORD + "')";
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
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void delete(String ID, String PWD) { // 탈퇴
//		SELECT ID FROM PMEMBER WHERE ID = 'ID' AND PASSWORD = 'PWD'
		
		try {
			connDB();

			String sql = "delete FROM PMEMBER Where ID = '" + ID + "' AND PASSWORD = '" + PWD + "'"; // 아이디 적용시키기
//			System.out.println(sql);
			stmt.executeQuery(sql);

		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
