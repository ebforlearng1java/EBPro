package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問１:成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		int a = 56;
		//90以上:A
		if(a >= 90) {
			System.out.println("A");
		//80-90:B
		} else if(a >= 80 && a < 90) {
			System.out.println("B");
		//70-80:C
		} else if(a >= 70 && a < 80) {
			System.out.println("C");
		//60-70:D
		} else if(a > 60 && a < 70) {
			System.out.println("D");
		//60以下:E
		} else {
			System.out.println("E");
		}

		//質問２:日本のコインを１円、５円、１０円、１００円、５００円があります。
		//３３４０円のコイン数をもとめください。
		//方法１
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
