package day00HomeWorks;

import java.util.Scanner;

public class KahveMakinesi {

	public static void main(String[] args) {
		
		/*
		​
		  1. Basit bir Kahve makinesi oluşturun.    3 çeşit kahvemiz olsun.
		  2. Sistem şu soruyu sorsun: "Hangi Kahveyi istersiniz?"
		  3.Bu soru ile birlikte kullanıcı kahve bilgilerini görsün.
		   Örn:
		  Hangi Kahveyi İstersiniz?
		  1.Türk kahvesi
		  2.Filtre Kahve
		  3.Espresso
		​
		        String hangiKahve oluşturun ve var olan kahvelerden birini yazınız.
		         (örn: Türk Kahvesi,  ya da türk kahvesi.  --->  Büyük- küçük harf duyarlı olmaması için String methodu kullanın.)
		                                                                                      1. Koşul bölümü
		        Eğer kahve Türk kahvesi ise, konsola = Türk kahvesi hazırlanıyor. yazsın.(Dümdüz Türk kahvesi yazmayın. String hangiKahve'yi çağırın!!)
		        Eğer filtre kahve ise,   konsola = Filtre kahve hazırlanıyor.  yazsın.     (String hangiKahve'yi kullanın !)
		        Eğer Espresso ise, konsola =  Espresso hazırlanıyor...   yazsın.  (String hangiKahve'yi kullanın !)
		        Eğer yanlış harf girerseniz, konsola = Hatalı tuşlama yaptınız. yazsın. (Hatalı tuslamadan sonra kod calısmaya devam edecektir, o konuyu daha görmediniz bu yüzden bastan baslatın.)
		                                                                                      ----------------------------------
		​
		        Sistem bize şu soruyu sorsun: "Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):    "   Konsolda aynen böyle  yazmalı. Parantez içi de konsolda olsun.
		​
		       String sut olusturun.
		                                                                            2.Koşul Bölümü
		       eğer String sut,  evet   e eşitse,konsola, Süt ekleniyor... yazısı gelsin.         -- (Büyük küçük harf duyarlı olmaması için String methodu kullanın. Olması gereken ihtimaller: Evet, EVET, EvEt,EVEt vs.
		​
		      eğer String sut, hayır a eşit ise, konsola , Süt eklenmiyor  yazısı gelsin.
		                                                                                     ----------------------------------
		​
		​
		​
		        Sistem bize "Şeker ister misiniz ? (Evet veya hayır cevabını veriniz) : " şeklinde bir soru sorsun. (Büyük küçük harf duyarlılıgı olmaması için string method kullanın.
		        String seker oluşturunuz.
		                                                               3.Koşul Bölümü
		        if(){
		        Eğer String seker   Evet e eşitse ,  sistem bize "Kaç şeker olsun?" sorusunu sormalı. Sorunun altına int kacSeker  oluşturunuz.
		        Şeker sayısını giriniz.
		        Ve konsola   şunu yazdırınız örnek: 5 şeker ekleniyor.  (ipucu: Bu kodların heosi if bloğunun içerisinde olacak)
		         }
		         else{
		    Eğer String şeker  hayır 'a eşitse, sistem bize "Şeker eklenmiyor" cevabını versin.
		​
		​
		            ONEMLİ !! =   bir int girdisinden sonra String girdisi yapacaksak,araya boş bir nextLine koymamız gerekiyor. (String bosKod = sc.nextLine();    )  dummy kod ekleyiniz.
		​
		  Sistem bize "Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.) :   sorusunu sorsun. (büyük küçük harf duyarlılıgı olmamalı. yani kullanıcı büyük boy veya BüYüK Boy girdiginde kabul etmeli.
		  String boyut oluşturun...
		​
		                                                   4.Koşul Bölümü
		        eğer String boyut Büyük boy' a eşitse =  Kahveniz büyük boy hazırlanıyor. (Büyük boy kısmını String boyut'u kullanarak yazalım= "Kahveniz" + boyut + "hazırlanıyor.")
		​
		        Eğer String boyut  Orta Boy'a eşitse = Kahveniz orta boy hazırlanıyor.. ("Kahveniz" + boyut + "hazırlanıyor.)
		​
		        Eğer String boyut  Küçük boy'a eşitse = Kahveniz küçük boy hazırlanıyor.    yazsın. ("Kahveniz" + boyut + "hazırlanıyor.)
		​
		​
		​
		​
		                    //  SONUÇ BÖLÜMÜ
		​
		                    Siparişlerimizi verdik. Son hali görmek istiyoruz.
		                    konsola şunu yazdırın örnek :
		​
		        Türk Kahvesi orta boy hazırdır. Afiyet olsun !!! (Türk kahvesi için String hangiKahveyi kullanın.     orta boy için de String boyut ' u kullanın.)
		​
		​
		        Açıklama :
		​
		       Projeyi bilerek biraz zor hazırladık. Üzerinde fazla fazla kafa yormanız ve "grupça çalışmanız için" böyle düzenledik. Yapamayan arkadaşlar kesinlikle canlarını sıkmasın.
		       Size çok zor gelebilir. Ancak adım adım ilerlerseniz, grup ile çözerseniz ve yazdığım notları tamamen uygularsanız halledebilirsiniz. Öğrenmediğiniz hiçbir şey yok. Sadece biraz karışık.
		​
		       Bir ödev çözümü günü yapacağız. Bunun haberini ilerleyen günlerde size vereceğim.
		​
		       Ancak arkadaşlarınızla beraber Voice Channel larda ödev üzerine tartışabilirsiniz.
		​
		       HERKESE KOLAY GELSİN !! :)
		​
		​
		​
		​
		                 */
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Hangi kahveyi istersiniz? \n1. Turk Kahvesi \n2. Filtre Kahve \n3. Espresso");		
		String hangiKahve=scan.nextLine().toLowerCase();
				
		while (!(hangiKahve.equals("turk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso"))) {
			
			if (!(hangiKahve.equals("turk kahvesi") || hangiKahve.equals("filtre kahve") || hangiKahve.equals("espresso"))) {
				System.out.println("Yanlis tuslama yaptiniz, lutfen yeniden giriniz");
				hangiKahve=scan.nextLine();
			}
		}
			System.out.println(hangiKahve+" hazirlaniyor, sut eklememizi ister miziniz? \nEvet ya da Hayir giriniz");
			String sutOlsunMu=scan.next().toLowerCase();
			
			while (!(sutOlsunMu.equals("evet") || sutOlsunMu.equals("hayir"))) {
				
				if (!(sutOlsunMu.equals("evet") || sutOlsunMu.equals("hayir"))) {
					System.out.println("Yanlis tuslama yaptiniz, lutfen yeniden giriniz");
					sutOlsunMu=scan.next();
	
	
		}
	  }

			if (sutOlsunMu.equals("evet")) {
				System.out.println("Sut ekleniyor... \n \nSeker ister misiniz? \nEvet ya da Hayir giriniz");
			} else {
				System.out.println("Sut eklenmedi. \n \nSeker ister misiniz? \nEvet ya da Hayir giriniz");
			}
			
			String sekerOlsunMu=scan.next().toLowerCase();
			
			while (!(sekerOlsunMu.equals("evet") || sekerOlsunMu.equals("hayir"))) {
				
				if (!(sekerOlsunMu.equals("evet") || sekerOlsunMu.equals("hayir"))) {
					System.out.println("Yanlis tuslama yaptiniz, lutfen yeniden giriniz");
					sekerOlsunMu=scan.next();
	
				}
			}
			
			int kacSeker;
			if (sekerOlsunMu.equals("evet")) {
				System.out.println("Kac seker olsun?");
				kacSeker=scan.nextInt();
				System.out.println(kacSeker+" seker ekleniyor... \n \nKahveniz hangi boyutta olsun? \nBüyük boy, Orta boy, Kucuk boy giriniz");
			} else {
				System.out.println("Seker eklenmedi. \n \nKahveniz hangi boyutta olsun? \nBüyük boy, Orta boy, Kucuk boy giriniz");
			}
			
			@SuppressWarnings("unused")
			String bosKod=scan.nextLine();
			
			String kahveBoyut=scan.nextLine().toLowerCase();
			
			while (!(kahveBoyut.equals("buyuk boy") || kahveBoyut.equals("orta boy") || kahveBoyut.equals("kucuk boy"))) {
				
				if (!(kahveBoyut.equals("buyuk boy") || kahveBoyut.equals("orta boy") || kahveBoyut.equals("kucuk boy"))) {
					System.out.println("Yanlis tuslama yaptiniz, lutfen yeniden giriniz");
					kahveBoyut=scan.nextLine();
			
			}
		}
			
			System.out.println("\nKahveniz "+kahveBoyut+" hazirlaniyor... \n \n ");
			System.out.println(hangiKahve.substring(0,1).toUpperCase()+hangiKahve.substring(1)+ " "+ kahveBoyut+" hazirdir. Afiyet olsun :)");
	
			scan.close();
			
	}

   }


