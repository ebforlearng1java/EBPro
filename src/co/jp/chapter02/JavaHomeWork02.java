package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


//		質問１︓System.out.println(“this is line1\tthis line2“); は何行出力しますか？
//		答え： １行
//
//		質問２︓Stringを比較方法は？
//		答え： equals
//
//		質問３︓Float値⇒String文字列変更する場合、どうなメソッドを利用しますか？
//		答え：String.valueOf(“1.0F“)

//		★質問３の修正：
//		Float値⇒String文字列変更する場合、どうなメソッドが正しいですか？
//		1. String.valueOf("1.0F")
//		2. 1.0F + ""
		
//		答え：2. 1.0F + ""

		System.out.println(String.valueOf("1.0F"));//1.0F
		System.out.println(String.valueOf(1.0F));//1.0
		System.out.println(1.0F + "");//1.0
//
//
//
//		質問４︓以下式の値を記載してください。
//		答え：1.0 + 2.0　の値は　3.0
//		答え：1.0 + “2.0“　の値は　1.02.0
//
//		質問５︓以下ステートメントの出力を記載してください。
//		 public static void main(String[] args) {
//		 	int a = 10;
//		 	System.out.println("a");
//		}
//
//		答え：a



	}

}

