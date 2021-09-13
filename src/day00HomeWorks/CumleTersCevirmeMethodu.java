package day00HomeWorks;

import java.util.Scanner;

public class CumleTersCevirmeMethodu {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String cumle=scan.nextLine();
		
		for (int i=0; i<cumle.length(); i++) {
			String terstenCumle=cumle.substring(cumle.length()-1-i,cumle.length()-i);
			
			System.out.print(terstenCumle);
		}
		scan.close();
	}

}
