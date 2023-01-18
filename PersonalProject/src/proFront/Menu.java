package proFront;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import db.Execute;
import proMiddle.Mypage;
import proMiddle.Notice;
import proMiddle.Search;
import proMiddle.Tab;

public class Menu extends WindowAdapter implements ActionListener {
	private JFrame f4;
	private JButton bm1, bm2, bs, bmp;
	private JLabel lm, line;
	private String ID;
	String str;

	String A = "";


	public Menu() {
//		Frame setting
		f4 = new JFrame("MENU");
		f4.setLayout(null);
		f4.setSize(300, 550);
		f4.setLocation(900, 300);
//		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f4.setResizable(false);



//		Button setting
		bm1 = new JButton("게시판");
		bm1.setSize(100, 30);
		bm1.setLocation(95, 140);
		bm1.addActionListener(this);
		bm1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bm2 = new JButton("List");
		bm2.setSize(100, 30);
		bm2.setLocation(95, 200);
		bm2.addActionListener(this);
		bm2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		bs = new JButton("검색");
		bs.setSize(100, 30);
		bs.setLocation(95, 320);
		bs.addActionListener(this);
		bs.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 12));

		bmp = new JButton("마이페이지");
		bmp.setSize(100, 30);
		bmp.setLocation(95, 380);
		bmp.addActionListener(this);
		bmp.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		Label setting
		lm = new JLabel("MENU");
		lm.setSize(120, 30);
		lm.setLocation(85, 55);
		lm.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 40));

		line = new JLabel("- - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
		line.setSize(200, 10);
		line.setLocation(50, 270);

	}

	public void startFrame() {
		f4.add(lm);
		f4.add(line);
		f4.add(bm1);
		f4.add(bm2);
		f4.add(bs);
		f4.add(bmp);
		f4.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		Mypage mp = new Mypage();
		Execute ec = new Execute();
		Notice note = new Notice();
		ec.connDB();
		if (e.getActionCommand().equals("게시판")) {
			note.setID(ID);
			note.startFrame();
		}

		if (e.getActionCommand().equals("List")) {
			Tab.main(null);
		}

		if (e.getActionCommand().equals("검색")) {
			Search s = new Search();
			s.setID(ID);
			s.startFrame();
		}

		if (e.getActionCommand().equals("마이페이지")) {
			mp.setID(ID);
			mp.startFrame();			
		}

	}
	
	public void setID(String ID) {
		this.ID = ID;
	}

	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.startFrame();

	}

}