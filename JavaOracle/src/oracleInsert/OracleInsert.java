package oracleInsert;
import java.sql.*;

public class OracleInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver"; //오라클에서 제공함.
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클에서 사용하는 포트와 이름 localhost = 127.0.0.1
		String user = "c##green";
		String password = "green1234";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");

			Statement stmt = conn.createStatement();

			String sql = "SELECT * FROM dept"; // 조회 쿼리
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("deptno") + " ");
				System.out.print(rs.getString("dname") + " ");
				System.out.println(rs.getString("loc") + " ");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
//			e.printStackTrace(); //오류가 자세하게 나오도록
		} catch (SQLException e) {
			System.out.println("oracle connection fail.");
		}

	}

}
