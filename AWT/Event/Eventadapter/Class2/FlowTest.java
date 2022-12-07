package Eventadapter.Class2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest extends WindowAdapter {
	private Frame frame;
	private Button button1, button2, button3;
	
	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("OK");
		button2 = new Button("Open");
		button3 = new Button("Close");
			
	}
	
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
//	public void startFrame() {
//		frame.addWindowListener(this);
//		frame.setLayout(new FlowLayout()); // frame의 디폴드 레이아웃은 보더레이아웃이므로 직접 다른 레이아웃으로 지정.
//		
//		frame.add(button1);
//		frame.add(button2);
//		frame.add(button3);
//		frame.setSize(300,300);
//		frame.setVisible(true);
//	}
	
	public void startFrame() { // frame의 레이아웃을 디폴트 그래도 놔둘 때, 일일이 버튼의 크기, 위치를 직접 지정해야한다.
		frame.addWindowListener(this);
//		frame.setLayout(new FlowLayout()); 
		frame.setLayout(null); 
		
		button1.setSize(50,50);
		button1.setLocation(10,30);
		frame.add(button1);
		
		button2.setSize(50,50);
		button2.setLocation(70,30);
		frame.add(button2);
		
		button3.setSize(50,50);
		button3.setLocation(130,30);
		frame.add(button3);
		
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	
	
	
	
	public static void main(String[] args) {
		FlowTest g = new FlowTest();
		g.startFrame();
	}
}
