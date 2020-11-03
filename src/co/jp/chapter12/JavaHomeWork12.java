package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生
		//します。該当例外を処理するサンプルコードを書いてください。
		try {
			int[] arrey = {99, 98, 97};
            System.out.println(arrey[99]);

		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("エラーを発生します");

		}catch(Exception e) {
			System.out.println("例外");
		}

		//質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
		//商用アプリで利用しています。
		//すみません、できません


	}

}
