package day00HomeWorks;

import java.util.Scanner;

public class FaktoriyelHesaplayici {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int sayi=scan.nextInt();
				
		double sonuc=1;
		
		String carpimSatiri="";
		
		for (int i=sayi; i>=1; i--) {
			sonuc*=i;
			carpimSatiri+=i+"*";
		}
		carpimSatiri=carpimSatiri.substring(0,carpimSatiri.length()-1);
		
		System.out.println(sayi+"!="+carpimSatiri+"="+sonuc);
	 
		scan.close();
	}

}
