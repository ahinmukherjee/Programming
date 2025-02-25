
import java.util.*;

class ArrayIndexFind {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter values:");
        for (int i = 0; i <n; i++) {  
            arr[i] = sc.nextInt();
        }

        System.out.println("Values are below:");
        for (int i = 0; i <n; i++) {  
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
