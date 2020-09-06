package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

//Ｐ３の質問：
//boolean value = true;
//switch(value) {
//case true:break;
//case false:break;
//default:break;
//}

//booleanはswitchの場合に使えません
//defaultは必要ではありません


//Ｐ５の質問１：
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);

		if (a >= 90 && a <= 100) {
		//ア：上記条件がTRUEの場合、下記処理を実行
		System.out.println("A");

		} else if (a < 90 && a >= 80) {
		//イ：アがFALSE かつ 上記条件がTRUEの場合、下記処理を実行
		System.out.println("B");

		} else if (a < 80 && a >= 70) {
		//ウ：ア、イがFALSEの場合 かつ 上記条件がTRUEの場合、下記処理を実行
		System.out.println("C");

		} else if (a < 70 && a >= 60) {
		//エ：ア、イ、ウ条件がFALSEの場合 かつ 上記条件がTRUEの場合、下記処理を実行
		System.out.println("D");

		} else {
		//オ：ア、イ、ウ、エ条件がFALSE場合 かつ 上記条件がTRUEの場合、下記処理を実行
		System.out.println("E");

		}
//成績はＥです


//Ｐ５の質問２：
		int n = 3340;
		int b = n/500;
		int c = n%500/100;
		int d = n%500%100/10;
		int e = n%500%100%10/5;
		int f = n%500%100%10%5/1;
		System.out.println("500円は"+b+"枚");
		System.out.println("100円は"+c+"枚");
		System.out.println("10円は"+d+"枚");
		System.out.println("5円は"+e+"枚");
		System.out.println("1円は"+f+"枚");
//答：500円は6枚、100円は3枚、10円は4枚、5円は0枚、1円は0枚です
	}

}
