package day41_exception01;

import java.util.Scanner;

public class C02_Exceptions02 {

	public static void main(String[] args) {//kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
        
        Scanner scan = new Scanner(System.in);
        int count=1;
        while (count<=2) {
            System.out.print("bolunen sayiyi giriniz : ");
            int sayi1=scan.nextInt();
            
            System.out.print("bolen sayiyi giriniz : ");
            int sayi2=scan.nextInt();
            try {
                System.out.println("bolum : "+sayi1/sayi2);
                
            } catch (ArithmeticException e) {//try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi
            System.out.println("hatali giris yaptin  bolen 0 olamaz");//manuel handle
            System.out.println(e.getMessage());// by zero -->handle edilecek veridir
            e.printStackTrace();//java.lang.ArithmeticException: / by zero
                                //bolunen sayiyi giriniz :  at _14_Exceptions.Exceptions02.main(Exceptions02.java:19)
                                //hatanin handle edilmesi icin tum verileri yazdirildi
            
    
}
            count++;
}
        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

        scan.close();
        
	}

}
