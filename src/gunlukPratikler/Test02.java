package gunlukPratikler;

public class Test02 extends C01{

	int num=15;
	
	protected Test02() {
		System.out.println(this.num);
		System.out.println("Test class");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Test02 obj =new Test02();
		

	}

}
