class A {
    void f(){
	System.out.println("hello");
      
    }
    void f(int a){
        int s= a*a;
        System.out.println(s);
    }
     
}

public class OverloadMethodSubclass extends A { 
    public static void main(String args[]){
        A r= new OverloadMethodSubclass();
        r.f();
        r.f(2);
      }   
}
