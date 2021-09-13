package day31_varargsStringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		
	
		
		
		StringBuilder sb1= new StringBuilder();					// Bos bir StringBuilder olusturur.
		System.out.println("sb1 : "+sb1);
		
		
		
		
		StringBuilder sb2= new StringBuilder("Mehmet");			// Icinde Mehmet degeri olan bir StringBuilder olusturur.
		System.out.println("sb2 : "+sb2);
		
		
		
		
		StringBuilder sb3= new StringBuilder(10);				// 10 karakter kapasitesi olan bir StringBuilder olusturur.
		System.out.println("sb3 : "+sb3);
		
		
		System.out.println("sb1 uzunluk : "+sb1.length());		// ici bos oldugu icin length() methodu bize 0 dondurdu
		System.out.println("sb1 kapasite : "+sb1.capacity());	// ici bos fakat Java SB icin 16 karakterlik bir kapasite belirledi
		
		
		
		
		sb1.append(" Hoca");
		System.out.println("sb1 append : "+sb1);				// ' Hoca'
		
		
		
		
		sb2.append(" Hoca");
		System.out.println("sb2 append : "+sb2);				// 'Mehmet Hoca'
		
		
		
		
		sb3.append(" Hoca0101010101");
		System.out.println("sb3 append : "+sb3);				// ' Hoca'
		
		
		
		
		System.out.println("sb1 uzunluk2 : "+sb1.length());		// 5    " Hoca"
		System.out.println("sb1 kapasite : "+sb1.capacity());	// 16	bir deger yazmadigimiz icin default kapasite
		
		System.out.println("sb2 uzunluk : "+sb2.length());		// 11	" Mehmet Hoca"
		System.out.println("sb2 kapasite : "+sb2.capacity());	// 22	 basta biz 6 olusturduk, 16'da default'tan geldi 
		
		System.out.println("sb3 uzunluk : "+sb3.length());		// 5	" Hoca"
		System.out.println("sb3 kapasite : "+sb3.capacity());	// 10	biz basta 10 kapasite verdigimiz icin dolana kadar onu kullandi. ----> StringBuilder olustururken belirtilen kapasiteyi gectigimizde Java 
																// bizim icin olusturulan kapasitenin iki katinin iki fazlasini olusturur.
		
		
		
		
		// capacity hafiza yonetimi icin cok onemli
		// kod yazilirken sabit veya maksimum uzunluk belirliyse 
		// 3. method ile kullanarak HAFIZA KULLANIMINI optimize edebiliriz
		
	}

}
