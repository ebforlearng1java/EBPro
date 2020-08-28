package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問:以下コードを補完してください。
		//boolean value = true;
		//switch(value){
		//case ?? : break; case??
		//case ?? : break; case??
		//default : break; defaultは必要か？

		//まずswitchではbooleanは使えません、case true と case falseが存在すると思います、defalutは必要ないです。


		for (int i = 0; i <5; i++) {
			for (int j =5; j>i+1; j--) {//打印左上角的空白部分
				System.out.print(" ");
			}
			for (int j = 0; j<2*i+1; j++) {//打印*
				System.out.print("*");
			}
		System.out.println();
		}
//		//打印输出菱形的下半部分
//		for (int i =0; i<4; i++) {
//			for (int j = 0; j<i+1; j++) {//打印空白部分
//			    System.out.print(" ");
//			}
//			for (int j =0; j<2*(4-i)-1; j++) {//打印*
//				System.out.print("*");
//			}
//		System.out.println();
//		}




	}

}
