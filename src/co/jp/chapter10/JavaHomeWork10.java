package co.jp.chapter10;

public class JavaHomeWork10 {



	//質問２
	public static String getFileType(String path) {

	    int point = path.lastIndexOf(".");
	    if (point != -1) {
	        return path.substring(point + 1);
	    }
	    return null;

	}

	//質問4
	public static boolean nullOrEmpty(String value) {
	if (value == null || value.isEmpty()) {
		System.out.println("nullOrEmpty");
		return true;
	}
	System.out.println("not nullOrEmpty");
	return false;
	}


	public static void main(String[] args) {

		//質問2
		System.out.println("質問2");
		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa"));
		System.out.println();

		//質問3
		System.out.println("質問3");
		String value = "abced12345あいうえお１２３４５";
		 System.out.println("バイト数は" + value.getBytes().length + "です。");
		 System.out.println("桁数" + value.length() + "です。");
		 System.out.println();

		//質問4
		 System.out.println("質問4");
		 System.out.println(nullOrEmpty("c://windows//aa.xlsx"));
		 System.out.println(nullOrEmpty(""));
		 System.out.println();

		 //質問5
		 System.out.println("質問5");
		 float one = 123456.99999F;
		 System.out.println(String.format("one = %.2f", one));
		 int two = 123;
		 System.out.println(String.format("two = %05d", two));
		 double three = 123.4567;
		 System.out.println(String.format("one = %.3f", three));
		 System.out.println();

		//質問6
		 System.out.println("質問6");
		 int i = 16;
		 System.out.println(Integer.toHexString(i));

	}
}

