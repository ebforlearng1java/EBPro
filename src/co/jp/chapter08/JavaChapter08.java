package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		Animal an = new Animal();
//		an.name = "Animal";
//
//
//		System.out.println("親クラス属性を設定する:"+an.name);
//
//
//		Fish nimo = new Fish();
//		nimo.name = "NIMO";
//		System.out.println("サブクラス属性を設定する:"+nimo.name);
//
//
//		System.out.println("親クラス属性:"+an.name);
//
//
//		Dog wangwang = new Dog();
//		wangwang.say("WOWOWOWO");
//
//
//
//
//		Car taxi = new Car();
//		System.out.println(taxi.luntai.lungu);


		Animal an = new Animal();
		handan(an);

		Dog dog = new Dog();
		handan(dog);

		Fish fi = new Fish();
		handan(fi);

		Iruka ir = new Iruka();
		handan(ir);

		Maguro ma= new Maguro();
		handan(ma);


		Komori ko = new Komori();
		handan(ko);

		Galas ga = new Galas();
		handan(ga);


	}



	static void handan(Animal an) {
		System.out.println(an.getType(an));

	}



}
