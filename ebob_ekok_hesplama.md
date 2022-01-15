# Patika.dev-repo-15
### Java101 - Ebob - Ekok Hesaplayan Uyugulama

* `while döngüsü` ile `ebob-ekok` hesaplayan uygulama

````
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
                System.out.print("n1 sayısını giriniz : ");
                int n1 = input.nextInt();
                System.out.print("n2 sayısını giriniz : ");
                int n2 = input.nextInt();


                int i = 1, j = 1, ebob = 1, ekok = 1;

                // Ekok
                while(j <= (n1*n2)){
                    j++;
                    if (j % n1 == 0 && j % n2 == 0) {
                        ekok = j;
                        break;
                    }
                }
                System.out.println("Ekok : " + ekok);

                // Ebob
                    if (n1 < n2) {
                        while(i <= n1){
                            i++;
                            if (n1 % i == 0 && n2 % i == 0) {
                                ebob = i;
                            }
                        }
                    } else {
                        while(i <= n2){
                            i++;
                            if (n2 % i == 0 && n1 % i == 0) {
                                ebob = i;
                            }
                        }
                    }
                System.out.println("Ebob : " + ebob);
            }
        }
