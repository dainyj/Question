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

// 로그인, 회원가입 프레임으로 넘어가는 버튼 필요
// 버튼 눌렀을때 다른 프레임이 뜨도록 하기
// 종료버튼 작동하게 하기
public class Introduction extends WindowAdapter implements ActionListener {
	private JFrame f1;
	private JButton blogf, bsignf;
	private JTextArea ta;
	private JPanel p;
	private JScrollPane sp;

	public Introduction() { // setting
//		Frame setting
		f1 = new JFrame("INTRODUCTION");
//		f1.setLayout(new FlowLayout());
		f1.setLayout(null);
		f1.setSize(400, 400);
		f1.setLocation(300, 300);
		f1.addWindowListener(this);
//	종료 
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setSize(300, 200);
		p.setLocation(43, 30);
		p.setLayout(new BorderLayout());
//		p.setBackground(Color.green);
		

//		Button setting
		blogf = new JButton("로그인");
		blogf.setSize(100, 30);
		blogf.setLocation(80, 300);
		blogf.addActionListener(this);
		blogf.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 15));

		bsignf = new JButton("회원가입");
		bsignf.setSize(100, 30);
		bsignf.setLocation(200, 300);
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
		sp = new JScrollPane(ta); //스크롤 3. 스크롤에 TA를 추가한다.
		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(sp);  //3. 패널에 스크롤을 추가, 패널에 TA를 직접 추가하지 않는다.

		String intro = "안녕하세요.";
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
