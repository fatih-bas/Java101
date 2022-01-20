# Patika.dev-repo-15
### `Java101` - Mükemmel Sayı Bulan Uygulama

```
Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
```

```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
                int i=1, sum=0;
                System.out.print("Enter a number : ");
                int num = input.nextInt();

                for (i=1; i<num; i++) {
                    if (num % i == 0 || num % i == num) {
                       sum += i;
                    }
                }
                if (sum == num) {
                    System.out.println(num + " Mükemmel Sayıdır");
                } else {
                    System.out.println(num + " Mükemmel Sayı Değildir.");
                }
            }
        }
```
