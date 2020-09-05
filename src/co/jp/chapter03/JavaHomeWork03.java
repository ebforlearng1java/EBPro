package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**ーーーーーーーーーーーーーーーーー03 フロー制御ーーーーーーーーーーーーーーーーー */

		//質問：以下コードを補完してください。
		//boolean value = true;
		//switch(value) {
		//case ??:break; // case ??
		//case ??:break; // case ??
		//default:break; // default は必要ですか？
		//}

		//回答：1.型 boolean の値でスイッチすることはできません。
		//      2.defaultは省略可能。

		//質問１：成績ランキング判断を作成する
		//「90以上：A, 80-90：B, 70-80：C, 60-70：D, 60以下：E」
		//回答：

		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90 && a <= 100) {
			//ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("成績：A");
		} else if (a < 90 && a >= 80) {
			//イ：ア条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("成績：B");
		} else if (a < 80 && a >= 70) {
			//ウ：ア、イ条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("成績：C");
		} else if (a < 70 && a >= 60) {
			//エ：ア、イ、ウ条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("成績：D");
		} else if (a < 60 && a >= 0) {
			//オ：ア、イ、ウ、エ条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("成績：E");
		} else {
			//カ：ア、イ、ウ、エ、オ条件がfalseの場合、
			//下記処理を実行
			//上記以外
			System.out.println("入力値は0以上、100以下の整数を設定してください。");
		}

		//実行結果：成績ランキング判断。入力値=56
		//			成績：E

		System.out.println("--------------------------");

		//質問２：日本のコインを１円、５円、１０円、１００円、５００円があります。
		//３３４０円のコイン数をもとめください。
		//回答：合計13枚。
		//		500円：6枚、100円：3枚、10円：4枚、5円：0枚、1円：0枚。

		//方法１
		// コイン数配列
		int[] counts = { 0, 0, 0, 0, 0 };
		// 金種配列
		int[] types = { 500, 100, 10, 5, 1 };
		//金額
		int money = 3340;
		//合計枚数
		int totalCount = 0;

		System.out.println("日本のコインは１円、５円、１０円、１００円、５００円があります。");
		System.out.println(money + "円のコイン数は：");

		for (int i = 0; i < types.length; i++) {//i<5
			counts[i] = money / types[i];
			money = money % types[i];
			totalCount = totalCount + counts[i];
			if (counts[i] > 0) {
				System.out.println(types[i] + "円：" + counts[i] + "枚");
			}
			if (money == 0) {//余りが0の場合、計算が終了する
				break;
			}
		}
		System.out.println("合計枚数：" + totalCount + "枚");

		//実行結果：日本のコインは１円、５円、１０円、１００円、５００円があります。
		//			3340円のコイン数は：
		//			500円：6枚
		//			100円：3枚
		//			10円：4枚
		//			合計枚数：13枚

		System.out.println("--------------------------");

		//方法２

		int coin = 3340;
		System.out.println("日本のコインは１円、５円、１０円、１００円、５００円があります。");
		System.out.println(coin + "円のコイン数は：");
		if (coin >= 500) {
			System.out.println("500円：" + coin / 500 + "枚");
			coin = coin % 500;
		} else if (coin < 500) {
			System.out.println("500円：" + coin / 500 + "枚");
		}
		if (coin >= 100) {
			System.out.println("100円：" + coin / 100 + "枚");
			coin = coin % 100;
		} else if (coin < 100) {
			System.out.println("100円：" + coin / 100 + "枚");
		}
		if (coin >= 10) {
			System.out.println(" 10円：" + coin / 10 + "枚");
			coin = coin % 10;
		} else if (coin < 10) {
			System.out.println(" 10円：" + coin / 10 + "枚");
		}
		if (coin >= 5) {
			System.out.println("  5円：" + coin / 5 + "枚");
			coin = coin % 5;
		} else if (coin < 5) {
			System.out.println("  5円：" + coin / 5 + "枚");
		}

		if (coin >= 1) {
			System.out.println("  1円：" + coin / 1 + "枚");
			coin = coin % 1;
		} else {
			System.out.println("  1円：" + coin / 1 + "枚");
		}

		//実行結果：日本のコインは１円、５円、１０円、１００円、５００円があります。
		//			3340円のコイン数は：
		//			500円：6枚
		//			100円：3枚
		//			 10円：4枚
		//			  5円：0枚
		//			  1円：0枚

	}

}
