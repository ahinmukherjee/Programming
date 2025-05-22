import java.util.*;
public class ArraysPropersInput{
    public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	
		try{
			System.out.println("Enter size");
			int size= sc.nextInt();
			int a[]= new int[size];
			if(size<0){
				System.out.println("Arrays size is cannot negetive");
				System.exit(0);
			}
			for(int i=0; i<size; i++){
				System.out.println("Data is:");
				int data=sc.nextInt();
				a[i]=data;
			}
			System.out.println("Arrays elements is:");
			for(int x:a)
			System.out.print(x+" ");
		}
		catch(InputMismatchException ime){
			System.out.println("Doesn't match valid inputs format: "+ime);
		}
		catch(Exception e){
			System.out.println("Plz enter correct input: "+e);
		}
		finally{
			sc.close();
		} 
    }
}


