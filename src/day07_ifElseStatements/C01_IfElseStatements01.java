package day07_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements01 {

	public static void main(String[] args) {
	/*	Soru 3) Kullanicidan gun ismini alin ve 
         haftaici veya hafta sonu oldugunu yazdirin 
         Ornek:     gun=Pazar output = “Hafta sonu”
         gun=Sali output = “Hafta ici”
         *** String icin equals method’unu kullanin
	 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz.");
		String gunIsmi=scan.next().toLowerCase();
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
			
			System.out.println("Girdiginiz gun hafta icidir.");
			
		} if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
			
			System.out.println("Girdiginiz gun hafta sonudur");
			
		}
		
		
		scan.close();
		
	}

}
