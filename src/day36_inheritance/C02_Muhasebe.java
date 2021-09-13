package day36_inheritance;

public class C02_Muhasebe extends C01_Personel {

	public int saatUcreti;
	public String statu;
	public int maas;

	public int maasHesapla() {

		int maas = saatUcreti * 8 * 30;
		return maas;
	}
}
