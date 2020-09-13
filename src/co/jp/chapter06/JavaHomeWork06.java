package co.jp.chapter06;

public class JavaHomeWork06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
		//public staticは修飾⼦
		//voidは返却型。
		//関数名はmain
		//引数の型はString[]、名称はargs


		//質問2
		JavaHomeWork06 obj = new JavaHomeWork06();
		int[] arr2 = new int[] {1,3,5,7,100,0,1};
		obj.searchMaxMinSum(arr2);



		//質問3
		//null
		System.out.println("質問3の実施結果：null");

		//質問4
		//Value2
		System.out.println("質問4の実施結果：Value2");

		//質問5
		//true
		System.out.println("質問5の実施結果：true");


	}

	public static int searchMaxMinSum(int[] datas) {
		int max = datas[0];
		int min = datas[0];
		int sum = 0;
		for(int x=0;x<datas.length;x++) {
			if (datas[x] > max) {
				max = datas[x];
			}
			if(datas[x]<min) {
				min = datas[x];
			}

			sum = sum+datas[x];


		}
		System.out.println("最大値："+max);
		System.out.println("最小値："+min);
		System.out.println("和："+sum);
		return 0;
	}






}
