# Patika.dev-repo-15
### Java101 - Dik Üçgende alan Bulan Program

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // değişkenleri taımla
        int a, b, c;
        double u, alan;
        
        // scanner sınıfı
        Scanner input = new Scanner(System.in);

        // kullanıcıdan değerleri al
        System.out.print("Birinci Kenar: ");
        a = input.nextInt();
        System.out.print("İkinci Kenar: ");
        b = input.nextInt();
        System.out.print("Üçüncü Kenar: ");
        c = input.nextInt();

        u = (a + b + c)/2;
        Math.sqrt(alan = u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);
```
