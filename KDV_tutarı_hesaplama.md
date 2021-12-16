# Patika.dev-repo-15

### Java101 - KDV Tutarı Hesaplayan Program

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımla
        double tutar, kdvTutari, kdvOrani;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Tutarı Giriniz:");
        tutar = input.nextDouble();

        kdvOrani = tutar > 1000 ? 0.08 : 0.18;
        kdvTutari = (tutar * kdvOrani);
        double toplam = tutar + kdvTutari;

        System.out.println("KDV Dahil Tutar :" + toplam);
    }
}
```
