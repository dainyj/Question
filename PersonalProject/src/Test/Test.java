package Test;
//package db;
//
//import java.awt.BorderLayout;
//
//import javax.swing.*;
//
//public class Test { // 실행 클래스
//	private JFrame f;
//	private JPanel p;
//	private JTextArea ta;
//	private JScrollPane sp;
//
//	public Test() {
//		f = new JFrame("TEST");	
//		f.setLayout(null);
//		f.setSize(300, 550);
//		f.setLocation(300, 300);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setResizable(false);
//		
//		p = new JPanel();
//		p.setSize(230, 410);
//		p.setLocation(30, 70);
//		p.setLayout(new BorderLayout());
//		
//		ta = new JTextArea();
//		ta.setLineWrap(true); // 자동 줄바꿈
//		ta.setEditable(false); // 수정 X
//		p.add(ta);
//		
//		sp = new JScrollPane();
//		sp.setViewportView(ta);
//		p.add(sp);
//	}
//
//	public void startFrame() {
//		f.add(p);
//		f.setVisible(true);
//	}
//
//	public void taAppend(String a) {
//		ta.append(a);
//	}
//	
//	public static void main(String[] args) {
//		Test t = new Test();
//		Query qu = new Query();
//		Execute ec = new Execute();
//		String[]list =ec.printResult(qu.allQuery());
//		for(int i=0; i<list.length;i++) {
//			t.taAppend(list[i]);
//		}
//	}
//}
