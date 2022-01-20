# Patika.dev-repo-15
### `Java101` - Kullanıcıdan Alınan Değer Kadar Fibonacci Serisinin Eleman Sayısını Bulan Uygulama

```
import java.util.Scanner;

  public class Main {
      public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Eleman Sayısı: ");
         int n = input.nextInt();
         String result = "";

         int num1 = 1, num2 = 0, fib;

         for (int i = 0; i <= n; i++){
             fib = num1 + num2;
              num1 = num2;
              num2 = fib;
             result += num1 + " " ;
         }

          System.out.println(result);
      }
  }
```
