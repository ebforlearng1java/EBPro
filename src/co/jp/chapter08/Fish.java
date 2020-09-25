package co.jp.chapter08;

public class Fish extends Animal{

	@Override
	public String getType(Animal an) {


		String rtn = "";
		if(an instanceof Iruka) {
			rtn="1.1イルカ";
		}
		else if(an instanceof Maguro) {
			rtn="1.2マグロ";
		}
		else {
			rtn= super.getType(an);
		}
		return rtn;

	}



}
