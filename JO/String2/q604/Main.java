package String2.q604;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrInp = new String[10];
        for (int i = 0; i < arrInp.length; i++) {
            arrInp[i] = sc.next();
//            System.out.println(arrInp[i]);
        }
        char c = sc.next().charAt(0);
//        System.out.println(c);

        for (int i = 0; i < arrInp.length; i++) {
//            arrInp[i].length()-1  단어의 마지막 문자 위치
            int point = arrInp[i].length() - 1;
//            System.out.print(i + point);
//            System.out.print(" 단어: " + arrInp[i]);
//            System.out.print(" 마지막 문자: " + arrInp[i].charAt(point));
//            System.out.println();
            if (arrInp[i].charAt(point) == c) {
//                System.out.println("마지막 문자 : " + arrInp[i].charAt(point));
                System.out.println(arrInp[i]);
            }
        }
    }
}