package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array_01 = new int[4];
		Integer[] array_02 = new Integer[4];

		for(int i = 0;i<array_01.length;i++) {
			if(i<array_01.length-1) {
				System.out.print(array_01[i]+",");
			}else {
				System.out.print(array_01[i]);
			}
		}

		System.out.println();

		for(int i = 0;i<array_02.length;i++) {
			if(i<array_02.length-1) {
				System.out.print(array_02[i]+",");
			}else {
				System.out.print(array_02[i]);
			}
		}

		System.out.println();

		int[] arr = new int[10];
		for(int i = 0;i<arr.length;i++) {
			if(i<5) {
			arr[i] = (i+1)*2;
			}else {
				arr[i] = (i-(arr.length/2)+1)*2-1;
			}
			if(i<arr.length-1) {
				System.out.print(arr[i]+",");
			}else {
				System.out.print(arr[i]);
			}
		}
		System.out.println();

		for(int num:arr) {
			System.out.print(num);
		}

		System.out.println();

		int[][] arr_01 = {{5, 6},{7, 8}};
		for(int i = 0;i < arr_01.length; i++) {
			for(int j = 0; j< arr_01[i].length;j++) {
					System.out.print(arr_01[i][j]+",");
			}
		}

	}

}
