package Constructor.q199;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arrS = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();

            arrS[i] = new Student(name, score1, score2, score3);
        }
        sc.close();


        for (int i = 0; i < n; i++) {
//            System.out.println(arrS[i]);
        }

        for (int i = 0; i < n; i++) {
//            arrS[i].print();
        }//  여기까지가 입력 확인

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getSum() - o1.getSum();
            }
        };
//      Arrays.sort(arrS); // 방법 1 comparator 사용 안할때
        Arrays.sort(arrS, comparator);

        for (int i = 0; i < n; i++) {
//            arrS[i].print();
            arrS[i].printSum();
        }
    }

//    public void calc(int[] score) {
//
//        for (int i = 0; i < score.length; i++) {
//
////            System.out.print(score[i] + " ");
//        }
//    }

}

class Student {
    private String name;
    private int score1, score2, score3;
    private int sum;


    public Student(String name, int score1, int score2, int score3) {
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        sum = score1 + score2 + score3;
    }

    public void print() {
        System.out.println(name + " " + score1 + " " + score2 + " " + score3);
    }

    public void printSum() {
        System.out.println(name + " " + score1 + " " + score2 + " " + score3 + " " + sum);
    }

    public int getSum() {
        return sum;
    }

    public int compareTo(Student o) {
        return o.getSum() - getSum();
    }


}