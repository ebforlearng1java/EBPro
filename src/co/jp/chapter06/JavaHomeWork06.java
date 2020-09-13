package co.jp.chapter06;

public class JavaHomeWork06 {



	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//Q1:以下関数の修飾子、返却型、関数名、引数(引数の型、名称)を回答してください
		//　public static void main (String[] args)
		//A 修飾子public static、返却型void、関数名main、引型String[]、引数名args、

		JavaHomeWork06 obj = new JavaHomeWork06();



		//Q2:配列の和、MAX値、MIN値を求める処理を関数化してください。
		//main関数に呼び出してください
		//A2 55行目からメソッドです

		int[] dt2= new int[] {5,1,3,5,7,9};
		int sum=sum(dt2);
		int max=max(dt2);
		int min=min(dt2);

		System.out.println("合計="+sum);
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);

		//Q3以下メソッドの実施結果を教えてください。
		//A3:  null

		String x = null;
		sayHello(x);
		System.out.println(x);


		//Q4以下メソッドの実施結果を教えてください。
		//A4 value2

		String[] array4 = new String[] {"value1"};
		fillArray4(array4);
		System.out.println(array4[0]);

		//Q5以下メソッドの実施結果を教えてください。
		//A5: true
		String[] array5 = null;
		fillArray5(array5);
		System.out.println(array5==null);

	}


	//A2
	public static int sum(int[] data2) {
		int sum2=0;
		for(int i=0;i<data2.length;i++) {
			sum2 += data2[i];
		}
		return sum2;

	}

	public static int max(int[] data2) {
		int max2=data2[0];
		for(int i=0;i<data2.length;i++) {
			if(max2 <data2[i]) {
				max2=data2[i];
			}
		}
		return max2;

	}


	public static int min(int[] data2) {
		int min2=data2[0];
		for(int i=0;i<data2.length;i++) {
			if(min2 >data2[i]) {
				min2=data2[i];
			}
		}
		return min2;

	}



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

}
