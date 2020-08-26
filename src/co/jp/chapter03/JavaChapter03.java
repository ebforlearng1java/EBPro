package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str1 = "abc";
		String str3 = new String("abc");
		
		int i = 1;//変数
		
		if (i > 10) {
			// ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("変数.iはプラス");
		} else if (i < 0) {
			// イ:ア条件がfalseかつ、上記条件がtrueの場合
			// 下記処理を実行
			System.out.println("変数.iはマイナス");
		} else {
			// ウ: ア条件がfalseかつ、イ条件がfalseの場合
			// 下記処理を実行
			// 上記以外
			System.out.println("変数.iはゼロ");
		}

	}

}
