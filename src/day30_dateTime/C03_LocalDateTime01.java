package day30_dateTime;

import java.time.LocalDateTime;

public class C03_LocalDateTime01 {

	public static void main(String[] args) {
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		System.out.println(ldt.toString());
		
		String time = ldt.toString();
		System.out.println(time.startsWith("2022"));

	}

}
