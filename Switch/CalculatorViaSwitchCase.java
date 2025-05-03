// package Switch;

import java.util.Scanner;
class CalculatorTests {
     void add(int a, int b){
		int sum= a+b;
		System.out.println("Addition is:" +sum);	
	}

	void subs(int a, int b){
		int sub= a-b;
		System.out.println("Subtraction is:" +sub);	
	}
	void multi(int a, int b){
		int mul= a*b;
		System.out.println("Multiplication is:" +mul);	
	}
	void divi(int a, int b){
		int vag= a/b;
		System.out.println("Division is:" +vag);	
	}	
}

public class CalculatorViaSwitchCase {
    public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		CalculatorTests rn= new CalculatorTests();
		try{
			try{
			
				System.out.println("Enter first number");
				int num1 = sc.nextInt();
				System.out.println("Enter second number");
				int num2 = sc.nextInt();
			
				System.out.println("Enter 1 for Addition || Enter 2 for Subtraction || Enter 3 for Multiplication || Enter 4 for Divition|| Enter 5 for Exit");
				int choices=sc.nextInt();
			}
			
			switch(choices){
			case 1: 
				rn.add(num1, num2);
				break;
			case 2: 
				rn.subs(num1, num2);
				break;
			case 3: 
				rn.multi(num1, num2);
				break;
			case 4: 
				rn.divi(num1, num2);
				break;
			case 5: 
				System.exit(0);
			default:
				System.out.println("Plz enter the screen numbers");
			}
			finally{
				sc.close(); 
			}
		
		}
		catch(ArithemeticException ae){
			System.out.println("Doesn't divisibel by zero"+ae);;
		}
		catch(InputMissmatchException im){
			System.out.println("Plz enter valid inters number"+im);
		}
		catch(Exception e){
			System.out.println("Doesn't match input numbers"+e);
		}
		 
	}
}