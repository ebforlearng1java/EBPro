package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Line {

	public static void main(String...args) {
		List<String> yamanote = new ArrayList<>();
		yamanote.add("上野");
		yamanote.add("日暮里");
		yamanote.add("東京");
		yamanote.add("新橋");
		for (String data : yamanote) {
			if(data == "新橋") {
				System.out.println("ある");
				break;
			}else {
				continue;
			}
			}
		
		
		List<String> densha = new ArrayList<>();
		densha.add("1号車");
		densha.add("2号車");
		densha.add("3号車");
		densha.add("4号車");
		densha.add("5号車");
		densha.add("6号車");
		densha.add("7号車");
		densha.add("8号車");
		densha.add("9号車");
		densha.add("10号車");
		int i = 0;
		for (String data : densha) {
			if(i < 10) {
				i++;
			}System.out.println(i + "人");
			
			
			
		}
		
		
		
		
		
		
		}
	
	
	
}
