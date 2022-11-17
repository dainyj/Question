package q_baseballnumbergame;

import java.util.Scanner;

public class answer_m {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[3];
		boolean eq;

//		do {
//			eq = false;
//			for (int i = 0; i < n.length; i++) {
//				n[i] = (int) (Math.random() * 10);
//			}
//			if (n[0] == n[1] || n[1] == n[2] || n[2] == n[0]) {
//				eq = true;
//			}
//
//		} while (eq);
	
//		int i1, i2, i3 = sc.nextInt();

		for (int i = 0; i < n.length; i++) {
			n[i] = (int) (Math.random() * 10);
			if (i!=0 && n[0] == n[1] || n[1] == n[2] || n[2] == n[0]) {
				i--;
			}else {
				System.out.print(n[i]+" ");
			
			}
		}
	}
}




















//		do {
//			for(;;)
//			if (n[0] == i1 && n[1] == i2 && n[2] == i3) {
//				System.out.print("축하합니다." + " ");
////					break;
//			} else if (n[0] == i1) {
//				if (n[1] == i2) {
//					if (n[2] != i3)
//						System.out.print("2 Strike" + " ");
//				} else if (n[1] != i2) {
//					if (n[2] == i3) {
//						System.out.print("2 Strike" + " ");
//					} else if (n[2] != i3) {
//						System.out.print("1 Strike" + " ");
//					}
//				}
//			} else if (n[0] != i1) {
//				if (n[1] == i2) {
//					if (n[2] == i3) {
//						System.out.print("2 Strike" + " ");
//					} else if (n[2] != i3) {
//						System.out.print("1 Strike" + " ");
//					}
//				} else if (n[1] != i2) {
//					if (n[2] == i3) {
//						System.out.print("1 Strike" + " ");
//					} else if (n[2] != i3) {
////						System.out.print("Out" + " ");
//					}
//				}
//			}
//			if (n[0] == i2) { // <1 2
//				if (n[1] == i3) {
//					if (n[2] == i1) {
//						System.out.print("3 Ball" + " ");
//					} else if (n[2] != i1) {
//						System.out.print("2 Ball" + " ");
//
//					}
//				} else if (rn2 != ipn3) {
//					if (rn3 == ipn1) {
//						System.out.print("2 Ball" + " ");
//					} else if (rn3 != ipn1) {
//						System.out.print("1 Ball" + " ");
//
//					}
//				}
//
//			} else if (rn1 != ipn2) { // <1 2
//				if (rn2 == ipn3) {
//					if (rn3 == ipn1) {
//						System.out.print("2 Ball" + " ");
//					} else if (rn3 != ipn1) {
//						System.out.print("1 Ball" + " ");
//
//					}
//				} else if (rn2 != ipn3) {
//					if (rn3 == ipn1) {
//						System.out.print("1 Ball" + " ");
//					} else if (rn3 != ipn1) {
//						System.out.print("Out" + " ");
//					}
//				}
//			} else if (rn1 == ipn3) { // <1 3
//				if (rn2 == ipn1) {
//					if (rn3 == ipn2) {
//						System.out.print("3 Ball" + " ");
//					} else if (rn3 != ipn2) {
//						System.out.print("2 Ball" + " ");
//
//					}
//				} else if (rn2 != ipn1) {
//					if (rn3 == ipn2) {
//						System.out.print("2 Ball" + " ");
//					} else if (rn3 != ipn2) {
//						System.out.print("1 Ball" + " ");
//
//					}
//				}
//
//			} else if (rn1 != ipn3) { // <1 3
//				if (rn2 == ipn1) {
//					if (rn3 == ipn2) {
//						System.out.print("2 Ball" + " ");
//					} else if (rn3 != ipn2) {
//						System.out.print("1 Ball" + " ");
//
//					}
//				} else if (rn2 != ipn1) {
//					if (rn3 == ipn2) {
//						System.out.print("1 Ball" + " ");
//					} else if (rn3 != ipn2) {
//						System.out.print("Out" + " ");
//					}
//				}
//			}
//			
//		} while ();//   < 
//		
//		
//		
//	}
//}
