package day00HomeWorks;

import java.util.Scanner;

public class SayiTersCevirmeMethodu {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		String sayi=scan.next(); // 12345
		
		sayiyiTersCevir(sayi);
		
		
		scan.close();
	} 

	public static void sayiyiTersCevir(String sayi) {
		
		for (int i = 0; i<(sayi.length()); i++) {
			
			String tersCevrilmisSayi=sayi.substring(sayi.length()-1-i,sayi.length()-i) ;

			System.out.print("Girilen Numananin tersi: "+tersCevrilmisSayi);
			
			
		} 
		
		
	} 

}
