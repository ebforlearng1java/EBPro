package co.jp.chapter11;

import java.util.HashMap;
import java.util.Map;

public class JavaHomeWork11 {

	public static void main(String[] args) {
 		// TODO 自動生成されたメソッド・スタブ


//質問１、質問２：
//答：クラスStationとクラスLineを参考してください


//質問３：
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
 	for (Map.Entry<String,String> entry : passenger.entrySet()) {
 		System.out.println( "passenger" + entry.getKey() + " is in " + entry.getValue());
 	}
 		 }
}
