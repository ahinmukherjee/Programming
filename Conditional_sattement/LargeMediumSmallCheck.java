import java.util.Scanner;

public class LargeMediumSmallCheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st value: ");
        float first = sc.nextFloat();
        
        System.out.print("Enter 2nd value: ");
        float second = sc.nextFloat();
        
        System.out.print("Enter 3rd value: ");
        float third = sc.nextFloat();

        NumberCalculate no = new NumberCalculate();
        no.largemediumsmall(first, second, third);
        
        sc.close();
    }
}

class NumberCalculate {
    void largemediumsmall(float a, float b, float c) {
        float large, medium, small;

        if (a >= b && a >= c) {
            large = a;
            if (b >= c) {
                medium = b;
                small = c;
            } else {
                medium = c;
                small = b;
            }
        } else if (b >= a && b >= c) {
            large = b;
            if (a >= c) {
                medium = a;
                small = c;
            } else {
                medium = c;
                small = a;
            }
        } else {
            large = c;
            if (a >= b) {
                medium = a;
                small = b;
            } else {
                medium = b;
                small = a;
            }
        }

        System.out.println("Large value: " + large);
        System.out.println("Medium value: " + medium);
        System.out.println("Small value: " + small);
    }
}


