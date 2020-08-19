package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//https://github.com/ebforlearng1java/EBPro
		//ebforlearng1java
		//learng1java

		// String
		String name = "SQM" ;
		System.out.print("name:"); //固定文言を出力
		System.out.println(name);  //変数の値を出力


		//2つ文字列の変数を定義　値が一致する
		String str1 = "hello";
		String str2 = "hello";
		int inte1 = 123;

		System.out.println(str1);
		System.out.println(str2);
		System.out.println("変数の宣言(方式１)："+ (str1 == str2));

		String str3 = new String("hello");
		String str4 = new String("hello");
		//int inte2 = new Integer(1234);

		System.out.println(str3);
		System.out.println("変数の宣言(方式2)："+ (str3 == str4));
		System.out.println("変数の宣言(方式3)："+ (str3.equals(str4)));


		//文字列の比較　
		// ==はNG　 １： メモリの物理アドレスを比較している　　2:値
		// .equals()  を使う

		//クラスは対象です

		///メモリ//////////////
		///*JAVA************//
		///***++str1+++++****//
		///***+++++++++++***///
		///***str3***********///
		///*****************///
		//////////////////////

		//String s = String.valueOf(i);
		//int i = Integer.parseInt(s);

	}

}
