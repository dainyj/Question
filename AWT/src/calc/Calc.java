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
	private Button[] b = new Button[15];
	private TextField cal, num;
	private Panel p;

	public Calc() {
		f = new Frame("Calculator");
		p = new Panel();
		String[] bname = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "x", "/", "=", "초기화" };
		for (int i = 0; i <bname.length;i++) {
			b[i]= new Button(bname[i]);
//			b[i] = new Button(Integer.toString(i));
//			p.add(b[i]);// 패널에 숫자버튼 추가
		}

		cal = new TextField(35);
		num = new TextField(35);

		for (int i = 0; i < b.length; i++) {
			b[i].addActionListener(this);
		}

		TextField t = new TextField();
		t.setEditable(false); // 편집불가설정
		t.setFocusable(false);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void startFrame() {
		f.addWindowListener(this);
		p.setBackground(Color.DARK_GRAY);
		f.add(cal, BorderLayout.NORTH);
		p.add(num);

		for (int i = 0; i < 9; i++) { //패널에 버튼 추가 
			p.add(b[i]);
		}

		for (int i = 9, j = 0; i < 14; i++, j += 50) {
			f.add(b[i]);
			b[i].setSize(30, 30);
			b[i].setLocation(35 + j, 125);
		}
		f.add(p, BorderLayout.CENTER);
		f.add(b[14], BorderLayout.SOUTH);

		f.setSize(300, 200);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int res = 0;
		char a = '\0';
		String str = null;
//		for (int i = 0; i < b.length; i++) {
//			if (e.getActionCommand().equals("b[i]") && i < 9) {
//				str = cal.getText();
//				cal.setText(str + "b[i]");
//				num.setText("b[i]");

//			} else if (e.getActionCommand().equals("b[i]") && i >= 9 && i < 14) {
//				str = cal.getText();
//				cal.setText(str + b[i]);
//				res = Integer.parseInt(str);
//				str = null;
//				
//			} 
//				else if (e.getActionCommand().equals("b[14]")) {
//				cal.setText(" ");
//				num.setText(" ");
//			}
//			}
		
		
//		숫자 입력 -> n1에 저장. 단, IntegerParseInt(); 문자->숫자로 변환하여 저장.
//		기호 입력 -> 액션커맨드 이퀄스로 비교 +-*/. 그 다음은??????
//		숫자 입력 

		if(e.getActionCommand().equals("1")) {
			str=cal.getText();
			cal.setText(str+"1");
			num.setText("1");
		} 
		if(e.getActionCommand().equals("2")) {
			str=cal.getText();
			cal.setText(str+"2");
			num.setText("2");
		}
		if(e.getActionCommand().equals("3")) {
			str=cal.getText();
			cal.setText(str+"3");
			num.setText("3");
		} 
		if(e.getActionCommand().equals("4")) {
			str=cal.getText();
			cal.setText(str+"4");
			num.setText("4");
		}
		if(e.getActionCommand().equals("5")) {
			str=cal.getText();
			cal.setText(str+"5");
			num.setText("5");
		}
		if(e.getActionCommand().equals("6")) {
			str=cal.getText();
			cal.setText(str+"6");
			num.setText("6");
		}
		if(e.getActionCommand().equals("7")) {
			str=cal.getText();
			cal.setText(str+"7");
			num.setText("7");
		}
		if(e.getActionCommand().equals("8")) {
			str=cal.getText();
			cal.setText(str+"8");
			num.setText("8");
		}
		if(e.getActionCommand().equals("9")) {
			str=cal.getText();
			cal.setText(str+"9");
			num.setText("9");
		}

			if (e.getActionCommand().equals("+")) {
				String fn = cal.getText();
				str = cal.getText();
				cal.setText(str + "+");
				res = Integer.parseInt(str);
				str ="0";				
				a = '+';
//				System.out.println(str);
			}
			if (e.getActionCommand().equals("-")) {
				str = cal.getText();
				cal.setText(str + "-");
				res = Integer.parseInt(str);
				str = null;
				a = '-';
			}
			if (e.getActionCommand().equals("x")) {
				str = cal.getText();
				cal.setText(str + "x");
				res = Integer.parseInt(str);
				str = null;
				a = '*';
			}
			if (e.getActionCommand().equals("/")) {
				str = cal.getText();
				cal.setText(str + "/");
				res = Integer.parseInt(str);
				a = '/';
				str = null;
			}

			if (e.getActionCommand().equals("=")) {
				str = cal.getText();
				System.out.println(str);
				int ult = Integer.parseInt(str); // str에 앞부분 전부가 나와서 안됨.
				if (a == '+') {
					int result = res + ult;
					cal.setText(result+"");
				}
			}

			if (e.getActionCommand().equals("초기화")) {
				cal.setText(" ");
				num.setText(" ");
			}
		}
	

	public static void main(String[] args) {
		Calc c = new Calc();
		c.startFrame();

	}// mend
}//
