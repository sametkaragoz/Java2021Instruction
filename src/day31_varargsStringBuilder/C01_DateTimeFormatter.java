package day31_varargsStringBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C01_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMMM-yyy  hh:mm");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yyy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("HH:mm");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("hh:mm");
		
		
		System.out.println(ldt);									// 2021-08-25T14:54:00.815050800
		System.out.println(dtf.format(ldt));						// 25-August-2021  02:54
		System.out.println(dtf2.format(ldt));						// 25/Aug/2021
		System.out.println(dtf3.format(ldt));						// 14:54
		System.out.println(dtf4.format(ldt));						// 02:54
		
		
		LocalDate dogumTarihi = LocalDate.of(1980, 3, 21);
		LocalDate bugun = LocalDate.now();
		
		Period benimYasim = Period.between(dogumTarihi, bugun);
		System.out.println(benimYasim);
		
		int yas = Period.between(dogumTarihi, bugun).getYears();
		System.out.println(yas);
		
		
		
		String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);
		System.out.println(date);
		
		
	}

}
