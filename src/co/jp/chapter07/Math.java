package co.jp.chapter07;

public class Math {

	//A2-1,2,3
	public static int max(int[] input) {
		int max2=input[0];
		for(int i=0;i<input.length;i++) {
			if(max2 <input[i]) {
				max2=input[i];
			}
		}
		return max2;

	}

	public static int min(int[] input) {
		int min2=input[0];
		for(int i=0;i<input.length;i++) {

			if(min2 >input[i]) {
				min2=input[i];
			}
		}
		return min2;

	}

	public static int ave(int[] input) {
		int sum2=0;
		for(int i=0;i<input.length;i++) {
			sum2 += input[i];
		}
		return sum2/input.length;

	}

}
