package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {

		// TODO 自動生成されたメソッド・スタブ

		//3ページ 質問：以下コードを補完してください。
//		boolean value = true;
//		switch(value) {
//		 case true:break;
//		 case false:break;
//		 default:break;
//		}

//		答え：
//		・型byte,short,int,charの値だけはswith文に適用できるが、型booleanの値は使えない。
//		・defaultは省略可能。


		//5ページ 質問１

		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if(a >= 90 && a<= 100) {
			System.out.println("A");
		}else if(a >= 80 && a < 90) {
			System.out.println("B");
		}else if(a >= 70 && a < 80) {
			System.out.println("C");
		}else if(a >= 60 && a <70) {
			System.out.println("D");
		}else if(a>=0 && a< 60) {
			System.out.println("E");
		}else{
			System.out.println("1から100までの数値をご入力ください。");
			}

		System.out.println("----------------------------------------");

		//5ページ 質問2

		int m = 3340;
		int round500 = (int)Math.floor(m/500);//floorは小数点以下を切り捨てる
		int round100 = (int)Math.floor(m % 500 / 100);
		int round50 = (int)Math.floor(m % 500 % 100 /50);
		int round10 = (int)Math.floor(m % 500 % 100 % 50 /10);
		int round5 = (int)Math.floor(m % 500 % 100 % 50 % 10 /5);
		int round1 = (int)Math.floor(m % 500 % 100 % 50 % 10 % 5 /1);
		System.out.println(m + "円のコイン数は以下の通りです：");
		System.out.println("500円のコインは" +round500 + "枚、");
		System.out.println("100円のコインは" +round100 + "枚、");
		System.out.println("50円のコインは" +round50 + "枚、");
		System.out.println("10円のコインは" +round10 + "枚、");
		System.out.println("5円のコインは" +round5 + "枚、");
		System.out.println("1円のコインは" +round1 + "枚。");

	}

}
