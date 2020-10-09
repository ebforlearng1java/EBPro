package co.jp.chapter10;

import java.text.DecimalFormat;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１︓以下３行文字列を「改行コード」と「,」を分割して２つペットオブジェクトを作成してください。

		// 質問２︓Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
		// の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦を取得してください。
		System.out.println(getFileType("c:\\windows\\aa.xlsx"));
		System.out.println(getFileType("c:\\windows\\a a.test"));
		System.out.println(getFileType("c:\\windows\\aa.bb.docx"));
		System.out.println(getFileType("c:\\windows\\aaaa"));

		// 質問３︓Javaには、すべての文字コードはUTF-8であり。日本語（全角文字）の場合１文
		// 字 = 3バイト。以下文字列のバイト数と桁数を求めてください。
		// 答え：以下文字列valueのバイト数は40、桁数は20；

		String value = "abced12345あいうえお１２３４５";
		byte[] buff = value.getBytes();
		System.out.println(buff.length);
		System.out.println(String.valueOf(value).length());

		// 質問４︓各現場は文字列に null 又は empty 判断要共通メソッドを実装しています。似て
		// いるメソッドを実装してください。
		String value_01 = null;
		String value_02 = "";
		System.out.println(nullOrEmpty(value));
		System.out.println(nullOrEmpty(value_01));
		System.out.println(nullOrEmpty(value_02));

		// 質問５︓以下仕様のフォーマティング指示コードを作成してくだい。
		// 1. 浮動⼩数点数
		// 2. 長さは5桁数
		// 3. 精度は小数点後2位

		float num_01 = 1.234F;
		System.out.println(new DecimalFormat("00.00").format( num_01));

		// 質問６︓整数16の16進数をSystem.out.println()してください。
		int num_10 = 16;
//		String num_16 = Integer.toHexString(num_10);
//		System.out.println(num_16);
		System.out.println(String.format("%x", num_10));
	}

	public static String getFileType(String path) {
		String filePath = path;
		String[] strArray = filePath.split("\\.");
		int kakuChoshiIndex = strArray.length-1;
		if(kakuChoshiIndex != 0) {
			return strArray[kakuChoshiIndex];
		}else {
			return "";
		}
//		File file = new File(path);
//		String name = file.getName();
//		if (name.('.')) {
//			String kakuChoshi = name.substring(name.lastIndexOf(".")+1);
//			return kakuChoshi;
//		}else {
//			return null;
//		}
	}

	public static boolean nullOrEmpty(String value) {
		if (value == null || value.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}



}
