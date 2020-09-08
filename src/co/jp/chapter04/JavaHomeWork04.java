package co.jp.chapter04;

public class JavaHomeWork04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
		System.out.println();
		System.out.println("質問1");
		int[] arr1 = new int[4];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = i+1;
			System.out.println(arr1[i]);
		}

		//質問2
		System.out.println();
		System.out.println("質問2");
		int[] arr2 = new int[] {5,6};
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}

		//質問3
		System.out.println();
		System.out.println("質問3");
		int[][] arr3 = new int[2][3];
		for(int i=0;i<arr3.length;i++) {

			for(int j=0;j<arr3[i].length;j++) {

				System.out.println(arr3[i][j]+" ");
			}
			System.out.println();
		}


		//質問4
		//以下ソースを理解する。
		System.out.println();
		System.out.println("質問4");
		System.out.println("説明はソースに入れるコメントを参照してください");
		//arr4という二次元配列を新規する。二つ要素を持つ一次元配列四つをまとめて、二次元配列となる。
		int [][] arr4 = new int[4][2];
		//配列arr4の中に、outという二つ要素を持つ一次元配列が存在する。
		for(int[] out:arr4) {
			//outという二つ要素を持つ一次元配列の中に、innerという要素が存在する。
			for(int inner : out) {
				//innerという要素を出力してください。
				//実は、innerでもoutでも、具体的な値を紐づけないので、すべての要素は順番に出力される。
				System.out.println(inner);
				//ただ、この配列は値を付与されないので、0しか出力しない。
			}
		}


	    //質問5
		//最大値と最小値を求める
		System.out.println();
		System.out.println("質問5");
		int[] arr5 = new int[] {1,3,5,7,100,0,1};
		int max = arr5[0];
		int min = arr5[0];
		for(int x=0;x<arr5.length;x++) {
			if (arr5[x] > max) {
				max = arr5[x];
			}
			if(arr5[x]<min) {
				min = arr5[x];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);


		//質問6
		//質問1配列の和を求める
		System.out.println();
		System.out.println("質問6");
		int sum6 = 0;
		for(int i=0;i<arr1.length;i++) {
			sum6 = sum6+arr1[i];
		}
		System.out.println("sum="+sum6);

		//質問7
		//二次元配列の和と積を計算
		//和を求める
		System.out.println();
		System.out.println("質問7");
		int[][] arr7 = new int[][] {
			{1,2,3},{4,5,6}
		};
		int sum7 = 0;
		for(int a=0;a<arr7.length;a++) {
			for(int b=0;b<arr7[a].length;b++) {
				//System.out.println(arr7[a][b]+" ");
				sum7 = sum7 + arr7[a][b];
			}
			//System.out.println();
		}
		System.out.println("この二次元配列の和は"+sum7+"です。");

		//積を求める
		System.out.println("この二次元配列の積は以下となります。");
		int[][] arr8 = new int[][] {
			{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
		};
		int[][] arr9 = new int[2][4];
		int sum8 = 0;
		for(int i=0;i<arr9.length;i++) {
			for(int j=0;j<arr9[i].length;j++) {
				sum8 = 0;
				for(int k=0;k<arr7[i].length;k++) {
					sum8+=arr7[i][k]*arr8[k][j];
				}
				arr9[i][j] = sum8;

				System.out.println(arr9[i][j]+" ");
			}
			System.out.println(" ");
		}



	}

}
