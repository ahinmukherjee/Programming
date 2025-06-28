import java.util.Scanner;
class SuperClass1{
	int add(int a, int b){
		int sum= a+b;
		System.out.println("Addition of two numbers is:"+sum);
		return sum;
	}
}

class SuperClass2 extends SuperClass1  {
	int mul(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number for multiplication");
		int n1=s.nextInt();
		int addition= add(2,4);
		int multi= n1*addition;
		System.out.println("Multiplication is:"+multi);
		s.close();
		return multi;
	}
}

class SuperClass3 extends SuperClass1  {
	int sub(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number for subtraction");
		int n2=s.nextInt();
		SuperClass2 sc2= new SuperClass2();
		int multion= sc2.mul();
		int subtraction= multion-n2;
		System.out.println("Subtraction of two numbers is:"+subtraction);
		s.close();
		return subtraction;
	}
}

class SuperClass4 extends SuperClass1  {
	void power(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number for power calculate");
		int n3=s.nextInt();
		SuperClass3 sc3= new SuperClass3();
		int base= sc3.sub();
		int calculate= 1;
		for(int i=1; i<=n3; i++){
			calculate*=base;
		}
		System.out.println("Power is:"+calculate);
		s.close();
	}
}

public class HierarchicalInheritanceJava{
	public static void main(String args[]){
		SuperClass4 sc4= new SuperClass4();
		sc4.power();
	}
}
