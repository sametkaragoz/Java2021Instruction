package day43_exception03_Errors;

public class C06_Final01 {

	static final int AGE=33;  //final keyword ile veri IMMUTABLE hale galir
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// AGE=34;
		
		int zam=3000;
		final int maas=5000;
		
		
		// maas+=zam;       //final keyword ile declare edilen veriable'a yeno deger ATANAMAZ!!!!
		
		
		
	}

}
