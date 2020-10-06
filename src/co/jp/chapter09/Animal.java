package co.jp.chapter09;

public class Animal {

	public static String name;
	public static int age;
	public static String type;
	
	
	public void sayHello() {
		System.out.println("にゃー");
	}
	
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Animal.name = name;
	}
	public static int getAge() {
		return age;
	}
	public static void setAge(int age) {
		Animal.age = age;
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		Animal.type = type;
	}
	
	
	
	

}
