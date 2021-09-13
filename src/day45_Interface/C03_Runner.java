package day45_Interface;

public class C03_Runner {

	public static void main(String[] args) {
		
		C02_Sahin s1=new C02_Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(IF01_IcDonanim.muzik);
		System.out.println(C02_Sahin.muzik);
	//	s1.kumas="deri";			final veriable assignment yapilamaz
		
		System.out.println(IF01_IcDonanim.RENK);		// ahsap
		System.out.println(IF02_DisDonanim.RENK);		// metalik
		System.out.println(IF03_Lastik.RENK);			// siyah beyaz yanakli
		
		System.out.println(s1.sisLambasi());			//    object      ile parent interface'den concrete method call edildi
		System.out.println(IF02_DisDonanim.boya());		// interface name ile parent interface'den concrete method call edildi
		
		
	}

}
