package proMiddle;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

import db.Mfind;
import db.MuseVo;
import proFront.Menu;

public class Search extends WindowAdapter implements ActionListener {
	private JFrame fsc;
	private JPanel p;
	private JButton bsc, back;
	private JTextField tfs;
	private JTextArea ta;
	private JScrollPane sp;
	private Choice group;

	Mfind mf = new Mfind();

	public Search() {
//		Frame setting
		fsc = new JFrame("MENU");
		fsc.setLayout(null);
		fsc.setSize(300, 550);
		fsc.setLocation(300, 300);
		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setResizable(false);

		p = new JPanel(); 
		p.setSize(230, 410);
		p.setLocation(30, 70);
		p.setLayout(new BorderLayout());
		
//		TextArea setting
		ta = new JTextArea();
//		ta.setSize(230, 410);
//		ta.setLocation(30, 70);
		ta.setLineWrap(true); // 자동 줄바꿈
		ta.setEditable(false); // 수정 X
		p.add(ta);
		// textArea 와 텍스트 경계 사이에 여백을 두기 위해 emptyBorder 생성
		Border emptyBorder = BorderFactory.createEmptyBorder(20, 20, 20, 20);

		// textArea 의 테두리 선의 색과 두께 설정 가능.
		Border lineBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3);
		// textArea 에 lineBorder, emptyBorder 로 구성된 복함 경계선을 설정.
		ta.setBorder(BorderFactory.createCompoundBorder(lineBorder,emptyBorder));

		
		
//		ScollPane setting
		sp = new JScrollPane();
		sp.setViewportView(ta);
//		sp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//		sp.setBounds(4, 4, 340, 330);
//		sp.setSize(20, 350);
		p.add(sp);
		
//		TextField setting
		tfs = new JTextField(20);
		tfs.setSize(100, 20);
		tfs.setLocation(90, 20);

//		Button setting
		bsc = new JButton("검색");
		bsc.setSize(60, 20);
		bsc.setLocation(200, 20);
		bsc.addActionListener(this);
		bsc.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		
		back = new JButton("뒤로");
		back.setSize(60, 18);
		back.setLocation(210, 485);
		back.addActionListener(this);
		back.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

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
		fsc.add(tfs);
		fsc.add(p);
		fsc.add(bsc);
		fsc.add(group);
		fsc.add(back);
		fsc.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("검색")) { // 한글만 입력가능
			String st = tfs.getText();// 검색어 부분
			ta.append(tfs.getText() + "\n\n");
			String c = group.getItem(group.getSelectedIndex()); // sc // 콤보박스 내용 -> 스위치케이스문으로 구분 -> 쿼리문 완성
			String ssl = mq(c,st); //SearchSqlList // sql 완성 메서드
			
			ArrayList<MuseVo> list = mf.list(ssl);
			String strbn = "", stradd = "";
			for (int i = 0; i < list.size(); i++) {
				MuseVo data = (MuseVo) list.get(i);
				System.out.println(list.get(i));
				System.out.println();
				strbn = data.getBIZPLC_NM();
				stradd = data.getREFINE_ROADNM_ADDR();
				String mlist = " - " + strbn + "\n" + "      주소 : " + stradd + "\n\n";
				System.out.println(mlist);
				ta.append(mlist);

			}

//        statusLabel.setText(c); // 인터넷에서 가져온것 라벨에 세팅하는 방법
			tfs.setText(null);// 검색버튼 누르면 tf 초기화

		}
		
		if (e.getActionCommand().equals("뒤로")) {
			fsc.setVisible(false);
			Menu.main(null);
		}
		
		
	}
	
	public String mq(String com, String sc) { //쿼리 완성 메서드
		switch (com) {
		case "기관명":
			com = "BIZPLC_NM";
			break;
		case "종류":
			com = "MUSEUM_ARTGLRY_TYPE_NM";
			break;
		case "도시":
			com = "SIGUN_NM";
			break;
		case "주소":
			com = "REFINE_ROADNM_ADDR";
			break;
		}
		String sql = "SELECT * FROM MUSEUM WHERE " + com + " LIKE '%" + sc + "%'";
		return sql;
	}

	public static void main(String[] args) {
		Search s = new Search();
		s.startFrame();
	}

}
