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

// case 2------------------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int B = sc.nextInt();
//        sc.close();
//
////      System.out.println(N + " " + B);
//        String str = "";
//        int p, r;
//        while (true) {
//            if (N < B) {
//                str = N + str;
//                break;
//            }
//            p = N / B;
//            r = N % B;
//            if (r < 10)
//                str = r + str;
//            else {
//                str = (char)(r - 10 + 'A') + str;
//            }
//            N = p;
//        }
//        System.out.println(str);
//    }
//}

// case 3--------------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int B = sc.nextInt();
//        sc.close();
//
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int i = N; ; ) {
//            if (i < B) {
//                al.add(i);
//                break;
//            }
//            al.add(i % B);
//            i = i / B;
//        }
//
//        for (int i = al.size() - 1; i >= 0; i--) {
//            if (al.get(i) >= 10 && B == 16) {
//                switch (al.get(i)) {
//                    case 10:
//                        System.out.print('A');
//                        break;
//                    case 11:
//                        System.out.print('B');
//                        break;
//                    case 12:
//                        System.out.print('C');
//                        break;
//                    case 13:
//                        System.out.print('D');
//                        break;
//                    case 14:
//                        System.out.print('F');
//                        break;
//                    case 15:
//                        System.out.print('E');
//                        break;
//                }
//            } else
//                System.out.print(al.get(i));
//        }
//    }
//}

// case 4-----------------------------------------------------
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int B = sc.nextInt();
//        String result = "";
//
//        if (B == 16) {
//            while (N > 0) {
//                int r = N % B;
//                if (r >= 10) {
//                    r = r - 10 + 'A';
//                    result = String.valueOf((char) r) + result;
//                    N /= B;
//                    continue;
//                }
//                result = String.valueOf(r) + result;
//                N /= B;
//            }
//            System.out.println(result);
//        } else {
//            while (N > 0) {
//                result = String.valueOf(N % B) + result;
//                N /= B;
//            }
//            System.out.println(result);
//        }
//    }
//}