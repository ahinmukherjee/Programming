import java.util.Scanner;
class AddNumber {
     void test (int n){
		int r=0;
		int sum=0;
		if(n<0){
			System.out.println("Plz enter postive number");
		}
		else if(n==0){
			System.out.println("NUmber Of Digit is:0");
		}
		else{
			while(n>0){
			r=n%10;
			sum= sum+r;
			n=n/10;
			}
			System.out.println("Total Number Of Digit is:"+sum);
		}
	}
	
}

public class NmberOfDigitAdd {
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	    System.out.println("Enter number");
     	int num = sc.nextInt();
	    AddNumber an = new AddNumber();
	    an.test(num);
        sc.close();  
	

    }
}


