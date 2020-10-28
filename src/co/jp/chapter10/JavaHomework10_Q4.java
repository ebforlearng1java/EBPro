package co.jp.chapter10;

public class JavaHomework10_Q4 {
	public static void main(String[] args) {

		// 文字列を作成し、判定
		String Str = "あいうえお";
		System.out.println(nullOrEmpty(Str));

		// 空の文字列を作成し、判定
		String emptyStr = "";
		System.out.println(nullOrEmpty(emptyStr));

	}

	public static boolean nullOrEmpty(String value) {

		if (value.isEmpty()) {
			return false;
		} else {
			return true;
		}

	}
}
