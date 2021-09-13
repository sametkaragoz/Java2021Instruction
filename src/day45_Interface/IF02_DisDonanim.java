package day45_Interface;

public interface IF02_DisDonanim {

	public void ayna();
	public void kapi();	
	public void kaporta();
	
	String RENK="metalik";
	
	public default String sisLambasi() {		// bu method bildigin body'li concrete method
		return "sisli hava dikkat!";
		
	}
	
	public static String boya() {				// bu method bildigin body'li concrete method
		return "koyu renk boya gunes yanigi yapar";
		
	}
}
