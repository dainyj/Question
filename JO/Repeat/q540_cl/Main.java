package q540_cl;

/*정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업도 하지 않고 

3의 배수인 경우에는 3으로 나눈몫을 출력하는 작업을 반복하다가

-1이 입력되면 종료하는 프로그램을 작성하시오.*/
public class Main {

	public static void main(String[] args) {

		Divide d = new Divide();  // 인스턴스 생성. 참고? 반복문 안에 넣지 않는 것이 좋다. 넣는다면 과부하 걸릴수도...
		d.Cal(); // 괄호 안의 타입이 일치해야함.

	}
}
