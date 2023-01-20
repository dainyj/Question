package proMiddle;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

import db.Execute;
import db.NoticeVo;
import db.Query;

public class Notice implements ActionListener {
	private JFrame fnote;
	private JButton bsave, bedit, bdelete, bopen;
	private JScrollPane sp;
	private JTable tb;
	DefaultTableModel model;
	private String ID;

	Query qu = new Query();
	Execute ec = new Execute();
	Write write = new Write();

	public Notice() {
		fnote = new JFrame("게시판"); // 박물관 정보 출력프레임 // 탭으로 화면 구현, DB 불러오는 방식 공부
		fnote.setLayout(null);
		fnote.setSize(600, 550);
		fnote.setLocation(600, 300);
		fnote.setResizable(false);

		String header[] = { "글번호", "제목", "글쓴이" }; //
		String contents[][] = null;// { { "1", "안녕", "나" } };
		model = new DefaultTableModel(contents, header); // 모델 생성

//		model 크기 확인
//		int a = model.getColumnCount();
//		int b = model.getRowCount();
//		System.out.println(a + " " + b);

		tb = new JTable(model); // 모델을 사용한 테이블 생성
		sp = new JScrollPane(tb); // 테이블을 스크롤패널에 추가
		sp.setSize(550, 420);
		sp.setLocation(18, 20);

//		tb.setEnabled(false); // 테이블 수정 금지// 적용하면 자료 이동이 안됨.
		tb.getTableHeader().setReorderingAllowed(false); // 테이블 컬럼 이동금지
		tb.getTableHeader().setResizingAllowed(false); // 테이블 사이즈 고정
		tb.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // 테이블 하나만 선택가능

//		테이블 가로 넓이 조절
		TableColumn col0 = tb.getColumnModel().getColumn(0);
		col0.setPreferredWidth(10);
		TableColumn col1 = tb.getColumnModel().getColumn(1);
		col1.setPreferredWidth(380);

//		테이블 내용 가운데 정렬
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
		dtcr.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcm = tb.getColumnModel();
		tcm.getColumn(0).setCellRenderer(dtcr); // 지정 열만
		tcm.getColumn(2).setCellRenderer(dtcr); // 지정 열만

		bopen = new JButton("확인");
		bopen.setSize(60, 30);
		bopen.setLocation(150, 450);
		bopen.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bopen.addActionListener(this);

		bsave = new JButton("등록");
		bsave.setSize(60, 30);
		bsave.setLocation(220, 450);
		bsave.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bsave.addActionListener(this);

		bedit = new JButton("수정");
		bedit.setSize(60, 30);
		bedit.setLocation(290, 450);
		bedit.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bedit.addActionListener(this);

		bdelete = new JButton("삭제");
		bdelete.setSize(60, 30);
		bdelete.setLocation(360, 450);
		bdelete.setFont(new Font("kopubworld", Font.ROMAN_BASELINE, 13));
		bdelete.addActionListener(this);
	}

	public void startFrame() {
		fnote.add(sp, new BorderLayout());
		fnote.add(bopen);
		fnote.add(bsave, new BorderLayout());
		fnote.add(bedit, new BorderLayout());
		fnote.add(bdelete, new BorderLayout());
		list();
		fnote.setVisible(true);

	}

//		게시판 화면에 등록된 글 나오도록 설정 수정
	public void list() {
		ec.connDB();
		String sql = qu.notice();
		ArrayList<NoticeVo> noticelist = ec.notice(sql);
		String list[] = new String[noticelist.size() * 3];
//		System.out.println("게시글 수 : " + noticelist.size());
//		System.out.println("배열 길이 : " + list.length);
		for (int i = 0; i < noticelist.size(); i++) {
			NoticeVo data = (NoticeVo) noticelist.get(i);
			list[0] = data.getNUM();
			list[1] = data.getTITLE();
			list[2] = data.getID();
			model.addRow(list);
			System.out.println(list);
		}

	}

	public void setID(String ID) {
		this.ID = ID;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Notice notice = new Notice();
		write.setID(ID);
		notice.setID(ID);
		ec.connDB();

		if (e.getActionCommand().equals("확인")) {
			System.out.println("확인");
			int selectRow = tb.getSelectedRow();
			String title = (String) tb.getValueAt(selectRow, 1);
			String num = (String) tb.getValueAt(selectRow, 0);
//			write.setID(ID);
			write.check(num, title);

		}

		if (e.getActionCommand().equals("등록")) {
//			새로운 창 열림 거기서 작성 및 수정
			write.setID(ID);
			write.startFrame();
			fnote.setVisible(false);
		}
		
		
		/* 공부 꼭 필요 >구글링한 정보
		 * 클래스의 trace가 없는 라이브러리에서 발생한 AWT-EventQueue의 OutOfBounds 익셉션의 경우 대부분 개발자가 작성한
		 * 코드에서의 화면 갱신이 AWT 이벤트 디스페칭 쓰레드 타지 않고, 비동기적으로 실행하기 때문에 발생한 동기화의 문제에서 야기된다. 이
		 * 문제는 TableModel.addRow(Object[] row)/removeRow(int i), ,
		 * Component.getComponentAt(int i)등에서 자주 발생하며, 동시 다발적으로 발생하는 경우가 많아서 로컬시스템에 많은
		 * 부하를 준다. 이런 경우SwingUtilities.invokeLater(또는 invokeAndWait, 응답 지연이 다소 발생하는 경우
		 * invokeAndWait를 사용하면, 응답을 기다리지 않고, 바로 리턴 한다.)를 사용하면, 대부분 해결 되고, 화면 갱신의 따른 깜빡
		 * 거림도 없이 부드럽게 넘어간다. 테이블의 removeRow 와 addRow가 빈번히 발생하는 곳에서는 invokeLater를 사용하면, 큰
		 * 효과를 볼 수 있다.
		 * <Sample Code>

DefaultTableModel model = new DefaultTableModel();
 
// model.addRow(row);
Runnable doAddRow = nwe Runnable() {
     public void run() {
         model.addRow(row);
     }
};
SwingUtilities.invokeLater(doAddRow);
 
// while(model.getRowCount() > 0) {
//       model.removeRow( model.getRowCount() - 1 );
// }
Runnable doRemoveRow = nwe Runnable() {
     public void run() {
         while(model.getRowCount() > 0) {
           model.removeRow( model.getRowCount() - 1 );
         }
     }
};
SwingUtilities.invokeLater(doRemoveRow);
		 * 
		 */		
		if (e.getActionCommand().equals("수정")) { // 동기 비동기 나중에 배우면 다시 확인하기, 
			int selectRow = tb.getSelectedRow();
			String selectId = (String) tb.getValueAt(selectRow, 2);
			String writingtitle = (String) tb.getValueAt(selectRow, 1);
			if (selectId.equals(ID)) {
				fnote.setVisible(false);
//				System.out.println("match");
				write.setID(ID);
				write.edit(writingtitle);
			} else {
				JOptionPane.showMessageDialog(null, "수정할 수 없습니다. 다시 선택하세요.");
			}
		}

		if (e.getActionCommand().equals("삭제")) {
			
			int selectRow = tb.getSelectedRow();
			String selectId = (String) tb.getValueAt(selectRow, 2);
			String writingNum = (String) tb.getValueAt(selectRow, 0);
			String writingtitle = (String) tb.getValueAt(selectRow, 1);
			String writingID = (String) tb.getValueAt(selectRow, 2);
			if (selectId.equals(ID)) {
//				System.out.println("match");
				fnote.setVisible(false);
				String sql = qu.noticeDelete(writingNum, writingtitle, writingID);
//				System.out.println("sql 실행전 : " + sql);
				ec.runQuery(sql);
				write.setID(ID);
				notice.setID(ID);
				notice.startFrame();
			} else {
				JOptionPane.showMessageDialog(null, "삭제할 수 없습니다. 다시 선택하세요.");
			}
		}
	}

	public static void main(String[] args) {
		Notice note = new Notice();
		note.startFrame();
		System.out.println();
	}

}
