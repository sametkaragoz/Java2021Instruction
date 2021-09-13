package day32_StringBuilder;

public class C01_StringBuilder01 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder("Samet");
		System.out.println(sb1);				// Samet
		
		sb1.append(" ").append("Karagoz");		// verilen SB'in sonuna istedigimiz String degerini ekler
		System.out.println(sb1);				// Samet Karagoz
		
		
		String cumle="Javayi cok sever";
		sb1.append(cumle , 6, 10);				// baska bir String'de istedigimiz bolumu SB'in sonuna ekler.
												// baslangic index'i inclusive, bitis index'i exclusive'dir
		
		System.out.println(sb1); 				// Samet Karagoz cok
		
		System.out.println(sb1.length());		// 17 --> SB'in uzunluk bilgisini verir
		System.out.println(sb1.capacity());		// 21 --> (5+16)  kapasite bilgisini verir
		
		System.out.println(sb1.charAt(2));
		System.out.println(sb1.charAt(1));		// a --> SB'in istedigimiz index'te olan karakterini verir
		
		sb1.charAt(5);							// bize bilgi getiren methodlar SB'i degistirmez.
		System.out.println(sb1); 				// Samet Karagoz cok
		
		sb1.delete(13, 19);						// SB'in istedigimiz index'lerin arasindaki kismini siler
		System.out.println(sb1);				// Samet Karagoz
		
		sb1.deleteCharAt(12);
		System.out.println(sb1);				// Samet Karago
		
		String isim="Samet Karago";
		System.out.println(sb1.equals(isim)); 					// false verir. data turleri farkli oldugu icin iceriginin kiyaslanmasi mumkun degildir.
		
		StringBuilder sb2=new StringBuilder("Samet Karago");
		System.out.println(sb1==sb2); 							// false verir. 
		System.out.println(sb1.equals(sb2)); 					// false verir. SB'da equals() methodu, String'den farkli calisir.
																// ancak ayni obje ile kiyaslandiginda true verir
																// String'deki == gibi calisir.
		
		System.out.println(sb1.equals(sb1)); 					// true
		
		System.out.println(sb1.indexOf("Kara"));				// 6 --> SB'da arama yapar
		System.out.println(sb1.indexOf("a", 6));				// 7 --> istedigimiz index'ten sonrasinda arama yapar 
		System.out.println(sb1.indexOf("J"));					// -1 --> aradigimiz String yok ise -1 doner
		
		sb1.insert(7, " ");										// istedigimiz index'ten itibaren istenen String eklenir
		System.out.println(sb1);								// Samet K arago
		
		cumle="Merhaba dunya";
		sb1.insert(0, cumle, 0, 8);								// 0 : SB'a hangi index'ten itibaren eklenecek
		System.out.println(sb1);								// cumle : Hangi String'den eklenecek
																// 0-8 : cumle'nin hangi index'inden itibaren kacinci index'e kadar alinacak?
		
		sb1.insert(21, cumle, 7, 13);
		System.out.println(sb1);								// Merhaba Samet K arago dunya
		
		System.out.println(sb1.lastIndexOf("a"));				// 26 ---> "a" harfinin en son nerede kullanildigini verir
		System.out.println(sb1.lastIndexOf("a", 25));	 		// 18 ---> "a" harfinin 25. karaktere kadar en son nereden kullanildigini gosterir. (kopruden onceki son cikis)
		
		sb1.replace(8, 13, "Ali");								// girilen String degerin kacinci index'lerin arasina konulacagini belirler (8'den itibaren, 13 haric)
		System.out.println(sb1); 								// Merhaba Ali K arago dunya
		
		
		
			
//************************************************************************************************************************************		
		
		System.out.println("\n\n\n******************************************\n\n\n");
		
		
		sb1.reverse();
		System.out.println(sb1); // aynud ogara K ilA abahreM
		sb1.reverse();
		
		sb1.setCharAt(10, 'k');
		System.out.println(sb1); // Merhaba Alk K arago dunyaa
		
		System.out.println(sb1.subSequence(8, 13)); // Alk K  SB'in istedigimiz index'ler 
													// arasindaki bolumunu verir
		System.out.println(sb1.substring(8)); // Alk K arago dunya
											  // baslangic index'inden sona kadar
		sb1.subSequence(8,13);
		System.out.println(sb1); // Merhaba Alk K arago dunya
		sb1.substring(8, 13);
		System.out.println(sb1); // Merhaba Alk K arago dunya
		
		StringBuilder sb3=new StringBuilder("Java cok guzel");
		StringBuilder sb4=new StringBuilder("Java cok guzel");
		
		System.out.println(sb3.equals(sb4)); // false
		// iceriklerinin esit oldup olmadigina bakmak icin String'deki equals method'unu kullanalim
		System.out.println(sb3.toString().equals(sb4.toString())); // true
		
		sb3.toString().concat(" Insanin sevdikce sevesi geliyor"); // String class'ina ait methodlar
																   // kullaninca kalici deg. olmaz 
		System.out.println(sb3);
		//toString() method'unu kullaninca SB String'e donusmus olur
		// dolayisiyla tum String methodlari kullanilabilir
		System.out.println(sb3.toString().concat(" Insanin sevdikce sevesi geliyor"));
		// Java cok guzel Insanin sevdikce sevesi geliyor
		
		System.out.println(sb1.length()); // 25
		System.out.println(sb1.capacity()); //44
		sb1.trimToSize(); // SB icin hazirlanan kapasitedeki fazlaliklari sile
						  // length ile kapasiteyi esit duruma getirir
		System.out.println(sb1.length()); // 25
		System.out.println(sb1.capacity()); //25
		
		 System.out.println(sb3.compareTo(sb4)); // 2 StringBuilder’in tum karakterlerinin
		 										 // esitligini kontrol eder. (0 ise esit)
		
	}

}
