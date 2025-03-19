class A {
    void f(){
	System.out.println("hello");
      
    }
    void f(int a){
        int s= a*a;
        System.out.println("Multiplication is="+s);
    }
     
}

class B extends A {
	void g(int a, int b){
	    int s= a+b;
	    System.out.println("Addition is ="+s);
    }
}

public class OverloadMethodSubclass{ 
    public static void main(String args[]){
        A r= new B();
        r.f(); // hello
	    r.f(2);// Multiplication is=4
	    B r1=(B)r;
	    r1.g(3,4);// Addition is =7
      }   
}
