# Patika.dev-repo-15
### `Java101` - Recursive Metotlar ile Üslü Sayı Hesaplayan Uygulama

```
import java.util.Scanner;

public class JavaPatika {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Taban değeri giriniz :");
            int base = scan.nextInt();
            System.out.print("Üs değeri giriniz :");
            int exponent = scan.nextInt();
            System.out.println(power(base, exponent));
        }
    }

     static int power(int base, int exponent) {
       if (exponent == 0) {
           return 1;
       } else {
           int result = base*(power(base, exponent-1));
           return result;
       }
    }
}
```
