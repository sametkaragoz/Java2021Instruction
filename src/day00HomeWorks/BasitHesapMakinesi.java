package day00HomeWorks;

import java.util.Scanner;

public class BasitHesapMakinesi {

	public static void main(String[] args) {
		/* Problem Tan�m� :
        Basit 4 i�lem yapan bir hesap makinesi methodu kodlay�n�z....
        Kullanicidan yapacagi islemi islem sembolu ile secmesini saglayalin�z.
        Kullanicidan iki sayi girmesini isteyiniz.
        Girilen iki sayi ve secilen isleme gore dogru sonucu ekrana yazdir�n�z.
      */
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Yapmak istediginiz islemin sembolunu giriniz (�rn: +,-,*,/)");
		
		String islemSembolu=scan.next();
		
		System.out.println("Lutfen iki sayi giriniz.");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		
		if (islemSembolu.equals("+")) {
			toplama(sayi1,sayi2);
		}
		if (islemSembolu.equals("-")) {
			��karma(sayi1,sayi2);
		}
		if (islemSembolu.equals("*")) {
			carpma(sayi1,sayi2);
		}
		if (islemSembolu.equals("/")) {
			bolme(sayi1,sayi2);
		
		scan.close();
		}
		
	}

	public static void bolme(int sayi1, int sayi2) {
		
		System.out.println("Bolme isleminin sonucu : "+sayi1/sayi2);
		
	}

	public static void carpma(int sayi1, int sayi2) {
		
		System.out.println("Carpma isleminin sonucu : "+sayi1*sayi2);
		
		
		
	}

	public static void ��karma(int sayi1, int sayi2) {
		
		if (sayi1<sayi2) {
			
			System.out.println("C�karma isleminin sonucu : "+(sayi2-sayi1));
		} else if (sayi1>sayi2) {
			
			System.out.println("C�karma isleminin sonucu : "+(sayi1-sayi2));
			
		} else {
			
			System.out.println("0");
			
		}
		
	}

	public static void toplama(int sayi1, int sayi2) {
		
		System.out.println("Toplama isleminin sonucu : "+(sayi1+sayi2));
		
		
	}

}
