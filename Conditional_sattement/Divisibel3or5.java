import java.util.*;

class Divisibeled{
	void divisibel(int num){
		if(num%3==0){
			System.out.println("Divisivel by 3. Not divisivel by 5");
		}
		else if(num%5==0){
            System.out.println("Divisivel by 5. Not divisivel by 3");
        }
		else{
			System.out.println("Not divisivel by 3 and 5");
		}
	}
}

public class Divisibel3or5{
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	Divisibeled dve = new Divisibeled();
	    try{
            System.out.println("Enter number");
            int n= sc.nextInt();
            dve.divisibel(n);
        }
        catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs format: "+ime);
        }
        catch(Exception e){
            System.out.println("Plz enter correct input"+e);
        }
        finally{
		    sc.close();
	    } 
    }
}



