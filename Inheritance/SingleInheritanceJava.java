import java.util.Scanner;
class SuperClass{
	void add(int a, int b){
		int sum= a+b;
		System.out.println("Addition of two numbers is"+sum);
	}
}

class SingleInheritanceJava extends SuperClass {
	public static void main(String args[]){
	Scanner s= new Scanner(System.in);
	System.out.println("Enter first number");
	int n1=s.nextInt();
	System.out.println("Enter second number");
	int n2=s.nextInt();
		SuperClass sc= new SuperClass();
		sc.add(n1,n2);
	}
	
}
