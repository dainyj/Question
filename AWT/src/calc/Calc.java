package calc;

//cal칸에 숫자 기호가 남아있을 수 있게 하는 법?
// 숫자 문자로 구분해서 계산까지
// 숫자 기호 숫자 

import java.awt.BorderLayout;

// 10:bAdd, 11:bDiv, 12:bMin, 13:bMul

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calc extends WindowAdapter implements WindowListener, ActionListener {
	private Frame f;
	private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, ad, min, mul, div, C, ca;
	private TextField cal,num;
	private Panel p;
	
	public Calc() {
		f = new Frame("Calculator");
		p = new Panel();
		
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		ad = new Button("+");
		min = new Button("-");
		mul = new Button("x");
		div = new Button("/");
		C = new Button("초기화");
		ca = new Button("=");
		
		cal = new TextField(35);
		num = new TextField(35);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		ad.addActionListener(this);
		min.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		C.addActionListener(this);
		ca.addActionListener(this);
		
		TextField t = new TextField();
		t.setEditable(false); // 편집불가설정
		t.setFocusable(false);
	
//		Button button[] = new Button[12];
//		for(int i= 0; i<9;i++) {
//			button[i]= ;
//		}
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f.addWindowListener(this);
		p.setBackground(Color.DARK_GRAY);
		
		f.add(cal,BorderLayout.NORTH);
		p.add(num);
		p.add(b1); p.add(b2); p.add(b3); p.add(b4);	p.add(b5); p.add(b6); p.add(b7); p.add(b8); p.add(b9);
		f.add(ad);
		ad.setSize(30,30);
		ad.setLocation(40,125);
		f.add(min);
		min.setSize(30,30);
		min.setLocation(90,125);
		f.add(mul);
		mul.setSize(30,30);
		mul.setLocation(140,125);
		f.add(div);
		div.setSize(30,30);
		div.setLocation(190,125);
		f.add(ca);
		ca.setSize(30,30);
		ca.setLocation(240,125);
		
		f.add(p, BorderLayout.CENTER);
		f.add(C,BorderLayout.SOUTH);
		
		f.setSize(300,200);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		String str = null;
		if(e.getActionCommand().equals("1")) {
			str=cal.getText();
			cal.setText(str+"1");
			num.setText("1");
		} else if(e.getActionCommand().equals("2")) {
			str=cal.getText();
			cal.setText(str+"2");
			num.setText("2");
		} else if(e.getActionCommand().equals("3")) {
			str=cal.getText();
			cal.setText(str+"3");
			num.setText("3");
		} else if(e.getActionCommand().equals("4")) {
			str=cal.getText();
			cal.setText(str+"4");
			num.setText("4");
		} else if(e.getActionCommand().equals("5")) {
			str=cal.getText();
			cal.setText(str+"5");
			num.setText("5");
		} else if(e.getActionCommand().equals("6")) {
			str=cal.getText();
			cal.setText(str+"6");
			num.setText("6");
		} else if(e.getActionCommand().equals("7")) {
			str=cal.getText();
			cal.setText(str+"7");
			num.setText("7");
		} else if(e.getActionCommand().equals("8")) {
			str=cal.getText();
			cal.setText(str+"8");
			num.setText("8");
		} else if(e.getActionCommand().equals("9")) {
			str=cal.getText();
			cal.setText(str+"9");
			num.setText("9");
		}
		
		if(e.getActionCommand().equals("+")) {
			str=cal.getText();
			cal.setText(str + "+");
		}
		if(e.getActionCommand().equals("-")) {
			str=cal.getText();
			cal.setText(str + "-");
		}
		if(e.getActionCommand().equals("x")) {
			str=cal.getText();
			cal.setText(str + "*");
		}
		if(e.getActionCommand().equals("/")) {
			str=cal.getText();
			cal.setText(str + "/");
		}
		if(e.getActionCommand().equals("=")) {
			str=cal.getText();
			
			System.out.println(str);
		}
		
		
		if(e.getActionCommand().equals("초기화")) {
			cal.setText(" ");
			num.setText(" ");
		}

		
	}
	
	public static void main(String[] args) {
		Calc c = new Calc();
		c.startFrame();
		
	}// mend

}//
