# Patika.dev-repo-15
### Java101 - Pozitif girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran uygulama

```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
                int  num;
                Scanner input = new Scanner(System.in);

                System.out.print("Sınır Sayısını Giriniz : ");
                num = input.nextInt();

                   if (num > 0) {
                        for (int i = 1; i <= num; i *= 4) {
                            System.out.println("Dördün Kuvvetleri " + i);
                        }
                        for (int j = 1; j <= num; j *= 5) {
                            System.out.println("Beşin Kuvvetleri " + j);
                        }
                   } else {
                       do {
                           System.out.print("Pozitif bir sayı girin: ");
                           num = input.nextInt();
                       } while(0 > num);

                            for (int i = 1; i <= num; i *= 4) {
                                System.out.println("Dördün Kuvvetleri " + i);
                        }
                            for (int j = 1; j <= num; j *= 5) {
                                System.out.println("Beşin Kuvvetleri " + j);
                        }
                   }
            }
        }
```
