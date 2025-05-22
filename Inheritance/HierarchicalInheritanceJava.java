import java.util.Scanner;
class SuperClass{
	void add(int a, int b){
		int sum= a+b;
		System.out.println("Addition of two numbers is"+sum);
	}
}

class SuperClass2 extends SuperClass  {
	void mul(){
		System.out.println("Enter number");
		int n1=s.nextInt();
		int mul= n1*add();
		System.out.println("Addition of two numbers is"+mul);
	}
}

class SuperClass3 extends SuperClass  {
	void sub(){
		System.out.println("Enter number");
		int n1=s.nextInt();
		int sub= n1-add();
		System.out.println("Addition of two numbers is"+sub);
	}
}

class HierarchicalInheritanceJava extends SuperClass2 {
	public static void main(String args[]){
	Scanner s= new Scanner(System.in);
		SuperClass2 sc= new SuperClass2();
		sc.add(2,4);
		sc.mul();
	}
	
}
