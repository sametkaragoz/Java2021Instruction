package day41_exception01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_Exceptions03 {

	public static void main(String[] args) {
		
		/*
		 * Eger kod creat edilirken birden fazla exception durumu olusuyorsa
		 * Iç içe nested try Catch Bloklari crate edilmeli asagidaki kod blogunda ilk 
		 * önce dosyayi okutmak istedik java "ya file'i bulamazsam ?" muhtemel 
		 * exceptions (hata istisna) için try-Catch blogu ===> FileNotFoundException ile
		 * handle edilmesi saglandi. Sonra file'daki karakterleri okumasi icin komutlar girildi.
		 * 
		 * Java yeniden "Ya file'daki karakterleri okuyamazsam?" muhtemel
		 * exceptions (hata-istisna) icin tray-catch blogu ===> IOException ile handle
		 * etmesi saglandi.
		 * 
		 */
		try { // parent try-catch --> file yerini kontrol ediyor ya evde yoksa hatasini handle ediyor 
			
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\samet\\eclipse-workspace\\java2021summertr\\src\\day41_exception\\note");
			int i = 0;
			try {   // child try-catch --> file icerigini okuma ve yazdirma islemini handle ediyor
				while ((i = fis.read()) != -1) { // int degeri fis obj read methodu ile atandiginda -1 ile esit degilse while body'sine gir...
					System.out.print((char) (i));

				}

			} catch (IOException e) { // I: input O: output
				e.printStackTrace(); // daha cok kullanilir cinku hatanin tum verisini verir hem de handle kolayligi saglar.
				System.out.println(e.getMessage());
			}

		}

		catch (FileNotFoundException e) {
			 //e.printStackTrace();

			System.out.println(e.getMessage());

		}

		System.out.println("\n\nAradigin dosya yerindeydi...");
		
		System.out.println();

		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}

}
