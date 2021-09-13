package day35_encapsulation;

import java.util.Scanner;


public class C02_Encapsulation02 {

	/*
    Burada iki adet class vardir. Biri Main digeri ise rentApartments
    rentApartments'in içinde;
    Bu variable'lari private olarak olusturun;
    String name
    int roomCount
    boolean balconyOrNo
    
    Butun variable'lar için getter ve setter olusturunuz.
    
    4 farkli Apartment(apartman dairesi) vardir. 0, 1, 2, 3 rooms(odali)
    -----------------------------------------------------------------
    Bir method olusturun;
    Eger room sayisı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.
​
    Main class'ın içinde;
    userName rent is amountOfRent
     */
	
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);
	
		System.out.println("adinizi giriniz");
		String name=scan.nextLine();
	
		System.out.println("Dairede talep ettiginiz oda sayisini giriniz : ");
		int odaSayisi=scan.nextInt();
	
		System.out.println("Balkon tercihinizi giriniz.  (true/false) : ");
		boolean balcony=scan.nextBoolean();
		
		C01_Encapsulation01 kiraci=new C01_Encapsulation01();
		
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		
		int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
		
		System.out.println(kiraci.getName()+" bey/hanim, kira ucretiniz : "+toplamKira);
		
	
		
		scan.close();
		
		
	}

}
