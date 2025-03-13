class ABC {
    int a;
    int b;
  ABC(int a, int b) {
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
        ABC r= new ABC(3,4);
        r.add();
    }
}
