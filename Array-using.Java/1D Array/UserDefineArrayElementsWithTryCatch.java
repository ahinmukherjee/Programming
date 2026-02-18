import java.util.InputMismatchException;
import java.util.Scanner;

public class UserDefineArrayElementsWithTryCatch {
    public static void main(String arga[]){
        Scanner s=new Scanner(System.in);
	    try{
		    System.out.print("Enter elemet no: ");
            int n=s.nextInt();
            float[] a=new float[n];
            for(int i=0; i<n; i++){
                System.out.print("Enter value is:: ");
                a[i]=s.nextFloat();
                }
            System.out.println("Array elements is:: ");
            for(float b:a){
                System.out.print(+b+" ");	
                }
            }
        catch(InputMismatchException ime){
            System.out.println("Doesn't match valid inputs: "+ime);
            }
        s.close();
    }
}

