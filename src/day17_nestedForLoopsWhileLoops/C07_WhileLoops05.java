package day17_nestedForLoopsWhileLoops;

import java.util.Scanner;

public class C07_WhileLoops05 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		while (toplam<200) {
			System.out.println("Lutfen toplamak icin bir tam sayi giriniz.");
			sayi=scan.nextInt();
			
			toplam+=sayi;
			sayac++;		
			
		}

		// toplamin 200'ü geçtiðinden eminiz artýk.
		
		System.out.println("Toplam "+sayac+" adet sayi girdiniz ve bu sayilarin toplami : "+toplam);
		
		
		scan.close();
		
	}

}
