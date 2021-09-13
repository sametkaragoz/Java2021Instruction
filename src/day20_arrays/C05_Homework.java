package day20_arrays;

import java.util.Arrays;

public class C05_Homework {

	public static void main(String[] args) {
				
		// "java �gren, hayati yasa" kelime kelime terse cevirme

				String str = "java �gren, hayati yasa"; // string olarak assign ettim.

				String bolunmusStr[] = str.split(" "); // split y�ntemi ile arrayi kelimelere boldum.
				System.out.println(Arrays.toString(bolunmusStr)); // burada b�l�nm�s elementleri yazdirdim.
				// burada b�ld�g�m arrayi tersten yeniden olusturacagim methoda atamak i�in
				// yaptim.
				String tersCumle = strTersten(bolunmusStr); // burada bolunmus arrayimi tersten methoduna atad�m.
				System.out.println(tersCumle); // burada bi �stte atadigim methodu yazd�rd�m.
			}

			private static String strTersten(String bolunmusStr[]) { // tersten methodum bu

				String temp = ""; // temporary yani ge�ici bir String olusturdum
																// deklare ettim uzunlu�u ise bolunmus arrayimle ayn�
				for (int i = 0; i < bolunmusStr.length; i++) { // forloop olu�turdum i 0 dan basladi kelimeyi sondan basa
																// dogru temp'e ekledim
					temp += bolunmusStr[bolunmusStr.length - 1 - i];
					temp+=" ";
					

				}

				return temp; // burada temp kelime kelime tersten yazilmis cumle oldu

	}

}
