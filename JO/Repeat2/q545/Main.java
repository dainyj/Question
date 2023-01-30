package Repeat2.q545;
/*10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.
 * 10 15 36 99 100 19 46 88 87 13
 * */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inp = new int[10];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = sc.nextInt();
//            System.out.print(inp[i] + " ");
        }
        int cnt3=0;
        int cnt5=0;
        for (int i = 0; i < inp.length; i++) {
            if(inp[i]%3==0){
                cnt3++;
            }
            if(inp[i]%5==0){
                cnt5++;
            }
        }
        System.out.println("Multiples of 3 : " + cnt3);
        System.out.println("Multiples of 5 : " + cnt5);
    }
}
