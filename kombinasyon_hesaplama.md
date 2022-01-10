# Patika.dev-repo-15
### Java101 - Kombinasyon Hesaplayan Uygulama

```
Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
```
```
import java.util.Scanner;

        public class Main {
            public static void main(String[] args) {
            int  n, r, nFactorial=1, rFactorial=1, combination,nSubr=1, nSubrFactorial=1;
                Scanner input = new Scanner(System.in);

                System.out.print("First Num : ");
                n = input.nextInt();
                System.out.print("Second Num : ");
                r = input.nextInt();

                for (int i = 1; i<=n; i++) {
                    if (i > 0) {
                        nFactorial *= i;
                    } else {
                        System.out.println("Please Enter Positive Number");
                    }
                }

                for (int j=1; j<=r; j++) {
                    if (j > 0) {
                        rFactorial *= j;
                    } else {
                        System.out.println("Please Enter Positive Number");
                    }
                }

                nSubr = n-r;
                for (int k=1; k<=nSubr; k++){
                    nSubrFactorial *=k;
                }

                combination = nFactorial/(rFactorial*nSubrFactorial);
                System.out.println("n factorial: " + nFactorial);
                System.out.println("r factorial: " + rFactorial);
                System.out.println("n-r factorial: " + nSubrFactorial);
                System.out.println("Combination " + combination);
                
            }

        }
```
