package co.jp.chapter08;

public class Animal {

	//名前
	public String name;

	//足
	public int legs;

	//年齢
	public int age;

	//タイプ:１、海　２、陸　３、空
	private String type;

	public void say(String word) {
		System.out.println(word);
	}

	public String getType(Animal an) {
		if(an instanceof Fish) {
			this.type = "1";
		}else if (an instanceof Dog) {
			this.type = "2";
		}else if (an instanceof Bird) {
			this.type = "3";
		}else {
			this.type = "0";
		}
		return type;
	}




}
