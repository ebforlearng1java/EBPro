package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		//配列
		//整形
		int [] array = new int [] {1,2,3,4,5};
		//文字列
		String [] strarray = new String [] { "1", "2", "3", "4", "5"};
		//
		Object[] Objarray = new Object[] {1,"333",1,1,1f,true};
		
		
		//定義方式①　宣言かつ初期化
		int[] intarray_1 = new int[] {1,2,3,4,5};
		for (int i = 0; i < intarray_1.length; i++) {
			System.out.println(i);
		}
		//
		int[] intarray_2 = new int[] {55, 22,33,11, 22, 555};
		for (int index = 0; index < intarray_2.length; index++) {
			System.out.println(intarray_2[index]);
		}
		
		//
		int[] intarray_3 = new int[] { 1, 2,3,4, 5, 565 };
		for (int index = 0; index < intarray_3.length; index++) {
			System.out.println(intarray_3[index]);
		}
		
		//定義方式②　宣言かつ長さ定義のみ
		
	}

}
