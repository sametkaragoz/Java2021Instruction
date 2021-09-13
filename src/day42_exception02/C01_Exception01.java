package day42_exception02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_Exception01 {

	public static void main(String[] args) {
		
		try { // parent try-catch --> file yerini kontrol ediyor ya evde yoksa hatasini handle ediyor 
			
			FileInputStream fis = new FileInputStream("C:\\Users\\samet\\eclipse-workspace\\java2021summertr\\src\\day41_exception\\note");
			fis.close();
			int i = 0;
			   // child try-catch --> file icerigini okuma ve yazdirma islemini handle ediyor
				while ((i = fis.read()) != -1) { // int degeri fis obj read methodu ile atandiginda -1 ile esit degilse while body'sine gir...
					System.out.print((char) (i));

				}

			} catch (FileNotFoundException e) {
			 //e.printStackTrace();

			System.out.println(e.getMessage());

		}catch (IOException e) { // I: input O: output
				e.printStackTrace(); // daha cok kullanilir cinku hatanin tum verisini verir hem de handle kolayligi saglar.
				System.out.println(e.getMessage());
			

		}

		

		System.out.println("\n\nAradigin dosya yerindeydi...");
		
		System.out.println();

		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	}

}
