import java.util.*;

public class UserDefineElements {
    public static void main(String arga[]){
        Scanner s=new Scanner(System.in);
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
        s.close();
    }
}


