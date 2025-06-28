//Bubble Shorts using user define input

import java.util.Scanner;
import java.util.InputMismatchException;


public class BubbleShorts{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		try{
			System.out.println("Enter how many elemnts want?");
			int size= sc.nextInt();
			int a[]=  new int[size];
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
			System.out.println("");
			for(int i=0; i<a.length; i++){
				for(int j=i+1; j<a.length; j++){
					if(a[i]>a[j]){
						int temp= a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			
			System.out.println("Shorting array is:");
			for(int x:a)
			System.out.print(x+" ");	
        }
       	catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs: "+ime);
        }
        catch(Exception e){
            System.out.println("Plz enter valid inputs:"+e);
        }
        finally{
            sc.close();
        }
         
    }
}
