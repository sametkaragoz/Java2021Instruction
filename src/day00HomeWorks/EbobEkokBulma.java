package day00HomeWorks;

import java.util.Scanner;

public class EbobEkokBulma {

	public static void main(String[] args) {
		// Kullanýcýdan 2 tamsayý girmesini ve ardýndan GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasýný isteyin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Ebob ve Ekok degerlerini bulmak istediginiz iki sayiyi giriniz.");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int ebob=1;
		int ekok;
		
		for (int bolenSayi=1; bolenSayi<=sayi1 && bolenSayi<=sayi2; bolenSayi++) {
			
			if (sayi1%bolenSayi==0 && sayi2%bolenSayi==0) {
				
				ebob=bolenSayi;
				
				}
			} 
			
		System.out.println("Girdiginiz sayilarin Ebob'u : "+ebob);
		ekok=sayi1*sayi2/ebob;
		System.out.println("Girdiginiz sayilarin Ekok'u : "+ekok);
		
		
		scan.close();
	
	
	}
		
	}


