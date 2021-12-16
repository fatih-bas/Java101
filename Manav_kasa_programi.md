# Patika.de-repo-15
### Java101 - Manav Kasa Programı
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımla

        double armut = 2.14, elma = 3.67, domates = 1.11,
                muz = 0.95, patlican = 5.00, total;
        int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Armut Kaç Kilo: ");
        armutKg = input.nextInt();
        
        System.out.print("Elma Kaç Kilo: ");
        elmaKg = input.nextInt();
        
        System.out.print("Domates Kaç Kilo: ");
        domatesKg = input.nextInt();
        
        System.out.print("Muz Kaç Kilo: ");
        muzKg = input.nextInt();
        
        System.out.print("Patlıcan Kaç Kilo: ");
        patlicanKg = input.nextInt();

        total = (armutKg*armut) + (elmaKg*elma) +
                (domatesKg*domates) + (muzKg*muz) +
                (patlicanKg*patlican);

        System.out.println("Toplam Tutar: " + total);

    }
}
```
