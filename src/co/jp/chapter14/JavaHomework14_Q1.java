package co.jp.chapter14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaHomework14_Q1 {
	public static List<LocalDate> eachEveryDay(LocalDate startDate, LocalDate endDate) {
		int numOfDays = (int) ChronoUnit.DAYS.between(startDate, endDate);
		return IntStream.range(0, numOfDays)
				.mapToObj(startDate::plusDays)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) throws ParseException {

		System.out.println("2020/10/20～2020/10/25、ループした結果は：");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		Date startDate = formatter.parse("2020/10/20");
		Date endDate = formatter.parse("2020/10/25");

		LocalDate startLocalDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate endLocalDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		List<LocalDate> dateRangeList8 = eachEveryDay(startLocalDate, endLocalDate);
		System.out.println(dateRangeList8);

	}
}
