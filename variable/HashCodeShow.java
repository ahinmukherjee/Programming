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

public class HashCodeShow {
    public static void main(String args[]){
        A r= new A(3,4); // 7
	    A r1= new A(6,4); // 10
        r.add();
	    System.out.println(r.hashCode()); //31168322
	    System.out.println(r1.hashCode()); //   17225372
      
    }
}
