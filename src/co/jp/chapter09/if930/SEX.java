package co.jp.chapter09.if930;

public enum SEX {
		MALE("1", "男性"),
		FEMALE("0", "女性");
		final String code;
		final String description;
		SEX(String code, String description) {
		this.code = code;
		this.description = description;
		}
		// コード値からEnum値を変換する
		public static SEX getEnum(String code) {
		for (SEX s : SEX.values()) {
		if (s.code.equals(code)) {
		return s;
		}
		}
		return null;
		}
//		public static String getValue(String code) {
//			return code;
//			
//		}		
		}
		//

