package co.jp.chapter06;

public class Dummy {
	public static void main(String[] args) {
		int[] left = new int[] {1, 2, 3, 4};
		int[] right = new int[] {5, 6, 7, 8};
		int maxlength = left.length+right.length;
		int[] result = new int[maxlength];
		for (int i = 0; i < result.length; i++) {
			if(i<left.length) {
				result[i] = left[i];
			}else {
				result[i] = right[i-right.length];
			}		
		}
		for (int i : result) {
			System.out.println(result[i]);
		}
	}
}