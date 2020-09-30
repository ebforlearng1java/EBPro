package co.jp.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaChapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		String[] array = new String[10];
		array[0] = "A";
		array[1] = "B";
		array[2] = "C";
		
		System.out.println(Arrays.toString(array));
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		System.out.println(list);
		
		
		//  Key  =  Value
		Map<String,String> map = new HashMap<String,String>();
		map.put("1", "男性");
		map.put("0", "女性");
		
		System.out.println(map);


	}

}
