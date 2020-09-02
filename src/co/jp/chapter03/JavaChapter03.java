package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str1 = "abc";
		String str3 = new String("abc");

		if (str1 == str3) {
			System.out.println("str1とstr3が一致");
		} else {
			System.out.println("str1とstr3が不一致");
		}

		int i = 0;

		if (i > 0) {
			// ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("変数Ｉはプラス");
		} else if (i < 0) {
			// イ：ア条件がfalseかつ、上記条件がtrueの場合、
			// 下記処理を実行
			System.out.println("変数Ｉはマイナス");

		} else {
			// ウ：ア条件がfalseかつイ条件がfalseの場合
			// 下記処理を実行
			System.out.println("変数Ｉはゼロ");
		}
		int a = 0;
		//switch
		switch (a) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("変数Ａはプラス");
			break;
		case -1:
		case -2:
		case -3:
		case -4:
		case -5:
		case -6:
		case -7:
		case -8:
		case -9:
			System.out.println("変数Ａはマイナス");
			break;
		case 0:
			System.out.println("変数Ａはゼロ");
			break;
		default:
			System.out.println("変数Ａは-9~9以外の数字です");
			break;
		}

		//loopの一つforループ
		//自然数1　2　3　4　5
		//0はＪＡＶＡの一番目座標
		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		//while
		int k = 0;
		while (k < 10) {
			System.out.println("kのループ回数:" + k);
			k++;
		}
		int m = 0;
		while (m <= 10) {
			System.out.println("mのループ回数:" + m);
			m++;
		}

		int l = 40;
		do {
			System.out.println("これはi" + l);
			l++;
		} while (l < 30);

		for (int q = 0; q <= 10; q++) {
			if (q % 2 != 0) {
				continue;
			}
			System.out.println("これはq" + q);
		}
int r = 10;
		for (int w = 0; w < r; w++) {
			for (int e = 0; e < r; e++) {
				if (w == e || (w + e == r-1)) {
					System.out.print(w + "" + e + " ");
				}
				else {
					System.out.print("  ");
					}
			}

			System.out.println();
		}

		//		for (int t = 0; t < 49; t++) {
		//			System.out.print(1);
		//			if (t > 0 && (t + 1) % 7 == 0) {
		//				System.out.println("");
		//			}
		//		}

		//質問1

	}
}
