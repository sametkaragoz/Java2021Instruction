package day00HomeWorks;

import java.util.Scanner;

public class PalindromKontrolu {

	public static void main(String[] args) {
		// Girilen stringin palindrom olup olmadýðýný kontrol edin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir isim giriniz.");
		
		String isim=scan.next();
		
		String terstenIsim="";
		
		for (int i = 0; i < isim.length(); i++) {
			
			terstenIsim+=isim.substring(isim.length()-1-i,isim.length()-i);
			
		}
		
		if (isim.equals(terstenIsim)) {
			
			System.out.println("Girdiginiz isim palindrom bir isimdir.");
		} else {
			
			System.out.println("Girdiginiz isim palindrom bir isim deðildir.");
			
		}
		
		scan.close();
	}

}
