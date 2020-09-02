package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "abc";
		String str3 = new String("abc");

		//		int i = 10;// 変数 input
		// if - else if - else 開放区間
		//		if (i > 0 && i <= 9) {
		//			// ア：上記条件がtrueの場合、下記処理を実行
		//			System.out.println("変数.iはプラス");
		//		} else if (i < 0 && i >= -9) {
		//			// イ：ア条件がfalse かつ、上記条件がtrueの場合、
		//			// 下記処理を実行
		//			System.out.println("変数.iはマイナス");
		//		} else { // (i  ①<  ②= 0)
		//			// ウ：ア条件がfalse かつ、イ条件がfalseの場合、
		//			// 下記処理を実行
		//			// 上記以外
		//			System.out.println("変数.iはゼロ");
		//		}

		//		//
		//		if (i > 0 && i <= 9) { // １
		//			System.out.println("変数.iはプラス");
		//		} else if (i < 0 && i >= -9) { // 2
		//			System.out.println("変数.iはマイナス");
		//		} else if (i == 0) { // 3 ★★★★
		//			System.out.println("変数.iはゼロ");
		//		} else { //4
		//			System.out.println("input変数の値が計算対象外「-9～9」の間に指定しください");
		//		}
		//
		//		// switch 定数のみ byte short char int
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
		//			System.out.println("input変数の値が計算対象外「-9～9」の間に指定しください");
		//		}

		//		// loopの一つはFORループ
		//		// 自然数 1 2 3 4 5
		//		// 0 はＪＡＶＡの一番目の位置
		//		for (int i= 0 ; i < 10 ;i++) {
		//			if (i%2 != 0) {
		//				continue;
		//			}
		//			System.out.println("FOR 10回　＝なし"+i);
		//		}
		//		System.out.println("ーーーーーーーーーーーーーーー");
		//
		//		// while
		//		int j = 0; // dead loop
		//		while (j > 10) {
		//			System.out.println("while の LABALABA"+j);
		//			j++;
		//		}
		//
		//		// dead loop 下方のソースは → dead code（logic）　デットロジック
		//		// {}の中に break 方のソースは → dead code（logic）　デットロジック
		//		// if (true) のelse にも →  dead code（logic）　デットロジック
		//
		//		System.out.println("ーーーーーーーーーーーーーーー");
		//		// do while
		//		int x = 0;
		//		do {
		//			System.out.println("do while の LABALABA  "+ x );
		//			x++;
		//		} while (x > 10);
		//
		//
		//
		//		System.out.println("ーーーーーーーーーーーーーーー");
		//
		//
		//
		//		for (int i= 0 ; i<= 10 ;i++) {
		//			System.out.println("FOR 10回　＝あり"+i);
		//		}
		//		System.out.println("ーーーーーーーーーーーーーーー");
		//		// while
		//		int j1 = 0; // dead loop
		//		while (j1 <= 10) {
		//			System.out.println("while の LABALABA"+j1);
		//			j1++;
		//		}
		//		// do while

		//		for (int i=0;i<25;i++) {
		//			System.out.print("1");
		//			if (i>0 && (i+1)%5==0) {
		//				System.out.println();
		//			}
		//		}

		//		int x = 8;
		//		for (int i = 0; i < (x * x); i++) {
		//			System.out.print("1");
		//			if (i > 0 && (i + 1) % x == 0) {
		//				System.out.println();
		//			}
		//		}

		int x = 100;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if (i == j || i + j == x - 1) {
					System.out.print(i + "" + j + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
