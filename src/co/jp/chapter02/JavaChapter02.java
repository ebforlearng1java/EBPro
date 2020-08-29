package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String name = "DW";
		System.out.println(name);

		// 変数宣言の方式１
		String temp1 = "equals";
		String temp2 = "equals";

		System.out.println("変数の宣言（方式１）:"+ (temp1==temp2));

		// 変数宣言の方式２
		String temp3 = new String("equals");
		String temp4 = new String("equals");

		System.out.println("変数の宣言（方式２）:"+ (temp3 == temp4)); //NG
		System.out.println("変数の宣言（方式２）:"+ (temp3.equals(temp4)));//ok
	}

}
