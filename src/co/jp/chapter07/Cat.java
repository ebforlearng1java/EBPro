package co.jp.chapter07;

public class Cat {

	static int count = 0;// 有　かつ　のみ

	private String name;

	private int age;

	private String sex;

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		Cat.sum();
	}


	private static void sum() {
		count += 1;
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
