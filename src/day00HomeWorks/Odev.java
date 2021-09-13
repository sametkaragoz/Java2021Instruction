package day00HomeWorks;

import java.util.Scanner;

public class Odev {

	public static void main(String[] args) {
		/*
         * 
         * Nested If kullanarak asagidaki soruyu cozen kodu yaziniz. Kullanicidan bir
         * sifre girmesini isteyin Eger ilk harf buyuk harf ise “A” olup olmadigini
         * kontrol edin. Ilk harf A ise “Gecerli Sifre” degilse “Gecersiz Sifre”
         * yazdirin. Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk
         * harf z ise “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
         * 
         */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen sifrenizi giriniz.");
		
		String sifre=scan.next();
		
		if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z') {
			
			if (sifre.substring(0,1).equals("A")) {
				System.out.println("Gecerli sifre.");
			} else {
				System.out.println("Gecersiz sifre.");
			}
		} else if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
				if (sifre.substring(0,1).equals("z")) {
					System.out.println("Gecerli sifre.");
				} else {
					System.out.println("Gecersiz sifre.");
				}
	} else {
		System.out.println("Lutfen ilk karakteri harf giriniz.");
	}
			scan.close();

	}

}
