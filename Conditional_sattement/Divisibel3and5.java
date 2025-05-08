import java.util.*;
class Divisibel{
	void divisibel(int num){
		if(num%3==0 && num%5==0){
			System.out.println("Divisivel by 3 and 5");
		}
		else{
			System.out.println("Not divisivel by 3 and 5");
		}
	}
}

public class Divisibel3and5{
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	Divisibel dv = new Divisibel();
        try{
            System.out.println("Enter number");
            int n= sc.nextInt();
            dv.divisibel(n);
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


