package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問１︓成績ランキング判断を作成する「90以上:A, 80-90:B, 70-80:C, 60-70 :D, 60以下:E」
		int mark = 99;

		// 成績は[90,100]の間の場合、成績ランキングはAです。
		if (mark >=90 && mark <=100) {
			System.out.println("成績ランキング判断： A");
		}

		// 成績は[80,90)の間の場合、成績ランキングはBです。
		else if (mark<90 && mark >= 80) {
			System.out.println("成績ランキング判断： B");
		}

		// 成績は[70,80)の間の場合、成績ランキングはCです。
		else if (mark<80 && mark >= 70) {
			System.out.println("成績ランキング判断： C");
		}

		// 成績は[60,70)の間の場合、成績ランキングはDです。
		else if (mark<70 && mark >= 60) {
			System.out.println("成績ランキング判断： D");
		}

		// 成績は[0,60)の間の場合、成績ランキングはEです。
		else if (mark<60 && mark >= 0){
			System.out.println("成績ランキング判断： E");
		}

		// 入力数字が[0,100]以外の場合、メッセージ「入力ミス」を出力する。
		else {
			System.out.println("入力ミス");
		}

		// 質問２︓日本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int total = 0;
		int ichien =0;
		int goen =0;
		int jyuen =0;
		int hyakuen =0;
		int gohyakuen =0;
		for(int num_coin = 0;num_coin<10;num_coin++) {
			if(total==3340) {
				System.out.println(num_coin);
			}
		}


	}
}

















