package co.jp.chapter07;

public class Dog {

	// 名前
	private String name;

	// 年齢
	private int age;

	// 性別
	private String sex;

	// 暗然的なコンストラクタ
	// XXXXXX

//	// ①
//	// 暗然的なコンストラクタを明示化にする
//	Dog() {
//		// XXXXX インスタンスを返す処理
//	}

	// ②
	Dog(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// ③
//	Dog(String name) {
//		//初期化時、一部属性の値を設定する
//		this.name = name;
//	}

	//	void dog () {
	//		System.out.println("dog dog ");
	//	}

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
