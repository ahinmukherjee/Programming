import java.util.Scanner;
import java.util.InputMismatchException;

class Power{
	void power( double base, double exponent){
		double result=1;
		for(int i=1; i<=exponent; i++){
			result*=base;
		}
		System.out.println("Power Calculate:"+result);
	}
}
public class PowerCalculateUsingTryCatch{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		Power st= new Power();
		try{
			System.out.println("Enter base");
            double base =sc.nextDouble();
			System.out.println("Enter exponent");
			double exponent =sc.nextDouble();
			st.power(base, exponent);
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
