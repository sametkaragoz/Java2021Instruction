package day42_exception02;

public class C03_Exception03 {

	public static void main(String[] args) {

		String str1 = " ";// space
		String str2 = "";// hiclik
		String str3 = null;// str3 veriable'nin hic bir degere esit olamdigini belirten bir
							// pointer(belirtec -isaretci)
							// null bir deger degildir ama konsola yazdirilabilir

		System.out.println(str1.length());// 1
		System.out.println(str2.length());// 0
		// System.out.println(str3.length());//NullPointerException unchecked:kendimiz
		// ettik kendimiz bulduk hatasi
		System.out.println(str3 + " erol tas");// null erol tas
		// System.out.println(str3.concat("erol tas")); -->null olarak atanmis bir obj
		// uygun olmayan bir islem yapilirsa
		// java NullPointerException unchecked verir

		//-------------------------------------------------------------------------------------------------------------
		
		str3 += "samet"; // var olan str3'un uzerine herhangi bir String eklense bile str3'un
							// icerisindeki 'null' kelimesine concat edilir!!!
		System.out.println(str3);

		str3 = "samet karagoz"; // fakat buradaki gibi sifirdan assignment yapilirsa atanan degeri gururuz.
								// (null kelimesini gormeyiz.)
		System.out.println(str3);
	}

}
