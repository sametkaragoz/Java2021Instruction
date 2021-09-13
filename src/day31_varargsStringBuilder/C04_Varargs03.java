package day31_varargsStringBuilder;

public class C04_Varargs03 {

	public static void main(String[] args) {
		
		// verilen integer'lardan ilki haric tum sayilari toplayin ve 
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin
		
		
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);

	}

	public static void toplama(int sayi1 , int... var ) {			// int sayi'yi varargs'tan once yazmamiz gerekir. Aksi halde varargs tum veriable'lari alir
																	// ve varargs'tan sonraki int sayi'ya deger kalmaz
		
		System.out.println("Varargs'a dahil olmayan argument");
		
		int toplam = 0;
		for (int each : var) {
			toplam+=each;
		}
		System.out.println(sayi1*toplam);
	}
	
}
