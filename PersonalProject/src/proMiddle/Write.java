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
	private JButton bsave, bedit;
	private JLabel l;
	private JTextField tf;
	private JTextArea ta;
	private JScrollPane sp;
	private String ID, num;

	public Write() {
		f = new JFrame("Write");
		f.setLayout(null);
		f.setSize(300, 550);
		f.setLocation(1200, 300);
		f.setResizable(false);

		bsave = new JButton("등록");
		bsave.setSize(60, 30);
		bsave.setLocation(115, 450);
		bsave.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bsave.addActionListener(this);

		bedit = new JButton("수정");
		bedit.setSize(60, 30);
		bedit.setLocation(115, 450);
		bedit.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bedit.addActionListener(this);

		l = new JLabel("제목");
		l.setSize(30, 30);
		l.setLocation(10, 10);
		l.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		tf = new JTextField();
		tf.setSize(235, 30);
		tf.setLocation(40, 10);

		ta = new JTextArea();

		sp = new JScrollPane();
		sp.setViewportView(ta);
		sp.setSize(265, 400);
		sp.setLocation(10, 50);

	}

	public void edit(String writingtitle) {
		Query qu = new Query();
		Execute ec = new Execute();
		Write wt = new Write();
		Notice notice = new Notice();
		ec.connDB();
		String sql = qu.noticeEdit(writingtitle, ID);
		System.out.println(sql);
		String[] strsum = ec.eidtQuery(sql);
		String title = strsum[0];
		String content = strsum[1];
		String num = strsum[2];
		notice.setID(ID);
		System.out.println(strsum[0] + " " + strsum[1] + " " + strsum[2]);
		wt.editStartFrame(title, content);
		wt.setNum(num);
	}
	
	public void check(String num, String title) {
		Query qu = new Query();
		Execute ec = new Execute();
		Write wt = new Write();
		Notice notice = new Notice();
		notice.setID(ID);
		ec.connDB();
		String sql = qu.check(num, title);
		String[]check = ec.eidtQuery(sql);
		String strt = check[0];
		String strc = check[1];
		wt.checkStartFrame(strt, strc);
		
//		.setEditable(false); // 수정 X
		
	}
	
	public void checkStartFrame(String strt, String strc) {
		f.setTitle("보기");
		tf.setText(strt);
		tf.setEditable(false); 
		ta.setText(strc);
		ta.setEditable(false);
		f.add(tf);
		f.add(sp);
		f.setVisible(true);
		
	}
	

	public void setNum(String num) {
		this.num = num;
	}

	public void editStartFrame(String title, String content) {
		tf.setText(title);
		ta.setText(content);
		f.add(l);
		f.add(tf);
		f.add(sp);
		f.add(bedit);
		f.setVisible(true);
	}

	public void startFrame() {
		f.add(l);
		f.add(tf);
		f.add(sp);
		f.add(bsave);
		f.setVisible(true);
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Notice notice = new Notice();
		Write write = new Write();
		Query qu = new Query();
		Execute ec = new Execute();
		write.setID(ID);
		notice.setID(ID);
		ec.connDB();
		if (e.getActionCommand().equals("등록")) {
//		DB에 저장 
			String cntnum = qu.noticenum(); // count 쿼리문
//			System.out.println("실행 쿼리문 :" + cntnum);

			int cntnumber = ec.cntrunQuery(cntnum); //게시글 수 확인
			int intnumber = 1 + cntnumber;
//			System.out.println("DB 수 : " + cntnumber + " 다음 게시글 순서 :" + intnumber);
			String number = String.valueOf(intnumber);
//			System.out.println(number);

			String title = tf.getText();
			String content = ta.getText();
			String sql = qu.noticeInsert(number, ID, title, content);
			ec.runQuery(sql);
//			System.out.println(title);
//			System.out.println(content);
			write.setID(ID);
			notice.setID(ID);
			notice.model.setNumRows(0);// 게시판 초기화 후
			notice.startFrame(); // 다시 실행
			f.setVisible(false);
		}
		if (e.getActionCommand().equals("수정")) {
			String title = tf.getText();
			String content = ta.getText();

			String sql = qu.editsave(title, content, num);
			ec.runQuery(sql);
			f.setVisible(false);
			write.setID(ID);
			notice.setID(ID);
			notice.startFrame();
		}

	}

	public static void main(String[] args) {
		Write write = new Write();
		write.startFrame();
	}

}
