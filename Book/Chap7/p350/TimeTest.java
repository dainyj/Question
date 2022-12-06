package p350;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(12,35,50);
		System.out.println(t);
//		t.hour = 13; //private인 변수는 못씀.
		t.setHour(t.getHour()+1);
		System.out.println(t); //System.out.println(t.toString());과 같다.
	}
}
