package day41_exception01;

import java.util.Scanner;

public class C01_Exceptions01 {
	
	public static void main(String[] args) {
		
		// kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz.
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Bolunen sayiyi giriniz");
		int sayi1=scan.nextInt();
		
		System.out.println("Bolen sayiyi giriniz");
		int sayi2=scan.nextInt();
		
		
		try {
			System.out.println("Bolum : "+sayi1/sayi2);
		} catch (ArithmeticException e) {                                            //try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi
			System.out.println("Bolme isleminde bolen sifir olamaz!!!");			/*
            																			e: ArithmeticException class'indan data type
            																		ArithmeticException olan bir exception obj
              																		manual handle yaptik
			 																		*/
		}
		scan.close();
	}

	

}
