package day03_datacasting_increment;

import java.util.Scanner;

public class C01_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soy isminizi yaziniz,\nisminizi yazdiktan sonra ENTER'a basiniz");
		
        String name = scan.nextLine();
        String surname = scan.nextLine();
        
        System.out.println("Isminiz : " + name +"\nSoy isminiz :"+ surname +"\nKursumuza katiliminiz alinmistir, tesekkür ederiz.");
        
        scan.close();
       
	}

}
