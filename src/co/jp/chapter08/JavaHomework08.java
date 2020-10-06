package co.jp.chapter08;

public class JavaHomework08 {




	//質問： 以下コードのコンパイルエラー理由を教えてください。
	//public final class Parent {}

	//public class Child extends Parent {}

	// 答え： finalキーワードが指定された場合、該当クラスは継承不可になるため、Parentクラスはアクセス不可。


	//質問１：以下コードの出力するを回答してください。

	//String x = "a";
	//String y = "a";
	//System.out.println(x == y);// true ? false? 原因は ?
	//答え： true。  原因：==で比較して、型と値は同じ。
	//System.out.println(x.equals(y)); // true ? false? 原因は ?
	//答え： true。  原因：メソッドequals()で比較して、型と値は同じ。



	//質問２：以下コードの出力するを回答してください。

	 private String id;
	 public JavaHomework08(String id) {
	 this.id = id;

     }
	 @Override
	 public boolean equals(Object another) {
	 if (another instanceof  JavaHomework08) {
	 JavaHomework08 an = (JavaHomework08) another;
	 return an.id.equals(id);
	 }
	 return false;
	 }

	 public static void main(String...args) {
	 JavaHomework08 x = new JavaHomework08("1234");
     JavaHomework08 y = new JavaHomework08("1234");
	 System.out.println(x == y); // true ? false? 原因は ?

		//答え： false。  原因：値が同じであっても参照先が違うので、falseが出力される。

     System.out.println(x.equals(y)); // true ? false? 原因は ?
   }
	    //答え： true。    原因：メソッドequals()で比較して、型と値は同じ。


	//質問３：以下コンパイルを修正してください。

    // 答え：  クラスKickerを参照してください。



}
