## Patika.dev-repo-15
### Java101 - Uçak Bileti Fiyatı Hesaplama Uygulaması

Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
- Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
- Mesafe başına ücret 0,10 TL / km olarak alın. 
- İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

- Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yas,biletTipi;
    double mesafe, birimFiyat = 0.10, yasIndirimi, ciftYonIndirimi,indirimliBiletFiyati, toplamTutar;
    double biletFiyati = 0;

    Scanner input = new Scanner(System.in);

        System.out.print("Gideceğiniz Mesafe(KM) : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Girin: ");
        yas = input.nextInt();

        System.out.println("Lütfen Bilet Tipini Seçin: ");
        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        System.out.print("Seçiminiz: ");
        biletTipi = input.nextInt();

        if (mesafe < 0){
            System.out.println("Hatalı giriş yaptınız!");
        } else {
            if (yas<0) {
                System.out.println("Hatalı giriş yaptınız!");
            } else {
                if (biletTipi == 1) {
                    if (yas < 12) {
                        biletFiyati = (mesafe * birimFiyat)*0.5;
                        System.out.println(biletFiyati);

                    } else if (yas >=12 && yas <= 24) {
                        biletFiyati = (mesafe * birimFiyat);
                        yasIndirimi = biletFiyati*0.10;
                        toplamTutar = biletFiyati - yasIndirimi;
                        System.out.println(toplamTutar);

                    } else if (yas >= 65) {
                        biletFiyati = mesafe * birimFiyat;
                        yasIndirimi = biletFiyati*0.30;
                        toplamTutar = biletFiyati - yasIndirimi;
                        System.out.println(toplamTutar);

                    } else if (yas<0) {
                        System.out.println("Hatalı giriş yaptınız!");
                    } else {
                        biletFiyati = mesafe * birimFiyat;
                        System.out.println(biletFiyati);
                    }

                } else if (biletTipi == 2) {
                    birimFiyat = 0.2;
                    if (yas < 12) {
                        biletFiyati = mesafe * birimFiyat;
                        yasIndirimi = biletFiyati *0.5;
                        indirimliBiletFiyati = biletFiyati-yasIndirimi;
                        ciftYonIndirimi = indirimliBiletFiyati * 0.20;
                        toplamTutar = indirimliBiletFiyati -  ciftYonIndirimi;
                        System.out.println(toplamTutar);

                    } else if (yas >=12 && yas <= 24) {
                        biletFiyati = (mesafe * birimFiyat);
                        yasIndirimi = biletFiyati*0.10;
                        indirimliBiletFiyati = biletFiyati - yasIndirimi;
                        ciftYonIndirimi = indirimliBiletFiyati * 0.2;
                        toplamTutar = indirimliBiletFiyati - ciftYonIndirimi;
                        System.out.println(toplamTutar);

                    } else if (yas >= 65) {
                        biletFiyati = mesafe * birimFiyat;
                        yasIndirimi = biletFiyati*0.30;
                        indirimliBiletFiyati = biletFiyati-yasIndirimi;
                        ciftYonIndirimi = indirimliBiletFiyati * 0.2;
                        toplamTutar = indirimliBiletFiyati -  ciftYonIndirimi;
                        System.out.println(toplamTutar);

                    } else {
                        biletFiyati = mesafe * birimFiyat;
                        ciftYonIndirimi = biletFiyati * 0.20;
                        indirimliBiletFiyati = biletFiyati-ciftYonIndirimi;
                        System.out.println(indirimliBiletFiyati);
                    }

                } else {
                    System.out.println("Hatalı giriş yaptınız!");
                }
            }
        }
    }
}
```
