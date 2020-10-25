package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Station station = new Station();

		for (int i = 0; i < station.yamanote.length; i++) {
			list.add(station.yamanote[i]);
			System.out.println(list.get(i));
		}
	}

}
