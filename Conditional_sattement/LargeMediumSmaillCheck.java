import java.util.Scanner;

public class LargeMediumSmaillCheck {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st value");
	    System.out.println("Enter 2nd value");
	    System.out.println("Enter 3rd value");

	    float first = sc.nextFloat();
	    float second = sc.nextFloat();
	    float third = sc.nextFloat();

	
	    DiscountOffer do = new DiscountOffer();
	    do.discountCalculate(first, second, third);
        sc.close();
    }
}

class DiscountOffer{
	void discountCalculate(float n, float y, float z ){
		if(y<=n=>z){
			System.out.println("Large value"+z);
			System.out.println("Medium value"+n);
			System.out.println("Small value"+y);
		}

		else if(n<=y=>z){
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
