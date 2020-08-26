package co.jp.chapter02;

public class JavaChapter02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//String

		String name = "YQY";
		System.out.println(name);
		
		//二つの文字列の変数を定義する
		//値が一致する　
		String test1 = "sugoi";
		String test2 = "sugoi";
		int suji2 =1234;
		
		System.out.println("変数の宣言（方式１）" + (test1 == test2));
		
		
		//変数宣言の方式２
		//クラス（タイプ）　変数名　= new クラス("変数値")
		String str3 = new String("abc");
		String str4 = new String("abc"); //
		
		System.out.println("変数の宣言（方式２）" + (str3 == str4));
		System.out.println("変数の宣言（方式２）" + (str3.equals(str4)));
		
		
		int suji3 = new Integer(1234); //すでにジャバに削除された
		boolean flg = new Boolean(true); //すでにジャバに削除された
		
		//文字列比較　 
		//== NG　の原因。
		//比較の順番
		//１、メモリーの物理アドレス
		//２、値
		
		//文字列の比較は
		//equlsを使います
		
		String testStr = 1.0f +"1" ;
		System.out.println(testStr);
		
	}

}
