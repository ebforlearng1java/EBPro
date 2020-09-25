package co.jp.chapter08;

public class Bird extends Animal{

	public String getType(Animal an) {
		String str = "";
		if(an instanceof Karasu) {
			str = "2.2";
		}else if(an instanceof Karasu) {
			str = "2.1";
		}else {
			str = super.getType(an);
		}
		return str;
	}

}
