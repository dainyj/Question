package src.q2588;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  방법1
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
////        System.out.println(num1 + " " + num2);
//        sc.close();
//
//        int n1 = num1 * (num2 % 10);
//        System.out.println(n1);
//        int n2 = num1 * ((num2 / 10) % 10);
//        System.out.println(n2);
//        int n3 = num1 * (num2 / 100);
//        System.out.println(n3);
//        int sum = n1 + n2 * 10 + n3 * 100;
//        System.out.println(sum);

//  방법2
        int num1 = sc.nextInt();
        String num2 = sc.next();
        sc.close();

        char c1 = num2.charAt(2);
        char c10 = num2.charAt(1);
        char c100 = num2.charAt(0);
        int n1 = Character.getNumericValue(c1);
        int n10 = Character.getNumericValue(c10);
        int n100 = Character.getNumericValue(c100);

        int sum1 = num1 * n1;
        int sum10 = num1 * n10;
        int sum100 = num1 * n100;

        System.out.println(sum1);
        System.out.println(sum10);
        System.out.println(sum100);
        System.out.println(sum1 + sum10 * 10 + sum100 * 100);

    }
}
