package proFront;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Introduction extends WindowAdapter implements ActionListener {
	private JFrame f1;
	private JButton blogf, bsignf;
	private JTextArea ta;
	private JPanel p;
	private JScrollPane sp;

	public Introduction() { // setting
//		Frame setting
		f1 = new JFrame("INTRODUCTION");
		f1.setLayout(null);
		f1.setSize(300, 550);
		f1.setLocation(900, 300);
		f1.addWindowListener(this);
		f1.setResizable(false);
//	종료 
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		p = new JPanel();
		p.setSize(210, 300);
		p.setLocation(40, 30);
		p.setLayout(new BorderLayout());

//		Button setting
		blogf = new JButton("로그인");
		blogf.setSize(100, 30);
		blogf.setLocation(30, 380);
		blogf.addActionListener(this);
		blogf.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		bsignf = new JButton("회원가입");
		bsignf.setSize(100, 30);
		bsignf.setLocation(150, 380);
		bsignf.addActionListener(this);
		bsignf.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));
		
//		JTextArea  
//		스크롤 추가할 때 순서가 중요 
		ta = new JTextArea(); // 1. TA 생성
		ta.setSize(200, 150);
		ta.setLocation(50, 40);
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // 편집X
		ta.setCaretPosition(ta.getDocument().getLength()); // 내용이 추가될 때마다 스크롤 내리지 않고 바로 보기
		p.add(ta);
		sp = new JScrollPane(ta); //스크롤 2. 스크롤에 TA를 추가한다.
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(sp);  //3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.

		String intro = "경기도에 위치한 박물관, 미술관, 전시관을 검색할 수 있는 프로그램입니다.\n회원가입을 하시면 검색한 박물관 정보를 마이페이지에 저장하실 수 있습니다.\n이용해주셔서 감사합니다."; // 소개 글 적는 부분
		ta.append(intro);
	}

	public void startFrame() {
		f1.add(p);
		f1.add(blogf);
		f1.add(bsignf);
		f1.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("회원가입")) {
			f1.setVisible(false);
			SignUp.main(null);

		}

		if (e.getActionCommand().equals("로그인")) {
			f1.setVisible(false);
			Login.main(null);
		}
	}

	public static void main(String[] args) {
		Introduction intro = new Introduction();
		intro.startFrame();
	}

}
