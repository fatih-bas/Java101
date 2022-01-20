# Patika.dev-repo-15
### ` Java101 ` - Yıldızlarla Ters Üçgen Çizen Uygulama

```
Kullanıcıdan alınan basamak sayısı ile döngüler kullanarak ters üçgen çizen uygulama yapımı.
```

<img width="418" alt="Ekran Resmi 2022-01-21 00 03 27" src="https://user-images.githubusercontent.com/47625725/150421829-75e62e32-dfc6-447f-a4cc-fd2a0190f3e5.png">

```
import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
          System.out.print("Basamak syısını giriniz: ");
          int n = input.nextInt();

          for (int i = n; i > 0; i--) {
              for (int j = 1; j <= (n - i); j++) {
                  System.out.print(" ");
              }
              for (int k = 1; k <= (2 * i)-1 ; k++) {
                  System.out.print("*");
              }
              System.out.println();
          }
      }
  }
```
