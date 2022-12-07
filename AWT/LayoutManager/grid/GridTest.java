package grid;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextField;

public class GridTest {
	private Frame frame;
	private Button b1, b2, b3;
	private TextField tf1, tf2, tf3;

	public GridTest() {
		frame = new Frame("GridLayout example");
		b1 = new Button("button1");
		b2 = new Button("button2");
		b3 = new Button("bitton3");

		tf1 = new TextField("Input Text 1");
		tf2 = new TextField("Input Text 2");
		tf3 = new TextField("Input Text 3");

	}

	public void startFrame() {
		frame.setLayout(new GridLayout(3, 0));
		frame.add(b1);
		frame.add(tf1);
		frame.add(b2);
		frame.add(tf2);
		frame.add(b3);
		frame.add(tf3);

//		frame.pack();// 자동적으로 데이터에 맞게 지정됨.
		frame.setSize(200,200);
		frame.setLocation(500,500);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridTest flow = new GridTest();
		flow.startFrame();
	}

}
