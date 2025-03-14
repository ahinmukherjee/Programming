import java.util.Scanner;
class Fact{
	void f(int n){
            int fact =1;
            if(n>0){
                while(n>0){
                    fact=fact*n;
                    n--;       
                }
                System.out.println("Factorial is="+fact);
            }
            else if(n==0){
                 System.out.println("Factorial is= 1");
            }
            else{
                System.out.println("Plz enter the positive number");
            }
	}   
}

public class FactorialCallByObj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n= sc.nextInt();
        Fact r= new Fact();
        r.f(n);
        sc.close();
        }
}
