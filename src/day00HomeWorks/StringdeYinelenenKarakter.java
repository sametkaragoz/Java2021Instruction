package day00HomeWorks;

import java.util.Scanner;

public class StringdeYinelenenKarakter {

	public static void main(String[] args) {
		// Bir String icerisinde yinelenen karakterleri döndüren bir kod yazýniz.(mülakat Sorusu)
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("Bir string giriniz: "); 
		String str = scan.nextLine(); 
		
		int i=0;
		
		String yinelenenKarakterler="";
		
		while (i<str.length()-1) {
			int j=i+1;
			
			while (j<str.length()) {
			
				if ((str.substring(i,i+1).equals(str.substring(j,j+1)))) {
				
					if (!(yinelenenKarakterler.contains(String.valueOf(str.charAt(j))))) {
						yinelenenKarakterler+=str.charAt(j);
						yinelenenKarakterler+=" ";
					}
				
				} j++;
				
			}i++;
						
		} 
		
		System.out.print(yinelenenKarakterler);
		
		scan.close();
	}

}
