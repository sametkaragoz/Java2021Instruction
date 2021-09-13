package day00HomeWorks;

public class C01_30_06_2021_DataCasting {

	public static void main(String[] args) {
		
		// Soru-1 : byte veri turunden itibaren genisletildi (widening)
		
		byte sayi1= 19;
		
		System.out.println("Birinci Sayi : "+sayi1);
		
		short sayi2= sayi1;
		
		System.out.println("Ikinci Sayi : "+sayi2);
		
		int sayi3 = sayi2;
		
		System.out.println("Ucuncu Sayi : "+sayi3);
		
		float sayi4=2065.5f;
		
		System.out.println("Dorduncu Sayi : "+sayi4);
		
		double sayi5= sayi4;
		
		System.out.println("Besinci Sayi : "+sayi5);
		
		//Soru-2 : int veri turunden itibaren daraltildi (narrowing)
		
		int sayi10= 990;
		
		System.out.println("\n\nOnuncu Sayi :"+sayi10);
		
		short sayi11 = (short) sayi10;
		
		System.out.println("On Birinci Sayi :"+sayi11);
				
		byte sayi12= (byte) sayi11;
		
		System.out.println("On Ikinci Sayi :"+sayi12);
		
		//Soru-3 : Float veri tipinde variable olusturup yazdirin
		
		float sayi20= 998.456f;
		
		System.out.println("\n\nYirminci Sayi :"+ sayi20);
		
		
		
		// Soru-4 : double 255.36 sayisini int'a ve ardindan int'ý byte'a cevirip yazdirin
		
		double sayi30=255.36;
		
		System.out.println("\n\nOtuzuncu Sayi :"+sayi30);
		
		int sayi31= (int) sayi30;
		
		System.out.println("Otuz birinci Sayi :"+sayi31);
		
		byte sayi32=(byte) sayi31;
		
		System.out.println("Otuz ikinci Sayi :"+sayi32);
		
		
		// Soru-5 : 2 tane int sayiyi birbirine boldurup yazdirin
		
		
		int sayi40= 955;
		
		System.out.println("\n\nKirkinci Sayi :"+sayi40);
		
		int sayi41= 25;
		
		System.out.println("Kirk birinci Sayi : " + sayi41);
		
		System.out.println("Girdiginiz sayilarin bolumu (40/41):"+ sayi4/sayi41);
		
		// Soru-6 int bir sayiyi double bir sayiya bolup yazdirin
		
		int sayi50= 8659;
		
		System.out.println("\n\nEllinci Sayi : "+ sayi50);
		
		double sayi51= 15.66;
		
		System.out.println("Elli birinci sayi :"+sayi51);
		
		System.out.println("Girdiginiz sayilarin bolumu (50/51):"+sayi50/sayi51);
		
		
		// Soru-7 Farkli data tipleri ile islem yapip sonuclari yazdirin
		
		int sayi60= 885;
		
		System.out.println("\n\nAltmisinci sayi :"+sayi60);
	
		float sayi61= 8.556f;
		
		System.out.println("Altmis birinci sayi :"+sayi61);
		
		System.out.println("Girdiginiz sayilarin bolumu (60/61) :"+sayi60/sayi61);
		
		
		
		
	}

}
