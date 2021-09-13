package day15_forLoops;

import java.util.Scanner;

public class C09_ForLoops08 {

	public static void main(String[] args) {
		// Soru 11 ) Interview Question 
		//Kullanicidan 10’den kucuk bir sayi isteyin ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 10'dan kucuk bir sayi giriniz.");
		int sayi=scan.nextInt();
		
		int faktoriyel=1;
		
		for(int i=1; i<=sayi; i++) {
		
			faktoriyel*=i;
			
		}
		
		System.out.println("Girdiginiz sayinin faktoriyeli :"+ faktoriyel);
		
		
		scan.close();
	}

}
