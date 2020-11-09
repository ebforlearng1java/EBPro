package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		質問１︓配列の範囲外を指定している場合、ArrayIndexOutOfBoundsException例外を発⽣
//		します。該当例外を処理するサンプルコードを書いてください。
		try {
			int[] arr = {1,2,3,4};
			System.out.println(arr[10]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外です");
		}
		
//		質問２︓Validation Exceptionを作成して、ユーザー⼊⼒した値を検証します。該当は実際
//		商⽤アプリで利⽤しています。
		try {
			check("1111");
			check("１１１１");
		}catch(ValidationException e){
			System.out.println(e.getMessage());
		}
		
	}
	public static void check(String name) throws ValidationException{
		if(!name.matches("^[0-9]+$")) {
			throw new ValidationException("名称", "半角数字を入力してください。");
		}else {
			System.out.println(name);
		}
	}

}
