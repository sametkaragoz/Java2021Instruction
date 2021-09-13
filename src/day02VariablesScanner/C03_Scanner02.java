package day02VariablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {
	
	public static void main(String[] args) {

      Scanner scan = new Scanner (System.in);
      
      System.out.println("Lutfen isminizi giriniz");
      
      String name = scan.next();
      
      System.out.println("Lutfen soy isminizi giriniz");
      
      String surname = scan.next();
      
      System.out.println("Isim-Soy isim : " + name + " " + surname);
      
      scan.close();
      
	
	
	
	}

	
}	