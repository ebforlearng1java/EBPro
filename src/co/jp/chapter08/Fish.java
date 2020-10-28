package co.jp.chapter08;

public  class Fish extends Animal{

	@Override
	public String getType(Animal an) {
		String rtn = "";
		if (an instanceof Iruka) {
			rtn = "1.1:海のイルカ";
		} else if (an instanceof Mguro) {
			rtn = "1.2:海のマグロ";
		} else {
			rtn= super.getType(an);
		}
		return rtn;
	}

}
