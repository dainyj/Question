package db;

public class Query {

//	메뉴f > ALL 버튼 > 모든 박물관 리스트 출력 //연결O
	public String allQuery() {
		String allSql = "SELECT * FROM MUSEUM";
		return allSql;
	}

//	메뉴f > 지역별 버튼 > City클래스 도시별로 //연결O
	public String cityQuery(String city) {
		String citySql = "SELECT BIZPLC_NM, REFINE_ROADNM_ADDR FROM MUSEUM WHERE SIGUN_NM LIKE '%" + city + "%'";
		return citySql;
	}
	
//	메뉴f > 주제별 버튼 > Theme클래스 1.박물관 2.미술관 3.전시관 버튼 클릭시 각각 //연결O
	public String themeQuery(String add) {
//		버튼 클릭시 해당 add가 여기로
		String baseSql = "SELECT * FROM MUSEUM WHERE MUSEUM_ARTGLRY_TYPE_NM LIKE '%" + add + "%'";
		return baseSql;
	}
	
	
//	 Search클래스 
	public String serchQuery(String combo, String search) { //쿼리 완성 메서드  
		switch (combo) {
		case "기관명":
			combo = "BIZPLC_NM";
			break;
		case "종류":
			combo = "MUSEUM_ARTGLRY_TYPE_NM";
			break;
		case "도시":
			combo = "SIGUN_NM";
			break;
		case "주소":
			combo = "REFINE_ROADNM_ADDR";
			break;
		}
		String SearchSql = "SELECT * FROM MUSEUM WHERE " + combo + " LIKE '%" + search + "%'";
		
		return SearchSql;
	}


}// class end
