package list;

import java.awt.Frame;
import java.awt.List;  // import 잘못시키면 오류남. awt.List(O)  util.List(X)

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame("List - Select");
		f.setSize(300, 200);
		f.setLayout(null);

		List selectOne = new List(6);  //List selectOne = new List(6, false); false는 자동으로 적용되므로 적지않아도 된다.
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");

		List selectMany = new List(6, true);
		selectMany.setLocation(150, 40);
		selectMany.setSize(100, 120);
		selectMany.add("Student");
		selectMany.add("Teacher");
		selectMany.add("Driver");
		selectMany.add("Computer Programmer");
		selectMany.add("Sales Man");
		selectMany.add("Musician");
		selectMany.add("Director");

		f.add(selectOne);
		f.add(selectMany);
		f.setVisible(true);
	}
}
