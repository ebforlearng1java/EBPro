package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		String str1 = "abc";
//		String str3 = new String("abc");
//		//int i = 0;
//
//		if (str1 == str3) {
//			System.out.println("str1とstr3が一致");
//		} else {
//			System.out.println("str1とstr3が不一致");
//		}
//
//		int i =  11;
//
//		if (i > 0 && i < 9) {
//			// ア　上記条件はtrueの場合、下記処理を実行
//			System.out.println("変数iはプラス");
//		} else if  (i < 0 && i > -9)  {
//			// イ　ア条件がfalse かつ、上記条件がtrueの場合
//			// 下記処理を実行
//			System.out.println("変数iはマイナス");
//		} else {
//			// ウ　ア条件がfalse かつ、イ条件がfalse の場合
//			//下記処理を実行
//			//上記以外
//			System.out.println("変数ｉはゼロ");
//		}
//
//		if (i > 0 && i < 9) {
//			System.out.println("変数iはプラス");
//		} else if  (i < 0 && i > -9)  {
//			System.out.println("変数iはマイナス");
//		} else if (i == 0) {
//			System.out.println("変数ｉはゼロ");
//		} else {
//			System.out.println("input変数の値が計算対象外「９～－９」の間に指定したください。");
//		}
//
//		// switch　定数のみ byte short char int
//
//		switch (i) {
//			case 9:
//			case 8:
//			case 7:
//			case 6:
//			case 5:
//			case 4:
//			case 3:
//			case 2:
//			case 1:
//				System.out.println("変数iはプラス");
//				break;
//			case -9:
//			case -8:
//			case -7:
//			case -6:
//			case -5:
//			case -4:
//			case -3:
//			case -2:
//			case -1:
//				System.out.println("変数iはマイナス");
//				break;
//			case 0:
//				System.out.println("変数ｉはゼロ");
//				break;
//			default:
//				System.out.println("input変数の値が計算対象外「９～－９」の間に指定したください。");
//				break;
//
//		}
//
//		// loopの一つはFORループ
//		// 0~9を出力する
//		for (int j=0 ; j<10 ; j++) {
//			System.out.println(j);
//		}
//		System.out.println("------------------------------------------");
//
//		// 0~10を出力する
//		for (int j=0 ; j<=10 ; j++) {
//			if (j%2 != 0) {
//				continue;
//			}
//			System.out.println(j);
//		}
//		System.out.println("------------------------------------------");
//
//		// 0~9を出力する
//		int j = 0;
//		while (j < 10) {
//			System.out.println(j);
//			j++;
//			if (j == 5) {
//				break;
//			}
//		}
//		System.out.println("------------------------------------------");
//
//		//0~9を出力する
//		int c = 0;
//		do {
//			System.out.println(c);
//			c++;
//		} while (c < 10);
//		System.out.println("------------------------------------------");
//
//		// 0~11を出力する
//		int d = 0;
//		while (d <= 10) {
//			System.out.println("11回" + d);
//			d++;
//		}
//		System.out.println("------------------------------------------");
//
//		// 0~11を出力する
//		int e = 0;
//		do {
//			System.out.println("11回" + e);
//			e++;
//		} while (e <= 10);
//
//		//dead loop 下方のソースは　→　dead code デットロジック
//		// if (true) の　elseにも　→　dead code　デットロジック
//		// break

		for (int i=0 ; i<5 ; i++) {
			for (int j = 0; j<5; j++) {
				System.out.print("1");
			}
			System.out.println();
		}

		for (int i=0;i<49;i++) {
			   System.out.print("1");
			   if (i>0 && (i+1)%7==0) {
			    System.out.println();
			   }
			  }
		int x = 9;
		for (int i = 0; i < x; i++) {
			   for (int j = 0; j < x; j++) {
				   if (i == j || i+j == x-1) {
			    System.out.print(i+""+j+" ");
				   } else {
					   System.out.print("   ");
				   }
			   }
			   System.out.println();
			  }
	}

}
