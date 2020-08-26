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



		// loopの一つはFORループ
		// 自然数 1 2 3 4 5
		// 0 はＪＡＶＡの一番目の位置
		//
		for (int i= 0 ; i< 10 ;i++) {
			System.out.println(i);
		}
		for (int i= 0 ; i<= 10 ;i++) {
			System.out.println(i);
		}



	}

}
