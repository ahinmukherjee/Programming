class AThis{
    void f() {
        System.out.println(this);
    }
}

public class ThisCurrentObj {
    public static void main(String args[]){
        AThis r= new AThis();
        r.f(); // A@1db9742
    }
}
