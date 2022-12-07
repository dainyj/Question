package border.test2;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

import border.test.BorderTest;

public class BorderTest2 {
	private Frame frame;
	private Button center, west ;//, east, south;
	private TextField tf1;

	public BorderTest2() {
		frame = new Frame("BorderLayout example");
//		south = new Button("button 1");
		west = new Button("button 1");
//		east = new Button("button 3");
		center = new Button("button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFrame() {
		frame.add(tf1, "North");//배치
//		frame.add(south, "South");
		frame.add(west, "West");
//		frame.add(east, "East");
		frame.add(center, BorderLayout.CENTER);

		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
