# Patika.dev-repo-15
### `Java101` - 1 ile 100 Arasındaki Asal Sayıları Bulan Uygulama

```
 public class Main {
    public static void main(String[] args) {
        String result = " ";

        for (int i = 2; i <= 100; i++){
            boolean prime = true;
            for (int j = 2; j < i; j++){
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                result +=  i+ " ";
            }
        }
        System.out.println(result);
    }
}
```
