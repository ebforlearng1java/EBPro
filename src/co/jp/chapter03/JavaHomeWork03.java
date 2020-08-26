package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		/**03 フロー制御 */

		//質問︓以下コードを補完してください。
		//boolean value = true;
		//switch(value) {
		//case ??:break; // case ??
		//case ??:break; // case ??
		//default:break; // default は必要ですか？
		//}
		//答え：switchにbooleanが使えない

		//質問１︓成績ランキング判断を作成する
		//「90以上︓A, 80-90︓B, 70-80︓C, 60-70︓D, 60以下︓E」
		//答え：
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90 && a<=100) {
			//ア：上記条件がtrueの場合、下記処理を実行
			System.out.println("A");
		} else if (a < 90 && a >= 80) {
			//イ：ア条件がfalse　かつ、上記条件がtrueの場合、
			//下記処理を実行
			System.out.println("B");
		} else if (a < 80 && a >= 70) {
			//ウ：ア、イ条件がfalseの場合、かつ、
			//上記条件がtrueの場合、下記処理を実行
			System.out.println("C");
		} else if (a < 70 && a >= 60) {
			//エ：ア、イ、ウ条件がfalseの場合、かつ、
			//上記条件がtrueの場合、下記処理を実行
			System.out.println("D");
		} else if (a < 60 && a >= 0){
			//オ：ア、イ、ウ、エ条件がfalseの場合、かつ、
			//上記条件がtrueの場合、下記処理を実行
			System.out.println("E");
		}else {
			//カ：ア、イ、ウ、エ、オ条件がfalseの場合、
			//上記以外、下記処理を実行
			System.out.println("aの値が正しくない");
		}

		//質問２︓日本のコインを１円、５円、１０円、１００円、５００円があります。
		//３３４０円のコイン数をもとめください。
		//答え：13個。500円のコイン数は6個、100円のコイン数は3個、10円のコイン数は4個
		int count500=3340/500;
		int count100=3340%500/100;
		int count10=3340%500%100/10;
		int total=count500+count100+count10;
		System.out.println("全てコイン数は"+total);
		System.out.println("500円のコイン数は"+count500);
		System.out.println("100円のコイン数は"+count100);
		System.out.println("10円のコイン数は"+count10);
	}

}
