import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame f = new Frame("Hello");
		f.setSize(300, 200);
		f.setVisible(true);// 화면 출력, 기본적으로 마지막에 들어가야함.
	}
}
