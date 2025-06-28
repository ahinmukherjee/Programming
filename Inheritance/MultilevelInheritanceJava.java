import java.util.Scanner;
class SuperClassS{
	int add(int a, int b){
		int sum= a+b;
		System.out.println("Addition of two numbers is:"+sum);
		return sum;
	}
}

class SuperClass2 extends SuperClassS  {
	void mul(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		int n1=s.nextInt();
		int jog=add(2,4);;
		int mul= n1*jog;
		System.out.println("Multiplication is:"+mul);
        s.close();
	}
}

class MultilevelInheritanceJava extends SuperClass2 {
	public static void main(String args[]){
		SuperClass2 sc= new SuperClass2();
		sc.mul();
	}
	
}

