package day30_dateTime;

import java.time.LocalDate;

public class C01_LocalDate01 {

	public static void main(String[] args) {
		// Java'da sadece tarih kullanmak istiyorsak :
		// LocalDate class'indan bir obje uretiriz.
		
		LocalDate tarih = LocalDate.now(); 
		System.out.println(tarih);
		
		System.out.println(tarih.plusWeeks(25));													// plus  =  ekle
		System.out.println(tarih.plusDays(500));													// minus =  cikar
		System.out.println(tarih.plusYears(3).plusMonths(5).plusDays(12));
		
		System.out.println(tarih.minusMonths(15));
		System.out.println(tarih.minusYears(3).minusMonths(4).minusDays(10));
		
		
		System.out.println(tarih.getDayOfYear());								// yilin kacinci gunu oldugunu gosterir
		System.out.println(tarih.getMonthValue());								// kacinci ayda oldugunu gosterir
		System.out.println(tarih.getDayOfWeek()); 								// haftanin hangi gunu oldugunu gosterir
		
		LocalDate dogumGunu = LocalDate.of(1995, 02, 18);						
		System.out.println(dogumGunu.getDayOfWeek());							// haftanin hangi gunu oldugunu gosterir
		
		System.out.println(tarih.getMonth());									// hangi ayda olgunu yazdirir
		
		System.out.println(tarih.isLeapYear()); 				// artik yil midir? false
		
		
		// eger su anki tarih ile degil de eski bir tarihle islem yapacaksak : 
		
		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);
		
		System.out.println(tarih1.isAfter(tarih2));		// true
		System.out.println(tarih1.isBefore(tarih2));	// false
		
		

	}

}
