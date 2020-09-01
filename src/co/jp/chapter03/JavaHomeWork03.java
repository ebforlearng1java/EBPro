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

		int q = 56;
		System.out.println("成績ランキング判断。入力値=" + q);

		if(q >= 90 && q<= 100) {
			System.out.println("A");
		}else if(q >= 80 && q < 90) {
			System.out.println("B");
		}else if(q >= 70 && q < 80) {
			System.out.println("C");
		}else if(q >= 60 && q <70) {
			System.out.println("D");
		}else if(q>=0 && q< 60) {
			System.out.println("E");
		}else{
			System.out.println("1から100までの数値をご入力ください。");
			}

		System.out.println("----------------------------------------");

		//5ページ 質問2

		int m = 3340;
		int a = m/500;
		int b = m % 500 / 10;
		int c = m % 500 % 100 /50;
		int d = m % 500 % 100 % 50 /10;
		int e = m % 500 % 100 % 50 % 10 /5;
		int f = m % 500 % 100 % 50 % 10 % 5 /1;
		System.out.println(m + "円のコイン数は以下の通りです：");
		System.out.println("500円のコインは" +a + "枚、");
		System.out.println("100円のコインは" +b + "枚、");
		System.out.println("50円のコインは" +c + "枚、");
		System.out.println("10円のコインは" +d + "枚、");
		System.out.println("5円のコインは" +e + "枚、");
		System.out.println("1円のコインは" +f + "枚。");

	}

}
