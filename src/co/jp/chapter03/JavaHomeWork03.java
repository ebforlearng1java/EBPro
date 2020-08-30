package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:成績ランキング判断をさk末井する
		//「90以上:A, 80-90:B, 70-80:C, 60-70:D, 60以下:E」

		//A:E

		int a = 56;
		System.out.println("ランキング判断。入力値=" +a );
		if(a>=90) {
			System.out.println("A");
		}
		else if(a>=80 && a<90) {
			System.out.println("B");
		}else if(a>=70 && a<80) {
			System.out.println("C");
		}else if(a>60 && a<70) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}

		//Q2:日本のコインを1円、5円、10円、100円、500円があります。
		//3340円のコイン数を求めください

		//A:500円は6枚 ,100円は3枚  ,10円は4枚  ,5円は0枚  ,1円は0枚

		int coin = 3340;
		int k1,k5,k10,k100,k500;

		k500 = coin/500;
		coin = coin%500;

		k100 = coin/100;
		coin = coin%100;

		k10  = coin/10;
		coin = coin%10;

		k5   = coin/5;
		coin = coin%5;

		k1   = coin/1;
		coin = coin%1;

		System.out.println("500円は"+k500+ "枚");
		System.out.println("100円は"+k100+ "枚");
		System.out.println("10円は" +k10+  "枚");
		System.out.println("5円は"  +k5+   "枚");
		System.out.println("1円は"  +k1+   "枚");


		//Q3 以下コードを補完してください。
		//A エラーが発生、booleanはswitchに使えません
//		boolean value = true;
//		switch(value) {
//			case true:break;
//			case false:break;
//			default:break;
//		}





	}

}
