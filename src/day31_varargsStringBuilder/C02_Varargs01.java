package day31_varargsStringBuilder;

public class C02_Varargs01 {

	public static void main(String[] args) {
		
		// verilen iki sayiyi toplayan ve sonucu yazdiran bir method yaziniz.
		
		int sayi1 = 10;
		int sayi2 = 20;
		int sayi3 = 30;
		
		toplama(sayi1,sayi2);				// method call
//****************************************************************************************************************************		
		// verilen uc sayiyi toplayan bir method yaziniz. 
		
		toplama(sayi1,sayi2,sayi3);			// method call

//****************************************************************************************************************************		
		
		// oyle bir method yazalim ki icine kac sayi yazarsak yazalim toplasin
		
		toplama(2,3);		// iki sayinin toplama methodu
		toplama(2,5,8);		// uc sayinin toplama methodu
		
		// istedigimiz kadar sayi yazabilecegimiz methodu olusturabilmemiz icin Java Varargs olusturmus.
		
		

	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {

		System.out.println("Uc sayinin toplami : "+ (sayi1+sayi2+sayi3));
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("Iki sayinin toplami : "+ (sayi1+sayi2));
		
	}

}
