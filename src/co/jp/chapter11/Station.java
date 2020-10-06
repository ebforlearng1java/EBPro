package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Station {

	public static void main(String[] args) {
		List<String> eki = new ArrayList<>();
		eki.add("大崎");
		eki.add("五反田");
		eki.add("目黒");
		eki.add("大崎");
		eki.add("恵比寿");
		eki.add("渋谷");
		eki.add("原宿");
		eki.add("代々木");
		eki.add("新宿");
		eki.add("新大久保");
		eki.add("高田馬場");
		eki.add("目白");
		eki.add("池袋");
		eki.add("大塚");
		eki.add("巣鴨");
		eki.add("駒込");
		eki.add("田端");
		eki.add("西日暮里");
		eki.add("日暮里");
		eki.add("鶯谷");
		eki.add("上野");
		eki.add("御徒町");
		eki.add("秋葉原");
		eki.add("神田");
		eki.add("東京");
		eki.add("有楽町");
		eki.add("新橋");
		eki.add("浜松町");
		eki.add("田町");
		eki.add("高輪ゲートウェイ");
		eki.add("品川");
		for(Iterator<String> it = eki.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
	}

}
