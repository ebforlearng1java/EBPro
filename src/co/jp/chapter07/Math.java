package co.jp.chapter07;

public class Math {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// 配列のMAXを求める
		int[] test1 = new int[] {1,2,3,4};
		System.out.println(" 配列のMAX:"+Math.searchMax(test1));

		//配列のMINを求める
		//int[] test2 = new int[] {1,2,3,4};
		System.out.println(" 配列のMIN:"+Math.searchMin(test1));

		//配列の平均値を求める
		System.out.println(" 配列の平均値:"+Math.searchAvg(test1));




	}


	public static int searchMax(int[] arr1) {
		int max = arr1[0];
		for(int x=0;x<arr1.length;x++) {
			if (arr1[x] > max) {
				max = arr1[x];
			}
	}
		return max;
	}

	public static int searchMin(int[] arr2) {
		int min = arr2[0];
		for(int x=0;x<arr2.length;x++) {
			if(arr2[x]<min) {
				min = arr2[x];
			}
	}
		return min;
	}

	public static double searchAvg(int[] arr3) {
		int sum = 0;
		double avg = 0;
		for (int i = 0;i < arr3.length;i++){
			sum = sum+arr3[i];
		}
		avg = sum/arr3.length;
		return avg;
	}

}
