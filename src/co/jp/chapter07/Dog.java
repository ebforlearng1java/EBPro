package co.jp.chapter07;

public class Dog {

	//name
	private String name;

	//age
	private int age;

	//sex
	private String sex;


	//暗然なコンストラクタ
	//暗然なコンストラクタを明示化にする
	//特殊のメソッド
//	Dog()
//	{
//		インスタンスを返す処理
//	}

	//カプセル
	Dog(String name, int age, String sex){
		//初期化
		//全部　　　＝　局部
		this.name = name;
		this.age = age;
		this.sex = sex;
	}



//	Dog(int age, String sex){
//
//		this.age = age;
//		this.sex = sex;
//	}


	public Dog() {
		// TODO 自動生成されたコンストラクター・スタブ
	}


//	public Dog(String name, int age, String sex) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.sex = sex;
//	}


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
