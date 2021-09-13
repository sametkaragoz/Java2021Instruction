package day31_varargsStringBuilder;


public class C03_Varargs02 {

	public static void main(String[] args) {
		// Istedigimiz kadar sayi girdigimizde tum sayilari toplayan bir method yazalim
		
		// Var-------variety==> Cesitlilik               args----arguments==> Arguman
		
		
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);

	}

	public static void toplama(int... var) {			// data turunden sonra yazdigimiz  ...  varargs kullanacagimiz anlamina gelir
		
		int toplam = 0;
		for (int each : var) {				// var'a git, her bir int'i bana getir
			toplam+=each;
			
		}
		System.out.println("toplam : "+toplam);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
