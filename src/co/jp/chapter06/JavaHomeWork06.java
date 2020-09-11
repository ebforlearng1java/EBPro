package co.jp.chapter06;

public class JavaHomeWork06 {


	//途中です、日曜日あるいは月曜日する

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下関数の修飾子、返却型、関数名、引数(引数の型、名称)を回答してください
		//　public static void main (String[] args)
		//A 修飾子public static、返却型void、関数名main、引型String[]、引数名args、

		JavaHomeWork06 obj = new JavaHomeWork06();

		//Q3
		String x = null;
		sayHello(x);
		System.out.println(x);


		//Q4
		String[] array4 = new String[] {"value1"};
		fillArray4(array4);
		System.out.println(array4[0]);

		//Q5
		String[] array5 = null;
		fillArray5(array5);
		System.out.println(array5==null);

	}


	//Q2
//	public static int max(int[] datas) {
//
//	}

	//Q3
	private static void sayHello(String y) {
		y="Hello world";
	}


	//Q4
	private static void fillArray4(String[] array4) {
		array4[0] = "value2";
	}

	//Q5

	private static void fillArray5(String[] array) {
		array = new String[] {"1","2"};
	}




//	public class Kicher{
//		private static void sayHello(string y) {
//			y="Hello world";
//		}
//		public static void main (String args[]) {
//			String x | null;
//			sayHello(x);
//		}
//	}


}
