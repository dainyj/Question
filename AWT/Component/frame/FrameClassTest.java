package frame;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameClassTest {

	public static void main(String[] args) {
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		Dimension d = f.getSize();
		System.out.println(d.getWidth());
		System.out.println(d.getHeight());
		

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
//		f.setLocation(screenSize.width / 2 - 150, screenSize.height / 2 - 500);
		f.setLocation(screenSize.width / 2 - (int)(d.getWidth()), screenSize.height / 2 - (int)(d.getHeight()));
//		위치를 직접 숫자로 지정해주기보단 스크린의 크기를 계산식으로 설정해줌.
		f.setVisible(true);
	}

}
