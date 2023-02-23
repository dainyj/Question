package Beginner2.q1430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        System.out.println(a + " " + b + " " + c);
        sc.close();

        int res = a * b * c;
//        System.out.println("int : " + res);

        String str = Integer.toString(res);
//        System.out.println("String : " + str);

        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                zero++;
            } else if (str.charAt(i) == '1') {
                one++;
            } else if (str.charAt(i) == '2') {
                two++;
            } else if (str.charAt(i) == '3') {
                three++;
            } else if (str.charAt(i) == '4') {
                four++;
            } else if (str.charAt(i) == '5') {
                five++;
            } else if (str.charAt(i) == '6') {
                six++;
            } else if (str.charAt(i) == '7') {
                seven++;
            } else if (str.charAt(i) == '8') {
                eight++;
            } else {
                nine++;
            }
        }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
    }
}

//case T--------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        String inp1 = "150";
//        String inp2 = "266";
//        String inp3 = "427";
//
//        int num1 = Integer.parseInt(inp1);
//        int num2 = Integer.parseInt(inp2);
//        int num3 = Integer.parseInt(inp3);
//        int iRes = num1 * num2 * num3;
////        System.out.println(iRes);
//        String strRes = Integer.toString(iRes);
//
//        for (int i = 0; i < 9; i++) {
//            int cnt = 0;
//            for (int j = 0; j < strRes.length(); j++) {
////                System.out.print(strRes.charAt(j) + " : ");
////                System.out.println('0' + i);
//                if (strRes.charAt(j) == ('0' + i)) {
//                    cnt++;
//                }
//            }
//            System.out.println(cnt);
//        }
//    }
//}
