## Patika.dev - repo-15 
### Java101 - Koşullu İfadeler ve Kod Blokları Bölümü, Bölüm Sonu Uygulaması  
### Kullanıcı Girişi 

```
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword ="",secim;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");

        } else if (userName.equals("patika") && (!password.equals("java123"))){
            System.out.print("Kullanıcı adı veya Parola Yanlış. Parolanızı sıfırlamak için lütfen 1 'e basın");
            secim = inp.nextLine();

            if (!secim.equals("1")) {
                System.out.print("Tekrar Deneyiniz: ");
                secim = inp.nextLine();
            } else {
                System.out.print("Lütfen yeni parolanızı girin: ");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı. Lütfen başka bir şifre giriniz. :");
                    newPassword = inp.nextLine();
                    System.out.print("Şifre oluşturuldu");
                } else {
                    System.out.print("Şifre oluşturuldu");
                }
            }
        }  else {
            System.out.println("Bilgileriniz Hatalı! Tekrar Deneyiniz.");
        }

    }
}
```
