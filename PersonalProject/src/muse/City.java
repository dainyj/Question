package muse;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

//1가평군 //2과천시 //3광명시 //4광주시 //5고양시 //6구리시 //7김포시
//8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
//14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시
//20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
//25파주시 //26포천시 //27하남시 //28화성시
public class City implements ActionListener {
	private JFrame fc;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22,
			b23, b24, b25, b26, b27, b28;

	public City() {
		fc = new JFrame("CITY");
//		fc.setLayout(null);
		fc.setLayout(new FlowLayout());
		fc.setSize(400, 400);
		fc.setLocation(300, 300);
		fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b1 = new Button("가평군");
		b1.setSize(100, 30);
		b1.setLocation(60, 130);
		b1.addActionListener(this);

		b2 = new Button("과천시");
		b2.setSize(100, 30);
		b2.setLocation(60, 130);
		b2.addActionListener(this);
		
		b3 = new Button("광명시");
		b3.setSize(100, 30);
		b3.setLocation(60, 130);
		b3.addActionListener(this);
		
		b4 = new Button("광주시");
		b4.setSize(100, 30);
		b4.setLocation(60, 130);
		b4.addActionListener(this);
		
		b5 = new Button("고양시");
		b5.setSize(100, 30);
		b5.setLocation(60, 130);
		b5.addActionListener(this);
		
		b6 = new Button("구리시");
		b6.setSize(100, 30);
		b6.setLocation(60, 130);
		b6.addActionListener(this);
		
		b7 = new Button("김포시");
		b7.setSize(100, 30);
		b7.setLocation(60, 130);
		b7.addActionListener(this);
//8남양주시 //9동두천시 //10부천시 //11성남시 //12수원시 //13시흥시
		b8 = new Button("남양주시");
		b8.setSize(100, 30);
		b8.setLocation(60, 130);
		b8.addActionListener(this);
		
		b9 = new Button("동두천시");
		b9.setSize(100, 30);
		b9.setLocation(60, 130);
		b9.addActionListener(this);
		
		b10 = new Button("부천시");
		b10.setSize(100, 30);
		b10.setLocation(60, 130);
		b10.addActionListener(this);
		
		b11 = new Button("성남시");
		b11.setSize(100, 30);
		b11.setLocation(60, 130);
		b11.addActionListener(this);
		
		b12 = new Button("수원시");
		b12.setSize(100, 30);
		b12.setLocation(60, 130);
		b12.addActionListener(this);
		
		b13 = new Button("시흥시");
		b13.setSize(100, 30);
		b13.setLocation(60, 130);
		b13.addActionListener(this);
//14안산시 //15안성시 //16안양시 //17양주시 //18양평군 //19여주시		
		b14 = new Button("안산시");
		b14.setSize(100, 30);
		b14.setLocation(60, 130);
		b14.addActionListener(this);
		
		b15 = new Button("안성시");
		b15.setSize(100, 30);
		b15.setLocation(60, 130);
		b15.addActionListener(this);
		
		b16 = new Button("안양시");
		b16.setSize(100, 30);
		b16.setLocation(60, 130);
		b16.addActionListener(this);
		
		b17 = new Button("양주시");
		b17.setSize(100, 30);
		b17.setLocation(60, 130);
		b17.addActionListener(this);
		
		b18 = new Button("양평군");
		b18.setSize(100, 30);
		b18.setLocation(60, 130);
		b18.addActionListener(this);
		
		b19 = new Button("여주시");
		b19.setSize(100, 30);
		b19.setLocation(60, 130);
		b19.addActionListener(this);
//20오산시 //21용인시 //22이천시 //23의왕시 //24의정부시
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);
//		
//		bm1 = new Button("");
//		bm1.setSize(100, 30);
//		bm1.setLocation(60, 130);
//		bm1.addActionListener(this);

	}

	public void startFrame() {
		fc.add(b1);
		fc.add(b2);
//		fc.add(b3);
//		fc.add(b4);
//		fc.add(b5);
//		fc.add(b6);
//		fc.add(b7);
//		fc.add(b8);
//		fc.add(b9);
//		fc.add(b10);
//		fc.add(b11);
//		fc.add(b12);
//		fc.add(b13);
//		fc.add(b14);
//		fc.add(b15);
//		fc.add(b16);
//		fc.add(b17);
//		fc.add(b18);
//		fc.add(b19);
//		fc.add(b20);
//		fc.add(b21);
//		fc.add(b22);
//		fc.add(b23);
//		fc.add(b24);
//		fc.add(b25);
//		fc.add(b26);
//		fc.add(b27);
//		fc.add(b28);
		fc.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

	}

	public static void main(String[] args) {
		City c = new City();
		c.startFrame();
	}

}
