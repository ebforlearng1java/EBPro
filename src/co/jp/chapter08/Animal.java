package co.jp.chapter08;

public class Animal {



	// 名前
	public String name ;

	// 年齢
	public int age;

	// 足
	public int legs;


	// 1:海 2:陸 3:空  0:自身
	private String type;
	public String getType(Animal an) {
		if (an instanceof Fish) {
			this.type = "1:海";
		} else if (an instanceof Dog) {
			this.type = "2:陸";
		}else if (an instanceof Bird) {
			this.type = "3:空";
		} else {
			this.type = "0:自身";
		}
		return type;
	}



	public void say(String word) {
		System.out.println(word);
	}


}
