package day45_Interface;

public class C02_Sahin extends C01_Tofas implements IF01_IcDonanim , IF03_Lastik{

	// IC DONANIM ====>
	
	@Override
	public void koltuk() {
		System.out.println("deri koltuk yazin pisirir...");	
		System.out.println("Icinde saman olmasin yeter.");
	}

	@Override
	public void klima() {
		System.out.println("Klima var");
				
	}

	@Override
	public void direksiyon() {
		System.out.println("F1 tarzi direksiyon");
		
	}

	// DIS DONANIM ====>
	
	@Override
	public void ayna() {
		System.out.println("Elenktrikli aynalar");
		
	}

	@Override
	public void kapi() {
		System.out.println("2 kapili coupe");
		
	}

	@Override
	public void kaporta() {
		System.out.println("Degisensiz boyasiz kaporta...");
		
	}

	// SAHIN ====>
	
	@Override
	public void motor() {
		System.out.println("1.6 aile motoru");
		
	}

	@Override
	public void yakit() {
		System.out.println("tup takmazsan cooook yakar");
	}

	// LASTIK ====>
	
	@Override
	public void ebat() {
		System.out.println("16 inch lastik ebati");
		
	}

	@Override
	public void jant() {
		System.out.println("Celik jant kullanilmistir");
		
	}

}
