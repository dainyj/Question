package Constructor.q198;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] phy = new double[4];

        for (int i = 0; i < phy.length; i++) {
            phy[i] = sc.nextDouble();
            System.out.println(phy[i]);
        }

        Physical physical = new Physical(phy[0], phy[1], phy[2], phy[3]);
        physical.cacl();
        physical.print();
    }
}

class Physical {
    private double dHeight, dWeight, mHeight, mWeight, sHeight, sWeight;


    public Physical(double dHeight, double dWeight, double mHeight, double mWeight) {
        this.dHeight = dHeight;
        this.dWeight = dWeight;
        this.mHeight = mHeight;
        this.mWeight = mWeight;
    }

    public void cacl() { // 학생 키 몸무게 계산
        sHeight = (dHeight + mHeight) / 2 + 5;
        sWeight = (dWeight + mWeight) / 2 - 4.5;
    }

    public void print() {
        System.out.println("height : " + (int) sHeight + "cm");
        System.out.printf("weight : %.1fkg", sWeight);
    }
}
// 키 몸무게 멤버변수로 갖는 구조체
//아버지 dad 어머니 mom 키와 몸무게 입력받아 학생 키 몸무게 출력
// 키-정수미만 버리기 (평균 +5)  , 몸무게 소수 첫째자리 반올림(평균-4.5)


//객체배열 -----------------------------------------------------------
//class Person {
//    private int height;
//    private double weight;
//
//    public Person(int height, double weight) {
//        this.height = height;
//        this.weight = weight;
//    }
//
//    public void print() {
//        System.out.println(height + " " + weight);
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Person[] parr = new Person[2];
//        for (int i = 0; i < parr.length; i++) {
//            int height = sc.nextInt();
//            double weight = sc.nextDouble();
//            parr[i] = new Person(height, weight);
//        }
//        sc.close();
//
////      for (int i = 0; i < parr.length; i++) {
////         parr[i].print();
////      }
//
//        int stuHeight = ((parr[0].getHeight() + parr[1].getHeight())/2) + 5;
//        double stuWeight = ((parr[0].getWeight() + parr[1].getWeight())/2) - 4.5;
//        Person student = new Person(stuHeight, stuWeight);
//        System.out.println("height : " + student.getHeight() + "cm");
//        System.out.printf("weight : %.1fkg\n", student.getWeight());
//    }
//}