package day00HomeWorks;

import java.util.Scanner;

public class EskenarUcgen2 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz");
        
		int rakam = scan.nextInt();
		
		
		
		
		
		tayfurMethodu(rakam) ; 
		
	scan.close();
	
	}
		
		public static void tayfurMethodu(int rakam) {
			for (int i = 1; i <=rakam; i++) {
	            for (int j =i; j <=rakam; j++) {//burasi ile yildizlarin onundeki bosluklu alani azaltarak olusturduk
	                System.out.print(" ");    //bitisi rakam ile sabit tuttuk baslangici yukselterek araydaki dongu sayisini azaltik

	            }
	            for (int a =1; a <=i; a++) {//her satira kac yildiz koyacagimizi i ile kontrol ettik
	                System.out.print("*");  //i=1 iken bitis de bire esitledik bir yildiz yazdirdi
	                System.out.print(" ");  //yildizlar arasinda bosluk biraktik
	            }
	            System.out.println(" ");//ilk forun her dongusunde alt satira gecmesi icin yaptik
			}
		
		
	}

}
