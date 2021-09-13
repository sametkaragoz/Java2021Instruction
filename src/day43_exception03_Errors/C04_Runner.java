package day43_exception03_Errors;

import java.util.Scanner;

public class C04_Runner {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws C03_EyyJavaBuHatayiOgrenException {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("email giriniz");
		
		String email=scan.next();
		
		if (email.contains("@gmail.com") ||email.contains("@ebikgabik.com")) {
			System.out.println("basarili");
			
		} else {
			throw new C03_EyyJavaBuHatayiOgrenException ("neyin kafasi bu? ") ;
		}
	scan.close();
	}

}
