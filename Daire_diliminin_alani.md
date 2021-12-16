# Patika.dev-repo-15

### Java101 - Daire Diliminin Alanını Bulan Program

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri taımla
        int r, a;
        double area, PI = 3.14 ;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Yarı Çapı Giriniz: ");
        r = input.nextInt();
        System.out.print("Daire Diliminin Açısı: ");
        a = input.nextInt();

        area = (PI * (r * r)* a)/360 ;

        System.out.println("Dairenin Alanı: " + area);

    }
}
```
