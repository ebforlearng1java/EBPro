package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public static void main(String[] args) {

		String[] array = new String[10];
		array[0] = "A";
		array[1] = "B";
		array[2] = "C";

		System.out.println(Arrays.toString(array));
		System.out.println(array.length);

		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("Ｂ");
		list.add("１２３１２３");
		list.toArray();
		System.out.println(list);
		System.out.println(list.size());



		//  KEY  =  Value
		Map<String,String> sexMap = new HashMap<String,String>();
		sexMap.put("1", "男性");
		sexMap.put("0", "女性");

		sexMap.put("0", "XXXXXX");
		sexMap.put("XXXXX", "男性");
		System.out.println(sexMap);



	}

}

