package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTemplate { // DAO 사용시 import해서 사용
							// import static database.JDBCTemplate.*;

	public static Connection getConnection() { // 연결 메서드
		try { // 드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("jdbc driver loading success.");
		} catch (Exception e) { // 드라이버 연결 실패시
			e.printStackTrace();
		}

		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "c##green";
		String pw = "green1234";

		Connection con = null;

		try { // 계정 연결
			con = DriverManager.getConnection(url, id, pw);
			con.setAutoCommit(false); // > 자동커밋모드(비활성화)
			System.out.println("oracle connection success.");

		} catch (SQLException e) { // 계정 연결 실패 시
			e.printStackTrace();
		}
		return con;
	}

	public static boolean isConnection(Connection con) {
		boolean valid = true;

		try {
			if (con == null || con.isClosed()) { // 연결 X 시
				valid = false;
			}
		} catch (SQLException e) { // 예외 발생 시
			valid = true;
			e.printStackTrace();
		}
		return valid;
	}

	public static void close(Connection con) { // 연결 상태 확인 메서드 -> 연결이 확인되면 close.
		if (isConnection(con)) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(Statement stmt) { // stmt가 null이 아닐 때 close
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void close(ResultSet rs) { // rs가 null이 아닐 때 close
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void commit(Connection con) { // 연결 상태일 떄 커밋
		if (isConnection(con)) {
			try {
				con.commit();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void rollback(Connection con) { // 연결 상태일때 롤백
		if (isConnection(con)) {
			try {
				con.rollback();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}