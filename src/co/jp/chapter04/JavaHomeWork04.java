package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//Q1:int[] array1 = new int[4];各要素の値を記載してください
		//A:0	0	0	0
		int[] array1 = new int[4];
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		System.out.println("-------------");


		//Q2:int[] array2 = new int[] {5,6};各要素の値を記載してください
		//A:5	6
		int[] array2 = new int[] {5,6};
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("-------------");


		//Q3:int[][] array3= new int[2][3];各要素の値を記載してください
		//A:0	0	0	0	0	0
		int[][] array3= new int[2][3];
		for(int i=0; i<array3.length;i++) {
			for(int j=0;j<array3[i].length;j++) {
				System.out.println(array3[i][j]);
			}
		}


		System.out.println("-----Q4--------");
		//Q4:以下2重Foreachを理解してください
		//A:
		int[][] array2d = new int[4][2];   //配列の宣言
		for (int[] out : array2d) {        //配列の値をoutに代入する、繰り返し
			for(int inner : out ) {        //outの値をinnerに代入する、繰り返し
				System.out.println(inner); //出力
			}
		}
		System.out.println("-------------");


		//Q5:int[] array5 = new int[] {1,3,5,7,100,10,1};
		//左の配列の最大値と最小桁値をSystem.out.println();
		//A:
		int[] array5 = new int[] {1,3,5,7,100,10,1};
		int max5=0;
		int min5=999999999;
		for(int i=0; i<array5.length; i++) {
//			System.out.println(array5[i]);
			if(array5[i]>max5) {
				max5=array5[i];
			}
			if(array5[i]<min5) {
				min5=array5[i];
			}
//			System.out.println(amx5);

		}
		System.out.println(max5);
		System.out.println(min5);


		System.out.println("-------------");


		//Q6:問題1の配列のSUMを求める
		//A:
		int[] array6 = new int[] {1,2,3,4};
		int sum6=0;
		for(int i=0; i<array6.length; i++) {

			sum6+=array6[i];
		}
		System.out.println(sum6);

		System.out.println("-------------");


		//Q7:行列(2次元配列)の和と積(簡単でよいので)を計算してください。
		//A:
		int[][] array7 = new int[][] {
			{1,2},
			{3,4}
		};

		int[][] array8 = new int[][] {
			{5,6},
			{7,8}
		};
		int[][] array9 = new int[2][2];
		int[][] array10 = new int[2][2];

		for (int i=0; i<array7.length ; i++) {
			for (int j=0; j<array8[i].length ; j++) {
				array9[i][j]=array7[i][j]+array8[i][j];
				System.out.print(array9[i][j]+",");
			}
			System.out.println("");
		}
		for (int i=0; i<array7.length ; i++) {
			for (int j=0; j<array8[i].length ; j++) {
				array10[i][j]=array7[i][j]*array8[i][j];
				System.out.print(array10[i][j]+",");
			}
			System.out.println("");
		}






	}

}
