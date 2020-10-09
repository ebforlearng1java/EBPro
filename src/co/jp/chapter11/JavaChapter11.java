package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> list_01 = new ArrayList<>();
		List<String> list_02 = new LinkedList<>();
		List<String> list_03 = new Vector<>();
		list_01.add("user_01");
		list_01.remove("user_01");
		list_01.clear();
		list_01.add("user_02");
		if(list_01.contains("user_02")) {
			System.out.println(list_01.indexOf("user_02"));
		}else {
			System.out.println("");
		}
		System.out.println(list_01.get(0));
		String[] datas = list_01.toArray(new String[0]);
		String[] datas_01 = new String[] {"item_01","item_02","item_03"};
		List<String> list_04 = Arrays.asList(datas_01);
		list_01.add("user_01");
		list_01.add("user_03");
		System.out.println(list_01);
		Collections.sort(list_01);
		System.out.println(list_01);
		Collections.sort(list_01,(t1,t2) ->{
			return t2.compareTo(t1);
		});
		System.out.println(list_01);

		Map<String,Object> map = new HashMap<>();
		map.put("key_01", "value_01");
		System.out.println(map);
		map.put("key_01", "value_02");
		System.out.println(map);
		map.remove("key_01");
		System.out.println(map);
		map.put("key_02","value_02");
		if(map.containsKey("key_02")) {
			System.out.println(map);
		}else {
			System.out.println("");
		}

		map.put("key_03", null);
		System.out.println(map.get("key_01"));
		System.out.println(map.get("key_02"));
		System.out.println(map.get("key_03"));
		System.out.println(map.getOrDefault("key_03","Empty"));
		System.out.println(map.getOrDefault("key_04","Empty"));
		System.out.println(list_01.size());
		for(Entry<String, Object> entry:map.entrySet()) {
			System.out.println("key=" +entry.getKey() + " value=" + entry.getValue());
		}

		Map<String , List<String>> map_01 = new HashMap<>();
		List<String> list = new ArrayList<>();
		list.add("2019/06/01");
		list.add("2019/06/02");
		list.add("2019/06/03");
		map_01.put("201906",list);
		System.out.println(map_01);

	}

}
