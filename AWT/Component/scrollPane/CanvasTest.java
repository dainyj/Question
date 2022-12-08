package scrollPane;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class CanvasTest {
	public static void main(String[] args) {
		Frame f = new Frame("Canvas Test");
		f.setSize(300, 200);

		ScrollPane sp = new ScrollPane(); // 괄호 안에 아래 3줄을 넣으면 됨.
//		SCROLLBARS_ALWAYS – 스크롤바가 항상 보이게 한다
//		SCROLLBARS_AS_NEEDED – 필요할 때만 보이게 한다
//		SCROLLBARS_NEVER – 항상 보이지 않도록 한다

		Panel p = new Panel();
		p.setBackground(Color.PINK);
		p.add(new Button("1st"));
		p.add(new Button("2nd"));
		p.add(new Button("3rd"));
		p.add(new Button("4th"));

		sp.add(p);
		f.add(sp);
		f.setVisible(true);
	}
}
