package day30_dateTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime01 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Java'da saat ile islem yapmak icin
		// LocalTime class'indan obje uretiriz.
		
		LocalTime saat = LocalTime.now();
		System.out.println(saat);
		
		for (int i = 0; i < 1000000; i++) {
			i++;
		}
		
		LocalTime saat2 = LocalTime.now();
		System.out.println(saat2);
		System.out.println(saat);		// yukaridaki 'saat' veriable'ini yazdirdigimiz icin 'saat2' den eski bir vakti gorduk. Cunku olusturma onemli!!
		
		System.out.println(saat.plusHours(15));
		System.out.println(saat.getSecond());
		System.out.println(saat.minusSeconds(1964897541));
		
		System.out.println("Japonya Saati : "+saat.now(ZoneId.of("Japan")));
		System.out.println("Chicago Saati : "+saat.now(ZoneId.of("America/Chicago")));
		
		System.out.println("Japonya saati : "+saat.now(ZoneId.of("Japan")));
	}

}
