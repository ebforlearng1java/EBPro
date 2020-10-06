package co.jp.chapter07;

public class Cat {

	static int count=0;

	//名前
	private String name;

	//年齢
	private int age;

	//性別
	private String sex;

	public Cat(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		Cat.sum();
	}

	public static void sum() {
		count+=1;
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
