package co.jp.chapter07;

public class JavaHomeWork08 {

	public static void main(String[] args) {

		//05の質問8の答え
		int rows = 10;
		for (int i = 0; i < rows; i++) {
			int number = 1;
			System.out.format("%" + (rows - i) * 2 + "s", "");
			for (int j = 0; j <= i; j++) {
				System.out.format("%4d", number);
				number = number * (i - j) / (j + 1);

			}
			System.out.println(i);

		}
	}

}
