package frameToframe;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FstPage implements ActionListener {
	private Frame f1, f2;
	private Button b1;

	public FstPage() {
		f1 = new Frame("1st Frame");
		f1.setLayout(null);
		f1.setSize(400, 300);
		f1.setLocation(500, 100);

		f2 = new Frame("2nd Frame");
		f2.setLayout(null);
		f2.setSize(400, 300);
		f2.setLocation(300, 100);

		b1 = new Button("Button");
		b1.setSize(55, 60);
		b1.setLocation(310, 100);
		b1.addActionListener(this);
	}

	public void startFrame() {
		f1.add(b1);
		f1.setVisible(true);
	}

	public static void main(String[] args) {
		FstPage ff = new FstPage();
		ff.startFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		f1.setVisible(false);
		f2.setVisible(true);
	}
}
