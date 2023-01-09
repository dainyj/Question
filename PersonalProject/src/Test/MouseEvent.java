package Test;

import java.awt.event.MouseListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MouseEvent extends JFrame implements MouseListener {
	private JFrame f;
	private JButton b;
	private JTextField tf;
	private JTable tb;

	String prog_NM = "";

	public MouseEvent() {
		f = new JFrame();
		f.setLayout(null);
		f.setSize(400, 300);
		f.setLocation(300, 300);

		b = new JButton();
		b.setSize(20, 20);
		b.setLocation(170, 150);

		tf = new JTextField();
		tf.setSize(100, 30);
		tf.setLocation(130, 100);
		
		
		f.addMouseListener(this);
		
		
		
		
		
	}

	public void startFrame() {
		f.add(tf);
		f.add(b);
		f.setVisible(true);
		
	}


	

	public static void main(String[] args) {
		MouseEvent m = new MouseEvent();
		m.startFrame();

	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent e) {
		if(e.getClickCount()==2) {
			System.out.println("ok");
		}
		
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent e) {//마우스가 눌린 상태
		// TODO Auto-generated method stub
		System.out.println("1111111");
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent e) { // 버튼 클릭 상태의 마우스에서 손 땠을 때 
		// TODO Auto-generated method stub
		System.out.println("2222222");
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent e) { // 마우스가 지정범위 안에 있을 때, 지정범위 = 프레임 안, 버튼 /tf 제외
		// TODO Auto-generated method stub
		System.out.println("33333333");
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent e) { // 마우스가 지정범위 밖에 있을때
		// TODO Auto-generated method stub
		System.out.println("44444444444");
	}

}
