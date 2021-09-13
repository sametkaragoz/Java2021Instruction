package day00HomeWorks;

import java.util.Scanner;

public class IkiSayiArasindakileriToplama {

	public static void main(String[] args) {
		// Girilen iki sayi arasindaki sayilari toplayip yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("Aralarindaki sayilari toplamak uzere iki sayi(dahiller) giriniz.");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int toplam=0;
		
		if(sayi1<sayi2) {
			
			for(int i=sayi1; i<=sayi2; i++) {
				
				toplam+=i;
			}
			
			System.out.println(sayi1+" ile "+sayi2+" arasindaki sayilarin toplami : "+toplam);
			
		} else if (sayi2<sayi1) {
			
			for(int i=sayi2; i<=sayi1; i++) {
				
				toplam+=1;
				
				System.out.println(sayi2+" ile "+sayi1+" arasindaki sayilarin toplamli : "+toplam);
				
			}
			
		} else {
			
			System.out.println("Sayilar esit ve toplami : "+(sayi1+sayi2));
		}
		scan.close();
		 
		
		
	}

}
