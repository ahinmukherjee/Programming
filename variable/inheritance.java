import java.util.*;
class Inheritance{
 int a,b,plus;
 void sum(int x,int y){
 System.out.println("enter two number");
  a=x;
  b=y;
 plus=a+b;
 System.out.println("sum="+plus);
 }
 int getplus(){
 return plus;
 }
}
 class Y extends Inheritance {
 int c,result =0;
 void add (){
 Scanner sc= new Scanner(System.in);
 System.out.println("enter number");
  c= sc.nextInt();
  result = getplus()+c;
  System.out.println("result="+result);
  sc.close();
 }
}
 class x {
  public static void main(String args[]){
  Y y= new Y();
  y.sum(20,30);
  y.add();
  }
}