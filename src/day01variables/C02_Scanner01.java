package day01variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
		String kullanicininIsmi = scan.nextLine();
  		
	     System.out.println("Girdiginiz isim : " + kullanicininIsmi);
	     
		 scan.close();
    
	}
	

}
