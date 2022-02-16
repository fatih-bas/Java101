# Patika.dev-repo-15
### `Java101` - Recursive Method İle Bir Sayının Üssünü Hesaplayan Uygulama

```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent;
        System.out.println("Taban Sayısını Giriniz: ");
        base = input.nextInt();
        System.out.println("Üssü giriniz: ");
        exponent = input.nextInt();
        int result = power(base, exponent);
        System.out.println("Sonuç : " + result);
    }

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (base == 0) {
            return 0;
        }
        return base * power(base, exponent - 1);
    }

}

```
