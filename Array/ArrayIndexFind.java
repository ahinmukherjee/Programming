import java.util.*;
class ArrayIndexFind{
  public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter elements that you want");
     int n= sc.nextInt();
     int arr[]= new int[n];
     System.out.println("Enter value");
     for(int i=0; i<=n; i++){
	arr[i]= sc.nextInt();
     }
     System.out.println("Value is bellow");
     for(int i=0; i<=n; i++){
	System.out.println(arr[i]);
     }
     sc.close();	
  }
}