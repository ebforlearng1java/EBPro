package co.jp.chapter10;

public class Pets {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("name,age,type");
		String[] name = { "みみ", "レオ", "マル" };
		int[] age = { 10, 1, 2 };
		int[] type = { 0, 1 };

		Pet pet_type = Pet.猫;

		switch (pet_type) {
		case 猫:
			System.out.println(name[1] + "," + age[1] + "," + type[0] + "\n" + name[2] + "," + age[2] + "," + type[0]);

		case 犬:
			System.out.println(name[0] + "," + age[0] + "," + type[1]);
			break;
		}
	}

	protected enum Pet {
		猫, 犬

	}

}
