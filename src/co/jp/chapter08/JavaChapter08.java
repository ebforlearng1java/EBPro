package co.jp.chapter08;


public class JavaChapter08 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Animal an=new Animal();
		an.name="Animal";
		System.out.println(an.name);

		Fish nimo=new Fish();
		nimo.name="NIMO";
		System.out.println(nimo.name);

		System.out.println(an instanceof Fish);//false
		System.out.println(nimo instanceof Animal);//true

		Dog wangwang=new Dog();
		wangwang.say("wang");

		Car taxi =new Car();
//		System.out.println(taxi.luntai.lungu);

		handan(an);
		handan(nimo);
		handan(wangwang);

		Iruka iruka=new Iruka();
		Makuro makuro=new Makuro();
		handan(iruka);
		handan(makuro);

		Komori komori=new Komori();
		Garasu garasu=new Garasu();
		handan(komori);
		handan(garasu);

		Keji keji=new Keji();
		Jinmao jinmao=new Jinmao();
		handan(keji);
		handan(jinmao);

	}

	static void handan(Animal an) {
		System.out.println(an.getType(an));
	}

}
