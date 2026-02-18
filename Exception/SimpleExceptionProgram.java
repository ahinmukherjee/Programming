
import java.util.Scanner;
import java.util.InputMismatchException;

public class SimpleExceptionProgram{
	public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        try{
            System.out.print("Input is: ");
            String a=s.nextLine();
            System.out.print("Input is: ");
            int aa=s.nextInt();
            System.out.println("output is: "+a+" "+aa);
            int b=2;
            b+=Integer.parseInt(a)+aa;
            System.out.println("After additon is "+b);
        }
        catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs: "+ime);
        }
        catch(NumberFormatException nfe){
            System.out.println("Doen't match requeirment: "+nfe);
        }
    s.close();
    }
}