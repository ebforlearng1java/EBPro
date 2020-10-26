package co.jp.chapter11;

public class JavaHomeWork11 {


//質問１、質問２：
//答：クラスStationとクラスLineを参考してください


//質問３：
		public static void main(String[] args) {
			for (int i = 1; i <= 31 / 5; i++) {
				if (i * 5 <= 31) {
					System.out.println("車両番号" + i + "の人数:" + 5);
					 }
			}

				int j = 31 / 5 + 1;
				int m = 31 % 5;
				if (31 % 5 > 0) {
					System.out.println("車両番号" + j + "の人数:" + m);
				}
					for (int train = j + 1; train <= 10; train++) {
						System.out.println("車両番号" + train + "の人数:" + 0);

					}
 		 }
}
