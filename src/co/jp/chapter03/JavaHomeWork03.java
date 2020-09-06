package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//03 フロー制御
		//質問1
		int a = 56;
		String A = "90以上";
		String B = "80-89";
		String C = "70-79";
		String D = "60-69";
		String E = "0-59";
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90) {
			System.out.println("A");
		} else if (80 <= a && a < 90) {
			System.out.println("B");
		} else if (70 <= a && a < 80) {
			System.out.println("C");

		} else if (60 <= a && a < 70) {
			System.out.println("D");

		} else {
			System.out.println("E");
		}

		System.out.println("ここからは質問２の処理です。");

		//質問２
		int q = 0;//1円のコイン数
		int w = 0;//5円のコイン数
		int e = 0;//10円のコイン数
		int t = 0;//100円のコイン数
		int y = 0;//500円のコイン数
		int i = 3340;
		for (; i >= 500; i = i - 500) {
			System.out.println("500円は" + y++);
			System.out.println("残りは" + i);

		}
		for (; i >= 100; i = i - 100) {
			System.out.println("100円は" + t++);
			System.out.println("残りは" + i);

		}
		for (; i >= 10; i = i - 10) {
			System.out.println("10円は" + e++);
			System.out.println("残りは" + i);

		}
		for (; i >= 5; i = i - 5) {
			System.out.println("5円は" + w++);
			System.out.println("残りは" + i);
		}
		for (; i >= 1; i = i - 1) {
			System.out.println("1円は" + q++);
			System.out.println("残りは" + i);
		}
		System.out.println("500円のコイン数" + y);
		System.out.println("100円のコイン数" + t);
		System.out.println("10円のコイン数" + e);
		System.out.println("5円のコイン数" + w);
		System.out.println("1円のコイン数" + q);
	}

}
