package function1.q174;
//3명 학생의 3과목 점수를 입력받아 각 과목별 학생별 총점을 출력하는 구조화된 프로그램을 작성하시오.
/*
50 80 100
96 88 66
100 85 90
*/

import java.util.Scanner;

public class Main {
    int[][] stuScore = new int[3][3];
    int[] stu = new int[3];
    int[] sco = new int[3];

    public void scan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < stuScore.length; i++) {
            for (int j = 0; j < stuScore[i].length; j++) {
                stuScore[i][j] = sc.nextInt();
//                System.out.print(stuScore[i][j] + " ");
            }
        }
    }//scan

    public void calc() {
//      학생별 총점
        for (int i = 0; i < stuScore.length; i++) {
            for (int j = 0; j < stuScore[i].length; j++) {
                if (i == 0) {
                    stu[0] += stuScore[i][j];
//                    System.out.println("stu1 : " + stu1);
                } else if (i == 1) {
                    stu[1] += stuScore[i][j];
//                    System.out.println("stu2 : " + stu2);
                } else {
                    stu[2] += stuScore[i][j];
//                    System.out.println("stu3 : " + stu3);
                }
            }
        }
//        System.out.println("student : " + stu[0] + " " + stu[1] + " " + stu[2]);

//      과목별 총점
        for (int i = 0; i < stuScore.length; i++) {
            for (int j = 0; j < stuScore[i].length; j++) {
                if (j == 0) {
                    sco[0] += stuScore[i][j];
//                    System.out.println("sco1 : " + sco1);
                } else if (j == 1) {
                    sco[1] += stuScore[i][j];
//                    System.out.println("sco2 : " + sco2);
                } else {
                    sco[2] += stuScore[i][j];
//                    System.out.println("sco3 : " + sco3);
                }
            }
        }
//        System.out.println("score : " + sco[0] + " " + sco[1] + " " + sco[2]);
    }//calc end

    public void print() {
        for (int i = 0; i < stuScore.length; i++) {
            for (int j = 0; j < stuScore[i].length; j++) {
                System.out.print(stuScore[i][j] + " ");
            }
            System.out.print(stu[i]);
            System.out.println();
        }
        int scoSum = 0;
        for (int i = 0; i < sco.length; i++) {
            System.out.print(sco[i] + " ");
            scoSum += sco[i];
        }
        System.out.println(scoSum);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.scan();
        m.calc();
        m.print();

    }
}//class end
