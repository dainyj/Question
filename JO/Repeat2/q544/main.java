package Repeat2.q544;

import java.util.Scanner;

public class main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        sc.close();
        int sum = 0;

        for (int i = inp; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
