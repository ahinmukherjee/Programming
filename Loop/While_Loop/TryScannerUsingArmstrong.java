import java.util.Scanner;

public class TryScannerUsingArmstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Using try-with-resources to auto-close Scanner
            int n = sc.nextInt(), temp = n, arm = 0;
            
            while (temp > 0) {
                int r = temp % 10;
                arm += r * r * r;  // Avoiding Math.pow() to reduce method call overhead
                temp /= 10;
            }

            System.out.println(n == arm ? "Number is Armstrong" : "Number is not Armstrong");
        }
    }
}
