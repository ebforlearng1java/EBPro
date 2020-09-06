package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		//05新米八問
		//質問1
		int sum = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "は偶数");

				sum += i;

			}
		}
		System.out.println("1から100まで偶数の和→" + sum);

		//質問2
		int m = 1;
		for (int i = 1; i < 6; i++) {
			m = m * i;

		}
		System.out.println("1から5までの階乗→" + m);

	}

}
