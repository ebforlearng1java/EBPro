package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[][] arr2d = new int[][] {
			{1,2,3,4},{21,22,23,24}
		};
		System.out.println(arr2d.length);

		//int[] arr = new int[3];
		//System.out.println(arr);

		//配列の要素を出力
		//方法1
		int[] arr3 = new int[] {1,2,3,4,5};
		for(int x:arr3) {
			System.out.println(x);
		}
        //方法2
		for(int i = 0;i<arr3.length;i++) {
			int y = arr3[i];
			System.out.println(y);
		}

	}

}
