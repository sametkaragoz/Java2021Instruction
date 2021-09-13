package day06_relatioanalOperators_ifstatements;

import java.util.Scanner;

public class C04_IfStatements03 {

	public static void main(String[] args) {
		
		/*
        
        Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
        ve o harfle baslayan gun isimlerini yazdirin 
        Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
        ilkHarf=S output = “Sali”
        Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen istediginiz gunun bas harfini giriniz.");
		
		char harf= scan.next().toLowerCase().charAt(0);
		
		if (harf=='p' || harf=='P') {
			
			System.out.println("Pazartesi, persembe, pazar");
		}  
		if (harf=='s' || harf=='S') {
			
			System.out.println("Sali");
		}
		if (harf=='c' || harf=='C') {
			
			System.out.println("Carsamba, cuma, cumartesi");
		}
		if (harf != 'p' && harf!='P' && harf!='s' && harf!='S' && harf!='c' && harf!='C') {
			
			System.out.println("Lutfen gecerli bir harf giriniz.");
		}
		
		scan.close();
		
		
		
	}

}
