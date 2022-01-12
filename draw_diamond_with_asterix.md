# Patika.dev-repo-15
### Java101 - Döngüler Kullanarak Yıldızlar ile Elmas Çizen Uygulama

  <img width="82" alt="ssss" src="https://user-images.githubusercontent.com/47625725/149232635-9e0d49d7-d052-4e27-b70f-f4733bd90855.png">
 

```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
                System.out.print("Basamak syısını giriniz: ");
                int n = input.nextInt();

                for (int i = 1; i <= n; i++) {
                    for (int k = 1; k <= (n - i); k++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i) - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
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
