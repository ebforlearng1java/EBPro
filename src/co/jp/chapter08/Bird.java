package co.jp.chapter08;

public class Bird extends Animal{
	
	@Override
	public String getType(Animal an) {


		String sk = "";
		if(an instanceof Komori) {
			sk="3.1蝙蝠";
		}
		else if(an instanceof Galas) {
			sk="3.2ガラス";
		}
		else {
			sk= super.getType(an);
		}
		return sk;

	}

}
