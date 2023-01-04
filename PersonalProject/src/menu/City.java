package menu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

import db.Mfind;
import proFront.Menu;

/*//1가평군 //2과천시 //3광명시 //4광주시 //5고양시 //6구리시 //7김포시
//8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
//14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시
//20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
//25파주시 //26포천시 //27하남시 //28화성시
*/public class City implements ActionListener {
	private JFrame fc;
	private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
			b23, b24, b25, b26, b27, b28, back;

	String A = "";

	public City() {
		fc = new JFrame("CITY");
		fc.setLayout(null);
		fc.setSize(300, 550);
		fc.setLocation(300, 300);
		fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fc.setResizable(false);

		
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

		b3 = new JButton("광명시");
		b3.setSize(87, 30);
		b3.setLocation(190, 20);
		b3.addActionListener(this);
		b3.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b4 = new JButton("광주시");
		b4.setSize(87, 30);
		b4.setLocation(10, 70);
		b4.addActionListener(this);
		b4.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b5 = new JButton("고양시");
		b5.setSize(87, 30);
		b5.setLocation(100, 70);
		b5.addActionListener(this);
		b5.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b6 = new JButton("구리시");
		b6.setSize(87, 30);
		b6.setLocation(190, 70);
		b6.addActionListener(this);
		b6.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b7 = new JButton("김포시");
		b7.setSize(87, 30);
		b7.setLocation(10, 120);
		b7.addActionListener(this);
		b7.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
		b8 = new JButton("남양주시");
		b8.setSize(87, 30);
		b8.setLocation(100, 120);
		b8.addActionListener(this);
		b8.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b9 = new JButton("동두천시");
		b9.setSize(87, 30);
		b9.setLocation(190, 120);
		b9.addActionListener(this);
		b9.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b10 = new JButton("부천시");
		b10.setSize(87, 30);
		b10.setLocation(10, 170);
		b10.addActionListener(this);
		b10.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b11 = new JButton("성남시");
		b11.setSize(87, 30);
		b11.setLocation(100, 170);
		b11.addActionListener(this);
		b11.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b12 = new JButton("수원시");
		b12.setSize(87, 30);
		b12.setLocation(190, 170);
		b12.addActionListener(this);
		b12.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b13 = new JButton("시흥시");
		b13.setSize(87, 30);
		b13.setLocation(10, 220);
		b13.addActionListener(this);
		b13.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시		
		b14 = new JButton("안산시");
		b14.setSize(87, 30);
		b14.setLocation(100, 220);
		b14.addActionListener(this);
		b14.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b15 = new JButton("안성시");
		b15.setSize(87, 30);
		b15.setLocation(190, 220);
		b15.addActionListener(this);
		b15.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b16 = new JButton("안양시");
		b16.setSize(87, 30);
		b16.setLocation(10, 270);
		b16.addActionListener(this);
		b16.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b17 = new JButton("양주시");
		b17.setSize(87, 30);
		b17.setLocation(100, 270);
		b17.addActionListener(this);
		b17.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b18 = new JButton("양평군");
		b18.setSize(87, 30);
		b18.setLocation(190, 270);
		b18.addActionListener(this);
		b18.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		
		b19 = new JButton("여주시");
		b19.setSize(87, 30);
		b19.setLocation(10, 320);
		b19.addActionListener(this);
		b19.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		
//20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
		b20 = new JButton("오산시");
		b20.setSize(87, 30);
		b20.setLocation(100, 320);
		b20.addActionListener(this);
		b20.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b21 = new JButton("용인시");
		b21.setSize(87, 30);
		b21.setLocation(190, 320);
		b21.addActionListener(this);
		b21.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b22 = new JButton("이천시");
		b22.setSize(87, 30);
		b22.setLocation(10, 370);
		b22.addActionListener(this);
		b22.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b23 = new JButton("의왕시");
		b23.setSize(87, 30);
		b23.setLocation(100, 370);
		b23.addActionListener(this);
		b23.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b24 = new JButton("의정부시");
		b24.setSize(87, 30);
		b24.setLocation(190, 370);
		b24.addActionListener(this);
		b24.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		
//25파주시 //26포천시 //27하남시 //28화성시
		b25 = new JButton("파주시");
		b25.setSize(87, 30);
		b25.setLocation(10, 420);
		b25.addActionListener(this);
		b25.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b26 = new JButton("포천시");
		b26.setSize(87, 30);
		b26.setLocation(100, 420);
		b26.addActionListener(this);
		b26.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b27 = new JButton("하남시");
		b27.setSize(87, 30);
		b27.setLocation(190, 420);
		b27.addActionListener(this);
		b27.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

		b28 = new JButton("화성시");
		b28.setSize(87, 30);
		b28.setLocation(10, 470);
		b28.addActionListener(this);
		b28.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		
		back = new JButton("뒤로");
		back.setSize(70, 20);
		back.setLocation(200, 480);
		back.addActionListener(this);
		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

	}

	public void startFrame() {
		fc.add(b1);
		fc.add(b2);
		fc.add(b3);
		fc.add(b4);
		fc.add(b5);
		fc.add(b6);
		fc.add(b7);
		fc.add(b8);
		fc.add(b9);
		fc.add(b10);
		fc.add(b11);
		fc.add(b12);
		fc.add(b13);
		fc.add(b14);
		fc.add(b15);
		fc.add(b16);
		fc.add(b17);
		fc.add(b18);
		fc.add(b19);
		fc.add(b20);
		fc.add(b21);
		fc.add(b22);
		fc.add(b23);
		fc.add(b24);
		fc.add(b25);
		fc.add(b26);
		fc.add(b27);
		fc.add(b28);
		fc.add(back);
		fc.setVisible(true);
	}

	public void cquery(String city) { // (정보 호출 쿼리), 이름과 주소만 출력되도록 설정.
		Mfind mf = new Mfind();
		String common = "SELECT BIZPLC_NM, REFINE_ROADNM_ADDR FROM MUSEUM WHERE SIGUN_NM = '" + city + "'";
		mf.fcity(common);
	}

	public void actionPerformed(ActionEvent e) {
		City c = new City();
		if (e.getActionCommand().equals("가평군")) {
//			System.out.println(b1.getText());
			c.cquery(b1.getText()); // 버튼 텍스트 가져오기 JButton이 가능
		}
		if (e.getActionCommand().equals("과천시")) {
//			System.out.println(b2.getText());
			c.cquery(b2.getText());
		}

		if (e.getActionCommand().equals("광명시")) {
//			System.out.println(b3.getText());
			c.cquery(b3.getText());
		}

		if (e.getActionCommand().equals("광주시")) {
//			System.out.println(b4.getText());
			c.cquery(b4.getText());
		}

		if (e.getActionCommand().equals("고양시")) {
//			System.out.println(b5.getText());
			c.cquery(b5.getText());
		}

		if (e.getActionCommand().equals("구리시")) {
//			System.out.println(b6.getText());
			c.cquery(b6.getText());
		}

		if (e.getActionCommand().equals("김포시")) {
//			System.out.println(b7.getText());
			c.cquery(b7.getText());
		}

		if (e.getActionCommand().equals("남양주시")) {
//			System.out.println(b8.getText());
			c.cquery(b8.getText());
		}

		if (e.getActionCommand().equals("동두천시")) {
//			System.out.println(b9.getText());
			c.cquery(b9.getText());
		}

		if (e.getActionCommand().equals("부천시")) {
//			System.out.println(b10.getText());
			c.cquery(b10.getText());
		}

		if (e.getActionCommand().equals("성남시")) {
//			System.out.println(b11.getText());
			c.cquery(b11.getText());
		}
		if (e.getActionCommand().equals("수원시")) {
//			System.out.println(b12.getText());
			c.cquery(b12.getText());
		}

		if (e.getActionCommand().equals("시흥시")) {
//			System.out.println(b13.getText());
			c.cquery(b13.getText());
		}

		if (e.getActionCommand().equals("안산시")) {
//			System.out.println(b14.getText());
			c.cquery(b14.getText());
		}

		if (e.getActionCommand().equals("안성시")) {
//			System.out.println(b15.getText());
			c.cquery(b15.getText());
		}

		if (e.getActionCommand().equals("안양시")) {
//			System.out.println(b16.getText());
			c.cquery(b16.getText());
		}

		if (e.getActionCommand().equals("양주시")) {
//			System.out.println(b17.getText());
			c.cquery(b17.getText());
		}

		if (e.getActionCommand().equals("양평군")) {
//			System.out.println(b18.getText());
			c.cquery(b18.getText());
		}

		if (e.getActionCommand().equals("여주시")) {
//			System.out.println(b19.getText());
			c.cquery(b19.getText());
		}

		if (e.getActionCommand().equals("오산시")) {
//			System.out.println(b20.getText());
			c.cquery(b20.getText());
		}

		if (e.getActionCommand().equals("용인시")) {
//			System.out.println(b21.getText());
			c.cquery(b21.getText());
		}

		if (e.getActionCommand().equals("이천시")) {
//			System.out.println(b22.getText());
			c.cquery(b22.getText());
		}

		if (e.getActionCommand().equals("의왕시")) {
//			System.out.println(b23.getText());
			c.cquery(b23.getText());
		}

		if (e.getActionCommand().equals("의정부시")) {
//			System.out.println(b24.getText());
			c.cquery(b24.getText());
		}

		if (e.getActionCommand().equals("파주시")) {
//			System.out.println(b25.getText());
			c.cquery(b25.getText());
		}

		if (e.getActionCommand().equals("포천시")) {
//			System.out.println(b26.getText());
			c.cquery(b26.getText());
		}

		if (e.getActionCommand().equals("하남시")) {
//			System.out.println(b27.getText());
			c.cquery(b27.getText());
		}

		if (e.getActionCommand().equals("화성시")) {
//			System.out.println(b28.getText());
			c.cquery(b28.getText());
		}
		
		if (e.getActionCommand().equals("뒤로")) {
			fc.setVisible(false);
			Menu.main(null);
		}

	}

	public static void main(String[] args) {
		City c = new City();
		c.startFrame();
	}

}
