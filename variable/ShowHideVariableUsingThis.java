class A {
    int a;
    int b;
  A(int a, int b) {
    this.a=a;
    this.b=b;
  }
  void add() {
    int c= a+b;
    System.out.println(c); 
  }

}
public class ShowHideVariableUsingThis {
    public static void main(String args[]) {
        A r= new A(3,4);
        r.add();
    }
}
