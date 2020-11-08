package co.jp.chapter10;

import java.io.UnsupportedEncodingException;

public class JavaHomeWork10 {

	public static void main(String[] args) throws UnsupportedEncodingException {

		//質問１︓以下３⾏⽂字列を「改⾏コード」と「,」を分割して２つペットオブジェクトを作成してください。
		//答え：
		String input = "みみ, 10,1\n レオ,1,0\n マル, 2,0";
		String[] petList = input.split("\n");//行毎で分ける

		for (String petStr : petList) {
			String[] petTemp = petStr.split(",");

			String name = petTemp[0].trim();
			int age = Integer.parseInt(petTemp[1].trim());
			PetType type = PetType.getById(petTemp[2].trim());

			Pet pet = new Pet(name, age, type);
			System.out.println("ペット名：" + pet.getName() + ",年齢：" + pet.getAge() + "歳,タイプ：" + pet.getType().getType());
		}

		//質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
		//の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
		//答え：
		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty

		//質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
		//字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
		//答え：バイト数は40, 桁数は20
		String value = "abced12345あいうえお１２３４５";
		System.out.println(value.getBytes("UTF-8").length);
		System.out.println(value.length());

		//質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似ているメソッドを実装してください。
		System.out.println(isNullOrEmpty(null));//true
		System.out.println(isNullOrEmpty(""));//true
		System.out.println(isNullOrEmpty("   "));//true
		System.out.println(isNullOrEmpty("aaa"));//false

		//質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
		//答え：3つ条件を達成するフォーマットは　%05.2f　です。
		System.out.println(String.format("%05.2f",12.3));

		//質問６︓整数16の16進数をSystem.out.println()してください。
		//答え：下記2つ方法で16進数に変換できる
		System.out.println(Integer.toHexString(16));
		System.out.println(Integer.toString(16,16));
	}

	public static String getFileType(String path) {
		int index = path.lastIndexOf(".");
		if (index > 0) {
			String ext = path.substring(index + 1);
			return ext;
		} else {
			return "拡張子がありません。";
		}
	}

	public static boolean isNullOrEmpty(String value) {
		if (value == null) {
			return true;
		} else {
			value = value.trim();
			if (value.isEmpty()) {
				return true;
			}
			return false;
		}
	}
}
