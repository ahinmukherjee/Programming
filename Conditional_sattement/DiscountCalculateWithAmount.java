import java.util.*;

public class DiscountCalculateWithAmount {
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product value");
		float oriamount = sc.nextFloat();
		DiscountOffer ds = new DiscountOffer();
		ds.discountCalculate(oriamount);
		System.out.println("Product amount is ="+oriamount);
        sc.close();
    }
}

class DiscountOffer{
	void discountCalculate(float n){
		if(500=<n>=1500){
			float dis= n*(5/100);
			float amount= n-dis;
			System.out.println("Discount is =",+dis);
			System.out.println("Amount with discount is =",+amount);
		}

		else if(1501=<n>=3500){
			float dis= n*(15/100);
			float amount= n-dis;
			System.out.println("Discount is =",+dis);
			System.out.println("Amount with discount is =",+amount);
		}

		else if(3501=<n>=5500){
			float dis= n*(25/100);
			float amount= n-dis;
			System.out.println("Discount is =",+dis);
			System.out.println("Amount with discount is =",+amount);
		}
		
		else if(5501=<n>=8500){
			float dis= n*(30/100);
			float amount= n-dis;
			System.out.println("Discount is =",+dis);
			System.out.println("Amount with discount is =",+amount);
		}

		else{
			float dis= n*(35/100);
			float amount= n-dis;
			System.out.println("Discount is =",+dis);
			System.out.println("Amount with discount is =",+amount);
		}


	}
}
