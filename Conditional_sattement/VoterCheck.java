import java.util.Scanner;

public class VoterCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("You are already available for a voter card");
        } else {
            System.out.println("You are below the required age to apply for a voter card");
        }

        scanner.close();
    }
}
