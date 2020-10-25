/**ーーーーーーーーーーーーーーーーー11 コレクションーーーーーーーーーーーーーーーーー */
package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class JavaHomeWork11 {

	public static void main(String[] args) {

		//質問１：駅クラス（Station）、路線クラス（Line）を作成して。
		//路線をインスタンス化してオブジェクト「山手線」を作成してください。
		//「山手線」に各駅情報を追加してください。

		//回答：Station.java、Line.javaを参照してください。

		//質問２：質問１に作成した山手線の駅をforeach 文を繰り返して、新橋駅は路線内であるかを判断する。
		//回答：下記処理で行う。

		List<String> list = new ArrayList<String>();
		Station station = new Station();

		for (int i = 0; i < station.yamanote.length; i++) {
			list.add(station.yamanote[i]);
			if (list.get(i) == "新橋") {
				System.out.println(list.get(i) + "駅は線路内にあります");
			}
		}

		//質問３：10両編成している通勤電車、各車の定員は5人です。
		//31人の乗車の状況をプログラミングしてください。(for文で旅客作成しても構わない）

	}
}