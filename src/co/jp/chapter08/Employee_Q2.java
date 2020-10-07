package co.jp.chapter08;

public class Employee_Q2{
	private String id;

	public Employee_Q2(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object another) {
		if (another instanceof Employee_Q2) {
			Employee_Q2 an = (Employee_Q2) another;
			return an.id.equals(id);
		}
		return false;
	}

}
