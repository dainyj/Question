package proMiddle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Search extends WindowAdapter implements ActionListener {
	private JFrame fsc;
	private JButton bsc;
	private JTextField tfs;
	private JTextArea ta;
	private JScrollPane sp;
	Choice group;

	public Search() {
//		Frame setting
		fsc = new JFrame("MENU");
		fsc.setLayout(null);
		fsc.setSize(300, 550);
		fsc.setLocation(300, 300);
		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setResizable(false);
		fsc.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));

//		TextArea setting
		ta = new JTextArea(7, 20);
		ta.setSize(230, 300);
		ta.setLocation(30, 100);

//		ScollPane setting
		sp = new JScrollPane();
		sp.setViewportView(ta);

//		TextField setting
		tfs = new JTextField(20);
		tfs.setSize(100, 20);
		tfs.setLocation(90, 20);

//		Button setting
		bsc = new JButton("검색");
		bsc.setSize(60, 20);
		bsc.setLocation(200, 20);
		bsc.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
//======================================== 엔터키로 동작=======================		
//		Container c = getContentPane(); // extends JFrame을 해줘야 사용 가능.
//		c.setLayout(new FlowLayout());
//		c.add(new JScrollPane(ta));
//
//		tfs.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JTextField t = (JTextField)e.getSource();
//				ta.append(t.getText() + "\n"); 
//				t.setText(""); 
//			}
//		});
//		c.setSize(300,300);
//=============================================================================

//		초이스? 콤보박스? setting
		group = new Choice();
		group.add("기관명");
		group.add("종류");
		group.add("도시");
		group.add("주소");
		group.setSize(60, 20);
		group.setLocation(20, 18);

	}

	public void startFrame() {
		fsc.add(new JLabel("입력"));
		fsc.add(tfs);
		fsc.add(ta);
		fsc.add(bsc);
		fsc.add(group);
		fsc.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("검색")) { // 한글만 입력가능 
		String st = tfs.getText();// 이거 쿼리에 넣을거
//			ta.append(tfs.getText() + "\n");
		System.out.println(st);
			tfs.setText(null);// 검색버튼 누르면 tf 초기화

//		bsc.addMouseListener(new MouseAdapter() {
//			public void mouseClicked(MouseEvent e) { // 버튼 클릭시 쿼리 실행
//				c.cquery(st);
//			}
//		});
		}

	}

	public static void main(String[] args) {
		Search s = new Search();
		s.startFrame();
	}

}
