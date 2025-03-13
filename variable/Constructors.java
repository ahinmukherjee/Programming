class A{
    A (int x){
        int s= x * x;
        System.out.println("Multiplication is= " +s);
   }
    A (int x, int y){
     int s= x + y;
     System.out.println("Sum is= " +s);
   }
	
}
class ConstructorOverloading {
    public static void main(String args[]){
        new A( 3 );
        new A( 3,2 );
    }
}

