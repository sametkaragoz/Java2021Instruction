package day43_exception03_Errors;

public class C09_ExceptionsExp01 {

	public static void main(String[] args) {
		
		/* Ortalama isminde bit method olusturun ve 'int v' - 'int f' isminde 2 adet parametresi olsun.
		 * 
		 * int v = vize
		 * int f= final
		 * 
		 * Eger vize 100'den buyuk veya final 100'den buyuk veya vize-final ikilisi 0'dan kucuk ise 
		 * sistem bize ArithmeticException hatasini versin ve "Notlar 0-100 arasinda olmali" mesajini dondursun.
		 * 
		 * Diger durumlarda ise,
		 * Vizenin %40'ini, finalin %60'ini alsin ve toplasin. (ortalama =)
		 * 
		 *  
		 *  vizeye 120, finale 80 girin ;
		 *  
		 *  Programin calisamasini saglayin...
		 */
		
		try {
			ortalama(120,80);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
			}
	
	public static void ortalama(int v , int f) {
		if (v>100 || v<0 || f>100 || f<0) {
			throw new ArithmeticException("Notlar 0-100 arasinda olmali");
		}else {
			System.out.println("Ortalama : "+((v*(0.4))+(f*(0.6))));
		}
	
	}

}
