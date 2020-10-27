package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Station station = new Station();

		for (int i = 0; i < station.station.length; i++) {
			list.add(station.station[i]);
			if(list.get(i) == "新橋") {
				System.out.println("新橋駅は山手線の中にある");
			}
		}
	}

}
