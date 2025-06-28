import java.util.Scanner;
import java.util.InputMismatchException;

class Fact{
	void factorial(int n){
            int fact =1;
            if(n<0){
		System.out.println("Does't calculate negetive number of factorial");
		}
	    else if(n==0){
			System.out.println("Factorial of 0 is: 1");
		}
		else{
			for(int i=1;i<=n;i++){
				fact*=i;
			}
			System.out.println("Factorial of number is:"+fact);
		}
	}   
}

public class FactorialUsingTryCatch{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Fact fa= new Fact();
		try{
			System.out.println("Enter base");
            int factorial= sc.nextInt();
			fa.factorial(factorial);
			
        }
       	catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs: "+ime);
        }
        catch(Exception e){
            System.out.println("Plz enter valid inputs:"+e);
        }
        finally{
            sc.close();
        }
         
    }
}
