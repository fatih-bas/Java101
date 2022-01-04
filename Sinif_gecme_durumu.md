# Patika.dev-repo-15
### Patika.dev - Java101 - Sınıf Geçme Durumunu Hesaplayan uygulama

```
Kulanıcı tarafından girilen notların ortalamasını alır ve girilen notlar 0 ve 100 aralığında olup olmadığını kontrol eder.
Girilen notlar belirtilen aralıkta değilse hata gösterip kullanıcıdan tekrar giriş yapılması istenir.
```
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, total=0, counter=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (!(mat < 0 || mat > 100)) {
            total += mat;
            counter++;
        } else {
            System.out.print("Hatalı giriş! Tekrar giriniz: ");
            mat = input.nextInt();
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (!(fizik < 0 || fizik > 100)) {
            total += fizik;
            counter++;
        } else {
            System.out.print("Hatalı giriş! Tekrar giriniz: ");
            fizik = input.nextInt();
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (!(turkce < 0 || turkce > 100)) {
            total += turkce;
            counter++;
        } else {
            System.out.print("Hatalı giriş! Tekrar giriniz: ");
            turkce = input.nextInt();
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (!(kimya < 0 || kimya > 100)) {
            total += kimya;
            counter++;
        } else {
            System.out.print("Hatalı giriş! Tekrar giriniz: ");
            kimya = input.nextInt();
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (!(muzik < 0 || muzik > 100)) {
            total += muzik;
            counter++;
        } else {
            System.out.print("Hatalı giriş! Tekrar giriniz: ");
            muzik = input.nextInt();
        }

        double average = total / counter;

        System.out.println("Ortalamanız: "  + average);

        if (average >= 55) {
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız.");
        }

    }
}
```
