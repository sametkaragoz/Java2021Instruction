package day14_methodCreationForLoop;

import java.util.Scanner;

public class C01_MethodCreation01 {

	public static void main(String[] args) {
		// Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, 
		//sifirdan buyuk mu kucuk mu oldugunu, 
		//ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz.");
		int sayi=scan.nextInt();
		
		tekMiCiftMiYazdir(sayi);
	
		scan.close();
	}

	public static void tekMiCiftMiYazdir(int sayi) {
		
		if(sayi%2==0) {
			System.out.println("Girilen sayi cift sayidir.");
		} else {
			System.out.println("Girilen sayi tek sayidir.");
		}
		
	}

}
