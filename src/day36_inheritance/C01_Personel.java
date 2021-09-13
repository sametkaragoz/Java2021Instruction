package day36_inheritance;

public class C01_Personel {

	public static int sayac = 1000;
	public int id;
	public String isim;
	public String soyisim;
	public String adres;
	public String tel;

	public int idAtama() {
		this.id = ++sayac;

		return id;
	}
}
