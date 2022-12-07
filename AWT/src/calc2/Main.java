package calc2;
//버튼 배열 만들기 연습
import java.awt.Button;

public class Main {
	private Button[] b = new Button[15];

	public Main() {
		String[] bname = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "x", "/", "=", "초기화" };
		for (int i = 0; i < bname.length; i++) {
			b[i] = new Button(bname[i]);
			System.out.println(b[i]);
		}
	}

	

	public static void main(String[] args) {
		Main m = new Main();
	}

}
