package day00HomeWorks;

import java.util.Scanner;

public class CumledenHarfSayisiBulma {

	public static void main(String[] args) {
		//Kullanýcýdan bir isim ve bir karakter girmesini isteyin, 
				//ardýndan döngüleri kullanarak karakterin isimde kaç kez tekrarlandýðýný kontrol edin.

				
				Scanner scan = new Scanner(System.in);
				
				String str=scan.nextLine().toLowerCase();
				char chr=scan.next().toLowerCase().charAt(0);
				
				int a=0;
						
				for (int i=0; i<=str.length()-1; i++) {
					
					
					if (str.charAt(i)==chr) {
						
						a++;
					} 
				}
			
				System.out.println("Girdiginiz cumledeki "+chr+" sayisi : "+a);

				scan.close();
				
	}

}
