package co.jp.chapter10;

public class Pet {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private enum petType{
		cat("猫","0"),
		dog("犬","1");
		
		private String type;
		private String num;
		
		petType(String type, String num) {
			this.type = type;
			this.num = num;
		}
			
	public String getType() {
			return type;
		}

		public String getNum() {
			return num;
		}

		
		
	}

}
