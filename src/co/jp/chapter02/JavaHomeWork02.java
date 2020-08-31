package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 質問１: System.out.println(“this is line1\tthis line2“); は何行出力しますか？
		// 答え：1行。
		System.out.println("this is line1\tthis line2");

		// 質問２︓Stringを比較方法は？
		// 答え：2.equals。


		// 質問３︓Float値⇒String文字列変更する場合、どうなメソッドを利用しますか
		// 答え：1.String.valueOf(1.0F)。
		float num = 1.0F;
		String name = String.valueOf(num);
		String age = name + "10";
		System.out.println(age);

		// 質問４︓以下式の値を記載してください。
		// 1. 1.0 + 2.0
		// 答え：3.0

		// 2. 1.0 + "2.0"
		// 答え：1.02.0
		System.out.println(1.0 + 2.0);
		System.out.println(1.0 + "2.0");

		// 質問５︓以下ステートメントの出力を記載してください。
		int a = 10;
		System.out.println("a");
	}

}
