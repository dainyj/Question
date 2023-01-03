package proMiddle;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import LOGIN_T.MemberVo;
import db.Mfind;
import db.MuseVo;

public class Search extends WindowAdapter implements ActionListener {
	private JFrame fsc;
	private JButton bsc;
	private JTextField tfs;
	private JTextArea ta;
	private JScrollPane sp;
	Choice group;

	Mfind mf = new Mfind();

	public Search() {
//		Frame setting
		fsc = new JFrame("MENU");
		fsc.setLayout(null);
		fsc.setSize(300, 550);
		fsc.setLocation(300, 300);
		fsc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fsc.setResizable(false);

//		TextArea setting
		ta = new JTextArea(7, 20);
		ta.setSize(230, 300);
		ta.setLocation(30, 100);
		ta.setLineWrap(true); // 자동 줄바꿈

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
		bsc.addActionListener(this);
		bsc.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));

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
			String st = tfs.getText();// 검색어 부분
			ta.append(tfs.getText() + "\n\n");
			String c = group.getItem(group.getSelectedIndex()); // sc // 콤보박스 내용 -> 스위치케이스문으로 구분 -> 쿼리문 완성
//			String str = mf.serch(c,st);
//			ta.append(str); 
//			String ssl = (String) mf.mq(c, st); //SearchSqlList
			mf.mq(c, st); // mf에 넘겨주고 sql완성
			ArrayList<MuseVo> list = mf.list();
			String strbn = "", stradd = "";
			for (int i = 0; i < list.size(); i++) {
				MuseVo data = (MuseVo) list.get(i);
				strbn = data.getBIZPLC_NM();
				stradd = data.getREFINE_ROADNM_ADDR();
				String mlist = " - " + strbn + "\n" + "      주소 : " + stradd + "\n\n";
				ta.append(mlist);

			}

//        statusLabel.setText(c); // 인터넷에서 가져온것 라벨에 세팅하는 방법
			tfs.setText(null);// 검색버튼 누르면 tf 초기화

		}
	}

	public static void main(String[] args) {
		Search s = new Search();
		s.startFrame();
	}

}
