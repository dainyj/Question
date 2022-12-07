package buttonChange.t;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Tanswer extends WindowAdapter implements ActionListener {
	private Button b;

	public void windowClosing(WindowEvent e) { // 화면 종료메서드
		System.exit(0);
	}

	public Tanswer() { // frame, button 사이즈 위치 설정
		Frame f = new Frame("Login");
		f.setSize(300, 200);
		f.setLayout(null);
		f.addWindowListener(this); // 화면 종료가능하게 해주는 리스너

		b = new Button("확인");
		b.setSize(100, 50);
		b.setLocation(100, 75);
		b.addActionListener(this); // 버튼 클릭을 확인해주는 리스너

		f.add(b);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) { // 마우스 클릭으로 글자 변환
		if (b.getLabel().equals("확인")) {
			b.setLabel("취소");
		} else {
			b.setLabel("확인");
		}
		System.out.println("Click");
	}

	public static void main(String[] args) { //실행메서드
		Tanswer t = new Tanswer();
	}
}
