package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Execute { // 쿼리받아서 실행 클래스
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	String user = "c##green";
	String password = "green1234";

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

	public ArrayList<MuseVo> list(String sql) { // 쿼리 실행해서 MuseVo에 저장하는 메서드
		ArrayList<MuseVo> muselist = new ArrayList<MuseVo>();
		connDB();
		try {
			System.out.println(sql);
			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strbn = rs.getString("BIZPLC_NM");
				String stradd = rs.getString("REFINE_ROADNM_ADDR");
				MuseVo data = new MuseVo(strbn, stradd);
				muselist.add(data);
//					System.out.println(strbn + " " + stradd + "\n" + list.add(data)));
//					System.out.println();
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return muselist;
	}
	
	
//	출력 프로그램
	public void printResult(String sql) {
		Test t = new Test();
		ArrayList<MuseVo> muselist = list(sql);
		String strbn = "", stradd = "";
		for (int i = 0; i < muselist.size(); i++) {
			MuseVo data = (MuseVo) muselist.get(i);
//			System.out.println(muselist.get(i));
//			System.out.println();
			strbn = data.getBIZPLC_NM();
			stradd = data.getREFINE_ROADNM_ADDR();
			String mlist = " - " + strbn + "\n" + "      주소 : " + stradd + "\n\n";
			t.taappear(mlist);
			System.out.println(mlist);
			
		}
		
	}

}// class end
