package co.jp.chapter07;

public class Dog {

	//名前
	private String name;

	//年齢
	private int age;

	//性別
	private String sex;

	public Dog() {
	}

	public Dog(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}

	public Dog(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
