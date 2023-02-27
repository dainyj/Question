package Beginner4.q1534;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
//        System.out.println("inp = " + inp);
//        System.out.println("B = " + B);

        String inp2 = Integer.toString(inp, 2); //2진수
        String inp8 = Integer.toString(inp, 8); //8진수
        String inp16 = Integer.toString(inp, 16).toUpperCase(); //16진수, 대문자로 (기본 소문자 출력)

        if (B == 2) {
            System.out.println(inp2);
        } else if (B == 8) {
            System.out.print(inp8);
        } else {
            System.out.println(inp16);
        }
    }
}
