package q614;
import java.util.Scanner;

class Student1{
	private String schoolName;
	private int grade;
	
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Tanswer {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student1 stu1 = new Student1();
		stu1.setSchoolName("Jejuelementary");
		stu1.setGrade(6);

		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Student1 stu2 = new Student1();
		stu2.setSchoolName(schoolName);
		stu2.setGrade(grade);

		stu1.print();
		stu2.print();
	}

}
