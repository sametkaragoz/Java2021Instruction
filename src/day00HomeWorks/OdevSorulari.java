package day00HomeWorks;

public class OdevSorulari {

	public static void main(String[] args) {
	// 1-	//  0-255 e kadar olan harflerin , sayý ve harf deðerini konsola yazdýrýnýz.
	// 2-	
		/*Girilen bir stringdeki a harfi sayýsýný bulunuz.
        	ama  c harfine  gelirse döngüden çýkýlsýn
        	Bugün hava oldukca güzel.-> 2
        	str.CharAt(0)
        	*/
        
      
	
		
		// 3- 
	
	
		/*
		
	1-		char ilkSayi=0;
			Integer sonSayi=255;
	
			for (char i=ilkSayi; i<=sonSayi; i++) {
			System.out.println(ilkSayi+0+" "+i);
			ilkSayi++;
	}
	
	*/
	
		/*
		
	2-	Scanner scan = new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str = scan.nextLine();
		
        int metinLength=str.length();
        int i=0;
        int count=0;
        
		while (metinLength>0) {
			
			if (str.substring(i,i+1).toLowerCase().equals("a")) {
				count++;
			}
			
			if (str.substring(i,i+1).equals("c")) {
				break;
			}i++;
			metinLength--;
		}
		
		System.out.println(count);
	
	
	*/
	
	}

}
