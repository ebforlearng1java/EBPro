package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問１：int[] array = new int[4]; 各要素の値を記載してください。

		int[] array1 = new int[4];
		System.out.println(array1[0]); //0
		System.out.println(array1[1]); //0
		System.out.println(array1[2]); //0
		System.out.println(array1[3]); //0
		//{0,0,0,0}


		//質問２：int[] array = new int[] {5,6};各要素の値を記載してください。

		int[] array2 = new int[] {5,6};
		System.out.println(array2[0]); //5
		System.out.println(array2[1]); //6


		//質問３：int[][]array = new int[2][3];各要素の値を記載してください。

		int[][]array3 = new int[2][3];//２行３列の配列 {0,0,0},{0,0,0}
		System.out.println(array3[0][0]); //0
		System.out.println(array3[0][1]); //0
		System.out.println(array3[0][2]); //0
		System.out.println(array3[1][0]); //0
		System.out.println(array3[1][1]); //0
		System.out.println(array3[1][2]); //0


		//質問４：以下２重Foreachを理解してください。

		int[][] array2d = new int[4][2];//４行２列の配列 {0,0},{0,0},{0,0},{0,0}
		for (int[] out : array2d) {      //array2d⇒out
			 for (int inner : out) {    //out⇒inner
			 System.out.println(inner);  //配列の要素を出力する。 0 0 0 0 0 0 0 0
			 }
		}


		//質問５：int[] array = new int[] {1,3,5,7,100,0,1};左の配列の最大値と最小桁値をSystem.out.println()。

		int[] array5 = new int[] {1,3,5,7,100,0,1};
		System.out.println(array5[4]);//最大値は100
		System.out.println(array5[5]);//最小値は0

		//最小桁値：1桁（0は桁数なし）
		System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[3]);
		System.out.println(array5[6]);


		//質問６：問題１の配列のSUMを求める。

		//int[] array1 = new int[4];

		//array1[0] = 0
		//array1[1] = 0
		//array1[2] = 0
		//array1[3] = 0

		//SUM = 0


		//質問７：行列（２次元配列）の和と積を計算してください。

		int[][]array7 = new int[3][2];

			array7[0][0] = 1;
			array7[0][1] = 2;
			array7[1][0] = 3;
			array7[1][1] = 4;
			array7[2][0] = 5;
			array7[2][1] = 6;

		System.out.println(array7[0][0]+array7[0][1]+array7[1][0]+array7[1][1]+array7[2][0]+array7[2][1]);//21
		System.out.println(array7[0][0]*array7[0][1]*array7[1][0]*array7[1][1]*array7[2][0]*array7[2][1]);//720



















































	}

}
