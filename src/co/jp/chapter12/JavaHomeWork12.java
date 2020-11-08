package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {

		//		質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣
		//		します。該当例外を処理するサンプルコードを書いてください。
		//答え：
		try {
			int[] array = { 1, 2 };
			System.out.println(array[5]);

		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a.getMessage());
		}

		//		質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
		//		商⽤アプリで利⽤しています。
		//答え：半角数字以外の文字がある場合は、例外をスローする
		try {
			doCheck("12345");
			doCheck("１２３４５");
		} catch (ValidationException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void doCheck(String name) throws ValidationException {
		if (!name.matches("^[0-9]+$")) {
			// 例外をthrowする
			throw new ValidationException("名称", "半角数字を入力してください。");
		}
		else {
			System.out.println(name);
		}
	}
}
