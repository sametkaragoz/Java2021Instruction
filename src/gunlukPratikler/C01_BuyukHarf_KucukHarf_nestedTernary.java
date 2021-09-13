package gunlukPratikler;

import java.util.Scanner;

public class C01_BuyukHarf_KucukHarf_nestedTernary {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		char harf=scan.next().charAt(0);
		
		System.out.println( harf<'A' ? "Lutfen bir harf giriniz" : harf<='Z' ? "Buyuk Harf" : harf<'a' ? "Lutfen bir harf giriniz" : harf<='z' ? "Kucuk Harf" : "Lutfen bir harf giriniz");
			
		scan.close();
	}

}
