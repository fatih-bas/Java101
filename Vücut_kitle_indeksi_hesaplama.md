# Patika.dev-repo-15

### Java101 - Vücut Kitle İndeksi Hesaplayan Program

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımla
        int kilo;
        double boy, vucutKitleIndex;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lüten Kilonuzu Girin: ");
        kilo = input.nextInt();

        vucutKitleIndex = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vucutKitleIndex);

    }
}
```
