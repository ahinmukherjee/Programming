class A{
    void f() {
        System.out.println(this);
    }
}

public class ThisCurrentObj {
    public static void main(String args[]){
        A r= new A();
        r.f(); // A@1db9742
    }
}
