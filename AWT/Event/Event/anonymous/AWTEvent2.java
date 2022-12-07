package Event.anonymous;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTEvent2 {
	private Frame frame;
	private Button btn1, btn2, btn3, btn4, btn5;

	public AWTEvent2() {
		frame = new Frame("event handler example");
		btn1 = new Button("Button1");
		btn2 = new Button("Button2");
		btn3 = new Button("Button3");
		btn4 = new Button("Button4");
		btn5 = new Button("Button5");
	}

	public void startFrame() {
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 1 Click!");
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 2 Click!");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 3 Click!");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 4 Click!");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Button 5 Click!");
			}
		});

		frame.add(btn1, "North");
		frame.add(btn2, "South");
		frame.add(btn3, "West");
		frame.add(btn4, "East");
		frame.add(btn5, "Center");
		frame.setSize(200, 200);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		AWTEvent2 border = new AWTEvent2();
		border.startFrame();
	}

}
