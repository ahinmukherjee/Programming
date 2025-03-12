class A {
    int a;
    int b;
  A(int x, int y) {
    a=x;
    b=y;
  }
  void add() {
    int c= a+b;
    System.out.println(c); 
  }

}

public class LocalVariableCheck {
    public static void main(String args[]){
        A r= new A(3,4);
        r.add(); //7
        }
}
