package co.jp.chapter11;

public class JavaHomework11 {

	//質問１：駅クラス（Station）、路線クラス（Line）を作成して。
	//路線をインスタンス化してオブジェクト「山手線」を作成してください。各駅情報を追加してください。

	//質問２：質問１に作成した山手線の駅を foreach 文を繰り返して、新橋駅は路線内であるかを判断する。


	//Line.java　と　Station.javaを参考してください。


	//質問３：10両編成している通勤電車、各車の定員は5人です。31人の乗車の状況をプログラミングしてください。
	//（for文で旅客作成しても構わない）

	public static void main(String[] args) {

		for (int no1 = 1; no1 <= 31 / 5; no1++) {

			if (no1 * 5 <= 31) {
				System.out.println("車両番号" + no1 + "の人数:" + 5);
			}
		}

		int no2 = 31 / 5 + 1;
		int no3 = 31 % 5;

		if (31 % 5 > 0) {
			System.out.println("車両番号" + no2 + "の人数:" + no3);
		}

		for (int train = no2 + 1; train <= 10; train++) {
			System.out.println("車両番号" + train + "の人数:" + 0);
		}
	}
}
