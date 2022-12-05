package p368;

class Product {
	int price; // 제품가격
	int bonusPoint; // 제품 구매시 제공하는 보너스점수

	Product(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0); // 보너스 점수는 가격의 10%
	}
}

class Tv extends Product {
	Tv() {
//		부모클래스의 생성자 Product(int price)를 호출
		super(100); // Tv가격은 100만원
	}

//	Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}

class Buyer { // 고객
	int money = 1000; // 소유금액
	int bonusPoint = 0;
	Product[] item = new Product[10];
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;

		}
		money -= p.price; // 구매금액 마이너스
		bonusPoint += p.bonusPoint; // 포인트 추가
		item[i++] = p;
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총 금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();

		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();

//		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
//		System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다.");
	}

}