import java.util.*;
  class armstrong{
  public static void main(String args[]){
      int r,n,c,arm=0;
      Scanner sc= new Scanner(System.in);
      n = sc.nextInt();
      c=n;
      while(n>0){
      r= n%10;
      arm=(r*r*r)+arm;
      n=n/10;
      sc.close();
  }
      if( c==arm){
      System.out.println("number is armstrong");
  }
      else {
      System.out.println("number is not armstrong");
  }

 }
}