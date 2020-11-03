package co.jp.chapter12;

public class ValidationException extends Exception{

	public ValidationException() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	private String name;
	private String  message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
