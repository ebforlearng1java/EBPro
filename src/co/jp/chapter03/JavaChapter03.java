package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str1 = "abc";
		String str3 = new String("abc");
		//int i = 0;

		if (str1 == str3) {
			System.out.println("str1とstr3が一致");
		} else {
			System.out.println("str1とstr3が不一致");
		}

		int i =  11;

		if (i > 0 && i < 9) {
			// ア　上記条件はtrueの場合、下記処理を実行
			System.out.println("変数iはプラス");
		} else if  (i < 0 && i > -9)  {
			// イ　ア条件がfalse かつ、上記条件がtrueの場合
			// 下記処理を実行
			System.out.println("変数iはマイナス");
		} else {
			// ウ　ア条件がfalse かつ、イ条件がfalse の場合
			//下記処理を実行
			//上記以外
			System.out.println("変数ｉはゼロ");
		}

		if (i > 0 && i < 9) {
			System.out.println("変数iはプラス");
		} else if  (i < 0 && i > -9)  {
			System.out.println("変数iはマイナス");
		} else if (i == 0) {
			System.out.println("変数ｉはゼロ");
		} else {
			System.out.println("input変数の値が計算対象外「９～－９」の間に指定したください。");
		}

		// switch　定数のみ byte short char int

		switch (i) {
			case 9:
			case 8:
			case 7:
			case 6:
			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
				System.out.println("変数iはプラス");
				break;
			case -9:
			case -8:
			case -7:
			case -6:
			case -5:
			case -4:
			case -3:
			case -2:
			case -1:
				System.out.println("変数iはマイナス");
				break;
			case 0:
				System.out.println("変数ｉはゼロ");
				break;
			default:
				System.out.println("input変数の値が計算対象外「９～－９」の間に指定したください。");
				break;

		}

		// loopの一つはFORループ
		// 0~9を出力する
		for (int j=0 ; j<10 ; j++) {
			System.out.println(j);
		}

		// 0~10を出力する
		for (int j=0 ; j<=10 ; j++) {
			System.out.println(j);
		}

		// 0~9を出力する
		int j = 0;
		while (j < 10) {
			System.out.println(j);
			j++;
		}

		//0~9を出力する
		int c = 0;
		do {
			System.out.println(c);
			c++;
		} while (c < 10);

		// 0~10を出力する
		int d = 0;
		while (d <= 10) {
			System.out.println(d);
			d++;
		}

		// 0~10を出力する
		int e = 0;
		do {
			System.out.println(e);
			e++;
		} while (e <= 10);


	}

}
