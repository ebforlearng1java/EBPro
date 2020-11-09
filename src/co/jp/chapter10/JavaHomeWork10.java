package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//質問1
		//途中までしかできていない
		
//		質問2：Windowsは各ファイルの拡張⼦を持っています。例 「新規ドキュメント.docx」
//		の拡張⼦は「docx」である。メソッドを作成して、ファイルパス（String型）から拡張⼦
//		を取得してください。
//		public static String getFileType(String path) {
//				if(path.lastIndexOf(".") != -1) {
//					String text = path.substring((path.lastIndexOf(".") + 1));
//					return text;
//				}else {
//					return "";
//				}
//			}
//			public static void main(String...args) {
//			System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
//			System.out.println(getFileType("c://windows//a a.test")); // test
//			System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
//			System.out.println(getFileType("c://windows//aaaaa")); // Empty
//			}
		

//		質問３︓Javaには、すべての⽂字コードはUTF-8であり。⽇本語（全⾓⽂字）の場合１⽂
//		字 = 3バイト。以下⽂字列のバイト数と桁数を求めてください。
			String value = "abced12345あいうえお１２３４５";
			byte[] byteLength = value.getBytes();
			System.out.println("バイト数は:" + byteLength.length + "  " + "桁数は:" + value.length());

//		質問４︓各現場は⽂字列に null ⼜は empty 判断要共通メソッドを実装しています。似て
//		いるメソッドを実装してください。
//			public static boolean nullOrEmpty(String value) {
//				System.out.println(value.isEmpty());
//			}
			
//			質問５︓以下仕様のフォーマティング指⽰コードを作成してくだい。
//			1. 浮動⼩数点数
//			2. ⻑さは5桁数
//			3. 精度は⼩数点後2位
			System.out.println(String.format("%05.2f",1.1));
			
//			質問６︓整数16の16進数をSystem.out.println()してください。
			System.out.println(String.format("%x", 16));

			

	}

}
