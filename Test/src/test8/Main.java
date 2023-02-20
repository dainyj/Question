package test8;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main implements ActionListener {
	private JFrame f;
	private JButton b;
	private JLabel lid, lpwd;
	private JTextField tfid, tfpwd;

	public Main() {
		f = new JFrame();
		f.setSize(400, 300);
		f.setLocation(300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setResizable(false);

		b = new JButton("로그인");
		b.setSize(100, 40);
		b.setLocation(150, 180);
		b.addActionListener(this);
		b.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lid = new JLabel("아이디");
		lid.setSize(100, 50);
		lid.setLocation(85, 50);
		lid.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		lpwd = new JLabel("비밀번호");
		lpwd.setSize(100, 50);
		lpwd.setLocation(80, 100);
		lpwd.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		tfid = new JTextField("");
		tfid.setSize(160, 30);
		tfid.setLocation(180, 60);
		tfid.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		tfpwd = new JTextField("");
		tfpwd.setSize(160, 30);
		tfpwd.setLocation(180, 110);
		tfpwd.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));
	}

	public void startFrame() {
		f.add(b);
		f.add(lid);
		f.add(lpwd);
		f.add(tfid);
		f.add(tfpwd);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("로그인")) {
			if (tfid.getText().equals("green")) {
				if (tfpwd.getText().equals("green1234")) {
					JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "아이디가 틀렸습니다.");
			}
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.startFrame();
	}

}
