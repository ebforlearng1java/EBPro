package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Collection;
public class Line {
	//String Name;
	public static void main(String args[]) {
		Collection<String> yamanoteline = new ArrayList<>();
		yamanoteline.add("新宿");
		yamanoteline.add("代々木");
		yamanoteline.add("原宿");
		yamanoteline.add("渋谷");
		yamanoteline.add("恵比寿");
		yamanoteline.add("目黒");
		yamanoteline.add("五反田");
		yamanoteline.add("大崎");
		yamanoteline.add("品川");
		yamanoteline.add("高輪ゲートウェイ");
		yamanoteline.add("田町");
		yamanoteline.add("浜松町");
		yamanoteline.add("新橋");
		yamanoteline.add("有楽町");
		yamanoteline.add("東京");
		yamanoteline.add("神田");
		yamanoteline.add("秋葉原");
		yamanoteline.add("御徒町");
		yamanoteline.add("上野");
		yamanoteline.add("鶯谷");
		yamanoteline.add("日暮里");
		yamanoteline.add("西日暮里");
		yamanoteline.add("田端");
		yamanoteline.add("駒込");
		yamanoteline.add("巣鴨");
		yamanoteline.add("大塚");
		yamanoteline.add("池袋");
		yamanoteline.add("目白");
		yamanoteline.add("高田の馬場");
		yamanoteline.add("新大久保");


		boolean hasName = false;
		yamanoteline.forEach( i -> i.equals("新橋"));
		hasName = true;

	}



}
