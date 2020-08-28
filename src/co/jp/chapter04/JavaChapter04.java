package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列（数组）
		int a = 0;
		//数字
		int[] array = new int[] {1,2,3,4,5};
		//文字列
		String[] strArray = new String[] {"1","2","3","4","5"};
		//オブジェクト
		Object[] objArray = new Object[] {"1",2,3,true};




		//定義方式1、宣言かつ初期化
		int[] array1 = new int[] {1,2,3,4,5};
		for (int i = 0; i < array1.length; i++ ) {
			System.out.println(array1[i]);
		}

		//定義方式２、宣言かつ長さ定義のみ
		int[] array2 = new int[5] ;
	}

}
