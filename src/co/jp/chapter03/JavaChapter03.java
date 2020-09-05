package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//		int i = 0;// 変数
		//		if (i > 0) {
		//			// ア：上記条件がtrueの場合、下記処理を実行
		//			System.out.println("変数.iはプラス");
		//		} else if (i < 0) {
		//			// イ：ア条件がfalse かつ、上記条件がtrueの場合、
		//			// 下記処理を実行
		//			System.out.println("変数.iはマイナス");
		//		} else {// (i ①< ②= 0)
		//			// ウ：ア条件がfalse かつ、イ条件がfalseの場合、
		//			// 下記処理を実行
		//			// 上記以外
		//			System.out.println("変数.iはゼロ");
		//		}
		//		//
		//		if (i > 0 && i <= 9) {
		//			System.out.println("変数.iはプラス");
		//		} else if (i < 0 && i >= -9) {
		//			System.out.println("変数.iはマイナス");
		//		} else if (i == 0) {
		//			System.out.println("変数.iはゼロ");
		//		} else {
		//			// ウ：ア条件がfalse かつ、イ条件がfalseの場合、
		//			// 下記処理を実行
		//			// 上記以外
		//			System.out.println("input変数の値が計算対象外「-9～9」の間指定してください");
		//		}
		//
		//		//switch
		//		switch (i) {
		//		case 9:
		//		case 8:
		//		case 7:
		//		case 6:
		//		case 5:
		//		case 4:
		//		case 3:
		//		case 2:
		//		case 1:
		//			System.out.println("変数.iはプラス");
		//			break;
		//		case -9:
		//		case -8:
		//		case -7:
		//		case -6:
		//		case -5:
		//		case -4:
		//		case -3:
		//		case -2:
		//		case -1:
		//			System.out.println("変数.iはマイナス");
		//			break;
		//		case 0:
		//			System.out.println("変数.iはゼロ");
		//			break;
		//		default:
		//			System.out.println("input変数の値が計算対象外「-9～9」の間指定してください");
		//			
		//
		//		//for
		//		for (int i = 0; i < 10; i++) {
		//			System.out.println("For 10回　＝あり" + i);
		//		}
		//		System.out.println("--------------------------");
		//
		//		for (int i = 0; i <= 10; i++) {
		//			System.out.println("For 10回　＝あり" + i);
		//
		//		}
		//		System.out.println("--------------------------");
		//
		//		//while
		//		int j1 = 0;
		//		while (j1 < 10) {
		//			System.out.println("whileのLABALABA" + j1);
		//			j1++;
		//		}
		//		System.out.println("--------------------------");
		//
		//		int j2 = 0;
		//		while (j2 <= 10) {
		//			System.out.println("whileのLABALABA" + j2);
		//			j2++;
		//
		//		}
		//		System.out.println("--------------------------");
		//
		//		//do while
		//		int j11 = 0;
		//		do {
		//			System.out.println("do whileのLABALABA" + j11);
		//			j11++;
		//		} while (j11 < 10);
		//		System.out.println("--------------------------");
		//
		//		int j22 = 0;
		//		do {
		//			System.out.println("do whileのLABALABA" + j22);
		//			j22++;
		//		} while (j22 <= 10);

		//		for (int i = 0; i < 5; i++) {
		//			for (int j = 0; j < 5; j++) {
		//				System.out.print("1");
		//			}
		//			System.out.println();
		//		}
		//		int x = 7;
		//		for (int i = 0; i < (x * x); i++) {
		//			System.out.print("1");
		//			if (i > 0 && (i + 1) % 7 == 0) {
		//				System.out.println();
		//			}
		//		}

		//输出对角线
		//		for (int i = 0; i < 5; i++) {
		//
		//			for (int j = 0; j < 5; j++) {
		//				if (i == j) {
		//					System.out.print(i + "" + j + "");
		//				} else {
		//					System.out.print("  ");
		//
		//				}
		//
		//			}
		//
		//			System.out.println();
		//		}

		//输出✖
		//		int x = 10;
		//		for (int i = 0; i < x; i++) {
		//
		//			for (int j = 0; j < x; j++) {
		//				if (i == j || (i + j) == x - 1) {
		//					System.out.print(i + "" + j + "");
		//				} else {
		//					System.out.print("  ");
		//
		//				}
		//
		//			}
		//
		//			System.out.println();
		//		}
		//输出风车
		//		int x = 9;
		//		for (int i = 0; i < x; i++) {
		//
		//			for (int j = 0; j < x; j++) {
		//				if (i == j || (i + j) == x - 1 || i == (x - 1) / 2 || j == (x - 1) / 2) {
		//					System.out.print(i + "" + j + "");
		//				} else {
		//					System.out.print("  ");
		//
		//				}
		//
		//			}
		//
		//			System.out.println();
		//		}

	}
}
