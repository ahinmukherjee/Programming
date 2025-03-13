import java.util.Scanner;

public class MemoryReduceArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), c = n, arm = 0;
        sc.close();
        
        while (n > 0) {
            arm += Math.pow(n % 10, 3);
            n /= 10;
        }
        
        System.out.println(c == arm ? "Number is Armstrong" : "Number is not Armstrong");
    }
}
