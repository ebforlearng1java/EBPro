package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１
		// １行を出力する(\tはTab)
		System.out.println("this is line 1\tthis is line 2");

		// 2行を出力ため、下記を実行する（\nは改行）
		System.out.println("this is line 1\nthis is line 2");

		// 質問２
		// String の比較方法はequalsです。
		String a = new String("1");
		String b = new String("1");
		// equals はaとbの値を比較するので、trueを出力する。
		System.out.println(a.equals(b));
		// ==はaとbの格納位置を比較するので、falseを出力する。
		System.out.println(a == b);

		// 質問３
		// Float値⇒String⽂字列変更する場合、下記のメソッドを利⽤して、1.0Fを出力する。
		System.out.println(String.valueOf("1.0F"));

		// 質問４
		// 3.0を出力する。
		System.out.println(1.0 + 2.0);
		// 1.02.0を出力する。
		System.out.println(1.0 + "2.0");

		// 質問5
		int c = 10;
		// "c"を出力する。
		System.out.println("c");
		// 10を出力するため、下記を実行する。
		System.out.println(c);


	}

}
