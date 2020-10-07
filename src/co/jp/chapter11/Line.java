package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		Station station = new Station();

		for(int i=0;i<station.yamate.length;i++) {
			list.add(station.yamate[i]);
			System.out.println(list.get(i));
		}
	}

}
