# Patika.dev-repo-15
### Java101 - Taksimetre Programı

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri taımla
        double total, km, perKm = 2.20;
        int initPrice = 10;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Gidilecek Mesafe(km): ");
        km = input.nextInt();

        total = (km * perKm) + initPrice;
        total = total < 20 ? 20 : total;

        System.out.println("Ödenecek Tutar: " + total);

    }
}
```
