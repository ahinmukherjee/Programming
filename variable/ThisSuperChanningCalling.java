
class ParentsA{
	ParentsA(int x){
	  int s= x;
	  System.out.println(s);
	}
	ParentsA(int x, int y){
	  this(5);
	  System.out.println(x+" "+y);
	}
}

class ChildB extends ParentsA{
	ChildB(int x){
	  super(2,3);
	  System.out.println(x);
	}
}


public class ThisSuperChanningCalling {
    public static void main(String args[]){
        new ChildB(7);    
        }
}
