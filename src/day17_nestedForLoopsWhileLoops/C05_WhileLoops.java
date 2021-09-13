package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C05_WhileLoops {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip 
		//bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.Kullanicinin hata yapmadigini farz edin.
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Luten farkli iki harf giriniz");
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		char degiskenHarf=ilkHarf;
		
		while (degiskenHarf<=sonHarf) {
			System.out.print(degiskenHarf+" ");
			
			degiskenHarf++;
		}
		
		
		scan.close();
		
	}

}
