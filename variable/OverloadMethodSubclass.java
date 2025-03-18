class A {
    void f(){
	System.out.println("hello");
      
    }
}

public class OverloadMethodSubclass extends A { 
    public static void main(String args[]){
        A r= new OverloadMethodSubclass();
        r.f();
      }   
}
