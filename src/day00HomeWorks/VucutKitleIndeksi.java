package day00HomeWorks;

import java.util.Scanner;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kilonuzu giriniz");
		int agirlik=scan.nextInt();
		System.out.println("Boyunuzu metre cinsinden giriniz");
		double uzunluk=scan.nextDouble();
		
		double vucutKitleIndeksi=agirlik/(uzunluk*uzunluk);
		
		if (vucutKitleIndeksi<18.5) {
			
			System.out.println("Agirlik : "+agirlik+"\nBoy : "+uzunluk+"\nBMI : "+vucutKitleIndeksi+"\nZayifsiniz.");
			
		} else if (vucutKitleIndeksi<=25) {
			System.out.println("Agirlik : "+agirlik+"\nBoy : "+uzunluk+"\nBMI : "+vucutKitleIndeksi+"\nKilonuz idealdir.");
		}else if (vucutKitleIndeksi<=30) {
			System.out.println("Agirlik : "+agirlik+"\nBoy : "+uzunluk+"\nBMI : "+vucutKitleIndeksi+"\nSismansiniz.");
		}else {
			System.out.println("Agirlik : "+agirlik+"\nBoy : "+uzunluk+"\nBMI : "+vucutKitleIndeksi+"\nObezsiniz.");
		}

		
		scan.close();
		
	}

}
