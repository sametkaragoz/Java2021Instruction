 package day00HomeWorks;

import java.util.Scanner;

public class MukemmelSayiKontrol {

	public static void main(String[] args) {
		// Sayinin M�kemmel say� olup olmad���n� kontrol eden Java kodunu yaz�n.
		//* Say�n�n kendisi hari� pozitif b�lenlerinin toplam� o say�ya e�itse, herhangi bir say� M�kemmel Say� olarak bilinir.
		

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
