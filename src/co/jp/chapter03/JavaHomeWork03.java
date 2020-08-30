package co.jp.chapter03;

public class JavaHomeWork03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//質問：以下コードを補完してください。
		//boolean value = true;
		//switch(value) {
		//case ??: break ;// case ??
		// case ??: break ;// case ??
		//default:break ;// default は必要ですか？
		//}

		//booleanの値でswitchすることができません。


		//質問１：成績ランキング判断を作成する
		int a = 56;
		System.out.println("成績ランキング判断。入力値=" + a);
		//以下のコードを完成してください。
		if (a > 90 || a == 90) {
			//ア　上記条件がTRUEの場合、下記処理をを実行
			System.out.println("A");
			}

		else if (a < 90 || a == 80) {
			//アがFALSE、かつ、イ　上記条件がTRUEの場合、下記処理をを実行
			System.out.println("B");
			}

		else if (a < 80 || a == 70) {
			//ア、イがFALSE、かつ、ウ　上記条件がTRUEの場合、下記処理をを実行
			System.out.println("C");
			}

		else if (a < 70 || a == 60) {
			//ア、イ、ウがFALSE、かつ、エ　上記条件がTRUEの場合、下記処理をを実行
			System.out.println("D");
			}

		else if (a < 60) {
			//ア、イ、ウ、エがFALSE、かつ、オ　上記条件がTRUEの場合、下記処理をを実行
			System.out.println("E");
			}


		//質問２：日本のコインを１円、５円、１０円、１００円、５００円があります。
		//        ３３４０円のコイン数をまとめてください。


		int m =3340;
        int b = m/500;
        int c = m%500/100;
        int d = m%500%100/50;
        int e = m%500%100%50/10;
        int f = m%500%100%50%10/5;
        int g = m%500%100%50%10%5;
		System.out.println(b);//500円のコイン数
		System.out.println(c);//100円のコイン数
		System.out.println(d);//50円のコイン数
		System.out.println(e);//10円のコイン数
		System.out.println(f);//5円のコイン数
		System.out.println(g);//1円のコイン数
		System.out.println(b+c+d+e+f+g);//コイン総数：13枚



























	}

}