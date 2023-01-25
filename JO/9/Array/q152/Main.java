package q152;
//10개의 정수를 입력받아 홀수 번째 입력받은 정수의 합과 짝수 번째 입력받은 정수의 합을 출력하는 프로그램을 작성하시오.
//10 20 25 66 83 7 22 90 1 100

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];
        int odd = 0, even = 0;
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
            if (i % 2 == 0) {
//                System.out.println(i);
                odd += inp[i];
            } else {
                even += inp[i];
//                System.out.println(i);
            }
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
