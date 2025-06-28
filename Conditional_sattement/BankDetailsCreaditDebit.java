import java.util.Scanner;
import java.util.InputMismatchException;

public class BankDetailsCreaditDebit{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		try{
			System.out.println("Set your amount");
			double amount= sc.nextDouble();
			if(amount>=0){
				System.out.println("Availabel amount is:"+amount);
			}
			else{
				System.out.println("Amount does't negetive");
			}
			System.out.println("Plz chose what you wants ?|| 1 for Creadit || 2 for Debit|| 3 for exit");
			int choices= sc.nextInt();
			switch(choices){
				case 1: 
					System.out.println("Enter your amount");
					double creadit= sc.nextDouble();
					System.out.println("Your total amount is:"+(amount+creadit));
					break;
				case 2: 
					System.out.println("Enter your amount");
					double debit= sc.nextDouble();
					System.out.println("Your total amount is:"+(amount-debit));
					break;
		
			}	
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
