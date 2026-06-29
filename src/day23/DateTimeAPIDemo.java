package day23;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println(currentDate);
		
		LocalTime currentTime=LocalTime.now();
		System.out.println(currentTime);
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println(currentDateTime);
		
		
		int year=1947;
		int month=8;
		int day=15;
		
		LocalDate independanceDay=LocalDate.of(year, month, day);
		System.out.println(independanceDay);
		
		int hh=17;
		int mm=20;
		int ss=15;
		
		LocalTime newTime = LocalTime.of(hh, mm,ss);
		System.out.println(newTime);
		
		
		
		LocalDate currentDate1=LocalDate.now();
		System.out.println(currentDate.plusDays(7));
		System.out.println(currentDate.plusMonths(4));
		System.out.println(currentDate.plusWeeks(8));
		
		System.out.println(currentDate.minusDays(7));
		
		LocalDate netflixSubscribeDate=LocalDate.now();
		LocalDate netflixSubscribeExpiryDate=netflixSubscribeDate.plusYears(1);
		System.out.println(netflixSubscribeExpiryDate);
		
		LocalDate netflixSubscribeExpiryDate1=LocalDate.of(2026, 07,15);
		LocalDate fifaWcFinalsDate=LocalDate.of(2026, 07,20);
		if(netflixSubscribeExpiryDate1.isAfter(fifaWcFinalsDate))
		{
			System.out.println("Enjoy the wc");
		}
		else
		{
			System.out.println("Please upgrade your subscription");
		}
		
		String formatted = netflixSubscribeExpiryDate.format(DateTimeFormatter.ofPattern("EEEE, dd MMM yyyy"));
		System.out.println(formatted);
		
		
		String s = "26-01-1950"; //string convert into date
		String s1 = "10/10/1950"; //string convert into date
		LocalDate republicDay=LocalDate.parse(s1,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		System.out.println(republicDay.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		
		ZoneId zone= ZoneId.of("Asia/Kolkata");
		System.out.println(zone);
		
		ZonedDateTime t1=ZonedDateTime.now(zone);
		System.out.println(t1);
		
		ZonedDateTime india = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime usa = india.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(usa);
		
		Instant instant = Instant.now();
		System.out.println(instant);
	}

}
