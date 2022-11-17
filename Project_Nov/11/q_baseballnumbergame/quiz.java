package q_baseballnumbergame;

import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ipn1 = sc.nextInt();
		int ipn2 = sc.nextInt();
		int ipn3 = sc.nextInt();

		System.out.println(ipn1 + " " + ipn2 + " " + ipn3);
		System.out.println();

		int rn1 = (int) (Math.random() * 10);
		int rn2 = (int) (Math.random() * 10);
		int rn3 = (int) (Math.random() * 10);

		for (int i = 0; i < 10; i++) {

		if (rn1 != rn2 && rn1 != rn3 && rn2 != rn3) {
			System.out.print(rn1 + " ");
			System.out.print(rn2 + " ");
			System.out.print(rn3);
		}
		}
		System.out.println();
//		for (;;) {
		
		
//		do {
//			
//		}while 로 초기화 시키는거 시도 해보기
			
		if (rn1 == ipn1 && rn2 == ipn2 && rn3 == ipn3) {
			System.out.print("축하합니다." + " ");
//				break;
		} else if (rn1 == ipn1) {
			if (rn2 == ipn2) {
				if (rn3 != ipn3)
					System.out.print("2 Strike" + " ");
			} else if (rn2 != ipn2) {
				if (rn3 == ipn3) {
					System.out.print("2 Strike" + " ");
				} else if (rn3 != ipn3) {
					System.out.print("1 Strike" + " ");
				}
			}
		} else if (rn1 != ipn1) {
			if (rn2 == ipn2) {
				if (rn3 == ipn3) {
					System.out.print("2 Strike" + " ");
				} else if (rn3 != ipn3) {
					System.out.print("1 Strike" + " ");
				}
			} else if (rn2 != ipn2) {
				if (rn3 == ipn3) {
					System.out.print("1 Strike" + " ");
				} else if (rn3 != ipn3) {
//					System.out.print("Out" + " ");
				}
			}
		}
		if (rn1 == ipn2) { // <1 2
			if (rn2 == ipn3) {
				if (rn3 == ipn1) {
					System.out.print("3 Ball" + " ");
				} else if (rn3 != ipn1) {
					System.out.print("2 Ball" + " ");

				}
			} else if (rn2 != ipn3) {
				if (rn3 == ipn1) {
					System.out.print("2 Ball" + " ");
				} else if (rn3 != ipn1) {
					System.out.print("1 Ball" + " ");

				}
			}

		} else if (rn1 != ipn2) { // <1 2
			if (rn2 == ipn3) {
				if (rn3 == ipn1) {
					System.out.print("2 Ball" + " ");
				} else if (rn3 != ipn1) {
					System.out.print("1 Ball" + " ");

				}
			} else if (rn2 != ipn3) {
				if (rn3 == ipn1) {
					System.out.print("1 Ball" + " ");
				} else if (rn3 != ipn1) {
					System.out.print("Out" + " ");
				}
			}
		} else if (rn1 == ipn3) { // <1 3
			if (rn2 == ipn1) {
				if (rn3 == ipn2) {
					System.out.print("3 Ball" + " ");
				} else if (rn3 != ipn2) {
					System.out.print("2 Ball" + " ");

				}
			} else if (rn2 != ipn1) {
				if (rn3 == ipn2) {
					System.out.print("2 Ball" + " ");
				} else if (rn3 != ipn2) {
					System.out.print("1 Ball" + " ");

				}
			}

		} else if (rn1 != ipn3) { // <1 3
			if (rn2 == ipn1) {
				if (rn3 == ipn2) {
					System.out.print("2 Ball" + " ");
				} else if (rn3 != ipn2) {
					System.out.print("1 Ball" + " ");

				}
			} else if (rn2 != ipn1) {
				if (rn3 == ipn2) {
					System.out.print("1 Ball" + " ");
				} else if (rn3 != ipn2) {
					System.out.print("Out" + " ");
				}
			}
		}

//		} // <for end
	}
}
