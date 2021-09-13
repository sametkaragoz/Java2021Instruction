package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		//Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		//KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin, 
		//ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz.");
		
		String musteriIsmi=scan.next();
		
		musteriIsmi= ismiDuzelt(musteriIsmi);
		
		System.out.println("Lutfen soyisminizi giriniz.");
		
		String musteriSoyismi= scan.next();
		
		musteriSoyismi= ismiDuzelt(musteriSoyismi);
		
		//pratik kullaným acisindan baba adi, anne adi, anne kizlik soyadi vb. tum bilgileri ayni
		//methodu kullanarak istedigimiz formata cevirebiliriz.
		
		System.out.println("Lutfen kredi kartý numaranýzý arada bosluk olmadan giriniz.");

		String kkNo=scan.next();
		
		kkNo=kkNoDuzelt(kkNo);
		
		System.out.println(musteriIsmi + " "+ musteriSoyismi + "\n"+ kkNo);
        scan.close();
		
	}


	public static String kkNoDuzelt(String kkNo) {
		kkNo=kkNo.replace(" ", "");
		kkNo= kkNo.substring(0,4) + " " + kkNo.substring(4,8) + " " + kkNo.substring(8,12) + " " + kkNo.substring(12);

		return kkNo;
	}


	public static String ismiDuzelt(String musteriIsmi) {
		
		musteriIsmi=musteriIsmi.trim();
		
		musteriIsmi= musteriIsmi.substring(0,1).toUpperCase() + musteriIsmi.substring(1).toLowerCase();
		//musteri isminde yaptigim degisiklikleri main methoda'a gonderebilmek icin retun type'i void yerine variable'in
		//data turune uygun bir sekle dnustururuz
		 
		return musteriIsmi;
	}

}


















