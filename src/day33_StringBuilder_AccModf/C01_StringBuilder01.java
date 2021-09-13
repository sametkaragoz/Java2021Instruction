package day33_StringBuilder_AccModf;

import java.time.LocalTime;

public class C01_StringBuilder01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

	
			// 100000 kere donecek bir loop yazalim
			// loop'da String ve StringBuilder kullanip 
			// oncesinde ve sonrasinda zaman alalim
			// hizlarini karsilastiralim
			
			
			String str="";
			StringBuilder sb=new StringBuilder("");
			
			LocalTime lt1=LocalTime.now();
			System.out.println("En bastaki kullanilmamis vakit : \t\t\t\t\t"+lt1);
			
			
			for (int i = 0; i < 100000; i++) {
				str+=i;
			}
			
			LocalTime lt2=LocalTime.now();
			System.out.println("String'in icerisine 100000 kez sayi concat yaptiktan sonraki vakit : \t"+lt2);// 2.5 dakika suruyor

			LocalTime lt3=LocalTime.now();
			System.out.println(lt3);
			
			
			for (int i = 0; i < 100000; i++) {
				sb.append(i);
			}
			
			LocalTime lt4=LocalTime.now();
			System.out.println("StringBuilder'in icerisine 400000 kez sayi ekledikten sonraki vakit : \t"+lt4);

	}

}
