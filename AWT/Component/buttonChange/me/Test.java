package buttonChange.me;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test extends WindowAdapter implements ActionListener {
	private Frame frame;
	private Button button;

	public Test() {
		frame = new Frame("Login");
		button = new Button("확인");
	}

	public void actionPerformed(ActionEvent e) {
		if (button.getLabel().equals("확인")) {
			button.setLabel("취소");
		} else {
			button.setLabel("확인");
		}
	}

	public void startFrame() {
		frame.addWindowListener(this);
		button.addActionListener(this);
		frame.setLayout(null);

		button.setSize(100, 50);
		button.setLocation(100, 75);
		frame.add(button);

		frame.setSize(300, 200);
		frame.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public static void main(String[] args) {
		Test g = new Test();
		g.startFrame();

	}
}