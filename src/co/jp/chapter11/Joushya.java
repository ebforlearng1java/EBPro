package co.jp.chapter11;

import java.util.HashMap;
import java.util.Map;

public class Joushya {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<String, String> map = new HashMap<>();
		 map.put("passenger1", "carriage1");
		 map.put("passenger2", "carriage1");
		 map.put("passenger3", "carriage1");
		 map.put("passenger4", "carriage1");
		 map.put("passenger5", "carriage1");
		 map.put("passenger6", "carriage2");
		 map.put("passenger7", "carriage2");
		 map.put("passenger8", "carriage2");
		 map.put("passenger9", "carriage2");
		 map.put("passenger10", "carriage2");
		 map.put("passenger11", "carriage3");
		 map.put("passenger12", "carriage3");
		 map.put("passenger13", "carriage3");
		 map.put("passenger14", "carriage3");
		 map.put("passenger15", "carriage3");
		 map.put("passenger16", "carriage4");
		 map.put("passenger17", "carriage4");
		 map.put("passenger18", "carriage4");
		 map.put("passenger19", "carriage4");
		 map.put("passenger20", "carriage4");
		 map.put("passenger21", "carriage5");
		 map.put("passenger22", "carriage5");
		 map.put("passenger23", "carriage5");
		 map.put("passenger24", "carriage5");
		 map.put("passenger25", "carriage5");
		 map.put("passenger26", "carriage6");
		 map.put("passenger27", "carriage6");
		 map.put("passenger28", "carriage6");
		 map.put("passenger29", "carriage6");
		 map.put("passenger30", "carriage6");
		 map.put("passenger31", "carriage7");
		 // マップのキーと値をペアでループする
		 for (Map.Entry<String, String> entry : map.entrySet()) {
		 System.out.println( "客=" + entry.getKey() + "; 車両=" + entry.getValue());
		 }

	}

}
