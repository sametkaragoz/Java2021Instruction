package day42_exception02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Exception04 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		System.out.println(arr[1]);// 2
		System.out.println(arr[3]);// 4
		// System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked

		List<String> gzlinsn = new ArrayList<>(Arrays.asList("merve", "hakan", "firat"));

		System.out.println(gzlinsn.get(2));//
		System.out.println(gzlinsn.get(0));//
		// System.out.println(gzlinsn.get(5));// IndexOutOfBoundsException unchecked

		// Array ve list'lerde olmayan bir index ile islem yapilirsa
		// java IndexOutOfBoundsException unchecked hatasi verir.

		// -------------------------------------------------------------------------------------

		String exp = "ornek cumle"; // 11 karakter barindiriyor
		System.out.println("8. karakter : " + exp.substring(7, 8)); // u
		System.out.println("12. karakter : " + exp.substring(11, 12)); // gorunurde hata yok. Kodun alti kirmizi
																		// cizilmedi
																		// fakat Run ettigimizde hata verecek.
																		// StringIndexOutOfBoundsException hatasini
																		// aldik.

	}

}
