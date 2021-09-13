package day00HomeWorks;

import java.util.Scanner;

public class MusteriIndirimOdevi {

	public static void main(String[] args) {
		/*
	     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	     * musteri karti olup olmadigini sorun
	     *
	     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
	     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	     * alirsa %10 indirim yapin
	     */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen kac adet urun aldýgýnýzý girin.");
		
		int urunSayisi=scan.nextInt();
		
		int girilenUrunSayisi=0;
		
		int toplamFiyat=0;
		
		while(girilenUrunSayisi<urunSayisi) {
			
			System.out.println("Aldiginiz urunlerin liste fiyatlarini giriniz.");
			
			int urunListeFiyati=scan.nextInt();
			
			girilenUrunSayisi++;
			toplamFiyat+=urunListeFiyati;
			
		}
		System.out.println("Aldiginiz urunlerin toplam fiyati : "+toplamFiyat );
		System.out.println("");
		System.out.println("Musteri kartiniz var mi?");
		
		String kartKontrol=scan.next().toLowerCase();
		
		if (kartKontrol.equals("evet")) {
			
			if (urunSayisi>=10) {
				
				toplamFiyat-=toplamFiyat*20/100;
			
			} else {
				
				toplamFiyat-=toplamFiyat*15/100;
				
			} System.out.println("Indirimli odeyeceginiz tutar : "+toplamFiyat);
		}  
		
		else if (kartKontrol.equals("hayir")) {
			
			if (urunSayisi>=10) {
				
				toplamFiyat-=toplamFiyat*15/100;
				
			} else {
				toplamFiyat-=toplamFiyat*10/100;
			}
			System.out.println("Ýndirimli odeyeceginiz tutar : "+toplamFiyat);
		}
	
		scan.close();
	}

}
