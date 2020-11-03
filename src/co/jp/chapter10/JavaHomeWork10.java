package co.jp.chapter10;

public class JavaHomeWork10 {

	// 質問１：Petクラスを参考します。

	//質問２
		public static String getFileType(String path) {
			if (path.lastIndexOf(".") !=  -1) {
		        return path.substring(path.lastIndexOf(".")+1);
		}
			return "";
		}

		//質問4
		public static boolean nullOrEmpty(String value) {
		if (value == null || value.isEmpty()) {
			System.out.println("null or empty");
			return true;
		}
		System.out.println("not null or empty");
		return false;
		}

		public static void main(String[] args) {
		 //質問2
		System.out.println(getFileType("c://windows//aa.xlsx"));//xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa"));//empty
		System.out.println();

		//質問3
		String value = "abced12345あいうえお１２３４５";
		System.out.println("バイト数は" + value.getBytes().length + "です。");
		System.out.println("桁数" + value.length() + "です。");
		System.out.println();

		//質問4
		 System.out.println(nullOrEmpty("test"));
		 System.out.println(nullOrEmpty(""));
		 System.out.println();

		//質問5
		 float one = 7894.99999F;
		 System.out.println(String.format("one = %.2f", one));
		 int two = 2456;
		 System.out.println(String.format("two = %05d", two));
		 double three = 999.7683;
		 System.out.println(String.format("one = %.2f", three));
		 System.out.println();

		//質問6
		 System.out.println(Integer.toHexString(10));

		}


}
