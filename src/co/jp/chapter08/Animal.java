package co.jp.chapter08;

public class Animal {

	//名前
	String name;

	//年齢
	int age;

	//足
	int legs;

	//1:海　2;陸　3;空
	private String type;

	public void say(String word) {
		System.out.println(word);
	}

	public String getType(Animal an) {
		if(an instanceof Fish) {
			this.type="1海";
		}
		else if(an instanceof Dog) {
			this.type="2陸";
		}
		else if(an instanceof Bird) {
			this.type="3空";
		}
		else {
			this.type="0";
		}
		return type;
	}









}
