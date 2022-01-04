## Patika.dev-repo-15
### Java101 - Hava Sıcaklık Durumuna Göre Etkinlik Öneren Uygulama

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsin.");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsin");
        } else if (heat >= 15 && heat <= 25){
            System.out.print("Piknik yapabilirsin");
        } else {
            System.out.println("Yüzebilirsin.");
        }
    }
}

```
