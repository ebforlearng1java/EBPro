package co.jp.chapter15;

public class Card {
	private long balance;
	private String num;
	private String passwod;


	/**
	 * @param balance
	 * @param num
	 * @param passwod
	 */
	public Card(String num, String passwod,long balance) {
		this.balance = balance;
		this.num = num;
		this.passwod = passwod;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPasswod() {
		return passwod;
	}
	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}


}
