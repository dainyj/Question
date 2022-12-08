package calc2;
//버튼 배열 만들기 연습
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

public class Main {
	private Button[] b = new Button[15];
	private TextField cal, num;
	
	public Main() {
		String[] bname = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "x", "/", "=", "초기화" };
		for (int i = 0; i < bname.length; i++) {
			b[i] = new Button(bname[i]);
			System.out.println(b[i]);
		}
		
		cal = new TextField(35);
		num = new TextField(35);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		int res = 0;
		char a = '\0';
		String str = null;
		
		
		
		
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
		str = cal.getText();
		cal.setText(str + "+");
		res = Integer.parseInt(str);
		str = null;
		a = '+';
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
		str = null;
		a = '/';
	}

	if (e.getActionCommand().equals("=")) {
		str = cal.getText();
		int ult = Integer.parseInt(str);
		if (a == '+') {
			int result = res + ult;
			String s = Integer.toString(result);
			cal.setText(s);
		}
	}

	if (e.getActionCommand().equals("초기화")) {
		cal.setText(" ");
		num.setText(" ");
	}
}

	public static void main(String[] args) {
		Main m = new Main();
	}

}
