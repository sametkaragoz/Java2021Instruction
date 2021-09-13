package day06_relatioanalOperators_ifstatements;

import java.util.Scanner;

public class C03_IfStatements02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz :");
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi%2==0) {
			
			System.out.println("Girdiginiz sayi cift sayidir.");
			
		}
		
		if (girilenSayi%2==1) {
			
			System.out.println("Girdiginiz sayi tek sayi.");
			
		}
		
		
	scan.close();
		

	}

}
