package Test;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TabLeft extends JFrame {
	public TabLeft() {
		setTitle("탭팬 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 550);
		Container c = getContentPane();

		JTabbedPane p = new JTabbedPane(JTabbedPane.LEFT);
		p.addTab("tab1", new Tab1());

		ImageIcon icon = new ImageIcon("./images/jiyoon.jpeg");
		p.addTab("tab2", icon, new Tab2());

		c.add(p);
		setVisible(true);
	}

	class Tab1 extends JPanel {
		public Tab1() {
			this.add(new JLabel("ID : "));
			JTextField id = new JTextField("", 10);
			this.add(id);

			this.add(new JLabel("PASSWORD : "));
			JPasswordField pw = new JPasswordField(10);
			this.add(pw);
		}
	}

	class Tab2 extends JPanel {
		public Tab2() {
			this.setLayout(new BorderLayout());
			JTextArea memo = new JTextArea("여기에 작성하세요", 50, 10);
			memo.selectAll();

			JScrollPane scroll = new JScrollPane(memo);
			this.add(scroll);
		}
	}

	public static void main(String[] args) {
		TabLeft a = new TabLeft();
	}
}
