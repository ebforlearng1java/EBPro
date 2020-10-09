package co.jp.chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
		// てオブジェクト「山手線」を作成してください。「山手線」に各駅情報を追加してください。
		Line YAMATE = new Line();
		YAMATE.stations = new ArrayList<>();

		Station ikeBukuro = new Station();
		ikeBukuro.stationName = "池袋駅";

		Station takaDababa = new Station();
		takaDababa.stationName = "高田馬場駅";

		Station shiJhuku = new Station();
		shiJhuku.stationName = "新宿駅";

		YAMATE.stations.add(0, ikeBukuro.stationName);
		YAMATE.stations.add(1, takaDababa.stationName);
		YAMATE.stations.add(2, shiJhuku.stationName);

		System.out.println(YAMATE.stations);


		// 質問２︓質問１に作成した山手線の駅を foreach 文を繰り返して、新橋駅は路線内であるかを判断する。
		for(String station:YAMATE.stations) {
			if(station.equals("新橋駅")) {
				System.out.println("新橋駅は路線内である！");
			}else {
				System.out.println("新橋駅は路線内ではない！");
				break;
			}
		}

		// 質問３︓10両編成している通勤電車、各車の定員は5人です。31人の乗車の状況をプログ
		// ラミングしてください。（for文で旅客作成しても構わない）
		Map<String,List<String>> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		int numOfPeople = 0;
		for(int i= 1;i<=5;i++) {
			list.add("第"+i+"人");
		}
		for(int j=1;j<=10;j++) {
				map.put("第"+j+"両車",list);

			}
		System.out.println(map);



		}





}
