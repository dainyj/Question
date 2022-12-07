package choice;

import java.awt.Choice;
import java.awt.Frame;
//import java.awt.event.WindowEvent;

public class ChoiceTest {

//	public void windowClosing(WindowEvent e) { // 화면 종료메서드
//		System.exit(0);
//	}	
	
	public static void main(String[] args) {
		Frame f = new Frame("Choice - Select");
		f.setSize(300, 200);
		f.setLayout(null);
//		f.addWindowListener();// 이거 적용방법 생각해보기

		Choice day = new Choice();
		day.add("SUN");
		day.add("MON");
		day.add("TUE");
		day.add("WED");
		day.add("THU");
		day.add("FRI");
		day.add("SAT");

		day.setSize(100, 50);
		day.setLocation(100, 70);

		f.add(day);
		f.setVisible(true);
	}
}
