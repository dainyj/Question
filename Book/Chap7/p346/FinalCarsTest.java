package p346;

public class FinalCarsTest {

	public static void main(String[] args) {
		Card c = new Card();
//		c.NUMBER=5; //NUMBER가 final이므로 변경불가 
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c); //System.out.println(c.toString());
		//object class 
	}

}
