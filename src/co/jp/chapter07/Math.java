package co.jp.chapter07;

public class Math {

	//質問２︓Mathクラスを作成してください。以下メソッドを定義します。

	public static int max(int[] datas) {

		int max = datas[0];
        for(int i = 0; i < datas.length; i++) {
        	if(datas[i] > max) {
        	max = datas[i];
        	}
        	}
		return max;
	}
		public static int min(int[] datas) {

			int min = datas[0];
			for(int i = 0; i < datas.length; i++) {
	        	if(datas[i] < min) {
	        	min = datas[i];
	        	}
	        	}
			return min;
		}
		
		public static double avg(int[] datas) {
	
			int sum = datas[0];
			int m = 1;
	        for(int i = 1; i < datas.length; i++) {
	        	sum += datas[i];
	        	m++;
	        	}
			double avg = sum/m;
			return avg;

}
		
		
		
		
		

		public static void main(String[] args) {
		System.out.println("質問2");
		int[] datas = new int[] {1, 2, 3, 4, 5,6,7,8,9};
		
		System.out.println("平均" + avg(datas));
		System.out.println("MAXは" + max(datas));
		System.out.println("MINは" + min(datas));
		
		
		
		}
}
