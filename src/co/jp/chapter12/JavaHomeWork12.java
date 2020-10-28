package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException
		//例外を発生します。該当例外するサンプルコードを書いてください。
		//A1:

		try {
			int[] ary = {1, 2, 3};
            System.out.println(ary[3]);

		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
			System.out.println("問題のエラーが出ました");

		}catch(Exception e) {
			System.out.println("何かのエラー");
		}



		//Q2:Validation Exception を作成して、ユーザー入力した値を検証します。
		//該当は実際商用アプリで使用しています

		//申し訳ございません。やっていません。


//			if(name.matches("^[0-9]+$")) {
//				throw new ValidationException("名称","半角数字を入力してください。")；
//			}


	}

	//A2
	public class ValidationException extends Exception{
		private String name;
		private String message;
	}


}
