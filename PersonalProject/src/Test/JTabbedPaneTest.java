package Test;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {

//	JTabbedPane tab;
	City city = new City(); // 외부클래스 객체 생성
	City2 city2 = new City2();

	public JTabbedPaneTest() {
		JTabbedPane tabbedPane = new JTabbedPane(); // tab 객체 생성

//		탭화면에 넣어줄 객체 생성 (패널)
		tabbedPane.add("CITY", city);

		tabbedPane.add("CITY2", city2);

//		프레임에 TabbedPane 붙이기
		add(tabbedPane, BorderLayout.CENTER);

		setTitle("tabTest");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 550);
		setLocation(900, 300);
		setVisible(true);

	}

	public static void main(String[] args) {
		new JTabbedPaneTest();
	}

}

class City extends JPanel implements ActionListener {
	private JButton b1, b2;

	public City() {

//		도시 시작
		b1 = new JButton("가평군");
		b1.setSize(87, 30);
		b1.setLocation(10, 20);
		b1.addActionListener(this);
		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b2 = new JButton("과천시");
		b2.setSize(87, 30);
		b2.setLocation(100, 20);
		b2.addActionListener(this);
		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		패널에 컴포넌트 붙이기 (버튼)
		add(b1);
		add(b2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("가평군")) {
			System.out.println("b1");

		}
		if (e.getActionCommand().equals("과천시")) {
			System.out.println("b2");
		}

	}

}

class City2 extends JPanel implements ActionListener {
//	private JFrame f;
//	private JPanel p;
	Intab1 intab1 = new Intab1();
	Intab2 intab2 = new Intab2();

//	private JButton b1, b2;
	public City2() {
//		p1.add();
		JTabbedPane tab = new JTabbedPane(JTabbedPane.LEFT);
		setLayout(new BorderLayout()); // 탭 추가보다 위에 있어야 함.
		setSize(300, 550);
		setLocation(900, 300);
		setVisible(true);

//		 탭화면에 넣어줄 객체 생성 (패널) 
		tab.add("ㄱ", intab1);
		tab.add("ㄴ", intab2);

//		 프레임에 TabbedPane 붙이기 
		add(tab);

//		setName("tab");
//		setDefaultCloseOperation(EXIT_ON_CLOSE);

//		도시 시작
//		b1 = new JButton("가평군");
//		b1.setSize(87, 30);
//		b1.setLocation(10, 20);
//		b1.addActionListener(this);
//		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		b2 = new JButton("과천시");
//		b2.setSize(87, 30);
//		b2.setLocation(100, 20);
//		b2.addActionListener(this);
//		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

//		패널에 컴포넌트 붙이기 (버튼)
//		add(b1);
//		add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if (e.getActionCommand().equals("가평군")) {
//			System.out.println("b1");

//		}
//		if (e.getActionCommand().equals("과천시")) {
//			System.out.println("b2");
//		}
	}
}

class Intab1 extends JPanel implements ActionListener {
	private JButton b1, b2;

	public Intab1() {
		setLayout(null); // 버튼 레이아웃 설정을 위해서 null로 해야함.
//		도시 시작
		b1 = new JButton("가");
		b1.setSize(87, 30);
		b1.setLocation(10, 20);
		b1.addActionListener(this);
		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b2 = new JButton("갸");
		b2.setSize(87, 30);
		b2.setLocation(100, 20);
		b2.addActionListener(this);
		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		add(b1);
		add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}

class Intab2 extends JPanel implements ActionListener {
	private JButton b1, b2;

	public Intab2() {
		setLayout(null);
//		도시 시작
		b1 = new JButton("나");
		b1.setSize(87, 30);
		b1.setLocation(10, 20);
		b1.addActionListener(this);
		b1.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b2 = new JButton("냐");
		b2.setSize(87, 30);
		b2.setLocation(100, 20);
		b2.addActionListener(this);
		b2.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		add(b1);
		add(b2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
