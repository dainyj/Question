package db;

import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParsXML {

	private static String getTagValue(String tag, Element eElement) { // TagName을 가져와서 nList에 저장
		NodeList nList = eElement.getElementsByTagName(tag).item(0).getChildNodes();

		Node nValue = (Node) nList.item(0);
		if (nValue == null) {
			return null;
		}
		return nValue.getNodeValue();
	}

	public static void main(String[] args) {
		String key = "558be4f19e69451f8a38179d74f13eca"; // 발급받은 인증키
		String url = "https://openapi.gg.go.kr/Museumartglry"; // 요청 주소

		try {
			String apiurl = url + "?KEY=" + key + "&pSize=200";
			// => '오픈api url'/'오픈api명'?KEY='인증키값'&pIndex='페이지위치(숫자)'&pSize='페이지당요청수'&'요청인자'
			// &Type=json / &pIndex=숫자 : 페이지위치 / &pSize=숫자 : 페이지당 요청수 / &요청인자

//			페이지에 접근해줄 Document 객체를 생성
//			생성한 객체 Document객체를 통해 파싱할 url의 요소를 읽어들인다.
//			doc.getDocumentElement().getNodeName()을 출력하면 위 xml의 최상위 tag값을 가져온다.
//			<Museumartglry>가 최상위 tag값이 될 것이다.

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(apiurl);
			doc.getDocumentElement().normalize(); // > 검색해보기

			System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
//			파싱할 정보가 있는 tag에 접근하는 부분
//			<row>라는 tag안에 원하는 정보가 있다.
//			nList에 <row> tag가 하나씩 담기게 되므로 getLength()를 통해 리스트 수 확인가능

			NodeList nList = doc.getElementsByTagName("row"); // 파싱할 tagname의 바로위
//			ex> <row><SICUN_NM> 양평군 </SIGUN_NM><SIGUN_CD>41830</SIGUN_CD></ROW>
//															
			System.out.println("파싱할 리스트 수 : " + nList.getLength()); // 여기서 부터 list에 담긴 데이터를 반복문으로 출력
//			getTextContent()는 전체 정보를 의미
//			getTagValue("tag", element)는 입력한 tag정보를 의미 -> "tag" 자리에 실질적인 tag변수값 입력, 따로 메서드를 만듬.

			MuseDAO md = new MuseDAO();

			for (int temp = 0; temp < nList.getLength(); temp++) { // 모든 데이터를 출력하기 위해 for문 사용
				Node nNode = nList.item(temp);
				Element eElement = (Element) nNode;
				if (nNode.getNodeType() == Node.ELEMENT_NODE 
						&& getTagValue("BSN_STATE_NM", eElement).equals("운영중")  // 파싱할 때 조건 넣는 부분. 운영중인 박물관만
						) {

					System.out.println("----------------------------------");
					System.out.println(getTagValue("BIZPLC_NM", eElement));
					System.out.println(getTagValue("MUSEUM_ARTGLRY_TYPE_NM", eElement));
					System.out.println(getTagValue("SIGUN_NM", eElement));
					System.out.println(getTagValue("REFINE_ROADNM_ADDR", eElement));
					System.out.println(getTagValue("BSN_STATE_NM", eElement));

//==================파싱한 정보를 DB에 insert시키는 메서드(MuseDAO에 있음) 호출  ======================================================
					ArrayList<MuseVo> list = md.mlist(getTagValue("BIZPLC_NM", eElement),
							getTagValue("MUSEUM_ARTGLRY_TYPE_NM", eElement), getTagValue("SIGUN_NM", eElement),
							getTagValue("REFINE_ROADNM_ADDR", eElement), getTagValue("BSN_STATE_NM", eElement));
					
					
					for (int i = 0; i < list.size(); i++) {
						MuseVo data = (MuseVo) list.get(i);
						String BIZPLC_NM = data.getBIZPLC_NM();
						String MUSEUM_ARTGLRY_TYPE_NM = data.getMUSEUM_ARTGLRY_TYPE_NM();
						String SIGUN_NM = data.getSIGUN_NM();
						String REFINE_ROADNM_ADDR = data.getREFINE_ROADNM_ADDR();
						String BSN_STATE_NM = data.getBSN_STATE_NM();

						System.out.println(BIZPLC_NM + " " + MUSEUM_ARTGLRY_TYPE_NM + " " + SIGUN_NM + " "
								+ REFINE_ROADNM_ADDR + " " + BSN_STATE_NM);
					}
//=================여기까지가 DB에 삽입 ==========================================================================================

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
