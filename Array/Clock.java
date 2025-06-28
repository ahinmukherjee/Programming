class Array{
	public static void main(String args[]){
	int a[]={-1,1,3,4,5};
	for(int i=0; i<=a.length; i++){
	  System.out.println(a[i]);
	}
   }
}


// import java.util.*;
// public class Clock{
// 	public static void main(String args[]){
// 		Scanner s= new Scanner(System.in);
// 		System.out.println("Enter how many elemnts wants?");
// 		int elements=s.nextInt();
// 		int a[]= new int[elements];
// 		for(int i=0; i<elements; i++){
// 			System.out.println("Data is:");
// 			int n=s.nextInt();
// 			a[i]=n;	
// 		}
// 		System.out.println("Arrays elements is:");
// 		for(int x:a){
// 			System.out.print(x+" ");
// 		}
// 		for(int i=0; i<elements; i++){
// 			for(int j=0; j<elements; j++){
// 				if(a[i]<a[j]){
// 					temp=a[i];
// 					a[i]=a[j];
// 					a[j]=temp;
// 				}
// 			}
// 		System.out.println(a[i]);	
// 		}
		
// 	}
// }