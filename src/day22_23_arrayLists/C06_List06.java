package day22_23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_List06 {

	public static void main(String[] args) {
		// 100'den buyuk ilk 20 fibonacci sayisini List olarak yazdirin.
		
		List <Integer> fibonacci=new ArrayList<>();
		List <Integer> istenenSayilar=new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		
		int count=1;
		int sayi=0;
		
		do {
			
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			
			fibonacci.add(sayi);
			
			if (sayi>100) {
				
				istenenSayilar.add(sayi);
				count++;
				
			}
			
			
		} while (count<=20) ;
		
		System.out.println(istenenSayilar);
		
	}

}
