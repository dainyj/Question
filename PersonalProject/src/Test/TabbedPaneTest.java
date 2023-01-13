package Test;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class TabbedPaneTest extends JFrame {
	public TabbedPaneTest() {

		JTabbedPane tabbedPane = new JTabbedPane(); // <--- 탭에 맞는 모양을 만들어야함.

//tab1
//tab1화면을 가지고 있는 JPanel[tab1]객체 생성
		Tab1 tab1 = new Tab1(); // <--------탭 객체 생성 탭에 쓰여질 객체를 생성
		tabbedPane.add("Gender", tab1); // 탭에 쓰여질 글씨, 클래스

//Tab2
		Tab2 tab2 = new Tab2();
		tabbedPane.add("IMAGE", tab2);// 탭 이름이 IMAGE, 이에 의한 패널은 tab2클래스를 가져옴

//프레임에 TabbedPane을 붙이기
		add(tabbedPane, BorderLayout.CENTER); // 안붙여도 원래 가능함

		setTitle("TabbedPaneTest");
		setBounds(350, 100, 350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}// 생성자

//이너클래스 
	class Tab1 extends JPanel {
		public Tab1() {
			JLabel label = new JLabel("what's your Gender?"); // <---레이블 생성하고
			JRadioButton rb1 = new JRadioButton("MALE"); // <---- 버튼 이름 생성하고
			JRadioButton rb2 = new JRadioButton("FEMALE");
			ButtonGroup rg = new ButtonGroup(); // <--- radio니까 group사용해서 하나로 묶고
			rg.add(rb1);
			rg.add(rb2);

//Tab1패널에 컴포넌트 붙이기!!
			add(label); // <---- 프레임에 what's your Gender? MALE FEMALE 을 생성
			add(rb1);
			add(rb2);

			rb1.addActionListener(listener); // <----리스너를 붙여서 눌렀을때 이벤트가 생성하도록 마든다.
			rb2.addActionListener(listener); // 레디오버튼 누르면 리스너 클래스로 들어간다.
		}// Tab1의 생성자

//Tab1클래스의 이너클래스
		ActionListener listener = new ActionListener() {// <--- MALE을 눌렀을 때 발생하는 이벤트는 여기서 실행
			@Override
			public void actionPerformed(ActionEvent e) {
//클릭한  RadioButton에 써있는 글씨 얻어오기!
				String str = e.getActionCommand(); // <- 선택된 MALE을 Str로 옮겨줆.

//Dialog로 선택된 값을 사용자에게 알림.
//Dialog객체는 new키워드로 생성하지 않음.
//Dialog객체로 만들어주는 전용클래스가 존재함.[JOptionPane클래스]
//그 전용클래스의 static 메소드들을 이용하면 Dialog을 보여줄 수 있음.
//클래스. 사용하면 static을 이용하겠다는 의미.
				JOptionPane.showMessageDialog(TabbedPaneTest.this, str + "를 선택했습니다"); // <- 새롭게 창이 뜨는 기술

//여기서 this만 사용하면 익명클래스를 의미함.(ActionListener listener)  - 이 안에 있기때문에. 
//그래서 TabbedPaneTest.this를 해야 TabbedPaneTest 클래스를 의미함 
			}
		};
	}// Tab1이너클래스

//Tab2 화면을 가진 JPanel클래스
	class Tab2 extends JPanel { // <---패널을 상속받음
		public Tab2() {
			ImageIcon icon = new ImageIcon("images/ms_02.png");
			icon = new ImageIcon(icon.getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH));
			JLabel imgLabel = new JLabel(icon); // <----레이블에 리사이즈된 이미지가 들어가게 됨.

//Tab패널에 이미지 추가
			add(imgLabel); // <-- frame에 붙임.
		}
	}

	public static void main(String[] args) {
		new TabbedPaneTest();
	}
}