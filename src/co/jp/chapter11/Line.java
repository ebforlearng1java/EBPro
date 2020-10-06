package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {

	public static void main(String[] args) {

		Station zhan = new Station();

		zhan.line();


		List<String> datas = new ArrayList<>();

		datas.add("新宿");
		datas.add("池袋");
		datas.add("渋谷");

		System.out.print("質問２：新橋駅は存在しますか？  ");

		for (String data : datas) {

			if (data == "新橋") {
				System.out.println("true");
			}

			else {
				System.out.println("false");
				break;
			}
		}

	}
}
