package test9;

public class Student extends Person {
	private int java, html, sum;

	public Student() {
		super();
		java = 100;
		html = 50;
		sum = java + html;
	}

	public Student(int java, int html, int sum) {
		this.java = java;
		this.html = html;
		this.sum = sum;
	}

	public int getSum() {
		return sum;
	}

	public void infoPrint() {
//		super.infoPrint();
		System.out.println("Java : " + java);
		System.out.println("Html : " + html);
		System.out.println("합계 : " + sum);
	}

	
	public static void studentSort(Student[] stu, int length, Person[] p) {
		Student[] stuArr = new Student[length];
		Person[] person = new Person[length];
		int num[] = new int[stu.length];
		for (int i = 0; i < length; i++) {
			person[i] = p[i];
			stuArr[i] = stu[i];
//			System.out.println(stuArr[i]);
		}

		for (int i = 0; i < stuArr.length; i++) {
			num[i] = stuArr[i].getSum();
//			System.out.println(num[i]);
		}

		System.out.println();

		for (int i = 0; i < stuArr.length - 1; i++) {
			for (int j = 0; j < stuArr.length - 1; j++) {
				if (num[j] < num[j + 1]) {
					int tmp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < stuArr.length; i++) {
			for (int j = 0; j < stuArr.length; j++) {
				if (num[i] == stuArr[j].getSum()) {
					person[j].infoPrint();
					stuArr[j].infoPrint();
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.infoPrint();
	}
}
