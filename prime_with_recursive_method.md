# Patika.dev-repo-15
### `Java101` - Recursive Method ile Asal Sayı Bulan Uygulama

```
import java.util.Scanner;

public class Main {
    static void primeNum(){
        int number, result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        number = scan.nextInt();

        if (number > 2) {
            for (int i = 2; i < number; i++) {
                result = number % i;
                if (result == 0) {
                    System.out.println( number + " ASAL değildir!");
                    break;
                }
            }
            if (result != 0) {
                System.out.println(number + " ASALDIR!");
            }
        }

        switch(number) {
            case 0,1:
                System.out.println(number + " ASAL değildir.");
                break;
            case 2:
                System.out.println(number + " ASALDIR.");
                break;
        }
        primeNum();
    }

    public static void main(String[] args) {
        primeNum();
    }
}
```
