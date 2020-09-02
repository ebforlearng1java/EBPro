package co.jp.chapter05;

public class JavaHomeWork05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//質問1
				//1から100までの偶数の和を求める(for+if)
				int sum = 0;
				for (int i = 1;i<=100;i++){
					if(i%2 == 0){
						sum = sum + i;
					}

				}
				System.out.println(sum);


				//質問2
				//5の階乗を求める(for)
				int a = 1;
				for (int j=1;j<=5;j++){
					a = a*j;
				}
				System.out.println(a);

				//質問3
				int arr[] = new int[] {1,2,6,7,9,6,2,1};
				//ここに注意すべきのは、maxの初期値に0を設定してはいけない
				//最大値、最小値
				int max = arr[0];
				int min = arr[0];
				for (int i = 0;i < arr.length;i++){
				if (arr[i]>max){
					max = arr[i];
				}
				if (arr[i]<min){
					min = arr[i];
				}

				}
				System.out.println("max="+max);
				System.out.println("min="+min);

				//和と平均値
				int sum3 = 0;
				double avg = 0;
				for (int i = 0;i < arr.length;i++){
					sum3 = sum3+arr[i];
				}
				avg = sum3/arr.length;
				System.out.println("sum="+sum3);
				System.out.println("avg="+avg);

	}

}
