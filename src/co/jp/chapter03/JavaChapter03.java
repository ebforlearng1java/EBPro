package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "abc";
		String str3 = new String("abc");

		int i = 1;//変数

		if (i > 10) {
			// ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("変数.iはプラス");
		} else if (i < 0) {
			// イ:ア条件がfalseかつ、上記条件がtrueの場合
			// 下記処理を実行
			System.out.println("変数.iはマイナス");
		} else {
			// ウ: ア条件がfalseかつ、イ条件がfalseの場合
			// 下記処理を実行
			// 上記以外
			System.out.println("変数.iはゼロ");
		}

		//switch
		switch (i) {
		case 0:
			System.out.println("変数.iはゼロ");
			break;
		case 9:
		case 8:
		case 7:
		case 6:
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
			System.out.println("変数.iはプラス");
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
			System.out.println("変数.iはマイナス");
		dafault:
			System.out.println("変数.iは対象外");
		}

		//質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		int a = 56;
		//90以上︓A
		if(a >= 90) {
			System.out.println("A");
		//80-90︓B
		} else if(a >= 80 && a < 90) {
			System.out.println("B");
		//70-80︓C
		} else if(a >= 70 && a < 80) {
			System.out.println("C");
		//60-70︓D
		} else if(a > 60 && a < 70) {
			System.out.println("D");
		//60以下︓E
		} else {
			System.out.println("E");
		}

		//0はJAVAの一番目の位置
		//i<10 は10回、i<=10は11回
		//for (int i= 0 ; i< 10 ; i++) {
		//	System.out.println(i);
		//}
		//for (int i= 0 ; i<= 10 ; i++) {
		//	System.out.println(i);
		//}


		//質問２:日本のコインを１円、５円、１０円、１００円、５００円があります。
		//３３４０円のコイン数をもとめください。
		int coin = 3340;
		if (coin >= 500) {
			System.out.println("500円" + coin/500 + "枚");
			coin = coin%500;
		}
		if (coin >= 100) {
			System.out.println("100円" + coin/100 + "枚");
			coin = coin%100;
		}
		if (coin >= 10) {
			System.out.println("10円" + coin/10 + "枚");
			coin = coin%10;
		}
		if (coin >= 5) {
			System.out.println("5円" + coin/5 + "枚");
			coin = coin%5;
		}
		if (coin >= 1) {
			System.out.println("1円" + coin/1 + "枚");
			coin = coin%1;
		}




	}

}
