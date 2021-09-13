package day08_ternaryOperator;

import java.util.Scanner;

public class C06_NestedTurnery {

	public static void main(String[] args) {
		
		// Kullanicidan bir tamsayi alin ve sayi 10’dan kucukse “Rakam veya negatif sayi” , 
		// 100’den kucukse “iki basamakli sayi” 
		// degilse “uc basamakli veya daha buyuk sayi” yazdirin 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz.");
		
		int sayi=scan.nextInt();
		
		System.out.println(sayi<0 ? "Negatif sayi": sayi<10 ? "Rakam" : (sayi<100 ? "Iki basamakli sayi" : "Uc basamakli veya daha buyuk bri sayi"));

	
			scan.close();
	}
	
}
