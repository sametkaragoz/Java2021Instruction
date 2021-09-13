package day41_exception01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_ {

	public static void main(String[] args) {
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\samet\\eclipse-workspace\\java2021summertr\\src\\day41_exception\\notes");
			System.out.println(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
