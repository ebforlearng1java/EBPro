package co.jp.chapter11;

public class Station {

	String station[] = {"新宿","池袋","渋谷"};

	public void line() {

		System.out.print("質問１：山手線：");
		System.out.print(station[0] + " ");
		System.out.print(station[1] + " ");
		System.out.println(station[2]);
	}

}
