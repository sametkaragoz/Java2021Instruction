package day04_increment_matematiksel_islemler;

public class C02_Preincrement_Postincrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		
		int sayi2= ++sayi1;
		
		
		System.out.println("pre-increment sayi1 :" + sayi1);   //21
		System.out.println("pre-increment sayi1 :" + sayi2);   //21
		
		
          sayi2= sayi1++;
		
		
		System.out.println("\n\npost-increment sayi1 :" + sayi1);    //22
		System.out.println("post-increment sayi1 :" + sayi2);    //21

		int sayi3=10;
		
		System.out.println("\n\npre-increment :" + ++sayi3);
		
		System.out.println("post-increment :" + sayi3++);
		
		System.out.println("post increment'tan sonra sayi3 : "+ sayi3);
	}

}
