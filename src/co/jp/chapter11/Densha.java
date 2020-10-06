package co.jp.chapter11;

public class Densha {
	//電車名
	private String denshaName;
	//車両数
	private int size;
	//各車両の人数
	private int perCusNum;
	//全車の人数
	private int totalCusNum;

	//コンストラクタ
	public Densha(String denshaName,int size,int perCusNum) {
		this.denshaName=denshaName;
		this.size=size;
		this.perCusNum=perCusNum;
		this.totalCusNum=perCusNum*size;
	}

	public String getDenshaName() {
		return denshaName;
	}

	public int getSize() {
		return size;
	}

	public int getPerCusNum() {
		return perCusNum;
	}

	public int getTotalCusNum() {
		return totalCusNum;
	}
}
