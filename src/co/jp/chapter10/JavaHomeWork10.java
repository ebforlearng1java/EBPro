package co.jp.chapter10;

import java.io.UnsupportedEncodingException;

public class JavaHomeWork10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("--------Q1--------");
		//Q1:以下3行文字列を「改行コード」と「,」を
		//分割して2つペットオブジェクトを作成してください。
		//A1:

		String strq1="みみ, 10,1,レオ,1,0,マル, 2,0";
		String[] pet=Sp(strq1);
		for(int i=0;i<8;i+=3) {
			System.out.println(
					"名前は"+pet[i]+","+pet[i+1]+"歳"+"の"+Pet.getType(pet[i+2])+"です");
		}


		System.out.println("--------Q2--------");
		//Q2:Windowsは各ファイルの拡張子を持っています。
		//メソッドを作成して、ファイルパス(string型)から拡張子を取得してください。
		//A2:

		System.out.println(getFileType("c://windows//aa.xlsx")); // xlsx
		System.out.println(getFileType("c://windows//a a.test")); // test
		System.out.println(getFileType("c://windows//aa.bb.docx")); // docx
		System.out.println(getFileType("c://windows//aaaaa")); // Empty


		System.out.println("--------Q3--------");
		//Q3:Javaには、すべての文字コードはUTF-8であり。日本語(全角文字)の場合
		//1文字＝3バイト。以下文字列のバイト数と桁数を求めてください。
		//A3:バイト数は40, 桁数は20


		String value = "abced12345あいうえお１２３４５";
		try {
			System.out.println(value.getBytes("UTF-8").length);
			System.out.println(String.valueOf(value).length());
		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}


		System.out.println("--------Q4--------");
		//Q4:各現場は文字列にnullまたはempty判断用共通メソッドを実装しています。
		//似ているメソッドを実装してください。
		//A4;

		System.out.println(nullOrEmpty(null));
		System.out.println(nullOrEmpty(""));



		System.out.println("--------Q5--------");
		//Q5:以下仕様のフォーマティング指示コードを作成してください。
		//1:浮動小数点
		//2:長さは5桁の数
		//3:精度は少数点後2位

		//A5:   %05.2f

		System.out.println(String.format("Q51長さは：%fです", 12.3456789));
		System.out.println(String.format("Q52長さは：%05dです", 123));
		System.out.println(String.format("Q53長さは：%.2fです", 123.456789));
		System.out.println(String.format("Q5 長さは：%05.2fです", 1.2));

		System.out.println("--------Q6--------");
		//Q6:整数16の16進数をSystem.out.println()してください。
		//A6:
		System.out.println(String.format("%o", 123));

	}


	//A1:
	public enum Pet{
		cat("0"),
		dog("1");

	    private String id;
	    private Pet(String id) {
	        this.id = id;
	    }
	    String getId(){
	    	return id;
	    }

		public static Pet getType(String id) {
	    	for(Pet pet :Pet.values()) {
	    		if(pet.getId().equals(id)) {
	    			return pet;
	    		}
	    	}
	    	return null;
	    }
	}


	public static String[] Sp(String strq1) {
		String[] pe= strq1.split(",");  //strq1.split("/n"); に変更したら改行コードです
//		for(String p : pe) {
//			System.out.print(p);
//		}
//		System.out.println("");
		return pe;
	}



	//A2:
	public static String getFileType(String path) {

		int p = path.lastIndexOf(".");
		if(p != -1  && path != null) {
			String ext = path.substring(path.lastIndexOf(".")+1);
			return ext;
		}else {
			return "Empty";
		}


	}

	//A4
	public static String nullOrEmpty(String value) {
		if(value == null) {
			return "null";
		}
		else if (value.isEmpty()){
			return "Empty";
		}else {
			return "どちらでもない";
		}
	}






}
