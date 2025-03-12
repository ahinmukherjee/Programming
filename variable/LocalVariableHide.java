class A{
    int a;
    int b;
  A(int a, int b) {
    a = a;
    b = b;
  }
  void add() {
    int c= a+b;
    System.out.println(c); 
  }

}
public class LocalVariableHide {
    public static void main(String args[]){
        A r= new A(3,4);
        r.add(); // 0
        }
}
