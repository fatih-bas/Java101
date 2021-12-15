# Patika.dev-repo-15
### Java101 -  Not Ortalaması Hesaplayan Program
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri taımla
        int mat, fizik, kimya, turkce, tarih, muzik;

        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Matematik notunuz:");
        mat = input.nextInt();

        System.out.println("fizik notunuz: ");
        fizik = input.nextInt();

        System.out.println("kimya notunuz: ");
        kimya = input.nextInt();

        System.out.println("turkçe notunuz: ");
        turkce = input.nextInt();

        System.out.println("tarih notunuz: ");
        tarih = input.nextInt();

        System.out.println("muzik notunuz: ");
        muzik = input.nextInt();

        // not ortalaması
        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        int sonuc = toplam/6;
        System.out.println("Ortalamanız : " + sonuc);

        String arr = sonuc >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(arr);
   }
   
  }
  ```
