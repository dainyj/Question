package runanimal;

public class RunningAnimal {
	public static void main(String[] args) {
		Animal ani1 = new Animal();
//		ani1.name = "Cat";
		ani1.setName("Cat2");
		ani1.age = 10;

//		System.out.println(ani1.name);
		System.out.println(ani1.getName());
		System.out.println(ani1.age);

		Animal ani2 = new Animal();
//		ani2.name = "Dog";
		ani2.setName("Dog2");
		ani2.age = 15;

//		System.out.println(ani2.name);
		System.out.println(ani2.getName());
		System.out.println(ani2.age);
	}

}
