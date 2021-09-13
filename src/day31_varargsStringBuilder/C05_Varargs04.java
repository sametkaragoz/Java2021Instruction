package day31_varargsStringBuilder;

import java.util.ArrayList;
import java.util.List;

public class C05_Varargs04 {

	public static void main(String[] args) {
		
		//Scanner scan=new Scanner(System.in);
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		
		// toplama(list);			varargs esnek oldugu icin list'e benzese de list degildir
		
		int arr [] = {15,20,25} ;
		toplama(arr);				// varargs array olarak calisir ve argument olarak array gonderilebilir
		
		
		// kullanicidan deger alarak varags calistirmak istiyorsak 
		// girilen degerleri bir array'a kaydetmeliyiz
		// bunun icin kullanicidan aldigimiz degerleri esnek oldugu icin list'e koyariz
		// sonra list'i array'e ceviririz
		
	}

	public static void toplama(int... var) {
		
		int toplam = 0;
		for (int each : var) {				// var'a git, her bir int'i bana getir
			toplam+=each;
			
		}
		System.out.println("toplam : "+toplam);
		
	}
	
}
