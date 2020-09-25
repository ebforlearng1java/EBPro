package co.jp.chapter06;

public class Dummy {
	public static void main(String[] args) {

	}

	private String name;
	private String sex;

	public String getName() {
		return name;

	}

	public Dummy(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String setName(String name) {
		return this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public String setSex(String sex) {
		return this.sex = sex;
	}
}