package String.q598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println((int)'A'+" "+(int)'Z');
//        System.out.println((int)'a'+" "+(int)'z');

//case 1
        while (true) {
            char inp = sc.next().charAt(0);
            if (('A' <= inp && inp <= 'Z') || ('a' <= inp && inp <= 'z')) {
                System.out.println(inp);
            } else if ('0' <= inp && inp <= '9') {
                System.out.printf("%d\n", (int) inp);
            } else {
                break;
            }
        }

//case 2
//        while(true) {
//            char inp = sc.next().charAt(0);
//
//            if(Character.isAlphabetic(inp)) {
//                System.out.println(inp);
//            }else if (Character.isDigit(inp)) {
//                System.out.printf("%d\n", (int) inp);
//            }else{
//                break;
//            }
//        }

    }
}// class end


