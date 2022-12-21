package p633;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Bingo_2 {
	public static void main(String[] args) {
		Set set = new HashSet();
//			Set set = new LinkedHashSet();
		int[][] board = new int[5][5];

		for (int i = 0; i < set.size(); i++) {
			set.add((int) (Math.random() * 50) + 1 + "");
		}

		Iterator it = set.iterator();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt((String) it.next());
				System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
			}
			System.out.println();
		}

	}

}