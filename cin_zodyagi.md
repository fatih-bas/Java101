## Patika.dev-repo-15
### Java101 - Çin Zodyağı Hesaplama Uygulaması

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

- Doğum Tarihi %12 = 0 ➜ Maymun
- Doğum Tarihi %12 = 1 ➜ Horoz
- Doğum Tarihi %12 = 2 ➜ Köpek
- Doğum Tarihi %12 = 3 ➜ Domuz
- Doğum Tarihi %12 = 4 ➜ Fare
- Doğum Tarihi %12 = 5 ➜ Öküz
- Doğum Tarihi %12 = 6 ➜ Kaplan
- Doğum Tarihi %12 = 7 ➜ Tavşan
- Doğum Tarihi %12 = 8 ➜ Ejderha
- Doğum Tarihi %12 = 9 ➜ Yılan
- Doğum Tarihi %12 = 10 ➜ At
- Doğum Tarihi %12 = 11 ➜ Koyun


```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumTarihi;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Doğum Tarihinizi Giriniz : ");
        dogumTarihi = input.nextInt();

        if (dogumTarihi > 0) {
            if (dogumTarihi % 12 == 0){
                System.out.print("Çin Zodyağı Burcunuz: maymun");
            } else if (dogumTarihi % 12 == 1) {
                System.out.print("Çin Zodyağı Burcunuz Horoz");
            } else if (dogumTarihi % 12 == 2) {
                System.out.print("Çin Zodyağı Burcunuz Köpek");
            } else if (dogumTarihi % 12 == 3) {
                System.out.print("Çin Zodyağı Burcunuz Domuz");
            } else if (dogumTarihi % 12 == 4) {
                System.out.print("Çin Zodyağı Burcunuz Fare");
            } else if (dogumTarihi % 12 == 5) {
                System.out.print("Çin Zodyağı Burcunuz Öküz");
            } else if (dogumTarihi % 12 == 6) {
                System.out.print("Çin Zodyağı Burcunuz Kaplan");
            } else if (dogumTarihi % 12 == 7) {
                System.out.print("Çin Zodyağı Burcunuz Tavşan");
            } else if (dogumTarihi % 12 == 8) {
                System.out.print("Çin Zodyağı Burcunuz Ejderha");
            } else if (dogumTarihi % 12 == 9) {
                System.out.print("Çin Zodyağı Burcunuz Yılan");
            } else if (dogumTarihi % 12 == 10) {
                System.out.print("Çin Zodyağı Burcunuz At");
            } else if (dogumTarihi % 12 == 11) {
                System.out.print("Çin Zodyağı Burcunuz Koyun");
            }

        } else {
            System.out.println("Hatalı Giriş Yaptınız!");
            System.out.print("Lütfen Doğum Tarihinizi Giriniz : ");
            dogumTarihi = input.nextInt();
        }
    }
}
```
