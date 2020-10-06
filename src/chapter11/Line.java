package chapter11;

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
		
		
		}
	
	
	
}
