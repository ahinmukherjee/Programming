class AA{
    int a;
    int b;
  AA(int a, int b) {
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
        AA r= new AA(3,4);
        r.add(); // 0
        }
}
