package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//https://github.com/ebforlearng1java/EBPro
		//ebforlearng1java
		//learng1java

//		String str1 = "hello";
//		String str3 = new String("hello");
//
//		if (str1 == str3) {
//			//true処理ロジック
//			System.out.println("str1とstr3が一致");
//		} else {
//			//false処理ロジック
//			System.out.println("str1とstr3が不一致");
//		}
//
//		int i=50;
//		if (i>10) {
//			//true処理ロジック
//			System.out.println("i>10");
//		} else {
//			//false処理ロジック
//			System.out.println("i<=10");
//		}
//

//		int i = 0;
//		if (i<0 && i>=-9 ) {
//			//ア：上記条件がture　下記処理
//			System.out.println("変数iはマイナスです");
//		}
//		else if (i>0 && i<=9) {
//			//イ：アの条件がfalse　かつ　上記条件が	tureの場合　下記処理
//			System.out.println("変数iはプラスです");
//		}
//		else if (i == 0) {
//			System.out.println("変数iはゼロです");
//		}
//		else{
//			//上記ア、イ以外　下記処理
//			System.out.println("input変数の値が計算対象外[-9～9]の間に指定ください");
//		}

		//switch 定数のみ byte short char int
//		int num=13;
//		switch(num) {
//			case -1:
//			case -2:
//			case -3:
//			case -4:
//			case -5:
//			case -6:
//			case -7:
//			case -8:
//			case -9:
//				System.out.println("変数iはマイナスです");
//				break;
//			case 1:
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//			case 6:
//			case 7:
//			case 8:
//			case 9:
//				System.out.println("変数iはプラスです");
//				break;
//			case 0:
//				System.out.println("変数iはゼロです");
//				break;
//			default:
//				System.out.println("input変数の値が計算対象外[-9～9]の間に指定ください");
//
//		}

		//loop　の一つはforループ
		//自然数　1,2,3,4,5,
		//0 はJAVAの一番目の位置
		//　index

		int con1=0;
		for(int i = 0; i < 100 ;i++) {
			//System.out.println(i);
			con1 = con1 +1;
		}
		System.out.println(con1);

		int con2=0;
		for(int i = 0; i <=100 ;i++) {
			//System.out.println(i);
			con2 = con2 +1;
		}
		System.out.println(con2);




























	}

}
