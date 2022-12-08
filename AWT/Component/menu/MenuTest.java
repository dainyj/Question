package menu;

import java.awt.CheckboxMenuItem;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest extends WindowAdapter {
	private Frame f;
	private static MenuBar mb;
	
	public MenuTest() {
		f = new Frame("Parent");
		f.setSize(400, 200);
		mb = new MenuBar();
		f.setMenuBar(mb);
		f.setVisible(true);
		f.addWindowListener(this);

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("열기(O)")) {
			FileDialog fo = new FileDialog(f,"File Open", FileDialog.LOAD);
			fo.setDirectory("C:\\Windows");
			fo.setVisible(true);
		}
		
		if(e.getActionCommand().equals("끝내기(X)")) {
			System.exit(0);
		}
	}
	
	public void windowClosing(WindowEvent e) {// 시스템 창 종료
		System.exit(0);
	}

	public static void main(String[] args) {
		
		MenuTest m = new MenuTest();
		
		Menu mFile = new Menu("파일(F)"); // 화면에 바로 보이는 메뉴
		MenuItem mi1 = new MenuItem("새로 만들기(N)");
		MenuShortcut mn = new MenuShortcut(KeyEvent.VK_N);// 우측 단축키
		mi1.setShortcut(mn);
		
		MenuItem mi2 = new MenuItem("새 창(W)");
		MenuShortcut ma = new MenuShortcut(KeyEvent.VK_SHIFT);
		mi2.setShortcut(ma);
		
		MenuItem mi3= new MenuItem("열기(O)");
		MenuShortcut mo = new MenuShortcut(KeyEvent.VK_O);
		mi3.setShortcut(mo);
		
		MenuItem mi4= new MenuItem("저장(S)");
		MenuShortcut ms = new MenuShortcut(KeyEvent.VK_S);
		mi4.setShortcut(ms);
		
		MenuItem mi5 = new MenuItem("다른 이름으로 저장(A)");
		MenuShortcut ms2 = new MenuShortcut(KeyEvent.VK_SHIFT);
		mi5.setShortcut(ms2);
		
		MenuItem mi6 = new MenuItem("페이지 설정(U)");
		
		MenuItem mi7 = new MenuItem("인쇄(T)");
		MenuShortcut mp = new MenuShortcut(KeyEvent.VK_P);
		mi7.setShortcut(mp);
		
		MenuItem mi8 = new MenuItem("끝내기(X)");
		
		mFile.add(mi1);
		mFile.add(mi2);
		mFile.add(mi3);
		mFile.add(mi4);
		mFile.add(mi5);
		mFile.addSeparator();
		mFile.add(mi6);
		mFile.add(mi7);
		mFile.addSeparator();
		mFile.add(mi8);
		
		Menu mEdit = new Menu("편집(E)");//
		MenuItem mi9 = new MenuItem("실행 취소(U)");
		MenuItem mi10= new MenuItem("잘라내기(T)");
		MenuItem mi11= new MenuItem("복사(C)");
		MenuItem mi12= new MenuItem("붙여넣기(P)");
		MenuItem mi13 = new MenuItem("삭제(L)");
		MenuItem mi14 = new MenuItem("Bing으로 검색(S)...");
		MenuItem mi15 = new MenuItem("찾기(F)");
		MenuItem mi16 = new MenuItem("다음 찾기(N)");
		MenuItem mi17 = new MenuItem("이전 찾기(V)");
		MenuItem mi18 = new MenuItem("바꾸기(R)...");
		MenuItem mi19 = new MenuItem("이동(G)...");
		MenuItem mi20 = new MenuItem("모두 선택(A)");
		MenuItem mi21 = new MenuItem("시간/날짜(D)");
		
		mEdit.add(mi9);
		mEdit.addSeparator();
		mEdit.add(mi10);
		mEdit.add(mi11);
		mEdit.add(mi12);
		mEdit.add(mi13);
		mEdit.addSeparator();
		mEdit.add(mi14);
		mEdit.add(mi15);
		mEdit.add(mi16);
		mEdit.add(mi17);
		mEdit.add(mi18);
		mEdit.add(mi19);
		mEdit.addSeparator();
		mEdit.add(mi20);
		mEdit.add(mi21);
		
		Menu mform = new Menu("서식(O)");
		
		CheckboxMenuItem mi22 = new CheckboxMenuItem("자동 줄 바꿈(W)");
		MenuItem mi23 = new MenuItem("글꼴(F)");
		
		mform.add(mi22);
		mform.add(mi23);
		
		
		Menu mView = new Menu("보기(V)");
		Menu mOthers = new Menu("확대하기/축소하기");
		CheckboxMenuItem mi24 = new CheckboxMenuItem("상태 표시줄(S)");
		
		mView.add(mOthers);
		mOthers.add("확대(I)");
		mOthers.add("축소(O)");
		mOthers.add("확대하기/축소하기 기본값 복원");
		
		mView.add(mi24);
		
		Menu mHelp = new Menu("도움말(H)");
		MenuItem mi25 = new MenuItem("도움말 보기(H)");
		MenuItem mi26 = new MenuItem("피드백 나누기(F)");
		MenuItem mi27 = new MenuItem("메모장 정보(A)");
		
		mHelp.add(mi25);
		mHelp.add(mi26);
		mHelp.addSeparator();
		mHelp.add(mi27);
		
		
//		MenuItem mi = new MenuItem("()");
//		m.add(mi);
//		m.addSeparator();
//		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar"); //체크박스
//		mView.add(miStatusbar);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mform);
		mb.add(mView);
		mb.setHelpMenu(mHelp);
		


	}

}
