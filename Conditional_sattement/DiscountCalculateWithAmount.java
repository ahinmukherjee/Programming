import java.util.*;

public class DiscountCalculateWithAmount {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product value");
		float oriamount = sc.nextFloat();
		DiscountOffer ds = new DiscountOffer();
		ds.discountCalculate(oriamount);
		if(oriamount>=0){
			System.out.println("Before the discount product amount is ="+oriamount);
		}
		else{
			System.out.println("Plz enter the right value");
		}
        sc.close();
    }
}

class DiscountOffer{
	void discountCalculate(float n){
		if(n>=0){

			if(n>=500 && n<=1500){
				float dis= n*(5f/100);
				float amount= n-dis;
				System.out.println("Discount is ="+dis);
				System.out.println("Amount with discount is ="+amount);
			}

			else if(n>=1501 && n<=3500){
				float dis= n*(15f/100);
				float amount= n-dis;
				System.out.println("Discount is ="+dis);
				System.out.println("Amount with discount is ="+amount);
			}

			else if(n>=3500 && n<=5500){
				float dis= n*(25f/100);
				float amount= n-dis;
				System.out.println("Discount is ="+dis);
				System.out.println("Amount with discount is ="+amount);
			}
		
			else if(n>=5501 && n<=8500){
				float dis= n*(30f/100);
				float amount= n-dis;
				System.out.println("Discount is ="+dis);
				System.out.println("Amount with discount is ="+amount);
			}

			else{
				float dis= n*(35f/100);
				float amount= n-dis;
				System.out.println("Discount is ="+dis);
				System.out.println("Amount with discount is ="+amount);
			}

		} 
		else{
			System.out.println("Amount is invalid");
		}

	}
}
