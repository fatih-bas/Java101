# Patika.dev-repo-15

### Java101 - Harmonik Sayıları Bulan Uygulama
```
Harmonik Seri Formülü
```
![harmonic_series](https://user-images.githubusercontent.com/47625725/149220313-ac94e14d-eeef-474a-9e7b-2bb823d60627.gif)


```
import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("N syısını giriniz: ");
        n = input.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1/i);
      }
        System.out.println(result);
      }
  }
```
