class CA {
    int a;
    int b;
  CA(int x, int y) {
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
      CA r= new CA(3,4); // 7
	    CA r1= new CA(6,4); // 10
      r.add();
	    System.out.println(r.hashCode()); //31168322
	    System.out.println(r1.hashCode()); //   17225372
      
    }
}
