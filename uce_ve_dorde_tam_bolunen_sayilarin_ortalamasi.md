# Patika.dev-repo-15
### Java101 - 3' e ve 4' e Tam Bölünen Sayıların Ortalamasını Hesaplayan Uygulama.

```
 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
 ```
 
 ```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int k, avg;
                int sum = 0;
                int counter = 0;
                Scanner input = new Scanner(System.in);
                System.out.print("Sayı Giriniz : ");
                k = input.nextInt();

                for (int i = 0; i <= k; i++) {
                    if (i % 3 == 0 && i % 4 == 0 ) {
                        sum += i;
                        counter++;
                    }
                }
                 avg = sum/counter;
                if (avg==0){
                    System.out.println("3'e ve 4' e bölünen saıların ortalaması : 0");
                } else {
                    System.out.println("3'e ve 4' e bölünen saıların ortalaması :" + avg);
                }
            }
        }


 ```
