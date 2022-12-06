package class_StringTokenizer;

import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		String text = "홍길동/이수홍/박연수";

		StringTokenizer st = new StringTokenizer(text, "/");
		int countTokens = st.countTokens();
		for (int i = 0; i < countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println();

		st = new StringTokenizer(text, "/");
		while (st.hasMoreTokens()) {  //hasMore~ true false로 결과
			String token = st.nextToken(); // 먼저 호출이 되어야 사용되므로 배열의 첫칸에서 두번째칸으로 이동된후 아래의 프린트가 이루어진다.
			System.out.println(token);
		}
	}
}
