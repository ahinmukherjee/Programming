import java.util.Scanner;

public class LargeMediumSmaillCheck {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter 1st value");
	    System.out.print("Enter 2nd value");
	    System.out.print("Enter 3rd value");

	    float first = sc.nextFloat();
	    float second = sc.nextFloat();
	    float third = sc.nextFloat();

	
	   NmberCalculate no = new NmberCalculate();
	    no.discountCalculate(first, second, third);
        sc.close();
    }
}

class NmberCalculate{
	void discountCalculate(float n, float y, float z ){
		if(y<=n && n<=z){
			System.out.println("Large value"+z);
			System.out.println("Medium value"+n);
			System.out.println("Small value"+y);
		}

		else if(n<=y&& y<=z){
			System.out.println("Large value"+z);
			System.out.println("Medium value"+y);
			System.out.println("Small value"+n);
		}


		else{
			System.out.println("Large value"+n);
			System.out.println("Medium value"+y);
			System.out.println("Small value"+z);
		}


	}
}
