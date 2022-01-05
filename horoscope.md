# Patika.dev-repo-15
### Java101 - Burç Bulan Uygulama


```
Kullanıcıdan alınan bilgilere göre burcunu söyleyen uygulama
```


```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Kova";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 31) {
                if (day < 20) {
                    burc = "Kova";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Balık";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Koç";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 4) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Koç";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Boğa";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "İkizler";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 6) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "İkizler";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Yengeç";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Yengeç";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Aslan";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Aslan";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Başak";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 9) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Başak";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Terazi";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day < 23) {
                    burc = "Terazi";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Akrep";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 11) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Akrep";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Yay";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Yay";
                    System.out.println("Burcunuz : " + burc);
                } else {
                    burc = "Oğlak";
                    System.out.println("Burcunuz : " + burc);
                }
            } else {
                isError = true;
            }

        } else {
            isError = true;
        }

        if (isError) {
            System.out.println("Hatalı bir giriş yaptınız, tekrar deneyiniz.");
        }
    }
}
```
