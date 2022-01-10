# Patika.dev-repo-15

#### Java101 - Tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
#### girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program

```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int n, total = 0;
                Scanner input = new Scanner(System.in);


                do {
                    System.out.print("Sayı Giriniz : ");
                    n = input.nextInt();
                    if (n % 2 == 1) {
                        break;
                    } else if (n % 2 == 0 && n % 4 == 0){
                        total += n;
                    }
                } while (n > 0);
                System.out.println(("Toplam: " + total));
            }
        }

```
