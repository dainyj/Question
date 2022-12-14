package memberFind;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521/xe";
	String user = "c##green";
	String password = "green1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	public ArrayList<MemberVo> list(String name) {
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();

		try {
			connDB();

			String query = "SELECT * FROM emp";

			if (name != null) {
				query += " where ename ='" + name.toUpperCase() + "'";
			}
			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query);
			rs.last(); //개수 파악하기 위해서
			System.out.println("rs.getRow() : " + rs.getRow());// 아래로 내리면서 개수 파악해줌.

			if (rs.getRow() == 0) {
				System.out.println("0 row selected.......");
			} else {
				System.out.println(rs.getRow() + " rows selected.....");
				rs.previous();//이전에 있던 위치로 이동 처음 

				while (rs.next()) {// 한칸씩 이동
					String empno = rs.getString("empno");
					String ename = rs.getString("ename");
					int sal = rs.getInt("sal");

					MemberVo data = new MemberVo(empno, ename, sal);
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
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.");
//			stmt = con.createStatement();
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			위의 33,40번 라인을 사용하기 위한 옵션 추가 
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
