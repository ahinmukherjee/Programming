import java.util.*;
  class Prime{
  public static void main(String args[]){
      int i,n,count=0;
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt();
      for(i=1;i<n;i++){
      if(n%i==0){
      count++;
      sc.close();
  }
 }
      if( count==2){
      System.out.println("number is prime");
  }
      else {
      System.out.println("number is not prime");
  }
 }
}