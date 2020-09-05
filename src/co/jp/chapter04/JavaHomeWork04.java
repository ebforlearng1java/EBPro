package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//問題１︓int[] array = new int[4]; 各要素の値を記載してください。
		//全部ゼロになります。
//		int[] array = new int[4];
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		//問題２︓int[] array = new int[] {5, 6}; 各要素の値を記載してください。
		//5と6になります。
//		int[] array = new int[] {5,6};
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
		
		//問題３︓int[][] array = new int[2][3]; 各要素の値を記載してください。
		//一行目の配列は0,0,0　二行目の配列は0,0,0
//		int[][] array = new int[2][3] ;
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j] );
//			}
//			System.out.println();
//		}
		
		//問題４︓以下２重Foreachを理解してください。
		//outは[4]の配列数
		//innerは[2]の配列数
//		int[][] array2d = new int[4][2];
//		for (int[] out : array2d) {
//			for(int inner : out) {
//				System.out.print(inner);
//			}
//			System.out.println();
//			
//		}
		
		
		//問題５︓int[] array = new int[] {1, 3, 5, 7, 100, 0, 1}; 左の配列の最⼤値と最⼩桁値をSystem.out.println()。
		//最大値は100、最小値は0
//		int[] array = new int[] {1, 3, 5, 7, 100, 0, 1};
//		int max= array[0];
//		for (int i = 0; i < array.length; i++) {
//			if(max < array[i]) {
//				max = array[i];
//			}
//		}
//		System.out.println("最大値は"+ max);
//		int min = array[0];
//		for (int i = 0; i < array.length; i++) {
//			if(min > array[i]) {
//				min = array[i];
//			}
//		}
//		System.out.println("最小値は"+ min);
		
		//問題６︓問題１の配列のSUMを求める。
		//SUM=0
//		int[] array = new int[4] ;
//		int sum = 0;
//		for (int i = 0; i < array.length; i++) {
//			sum += array[i];
//		}
//		System.out.println("この配列の値の和は："+sum);
		
		//問題７︓⾏列（２次元配列）の和と積を計算してください。
		int[][] arrA = new int[][]{
			{20,30},
			{10,5}
		};
		int[][] arrB = new int[][] {
			{8,9},
			{4,6}
		};
		int[][] arrC = new int[2][2];
		//和
		for(int i =0; i<arrC.length ; i++) {
			for(int j = 0; j <arrC.length ;j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}
		//積
		for (int i = 0; i < arrC.length; i++) {
			for (int j = 0; j < arrC.length; j++) {
				arrC[i][j] = arrA[i][j] * arrB[i][j];
				System.out.print(arrC[i][j] + ",");
			}
			System.out.println();
		}
	}

}
