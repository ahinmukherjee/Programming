import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // Auto-closing scanner
            System.out.print("Enter number: ");
            int n = sc.nextInt(), reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + (n % 10);
                n /= 10;
            }

            System.out.println("Reverse number is: " + reverse);
        }
    }
}
