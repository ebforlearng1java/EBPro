package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問:以下コードを補完してください。
		// boolean value = true;
		// switch(value){
		// case ?? : break; case??
		// case ?? : break; case??
		// default : break; defaultは必要か？

		// まずswitchではbooleanは使えません、case true と case falseが存在すると思います、defalutは必要ないです。

		// 質問１︓成績ランキング判断を作成する「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		if (a >= 90 && a <= 100) {
			System.out.println("A");
		} else if (a >= 80 && a < 90) {
			System.out.println("B");
		} else if (a >= 70 && a < 80) {
			System.out.println("C");
		} else if (a >= 60 && a < 70) {
			System.out.println("D");
		} else {
			System.out.println("E");
		}
		// 成績はEでした。

//		質問２︓⽇本のコインを１円、５円、１０円、１００円、５００円があります。３３４０円のコイン数をもとめください。
		int[] coin = new int[] { 500, 100, 10, 5, 1 };
		int money = 3340;
		int count;
		int total = 0;

		for (int i = 0; i < coin.length; i++) {
			count = money / coin[i];
			money = money % coin[i];
			total += count;
		}
		System.out.println("トータルで" + total + "枚コインになります。");

	}

}
