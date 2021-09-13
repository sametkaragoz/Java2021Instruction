package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C06_WhileLoops04 {

	public static void main(String[] args) {
		
		
		// Soru 7 ) Kullanicidan pozitif bir tam sayi alin ve bu sayinin rakamlari toplamini yazdirin

		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen pozitif bir tam sayi giriniz.");
		
		int sayi=scan.nextInt();
		
		int i=sayi;
		
		int rakamlarToplami=0;
		
		int rakam=0;
		
		while (i>0) {
			
			rakam=i%10;
			rakamlarToplami+=rakam;
			i/=10;
			
			System.out.println(rakamlarToplami);
		}
		
		System.out.println("Girdiginiz "+sayi+" sayisininnin rakamlari toplami : "+rakamlarToplami);
	
		scan.close();
	
	}

}
