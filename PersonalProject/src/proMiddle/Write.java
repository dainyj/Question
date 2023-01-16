package proMiddle;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import db.Execute;
import db.Query;

public class Write implements ActionListener {
	private JFrame f;
	private JButton b;
	private JLabel l;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane sp;
	private String ID;

	public Write() {
		f = new JFrame("Write");
		f.setLayout(null);
		f.setSize(300, 550);
		f.setLocation(1200, 300);
		f.setResizable(false);

		b = new JButton("등록");
		b.setSize(60, 30);
		b.setLocation(115, 450);
		b.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		b.addActionListener(this);

		l = new JLabel("제목");
		l.setSize(30, 30);
		l.setLocation(10, 10);
		l.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		tf = new JTextField();
		tf.setSize(235, 30);
		tf.setLocation(40, 10);

		ta = new JTextArea();
//		ta.setText("내용 : ");

		sp = new JScrollPane();
		sp.setViewportView(ta);
		sp.setSize(265, 400);
		sp.setLocation(10, 50);

	}

	public void edit(String writingtitle) {
		Query qu = new Query();
		Execute ec = new Execute();
		
		String sql = qu.noticeEdit(writingtitle, ID);
		ec.runQuery(sql);
		
		tf.setText(null);
		ta.setText(null);
	}

	public void startFrame() {
		f.add(l);
		f.add(tf);
		f.add(sp);
		f.add(b);
		f.setVisible(true);
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Query qu = new Query();
		Execute ec = new Execute();
		ec.connDB();
		if (e.getActionCommand().equals("등록")) {
//		DB에 저장 
			String title = tf.getText();
			String content = ta.getText();
			String sql = qu.noticeInsert(ID, title, content);
			ec.runQuery(sql);
//			System.out.println(title);
//			System.out.println(content);
			f.setVisible(false);
		}
	}

	public static void main(String[] args) {
		Write write = new Write();
		write.startFrame();
	}

}
