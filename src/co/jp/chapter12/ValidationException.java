package co.jp.chapter12;

public class ValidationException extends Exception {
	private String name;
	private String message;

	public ValidationException(String name, String msg) {
		this.name = name;
		this.message = msg;
	}

	public String getName() {
		return name;
	}

	public String getMessage() {
		return message;
	}

}
