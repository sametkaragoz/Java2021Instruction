package day00HomeWorks;

import java.util.Scanner;

public class CumledenHarfSayisiBulma {

	public static void main(String[] args) {
		//Kullan�c�dan bir isim ve bir karakter girmesini isteyin, 
				//ard�ndan d�ng�leri kullanarak karakterin isimde ka� kez tekrarland���n� kontrol edin.

				
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
