package day35_encapsulation;

import java.util.Scanner;

public class C03_Encapsulation03 {

	public static void main(String[] args) {

		C04_Encapsulation04 kitap = new C04_Encapsulation04();

		Scanner scan = new Scanner(System.in);

		System.out.println("Son okudugunuz kitabin ismini giriniz.");
		String kitap2 = scan.nextLine();
		kitap.setBookName("Calikusu");

		kitap.setAuthorName(kitap2);
		System.out.println("1. kitabim : " + kitap.getBookName() + " \n2. kitabim : " + kitap.getAuthorName());

		scan.close();

	}

}
