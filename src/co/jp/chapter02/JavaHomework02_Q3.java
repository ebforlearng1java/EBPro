package co.jp.chapter02;

public class JavaHomework02_Q3 {

	//質問３：Float値⇒String文字列変更する場合、どうなメソッドを利用しますか？

	public static void main(String[] args) {

		float num = 1.0F;

		String i = String.valueOf(num);
		String j = i + "10";

		System.out.println(j);
	}
}
