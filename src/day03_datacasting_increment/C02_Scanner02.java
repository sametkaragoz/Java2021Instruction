package day03_datacasting_increment;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz.");
		
	    char ilkHarf = scan.next().charAt(0);
	    
	    System.out.println("Isminizin ilk harfi :"+ilkHarf );
	    
	    
	    scan.close(); 
	    
	    
	    

	}

}
