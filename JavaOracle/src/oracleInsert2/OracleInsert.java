package oracleInsert2;

import java.sql.*;

public class OracleInsert {
	public static void main(String[] args) {
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

//			기본키 변경 
//			String sqlf = "SELECT max(deptno) FROM dept";
//			ResultSet rs1 = stmt.executeQuery(sqlf);
//			int num =0;
//			while(rs1.next()) {
//			num =rs1.getInt("max(deptno)");
//			System.out.println(num);
//			}

//			삭제
			String sqlf2 = "delete FROM dept Where deptno = 50";
			stmt.executeQuery(sqlf2);

//			삽입
//			int ideptno = (num+10); // 19번 라인의 기본키 변경시 사용 
			String ideptno = "50", sdname = "IT", sloc = "SEOUL";
			String sql = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}

			// String sql = "SELECT * FROM dept";
			String sql2 = "SELECT deptno, dname, loc From dept";
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc") + " ");
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
