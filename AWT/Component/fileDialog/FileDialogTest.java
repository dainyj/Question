package fileDialog;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogTest extends WindowAdapter {

	
//	public FileDialogTest() {
//		
//	}
//	
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		FileDialog fileOpen = new FileDialog(f, "File Open", FileDialog.LOAD);

		f.setVisible(true);
		fileOpen.setDirectory("C:\\Windows");
		fileOpen.setVisible(true);
//		f.addWindowListener(this);
		System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
	}
	
//	public void windowClosing(WindowEvent e) {// 시스템 창 종료
//		System.exit(0);
//	}
}
