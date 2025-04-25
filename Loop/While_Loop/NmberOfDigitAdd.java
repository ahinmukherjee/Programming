import java.util.Scanner;
class PasswordIdentify {
     PasswordIdentify (int n){
		int r=0;
		int sum=0;
		while(n>=0){
			r=n%10;
			sum= r+sum;
			n=n/10;
		}	
	}
}
public class NmberOfDigitAdd {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        PasswordIdentify cl= new PasswordIdentify(num);
        System.out.println("Total NUmber Of Digit is:"+cl);
        sc.close();
    }
}

