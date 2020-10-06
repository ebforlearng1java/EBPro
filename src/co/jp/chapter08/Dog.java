package co.jp.chapter08;

public class Dog extends Animal{

	@Override
	public String getType(Animal an) {

		String rtn;
		if(an instanceof Keji) {
			rtn="2.1：陸のKeji";
		}else if(an instanceof Jinmao) {
			rtn="2.2：陸の金毛";
		}else {
			rtn=super.getType(an);
		}

		return rtn;
	}
}
