package day15_forLoops;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		
		for(int i=4; i>1; i--) {
			System.out.println(i);
		}
		
		for(int a=10; a<21; a++) {
			System.out.print(a+" ");
		}
		 System.out.println("");
		 
	   	 for(int b=100; b<201; b+=10 ) {
	   		 System.out.print(b+" ");
	   	 }
        System.out.println("");	
		for(int c=50; c>9; c-=3) {
			System.out.print(c+" ");
		}
		System.out.println("");
		for(int d=50; d<101; d++) {
			
			if (d%3==0) {
				System.out.print(d+" ");
			} 
			
			
				
			}
			
			// 10'dan 20 ye kadar olan sayilari yazdiran bir loop olusturalim
	        
	        for (int i=10  ; i<=20 ; i++) {
	            
	            System.out.print(i+" ");
	        }
	        
	        // 100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin
	        System.out.println("");
	        for (int i = 100; i <=200; i+=10) {
	            System.out.print(i + " ");
	        }
	        
	        // 50'den 10 ye kadar (sinirlar dahil) 3'er 3'er geri sayarak yazdiralim
	        System.out.println("");
	        for (int i = 50; i >= 10 ; i-=3) {
	            System.out.print(i + " ");
	        }
	        
	        // 50 ile 100 arasinda uc ile bolunebilen sayilari yazdirin
	        System.out.println("");
	        
	        
	        
	        
	        for (int i = 50; i <=100; i++) {
	            
	            if ( i%3==0  ) {  // sayi 3 ile tam bolunuyorsa
	                System.out.print(i + " ");
	            }
	    
	        }
	        
	        System.out.println("");
	        
	        
	        // eger degiskenimiz verilen artis veya azalisla bitis kosuluna ulasamiyorsa 
	        // sonsuz loop olusur ve sistem cokene kadar loop calismaya devam eder
	        /*
	        for (int i = 10; i < 20 ; i--) {
	            System.out.print(i + " ");
	        }
	        */
	        
	        // eger baslangic degeri kosulu saglamiyorsa
	        // loop body hic calismadan, loop'un sonuna gider
	        // yani loop islevsiz olur
	        
	        for (int i = 10; i < 0; i++) {
	            System.out.println(i + " ");
	        }
	        
	        System.out.println("son for loop'un sonrasi");
			
		} 
		


	}


