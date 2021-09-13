package day43_exception03_Errors;

import java.util.Scanner;

public class C02_Exception02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Index giriniz");
		int indexNo=scan.nextInt();
		
		
		int arr []= {34,35,41,63,21};
		try {
			System.out.println(arr[indexNo]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" (siniri astiniz!!!)");
			System.out.println("Hatali index girdiniz");
		}
		finally {
			System.out.println("deamkee yazisini okuduysan code yeni sahillere yelken aciyor demektir");
		}
		
		/*
		 * finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		 * finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi 
		 * ongoremedigim bir exception olustugunda da calisir.
		 * 
		 * Final cumlesi : finally blogu her durumda mutlaka ve mutlaka CA-LI-SIR !!!
		 * 
		 */
		
		scan.close();
	}
	

}
