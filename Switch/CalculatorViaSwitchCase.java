import java.util.*;

class CalculatorTest {
     void add(double a, double b){
		double sum= a+b;
		System.out.println("Addition is:" +sum);	
	}
	void subs(double a, double b){
		double sub= a-b;
		System.out.println("Subtraction is:" +sub);	
	}
	void multi(double a, double b){
		double mul= a*b;
		System.out.println("Multiplication is:" +mul);	
	}
	void divi(double a, double b){
		double vag= a/b;
		System.out.println("Divition is:" +vag);	
	}	
}

public class CalculatorViaSwitchCase{
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	CalculatorTest rn= new CalculatorTest();
		try{
		
			System.out.println("Enter first number");
			double num1 = sc.nextDouble();
			System.out.println("Enter second number");
			double num2 = sc.nextDouble();
			System.out.println("Enter 1 for Addition || Enter 2 for Subtraction || Enter 3 for Multiplication || Enter 4 for Divition|| Enter 5 for Exit");
			int choices=sc.nextInt();
			
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
        }
		catch(ArithmeticException ae){
			System.out.println("Doesn't divisibel by zero: "+ae);;
		}
		catch(InputMismatchException ime){
			System.out.println("Doesn't match valid input numbers: "+ime);
		}
		catch(Exception e){
			System.out.println("Doesn't match input numbers"+e);
		}
		finally{
			sc.close();
		}
	 
    }
}
