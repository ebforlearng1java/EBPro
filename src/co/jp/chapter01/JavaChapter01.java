package co.jp.chapter01;

public class JavaChapter01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//		boolean flg = true;
//
//		//変数の宣言
//		boolean result = true;
//		char capitalC = 'c';
//		byte b = 100;
//		short s = 10000;
//		int i;//初期値を設定しない
//
//		//変数の値を再設定
//		int a = 10;
//		a = 100;
//
//		//型変換
//		float x = 10.1F;
//		int y = (int)x;
//
//		float f = 10.1F;
//		double n = (double)f;

		//算術演算子
//		int a = 15;
//		int b = 10;
//		System.out.println(a+b);//25
//		System.out.println(a-b);//5
//		System.out.println(a*b);//150
//		System.out.println(a/b);//1  ★0(精度)
//		System.out.println(a%b);//5
//		System.out.println(++a);//16
//		System.out.println(a++);//16
//		System.out.println(--a);//16
//		System.out.println(a--);//16

		//関係演算子
//		int a = 15;
//		int b = 10;
//		boolean c = a>b;
//		System.out.println(a > b);//true
//		System.out.println(a >= b);//true
//		System.out.println(a == b);//false
//		System.out.println(a != b);//true
//		System.out.println(a < b);//false
//		System.out.println(a <= b);//false

		//論理演算子
//		int a = 10;
//		int b = 15;
//		if(a < b || b == a) {
//			System.out.println("a < b また a = b");
//		}
//
//		if(a < b && b == a) {
//			System.out.println("a < b かつ a = b");
//		}
//
//		if(!(a > b)) {
//			System.out.println("a < b また a = b");
//		}

		//条件論理演算子
		int a = 3;
		int b = 4;
		int max = (a>b)? a : b;
		System.out.println(max);

	}

}
