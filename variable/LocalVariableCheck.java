class AB {
    int a;
    int b;
  AB(int x, int y) {
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
        AB r= new AB(3,4);
        r.add(); //7
        }
}
