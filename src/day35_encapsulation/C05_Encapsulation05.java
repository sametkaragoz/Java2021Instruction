package day35_encapsulation;

import java.util.Scanner;

public class C05_Encapsulation05 { // main class

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Adinizi giriniz");
		String name = scan.nextLine();

		System.out.println("Dogum tarihinizi giriniz MM/dd/yyyy");
		String dob = scan.nextLine();

		System.out.println("Talep ettiginiz maasi giriniz");
		int salary = scan.nextInt();

		
		C06_Encapsulation06 calisan=new C06_Encapsulation06();
		
		calisan.setDob(dob);
		calisan.setName(name);
		calisan.setSalary(salary);
		
		int calisanYas=calisan.yasHesapla(dob);
		
		if (calisanYas>18) {
			System.out.println("Welcome to our company "+name+" your salary is : "+salary);
		} else if (calisanYas==18) {
			System.out.println("We can have inter with you after that you can have a "+salary+" salary");
		} else if (calisanYas<18) {
			System.out.println("Come back when you are 18 years old.");
		}
		
		scan.close();
	}

}
