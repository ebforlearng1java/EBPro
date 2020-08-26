package co.jp.chapter03;

public class JavaChapter03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		int i = 11;
		if (i > 0)
		{
			//ア　上記条件はTRUEの場合、下記処理をを実行
			System.out.println("変数,iはプラス");
			 //trueの処理ロジック
		} else if (i < 0) {
			//イ　ア条件がFAlSEの場合、下記の処理を実行
			System.out.println("変数,iはマイナス");
		}
		else
		{
			System.out.println("変数,iはゼロ");
			//falseの処理ロジック
		}

	}

}
