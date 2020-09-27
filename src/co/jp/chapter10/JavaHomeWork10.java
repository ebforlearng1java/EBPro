package co.jp.chapter10;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ




		//質問2
		System.out.println();
		System.out.println(getFileType("c://windows//aa.xlsx"));
		System.out.println(getFileType("c://windows//a a.test"));
		System.out.println(getFileType("c://windows//aa.bb.docx"));
		System.out.println(getFileType("c://windows//aaaaa"));


		//質問3
		System.out.println();
		String value = "abced12345あいうえお１２３４５";
		System.out.println("文字列のバイト数："+getBytesLength(value));
		System.out.println("文字列の桁数："+value.length());


		//質問4
		System.out.println();
		String value1 = "";
		String value2 = null;
		String value3 = "長文字列";
		System.out.println("value1は"+nullOrEmpty(value1));
		System.out.println("value2は"+nullOrEmpty(value2));
		System.out.println("value3は"+nullOrEmpty(value3));


		//質問5
		System.out.println();
		//System.out.println(String.format("%.1f", 21.8755));
		System.out.println(String.format("%05d", 5));
		System.out.println(String.format("%.2f", 3.1415));


		//質問6
		System.out.println();
		int a = 16;
		System.out.println(String.format("%1$#9x", a));







	}



	public static String getFileType(String path) {

		String extensions = null;
		boolean status = path.contains(".");

        if(status){
        	extensions = path.substring(path.lastIndexOf(".") + 1);

        }else{
        	extensions = "Empty";
        }


		return extensions;
	}


	public static int getBytesLength(String str) {
		//int bytelen = str.getBytes("UTF-8").length;
		try{
		    //バイト数を取得する
		    return str.getBytes("UTF-8").length;        //UTF-8の場合


		  }catch(Exception ex){
		    //例外発生時はint型の最大値を返します。
		    return Integer.MAX_VALUE;
		  }


	}


	public static String nullOrEmpty(String value) {
		if(value == null) {
			return "null";
		}else {
			if(value.length()==0) {
				return "空文字列";
			}else {
				return"両方ではない";
			}
		}
	}




}
