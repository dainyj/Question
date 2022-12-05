package p359;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;

		fe.water();
		car = fe;
//		car.water();
		
		fe2 = (FireEngine) car;
		fe2.water();
	}
}
