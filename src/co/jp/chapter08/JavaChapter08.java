package co.jp.chapter08;

public class JavaChapter08 {

	public static void main(String[] args) {


//		Animal an = new Animal();
//		an.name = "Animal";
//		System.out.println("親クラスの属性を設定する： "+an.name);
//
//
//
//
//		Fish nimo = new Fish();
//		nimo.name = "NIMO";
//		System.out.println("サブクラスの属性を設定する： "+nimo.name);
//
//
//
//
//
//		Dog wangwang = new Dog();
//		wangwang.say("WOWOWO");
//
//
//
//
//		Car taxi = new Car();
//		//System.out.println(taxi.luntai.lungu);
//
//		 System.out.println(an instanceof Fish); // false
//		 System.out.println(nimo instanceof Animal); // true

		Animal an = new Animal();
		handan(an);

		Fish nimo = new Fish();
		handan(nimo);

		Dog snoopy = new Dog();
		handan(snoopy);

		Bird wudi = new Bird();
		handan(wudi);

		Iruka iruka = new Iruka();
		handan(iruka);

		Mguro m = new Mguro();
		handan(m);

	}

	 static void handan(Animal an) {
		System.out.println(an.getType(an));
	}

}
