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
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			System.out.println("statement create success.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public int runQuery(String sql) {
		int num = 0;
		try {
			rs = stmt.executeQuery(sql);
//			while (rs.next()) {

//				num = rs.getInt("COUNT(*)"); 
//				System.out.println("num = " + num);
//			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return num;
	}

//  쿼리 실행해서 MuseVo에 저장하는 메서드
	public ArrayList<MuseVo> list(String sql) { // 쿼리 실행해서 MuseVo에 저장하는 메서드
		ArrayList<MuseVo> muselist = new ArrayList<MuseVo>();
		connDB();
		try {
//			System.out.println(sql);
//			stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);
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

//	쿼리 실행하여 Vo로 저장
	public ArrayList<MuseVo> list2(String sql) { // 쿼리 실행해서 MuseVo에 저장하는 메서드
		ArrayList<MuseVo> muselist = new ArrayList<MuseVo>();
		connDB();
		try {
			System.out.println(sql);
//			stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strtn = rs.getString("MUSEUM_ARTGLRY_TYPE_NM");
				String strbn = rs.getString("BIZPLC_NM");
				String strcn = rs.getString("SIGUN_NM");
				MuseVo data = new MuseVo(strtn, strbn, strcn);
				muselist.add(data);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return muselist;
	}

//	여러개 출력 프로그램
	public String[] printResult(String sql) {
		String strbn = "", stradd = "";

		ArrayList<MuseVo> muselist = list(sql);
		// list(sql)의 list는 이 클래스 안에 있는 메서드 호출한 것
		String[] mulist = new String[muselist.size()];
		for (int i = 0; i < muselist.size(); i++) {
			MuseVo data = (MuseVo) muselist.get(i);
//			System.out.println(muselist.get(i));
			strbn = data.getBIZPLC_NM();
			stradd = data.getREFINE_ROADNM_ADDR();
			String mlist = " - " + strbn + "\n" + "      주소 : " + stradd + "\n\n";
//			System.out.println(mlist);
			mulist[i] = mlist;
		}
		return mulist;
	}

//	하나만 전송
	public String printRes(String sql) { // 하나만 전송됨. 여러개 전송하려면 배열로 넘겨야할듯
		connDB();
		String mlist = "";
		try {
//			stmt.executeQuery(sql);
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strbn = rs.getString("BIZPLC_NM");
				String strcn = rs.getString("SIGUN_NM");
				String stradd = rs.getString("REFINE_ROADNM_ADDR");
				mlist = "\n   " + strbn + " (" + strcn + ")\n\n" + "	    주소 : " + stradd + "\n\n";
//				System.out.println(mlist);
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
		return mlist;
	}

//	검색f > 저장버튼으로 삽입실행
	public void insertMypage(String sql) {
		connDB();
		try {
			boolean b = stmt.execute(sql);
			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

//	마이f > 기본 화면에 띄울 데이터 Vo에 저장 후 리턴
	public ArrayList<MyMuseVo> printBasics(String sql) {
		connDB();
		ArrayList<MyMuseVo> mylist = new ArrayList<MyMuseVo>();// DB 불러와서 저장할 ArrayList 생성
		try {
//			stmt.executeQuery(sql);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String strName = rs.getString("BIZPLC_NM");
				String strCity = rs.getString("SIGUN_NM");
				MyMuseVo data = new MyMuseVo(strName, strCity);
				mylist.add(data);
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return mylist;
	}

} // class end
