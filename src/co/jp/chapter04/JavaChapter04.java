package co.jp.chapter04;

public class JavaChapter04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//配列　数　組

		//整形配列
		int [] array = new int[] {1,2,3,4,5};

		//文字列配列
		String [] strArray = new String[] {"1","2","3","4","5"};

		//
		Object[] objArray = new Object[] {1,"333",true};


		//定義方式　宣言　かつ　初期化 値
		int [] intArray1 = new int[] {55,22,33,11,22,555};
		for(int i=0; i< intArray1.length ; i++) {
			System.out.println(intArray1[i]);
		}


		//定義方式　宣言　かつ 長さ定義のみ
		int [] intArray2 = new int[4] ;
		for(int i=0; i< intArray2.length ; i++) {
			System.out.println(intArray2[i]);
		}





	}

}
