package co.jp.chapter12;

import java.util.Scanner;

public class JavaHomeWork12 {

	// 質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発生
	//        します。該当例外を処理するサンプルコードを書いてください。
	public static void main(String[] args) throws ValidationException {

		try {
			// サンプルコード
			int[] array = new int[] {1,2,3};
			System.out.println(array[4]);

		} catch (ArrayIndexOutOfBoundsException e) {
			// エラーメッセージ
			System.out.println("配列の範囲外です");
		}

		// 質問２︓Validation Exceptionを作成して、ユーザー入力した値を検証します。該当は実際
		// 商⽤アプリで利用しています。
		Scanner scr = new Scanner(System.in);
        System.out.println("ユーザー名を入力してください：");
        String userName = scr.next();
        checkName(userName);

	}

	public static void checkName(String username) throws ValidationException {
		if(username.matches("^[ ]*[^ -~｡-ﾟ]*[ ]*$")) {
			 throw new ValidationException("半角名称を入力してください！");
			} else {
				System.out.println("正確");
			}

	}
}
