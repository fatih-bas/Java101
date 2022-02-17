# Patika.dev-repo-15
### `Java101` - Desene Göre Metod Oluşturma.

```
Kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metod yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
        Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
        Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
        Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
```
- Senaryolar
```
N Sayısı : 16
Çıktısı : 16 11 6 1 -4 1 6 11 16 
```
```
N Sayısı : 10
Çıktısı : 10 5 0 5 10 
```
```
N Sayısı : 25
Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 
```
```
N Sayısı : 5
Çıktısı : 5 0 5 
```

```
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayısı Giriniz: ");
        int num = input.nextInt();
        subFive(num);
    }

    static void subFive(int num) {

        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }
        System.out.print(num + " ");
        subFive(num - 5);
        System.out.print(num + " ");
    }
}
```
