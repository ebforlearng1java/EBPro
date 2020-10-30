package co.jp.chapter12;

public class JavaHomeWork12 {


 	public static void main(String[] args) {
 		// TODO 自動生成されたメソッド・スタブ.


//質問１：
		int[] arr1 = new int[] {1,2,3};
		try{
			  for (int i = 0; i < 4; i++){
			    System.out.println(arr1[i]);
			  }
			}
			catch(ArrayIndexOutOfBoundsException e){
			  System.out.println("配列の範囲を超えています");
			}


	}
}