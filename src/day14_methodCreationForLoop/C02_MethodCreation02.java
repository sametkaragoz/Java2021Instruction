package day14_methodCreationForLoop;

import java.util.Scanner;

public class C02_MethodCreation02 {

	public static void main(String[] args) {
		// Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. 
		//Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen kac sayi toplamak istediginizi giriniz.");
		
		int sayiAdedi=scan.nextInt();
		
		if (sayiAdedi<2) {
			System.out.println("Toplamak icin en az iki sayi girmelisiniz.");
		} else if (sayiAdedi==2) {
			ikiSayiTopla();
		} else if (sayiAdedi==3) {
			ucSayiyiTopla();
		} else if(sayiAdedi==4) {
			dortSayiyiTopla();
		} else {
			System.out.println("Cok sayi girdiniz, toplayamam.");
		}

		scan.close();
	}

	public static void dortSayiyiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen dort tam sayi giriniz.");
		double sayi1=scan.nextInt();
		double sayi2=scan.nextInt();
		double sayi3=scan.nextInt();
		double sayi4=scan.nextInt();
		System.out.println("Dort sayi girmeyi tercih ettiniz "+ "\nGirilen dort sayinin toplami : "+ (sayi1+sayi2+sayi3+sayi4));
		
		scan.close();
	}

	public static void ucSayiyiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen uc tam sayi giriniz.");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		System.out.println("Uc sayi girmeyi tercih ettiniz "+ "\nGirilen uc sayinin toplami : "+ (sayi1+sayi2+sayi3));
		
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki tam sayi giriniz.");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		System.out.println("Iki sayi girmeyi tercih ettiniz "+ "\nGirilen iki sayinin toplami : "+ (sayi1+sayi2));
		
		
		scan.close();
		
	}

}
