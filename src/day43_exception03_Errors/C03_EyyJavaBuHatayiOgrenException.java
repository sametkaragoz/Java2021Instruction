package day43_exception03_Errors;

public class C03_EyyJavaBuHatayiOgrenException  extends Exception{

	
	private static final long serialVersionUID = 1L;

	C03_EyyJavaBuHatayiOgrenException (String message) { // parametreli const creat ettim ki bu class'tan olusan
													  // Object ile class'tan ve parent'inden field ve veriable call edebileyim.
		
		super(message) ;
		
	}

}
