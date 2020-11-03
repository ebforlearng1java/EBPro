package co.jp.chapter12;

public class JavaHomeWork12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//質問１
		int[] a = new int[3];
		try {
			System.out.println(a[4]);
		} catch (ArrayIndexOutOfBoundsException ecp) {
			System.out.println("エラーが発生します。");
		}

		//質問2
		try {
			String name = "0";
			if (name.matches("^[0-9]+$")) {
				// ValidationExceptionを呼び出し
				ValidationException vec = new ValidationException();
				vec.setName("名称");
				vec.setMessage("半角数字を入力してください。");
				throw vec;
			}
		} catch (ValidationException vec) {
			System.out.println(vec.getName() + "は" + vec.getMessage());
		}

	}

}
