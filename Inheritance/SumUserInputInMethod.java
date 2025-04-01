import java.util.*;

public class SumUserInputInMethod {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        TryTest s= new TryTest();
        s.test(2,3);
        s.res();
        sc.close();
        
    }
}
    
class TryTest{
    void test(int b, int p){
        int result= b+p; 
        System.out.println("Result is:"+result);
    }
}
    
class UserInput extends TryTest{
        
    System.out.println("Enter number");
    int num= sc.nextInt();
        
    void res(int n){
        int finalresult= num+test();
        System.out.println("Result is:"+finalresult);            
    }
}