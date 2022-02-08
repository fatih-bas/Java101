# Patika.dev-repo-15
### Java101 - ATM Uygulaması

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz.");
                do {
                    System.out.println(
                             "1-Para Yatırma\n" +
                             "2-Para Çekme\n" +
                             "3-Bakiye Sorgulama\n" +
                             "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            if (select == 1) {
                                System.out.print("Yatırmak İstediğiniz Para Miktarı : ");
                                int price = input.nextInt();
                                balance += price;
                            }
                            break;
                        case 2:
                            if (select == 2) {
                                System.out.print("Çekmek İstediğiniz Para Miktarı : ");
                                int price = input.nextInt();
                                if (price > balance) {
                                    System.out.println("Bakiye Yersiz");
                                } else {
                                    balance -= price;
                                }
                            }
                            break;
                        case 3:
                            if (select == 3) {
                                System.out.println("Bakiyeniz : " + balance);
                            }
                            break;
                    }
                } while (select != 4);
                    System.out.println("Tekrar Görüşmek Üzere...");
                    break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }

            }
        }
    }
}
```
