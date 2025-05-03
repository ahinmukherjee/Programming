import java.util.Scanner;
class ReverseNumber {
     void reverseTest (int n){
		int r=0;
		int sum=0;
		if(n<0){
			System.out.println("Plz enter postive number");
		}
		else{
			while(n>0){
			r=n%10;
			sum= sum*10+r;
			n=n/10;
			}
			System.out.println("Reverse number is:"+sum);
		}
	}	
}

public class ReverseNumberCheck {
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	    System.out.println("Enter number");
     	int num = sc.nextInt();
	    ReverseNumber rn = new ReverseNumber();
	    rn.reverseTest(num);
        sc.close();  
    }
}


