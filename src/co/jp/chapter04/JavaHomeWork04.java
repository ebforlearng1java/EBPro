package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
		int[] arr1 = new int[4];
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

		//質問2
		int[] arr2 = new int[] {5,6};
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}

		//質問3
		int[][] arr3 = new int[2][3];
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3[i].length;j++) {
				System.out.println(arr3[i][j]+" ");
			}
			System.out.println();
		}


	}

}
