 package day00HomeWorks;

import java.util.Scanner;

public class MukemmelSayiKontrol {

	public static void main(String[] args) {
		// Sayinin Mükemmel sayý olup olmadýðýný kontrol eden Java kodunu yazýn.
		//* Sayýnýn kendisi hariç pozitif bölenlerinin toplamý o sayýya eþitse, herhangi bir sayý Mükemmel Sayý olarak bilinir.
		

		Scanner scan=new Scanner(System.in);
		int sayi=scan.nextInt();
		
		int bolenToplam=0;
		
		for (int bolenSayi=sayi-1; bolenSayi>=1; bolenSayi--) {
			
			if ((sayi%bolenSayi==0)) {
				bolenToplam+=bolenSayi;
			
			} else {
				
			}
	   }
		if (sayi==bolenToplam) {
			System.out.println(sayi+" Mukemmel Sayidir.");
		} else {
			System.out.println(sayi+" Mukemmel Sayidir degildir.");
		}
	
		scan.close();
	
	}

}
