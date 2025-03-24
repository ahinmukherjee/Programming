import java.util.*;

public class DiscountCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        
        double r = 0, price1 = 0;

        if (price >= 1500) {
            r = price * (20.0 / 100);
            price1 = price - r;
            System.out.println("Original Price: " + price);
            System.out.println("Discounted Price: " + price1);
        } else if (price >= 1000) {
            r = price * (15.0 / 100);
            price1 = price - r;
            System.out.println("Original Price: " + price);
            System.out.println("Discounted Price: " + price1);
        } else if (price >= 500) {
            r = price * (5.0 / 100);
            price1 = price - r;
            System.out.println("Original Price: " + price);
            System.out.println("Discounted Price: " + price1);
        } else {
            System.out.println("Not available for discount offer");
        }

        scanner.close();
    }
    
}
