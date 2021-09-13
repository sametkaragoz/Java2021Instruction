package day36_inheritance;

public class C03_Memur extends C02_Muhasebe{

	public static void main(String[] args) {
		
		C03_Memur memur1=new C03_Memur();
		
		memur1.isim="Samet";
		memur1.soyisim="Karagoz";
		memur1.tel="0538 954 1778";
		memur1.saatUcreti=75;
		memur1.maas=memur1.maasHesapla();
		memur1.id=memur1.idAtama();
		
		C03_Memur memur2=new C03_Memur();
		
		memur2.isim="Yunus Emre";
		memur2.soyisim="Karagoz";
		memur2.tel="-";
		memur2.saatUcreti=85;
		memur2.maas=memur2.maasHesapla();
		memur2.id=memur2.idAtama();
		
		System.out.println(memur1.id+ " "+memur1.maas);
		System.out.println(memur2.id + " " + memur2.maas);

	}

}
