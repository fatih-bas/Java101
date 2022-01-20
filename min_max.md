# Patika.dev-repo-15

### Java101 - Girilen Sayılardan Min ve Max Değerlerini Bulan Uygulama

```
Klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazdıran uygulama.
```
```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

                int max = 0, min = 0, k=1, i, n;

                System.out.print("How many numbers will you enter : ");
                int num = input.nextInt();

                for (i = 1; i <= num; i++) {
                    System.out.print("Number " + k + " :");
                    n = input.nextInt();
                    k++;
                    if (n > max) {
                       if (min == 0) {
                           min = n;
                       } else {
                           max = n;
                       }
                    }
                       if (n < min) {
                           if (max == 0) {
                               max = n;
                           } else {
                               min = n;
                           }
                       }
                }
                
                System.out.println("Max : " + max);
                System.out.println("Min : " + min);
            }
        }
```
