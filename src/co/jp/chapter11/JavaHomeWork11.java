package co.jp.chapter11;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１:駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
		//てオブジェクト「山手線」を作成してください。「山手線」に各駅情報を追加してくださ
		//い。
//		public class Station {
//
//			String[]  trainYmanote = {"池袋","上野","新宿"};
//			public String[] gettrainYmanote() {
//				return trainYmanote;
//			}
//			public void settrainYmanote(String[] trainYmanote) {
//				this.trainYmanote = trainYmanote;
//			}
//		}
//		public class Line {
//			public static void main(String[] args) {
//
//				List<String> list = new ArrayList<String>();
//				Station station = new Station();
//
//				for(int i=0;i<station.trainYmanote.length;i++) {
//					list.add(station.trainYmanote[i]);
//					System.out.println(list.get(i));
//				}
//			}
//
//		}

		//質問２：質問１に作成した山手線の駅を foreach文を繰り返して、新橋駅は路線内である
		//かを判断する。
//		List<String> list = new ArrayList<String>();
//		Station station = new Station();
//
//		for(int i=0;i<station.trainYmanote.length;i++) {
//			list.add(station.trainYmanote[i]);
//			if (list.get(i)== "池袋") {
//				System.out.println("bingo");
//			}
//		}

		//質問３：10両編成している通勤電車、各車の定員は5⼈です。31人の乗車の状況をプログ
		//ラミングしてください。（for文で旅客作成しても構わない）
		for (int tarinA = 1; tarinA <= 31/5; tarinA++) {
			if (tarinA * 5 <= 31) {
				System.out.println("車両番号" + tarinA + "の人数:" + 5);
			}
		}
		int tarinB = 31/5 + 1;
		int tarinC = 31 % 5;
		if (31 % 5 > 0) {
			System.out.println("車両番号" + tarinB + "の人数:" + tarinC);
		}

		for (int T = tarinB + 1; T <= 10; T++) {
			System.out.println("車両番号" + T + "の人数:" + 0);
		}

	}

}
