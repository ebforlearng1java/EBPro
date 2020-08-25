package co.jp.chapter02;

public class JavaHomeWork02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:System.out.println(“this is line1\tthis line2“);は何行出力しますか？
		//A:1行　　this is line1 	 this is line2

		System.out.println("this is line1 \t this is line2 ");

		//Q2:Stringを比較方法は？
		//A:equals();

		//Q3:Float値⇒String文字列変更する場合、どうなメソッドを利用しますか
		//A:String.valueOf("1.0F")　と　1.0F＋""


		float num1= 1.0f;
		String str1= String.valueOf(num1);
		System.out.println(str1);

		System.out.println(String.valueOf("1.0F"));

		float num2= 1.0f;
		String str2=num2 + "";
		System.out.println(str2);


		//Q4:以下式の値を記載してください。
		//A:1.0+2.0=3.0      A2;1.0+"2.0"=1.02.0

		System.out.println(1.0+2.0);
		System.out.println(1.0+"2.0");

		//Q5:以下ステートメントの出力を記載してください。
		//A: a

		int a =10;
		System.out.println("a");

	}
}
