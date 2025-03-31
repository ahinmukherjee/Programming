import java.util.*;

public class CalculatePowerUserInput {
    public static void main(String args[]){
   Scanner sc= new Scanner(System.in);	
   	    System.out.print("Enter the value of base:\t");
	    int base = sc.nextInt();
	    System.out.print("Enter the value of power:\t");
	    int power = sc.nextInt();
        TryTest st = new TryTest();
	    st.test(base, power);  
        sc.close();  
    }
}

class TryTest{
	void test(int b, int p){
		int result=1;
		for (int i=1; i<=p; i++){
			 result = b*result;
		}
		System.out.println("Result is:"+result);
	}
	
}

