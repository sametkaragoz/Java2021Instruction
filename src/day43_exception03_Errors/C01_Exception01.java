package day43_exception03_Errors;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_Exception01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\samet\\eclipse-workspace\\java2021summertr\\src\\day41_exception01\\notes");
		int i = 0;

		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		
		/*
		 * throws keyword'u sadece declaration icindir.
		 * throws kullanilan methodda exception olursursa KOD BLOKE (CODE BLOCK) olur.
		 * Exceptions arasinda parent-child iliskisi varsa throws'dan sonra parent class'in exception'i yazilmali.
		 * 
		 */
		
	}

}
