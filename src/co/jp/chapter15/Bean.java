package co.jp.chapter15;

public class Bean {
	// 残高
	static int balance = 1000;
	int arr[][] = {{000000,1234},{111111,1111}};

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {

		this.balance = balance;

	}
	// カレントの金額を表示する
	public int balance() {
		return this.balance();
	}

	// お金をおろす操作のメソッドを実装する
	public int takeMoney(int moneyNum) {

		this.balance -= moneyNum;
		return balance;
	}

	// お金をお預かる操作のメソッドを実装する
	public int saveMoney(int moneyNum) {

		this.balance += moneyNum;
		return balance;

	}










}
