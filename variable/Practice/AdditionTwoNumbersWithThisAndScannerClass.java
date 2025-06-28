// package Practice;

import java.util.Scanner;

class AB{
	int a,b;
	AB(int a, int b){
		this.a=a;
		this.b=b;
	}
	void sum(){
		int add=a+b;
		System.out.println("Additon of two numbers is:"+add);
	}
}
public class AdditionTwoNumbersWithThisAndScannerClass{
	public static void main(String[] args){
	Scanner s= new Scanner(System.in);
	System.out.println("1st numbers:");
	int n1=s.nextInt();
	System.out.println("2nd numbers:");
	int n2=s.nextInt();
	AB ab= new AB(n1,n2);
	ab.sum();
	s.close();
    }
}