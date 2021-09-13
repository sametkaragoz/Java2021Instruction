package day00HomeWorks;

import java.util.Scanner;

public class HaftaninSorusu_KelimeOyunu {

	public static void main(String[] args) {
		/*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" 
        yazdirinan bir method oluþturun
                  e.g:
                 name1= mehmet
                 name2= ahmet
                 Print ==> mehahmetmet
        */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen iki isim giriniz.");
		
		String name1=scan.next();
		String name2=scan.next();
		
		if(name1.length()%2==0) {
			System.out.println(name1.substring(0,name1.length()/2)+name2+name1.substring(name1.length()/2));
		} else {
			tekSayiMethodu(name1);
		}
		
		scan.close();
		
	}

	public static void tekSayiMethodu(String name1) {
		
		if (name1.length()%2!=0) {
			System.out.println("Girdiginiz ilk isim tek sayi karakter barindirdigi icin ortasýna yerlestiremedik.");
		}
		
	}

}
