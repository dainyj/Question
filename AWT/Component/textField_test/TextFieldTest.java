package textField_test;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TextFieldTest  {
	private Button logb;
	private TextField id, pwd, memo;

	public TextFieldTest() {
		Frame f = new Frame("Login");
//		f.addWindowListener(this);
		f.setSize(400, 300);
		f.setLayout(new FlowLayout());
		
		logb = new Button("Login");
		

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.RIGHT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');
		memo = new TextField(38);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(logb);
		f.add(memo);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) { 
		if (id.getText().equals("ABC")){
			
			
		} else {
			
		}
	}
	
//	public void windowClosing(WindowEvent e) {
//		System.exit(0);
//	}
	
	
	public static void main(String[] args) {
	TextFieldTest t = new TextFieldTest();
	}
}


// 로그인 가능하려면 로그인버튼(O), 아이디 일치하는지 비번 일치하는지 , 로그인되었습니다. 아이디가 틀렸~,비번이 틀렸~ 글자뜨게 하기