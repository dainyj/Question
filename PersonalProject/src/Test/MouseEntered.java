package Test;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MouseEntered implements MouseListener {
	private JFrame f, f2;
	private JButton b;
	private JTextField tf;
	private JLabel l;
	private JTable tb;
	private JTextArea ta;
	private JPanel p;
	private JScrollPane sp;

	public MouseEntered() {
		f = new JFrame();
		f.setLayout(null);
		f.setSize(190, 175);
		f.setLocation(300, 300);
		f.addMouseListener(this);

		f2 = new JFrame();
		f2.setLayout(null);
		f2.setSize(190, 175);
		f2.setLocation(300, 300);
		f2.addMouseListener(this);

		b = new JButton();
		b.setSize(20, 20);
		b.setLocation(170, 150);

//		tf = new JTextField("?");

		l = new JLabel("?");
		l.setSize(30, 30);
		l.setLocation(130, 30);
		l.setHorizontalAlignment(JLabel.CENTER);
		l.addMouseListener(this);

		String explain = "설명";

		ta = new JTextArea();
		ta.setSize(100, 100);
		ta.setLocation(20, 20);
		ta.append(explain);

		sp = new JScrollPane(ta);

		p = new JPanel();
		p.setSize(100, 100);
		p.setLocation(20, 20);
		p.setLayout(new BorderLayout());
		p.add(sp);

	}

	public void startFrame() {
		f2.add(p);
		f.add(l);
//		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource().equals(l)) {
			System.out.println("on");
			f2.setVisible(true);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource().equals(f2) ) {
			f2.setVisible(false);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		MouseEntered me = new MouseEntered();
		me.startFrame();

	}

}
