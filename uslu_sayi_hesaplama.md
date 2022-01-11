# Patika.dev-repo-15

### Java101 - For Döngüsü İle Kullanıcının Girdiği Değerlerden Üslü Sayı Hesaplayan Program

```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
            
              int n,k;
              Scanner input = new Scanner(System.in);
              System.out.print("Üssü Alınacak Sayı: ");
              n = input.nextInt();
              System.out.print("Üs Olacak Sayı: ");
              k = input.nextInt();

              int total = 1;

              for (int i = 1; i<=k; i++) {
                  total *= n;
              }
              System.out.println("Total: " + total);
          }
        }
```
