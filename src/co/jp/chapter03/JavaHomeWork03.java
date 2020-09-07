package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問︓以下コードを補完してください。
		//答え：switchにbooleanが使えないので、下記のコードが間違いです。
		//boolean value = true;
		//switch(value) {
		//case ??:break; // case ??
		//case ??:break; // case ??
		//default:break; // default は必要ですか？
		//}

		// 質問１
		int a = 89;
		System.out.println("成績ランキング判断。入力値＝" + a);
		if (a <= 100 && a >= 90) {
			System.out.println("成績ランキングはAです。");
		} else if (a < 90 && a >= 80) {
			System.out.println("成績ランキングはBです。");
		} else if (a < 80 && a >= 70) {
			System.out.println("成績ランキングはCです。");
		} else if (a < 70 && a >= 60) {
			System.out.println("成績ランキングはDです。");
		} else if (a < 60 && a >= 0) {
			System.out.println("成績ランキングはEです。");
		} else {
			System.out.println("成績入力ミスので、エラーが発生します。");
		}

		// 質問2
		int cost = 3340;
		int count = 0;
		int change =0;

		if (cost%500 >= 0) {
			count = cost/500;
			change = cost - 500*count;
			System.out.println("500円は" +count + "つがあります");
		}
		if (change%100 >= 0) {
			count = change/100;
			change = change - 100*count;
			System.out.println("100円は" +count + "つがあります");
		}
		if (change%10 >= 0) {
			count = change/10;
			change = change - 10*count;
			System.out.println("10円は" +count + "つがあります");
		}
		if (change%5 >= 0) {
			count = change/5;
			change = change - 5*count;
			System.out.println("5円は" +count + "つがあります");
		}
		if (change%1 >= 0) {
			count = change/1;
			change = change - 1*count;
			System.out.println("1円は" +count + "つがあります");
		}
	}

}
