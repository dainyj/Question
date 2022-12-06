package clone_deep;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	protected Object clone() throws CloneNotSupportedException {
		Member cloned = (Member) super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);  //주석처리하면 얕은 복제가 된다, 깊은 복제를 위한 추가
		cloned.car = new Car(this.car.model);  //주석처리하면 얕은 복제가 일어남, 깊은 복제를 위한 추가
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;

		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {

		}
		return cloned;
	}

}
