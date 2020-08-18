package co.jp.chapter01;

public class JavaHomeWork01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１
		int i = 10;
		int n = i%5;
		//n=0
		System.out.println(n);

		//質問２

		//a>10がTRUEの場合、11を出力する
		int a = 11;
		a = a > 10 ? 11 : 0;
		System.out.println(a);

		//a>10がFALSEの場合、0を出力する
		a = 8;
		a = a > 10 ? 11 : 0;
		System.out.println(a);

		//質問３

		//"＝"は変数値ｃ、ｄに１を設定する
		int c = 1;
		int d = 1;

		//"=="は変数値ｃ、ｄを比較する
		if (c == d) {
			System.out.println("cとｄは等しいです。");
		}

		//質問４
		//ブリアン変数に設定可能の値はtrue、falseです。
		int e = 1;
		int f = 2;
		for (int j = 1; j < 3; j++) {
			boolean g = e < f;
			if (g) {
				System.out.println("g =" + g);
				e = e + j;
			} else {
				System.out.println("g =" + g);
			}
		}

		//質問６
		int x = 10;
		int y = 20;
		x = y;
		y = 30;
		//x=20
		System.out.println(x);
		//y=30
		System.out.println(y);
	}
}
