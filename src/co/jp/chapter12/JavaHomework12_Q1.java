package co.jp.chapter12;

public class JavaHomework12_Q1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] family = { "パパ", "ママ", "子供" };
		try {

			for (int i = 0; i < 4; i++) {
				System.out.println(family[i]);
			}
		} catch (ArrayIndexOutOfBoundsException error) {

			System.out.println("範囲外になった。");
		}
		System.out.println("家族全部を表示した。");
	}
}
