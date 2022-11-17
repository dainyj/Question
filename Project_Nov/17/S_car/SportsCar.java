package S_car;

public class SportsCar extends Car {
	public void speedUp() {
		speed += 10;
	}

//	public void stop() {
//		System.out.println("SportsCar를 멈춤");  // Car에서 final로 했기에 여기서 오류남.
//		speed = 0;
//	}
}
