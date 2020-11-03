package co.jp.chapter10;

public class Pet {

	public enum PetType {
		CAT,DOG;
	}
	String name = "";
	int age = 0;
	PetType type0 = PetType.CAT;
	PetType type1 = PetType.DOG;

	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.name = "みみ";
		pet1.age = 10;
		StringBuffer  pet1Sb = new StringBuffer();
		pet1Sb.append(pet1.name).append(",").append(pet1.age).append(",").append(pet1.type1);
		System.out.println(pet1Sb.toString());

		Pet pet2 = new Pet();
		pet2.name = "レオ";
		pet2.age = 1;
		StringBuffer  pet2Sb = new StringBuffer();
		pet2Sb.append(pet2.name).append(",").append(pet2.age).append(",").append(pet2.type0);
		System.out.println(pet2Sb.toString());

		Pet pet3 = new Pet();
		pet3.name = "マル";
		pet3.age = 2;
		StringBuffer  pet3Sb = new StringBuffer();
		pet3Sb.append(pet3.name).append(",").append(pet3.age).append(",").append(pet3.type0);
		System.out.println(pet3Sb.toString());


	}

}
