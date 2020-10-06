package co.jp.chapter08;

public class Bird extends Animal {

	@Override
	public String getType(Animal an) {

		String rtn;
		if(an instanceof Komori) {
			rtn="3.1：空のコモリ";
		}else if(an instanceof Garasu) {
			rtn="3.2：空のガラス";
		}else {
			rtn=super.getType(an);
		}

		return rtn;
	}

}
