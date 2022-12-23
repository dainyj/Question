package dialog;

//import java.awt.Button;
//import java.awt.Dialog;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.Label;
// 
////원래 코드
//public class DialogTest {
//    public static void main(String[] args) {
//        Frame f = new Frame("Parent");
//        f.setSize(300, 200);
// 
//        Dialog info = new Dialog(f, "Information", true);
//        info.setSize(140, 90);
//        info.setLocation(50, 50);
//        info.setLayout(new FlowLayout());
// 
//        Label msg = new Label("This is modal Dialog", Label.CENTER);
//        Button ok = new Button("OK");
//        info.add(msg);
//        info.add(ok);
// 
//        f.setVisible(true);
//        info.setVisible(true);
//    }
//}

// OK버튼 클릭하면 종료되도록 만들어보기
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter implements ActionListener {
	private Button ok;
	private Frame f;
	private Label msg;
	private Dialog info;

	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(400,400);
		f.setLocation(300, 300);

		info = new Dialog(f, "Infomation", true); // modal 설정 true/false
		info.setSize(140, 90);
		info.setLocation(300, 300);
		info.setLayout(new FlowLayout());

		msg = new Label("This id monal Dialog", Label.CENTER);
		ok = new Button("OK");
		ok.addActionListener(this);
		f.addWindowListener(this);

		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);

	}

	public static void main(String[] args) {
		new DialogTest();

	}

	public void windowClosing(WindowEvent e) {// 시스템 창 종료
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("OK")) {
//			System.exit(0);//전체 화면이 종료된다.
			info.dispose(); // info창만 종료
		}
	}
}
