package co.jp.chapter11;

import java.util.HashMap;
import java.util.Map;

public class JavaHomeWork11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 質問１
		//クラスLineとStationを参照してください。
		Line line = new Line();
		station station = new station();
		line.yamanotsenn.add(station.station1);
		line.yamanotsenn.add(station.station2);
		line.yamanotsenn.add(station.station3);
		line.yamanotsenn.add(station.station4);
		line.yamanotsenn.add(station.station5);
		line.yamanotsenn.add(station.station6);
		line.yamanotsenn.add(station.station7);
		line.yamanotsenn.add(station.station8);
		line.yamanotsenn.add(station.station9);
		line.yamanotsenn.add(station.station10);
		line.yamanotsenn.add(station.station11);
		line.yamanotsenn.add(station.station12);
		line.yamanotsenn.add(station.station13);
		line.yamanotsenn.add(station.station14);
		line.yamanotsenn.add(station.station15);
		line.yamanotsenn.add(station.station16);
		line.yamanotsenn.add(station.station17);
		line.yamanotsenn.add(station.station18);
		line.yamanotsenn.add(station.station19);
		line.yamanotsenn.add(station.station20);
		line.yamanotsenn.add(station.station21);
		line.yamanotsenn.add(station.station22);
		line.yamanotsenn.add(station.station23);
		line.yamanotsenn.add(station.station24);
		line.yamanotsenn.add(station.station25);
		line.yamanotsenn.add(station.station26);
		line.yamanotsenn.add(station.station27);
		line.yamanotsenn.add(station.station28);
		line.yamanotsenn.add(station.station29);
		System.out.println(line.yamanotsenn);

		// 質問2
		for (String stationsearch : line.yamanotsenn) {
			if (stationsearch == station.station12) {
				System.out.println("新橋駅があります");
			}
		}

		// 質問3
		Map<String, String> passenger = new HashMap<>();
		passenger.put("1", "car1");
		passenger.put("2", "car1");
		passenger.put("3", "car1");
		passenger.put("4", "car1");
		passenger.put("5", "car1");
		passenger.put("6", "car2");
		passenger.put("7", "car2");
		passenger.put("8", "car2");
		passenger.put("9", "car2");
		 passenger.put("10", "car2");
		 passenger.put("11", "car3");
		 passenger.put("12", "car3");
		 passenger.put("13", "car3");
		 passenger.put("14", "car3");
		 passenger.put("15", "car3");
		 passenger.put("16", "car4");
		 passenger.put("17", "car4");
		 passenger.put("18", "car4");
		 passenger.put("19", "car4");
		 passenger.put("20", "car4");
		 passenger.put("21", "car5");
		 passenger.put("22", "car5");
		 passenger.put("23", "car5");
		 passenger.put("24", "car5");
		 passenger.put("25", "car5");
		 passenger.put("26", "car6");
		 passenger.put("27", "car6");
		 passenger.put("28", "car6");
		 passenger.put("29", "car6");
		 passenger.put("30", "car6");
		 passenger.put("31", "car7");
		 for (Map.Entry<String, String> entry : passenger.entrySet()) {
		 System.out.println( "passenger" + entry.getKey() + " is in " + entry.getValue());
		 }




	}

}
