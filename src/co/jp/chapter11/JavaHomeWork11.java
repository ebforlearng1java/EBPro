package co.jp.chapter11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/** 11 コレクション */

		//質問１︓駅クラス（Station）、路線クラス（Line）を作成して。路線をインスタンス化し
		//てオブジェクト「山手線」を作成してください。「⼭⼿線」に各駅情報を追加してください。
		//答え：Station.java、Line.javaと本クラスの24～39行目を確認してください。

		//質問２︓質問１に作成した⼭⼿線の駅を foreach ⽂を繰り返して、新橋駅は路線内であるかを判断する。較方法は？
		//答え：本クラスの41～43行目とsearchStationメソッドを確認してください。

		//質問３︓10両編成している通勤電車、各車の定員は5⼈です。31人の乗車の状況をプログ
		//ラミングしてください。（for⽂で旅客作成しても構わない）
		//答え：Densha.java、本クラスの47～59行目とcustomerSetメソッドを確認してください。

		//設定路線名と駅名を初期化する
		String lineName = "山手線";
		String stationNameArr[] = { "品川", "大崎", "五反田", "目黒", "恵比寿", "渋谷", "原宿", "代々木", "新宿", "新大久保",
				"高田馬場", "目白", "池袋", "大塚", "巣鴨", "駒込", "田端", "西日暮里", "日暮里", "鶯谷", "上野", "御徒町", "秋葉原",
				"神田", "東京", "有楽町", "新橋", "浜松町", "田町" };

		//各駅リストを作成する
		List<Station> stationList = new ArrayList<>();
		for (String item : stationNameArr) {
			Station station = new Station(item);
			stationList.add(station);
		}

		//「山手線」を作成して、各駅情報を設定する
		Line yamanote = new Line(lineName);
		yamanote.setStationList(stationList);

		//「山手線」に新橋駅があるかを判断する
		String searchName = "新橋";
		System.out.println("山手線に新橋駅があるか：" + searchStation(yamanote, searchName));

		//質問３の答え
		//電車情報を初期化する
		String denshaName = "Dummy";
		int size = 10;
		int perCusNum = 5;
		int passengerNum = 31;

		Densha densha = new Densha(denshaName, size, perCusNum);

		Map<String, Integer> map = customerSet(densha, passengerNum);
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "は車両" + entry.getValue() + "を乗る");
		}
	}

	public static boolean searchStation(Line line, String searchName) {

		for (Station station : line.getStationList()) {
			if (station.getStationName().equals(searchName)) {
				return true;
			}
		}

		return false;
	}

	public static Map<String, Integer> customerSet(Densha densha, int passengerNum) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();

		//乗車人数は電車のMAX人数より多い場合は、電車のMAX人数を設定する
		if (passengerNum > densha.getTotalCusNum()) {
			passengerNum = densha.getTotalCusNum();
		}

		int startCarNum = 1;
		for (int i = 1; i <= passengerNum; i++) {
			map.put("customer" + i, startCarNum);
			if (i % densha.getPerCusNum() == 0) {
				startCarNum++;
			}
		}
		System.out.println(map);

		return map;
	}
}
