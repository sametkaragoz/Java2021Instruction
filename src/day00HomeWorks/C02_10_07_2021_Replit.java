package day00HomeWorks;

import java.util.Scanner;

public class C02_10_07_2021_Replit {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);	
		
		int saat=scan.nextInt();
		int dakika=scan.nextInt();
		int saniye=scan.nextInt();
		
		int saatDonusturulmus=saat*3600;
		int dakikaDonusturulmus=dakika*60;
		
		
		System.out.println(saat+" saat "+dakika+" dakika "+saniye+" saniye ==>");
		System.out.println((saatDonusturulmus+dakikaDonusturulmus+saniye)+" saniye");
	
		scan.close();
	}

}
