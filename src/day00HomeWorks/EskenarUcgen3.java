package day00HomeWorks;

import java.util.Scanner;

public class EskenarUcgen3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz");
        
		int rakam = scan.nextInt();
        
        onurMethodu(rakam);
        
	scan.close();
	
	}
        
       
        public static void onurMethodu(int rakam) {
    		String a = "";

    		for (int i = 0; i <rakam; i++) {

    			for (int j = 0; j < rakam-i; j++) {
    				System.out.print(" ");

    			}
    			a+="* ";
    			System.out.println(a);

    		}
		
		
	}

}
