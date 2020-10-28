package co.jp.chapter14;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class JavaHomework14_Q2 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

		Calendar a = Calendar.getInstance();

		Calendar b = Calendar.getInstance();

		Calendar c = Calendar.getInstance();

		a.set(Calendar.HOUR_OF_DAY, 10);
		a.set(Calendar.MINUTE, 00);

		b.set(Calendar.HOUR_OF_DAY, 20);
		b.set(Calendar.MINUTE, 10);

		// 差分を求めてUTC+9:00を引く

		long sa = b.getTimeInMillis() - a.getTimeInMillis() - c.getTimeZone().getRawOffset();

		c.setTimeInMillis(sa);

		// 表示

		String[] s = sdf.format(c.getTime()).split(":");

		int hour = Integer.parseInt(s[0]);

		int minute = Integer.parseInt(s[1]);

		System.out.println(hour - 1 + "時間" + minute + "分");

	}

}