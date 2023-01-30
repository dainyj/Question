package String.q600;


/*공백을 포함한 100글자 이하의 문자열을 입력받아 문장을 이루는 단어의 개수를 출력하는 프로그램을 작성하시오.
 * My name is Kimchulsoo
 *case1 공백을 기준으로 구분 case2 StringTokenizer case3 inp.split사용
 *
 * */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
//        System.out.println(inp);
        int cnt = 1; //단어 수
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
