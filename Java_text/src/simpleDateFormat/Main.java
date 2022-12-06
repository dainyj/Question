package simpleDateFormat;
//날짜 형식 클래스
//java.lang.Object
//	java.text.Format
//		java.text.DateFormat
//			java.text.SimpleDateFormat
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyy년 MM월 dd일");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy.MM.ddd a HH:mm;ss");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("오늘은 E요일");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("올해의 w번째 주");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이달의 W번째 주");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 D번째 날");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));

	}
}
