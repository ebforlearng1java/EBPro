package co.jp.chapter10;

public class Pet {
	//ペット名
	private String name;
	//年齢
	private int age;
	//ペットタイプ
	private PetType type;

	//コンストラクタ
	public Pet(String name, int age, PetType type) {
		this.name = name;
		this.age = age;
		this.type = type;
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
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}

}
