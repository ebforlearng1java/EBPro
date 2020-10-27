package co.jp.chapter12;

public class JavaHomeWork12 {

	//質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生します。
	//該当例外を処理するサンプルコードを書いてください。
	public static void main(String[] args){
			    try {
			      int[] intArray = new int[5];
			      System.out.println("intArray[10]に数値を代入します。");
			      intArray[10] = 50;
			      System.out.println("intArray[10]に50を代入しました。");
			    } catch (ArrayIndexOutOfBoundsException e) {
			      System.out.println("配列の範囲外を指定しています。");
			    }
			    System.out.println("処理終了");
			  }


	//質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
	//商⽤アプリで利⽤しています。






}
