package p237;
import java.util.Scanner;

class Tv {
//	멤버변수
	String color;
	boolean power;
	int channel;

//	메서드
	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}

	public void chch(int n) {
		channel = n;
		System.out.println("channel값은 " + n + "입니다.");
	}

}

public class TvTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
//		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
//			System.out.println(num);
//		}
		sc.close();

		Tv channel = new Tv();
		channel.chch(num);

//		Tv t1= new Tv();
//		Tv t2 =new Tv();
//		System.out.println("t1의 channel값은 "+t1.channel+"입니다.");
//		System.out.println("t2의 channel값은 "+t2.channel+"입니다.");		

	}// main end

}
