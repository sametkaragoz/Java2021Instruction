package day00HomeWorks;

public class OdevSorulari {

	public static void main(String[] args) {
	// 1-	//  0-255 e kadar olan harflerin , say� ve harf de�erini konsola yazd�r�n�z.
	// 2-	
		/*Girilen bir stringdeki a harfi say�s�n� bulunuz.
        	ama  c harfine  gelirse d�ng�den ��k�ls�n
        	Bug�n hava oldukca g�zel.-> 2
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
