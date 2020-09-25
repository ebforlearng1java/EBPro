package co.jp.chapter07;

public class Cat {

	//あり　かつ　のみ　
	static int count = 0;

	private static String name;

	private int age;

	private String sex;

	public Cat(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;

	}

	private static void sum() {
		count +=1;
		name  = "abc";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getSex() {
		return sex;
	}



}
