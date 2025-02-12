import java.util.*;
class Practice{
    public static void main(String[] args) {
        int n,r;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enetr number:");
        n=sc.nextInt();
        while(n>0){
            r = n %10;
            sum = sum*10+r;
            n=n/10;
            System.out.println("Reverse number is"+sum);
        }
        System.out.println("Reverse number is"+sum);
        sc.close();
    }
    
}